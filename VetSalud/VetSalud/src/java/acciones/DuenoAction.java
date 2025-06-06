package acciones;

import WS.duenoWS;
import com.opensymphony.xwork2.ActionSupport;
import entidad.Dueno;
import java.util.List;
import javax.ws.rs.core.GenericType;

public class DuenoAction extends ActionSupport {

    private int id;
    private String nombre;
    private String email;
    private String telefono;
    private String dni;
    private List<Dueno> listaDuenos;
    private Dueno dueno;

    // -------------------
    // MÉTODO CREAR
    // -------------------
    public String crear() {
        duenoWS ws = new duenoWS();
        try {
            Dueno dueno = new Dueno();
            dueno.setNombre(nombre);
            dueno.setEmail(email);
            dueno.setTelefono(telefono);
            dueno.setDni(dni);

            ws.create_XML(dueno);
            return SUCCESS;

        } catch (Exception e) {
            e.printStackTrace();
            return INPUT;

        } finally {
            ws.close();
        }
    }

    // -------------------
    // MÉTODO EDITAR
    // -------------------
    public String editar() {
        duenoWS ws = new duenoWS();
        try {
            // Buscar dueño por DNI usando el método findbyDNI
            Dueno dueno = ws.findbyDNI(Dueno.class, dni);

            dueno.setNombre(nombre);
            dueno.setTelefono(telefono);
            dueno.setEmail(email);

            // Actualizar usando dni como id
            ws.editByDNI_XML(dueno, dni);

            return SUCCESS;
        } catch (Exception e) {
            e.printStackTrace();
            return INPUT;
        } finally {
            ws.close();
        }
    }

    // -------------------
    // MÉTODO ELIMINAR
    // -------------------
    public String eliminar() {
        duenoWS ws = new duenoWS();
        try {
            ws.removeByDNI(dni);
            return SUCCESS;
        } catch (Exception e) {
            e.printStackTrace();
            return ERROR;
        } finally {
            ws.close();
        }
    }

    // -------------------
    // MÉTODO LISTAR
    // -------------------
    public String listar() {
        duenoWS ws = new duenoWS();
        try {
            listaDuenos = ws.findAll_XML(new GenericType<List<Dueno>>() {});
            return SUCCESS;
        } catch (Exception e) {
            e.printStackTrace();
            return ERROR;
        } finally {
            ws.close();
        }
    }
    
    public String buscarDueno() {
        duenoWS ws = new duenoWS();
        try {
            dueno = ws.findbyDNI(Dueno.class, dni);
            if (dueno != null) {
                return SUCCESS;
            } else {
                addActionError("No se encontró el dueño con DNI: " + dni);
                return ERROR;
            }
        } catch (Exception e) {
            return ERROR;
        } finally {
            ws.close();
        }
    }

    // -------------------
    // GETTERS y SETTERS
    // -------------------
    public Dueno getDueno() { return dueno; }
    public void setDueno(Dueno dueno) { this.dueno = dueno; }
    
    public int getId() { return id; }
    public void setId(int id) { this.id = id; }

    public String getNombre() { return nombre; }
    public void setNombre(String nombre) { this.nombre = nombre; }

    public String getEmail() { return email; }
    public void setEmail(String email) { this.email = email; }

    public String getTelefono() { return telefono; }
    public void setTelefono(String telefono) { this.telefono = telefono; }

    public String getDni() { return dni; }
    public void setDni(String dni) { this.dni = dni; }

    public List<Dueno> getListaDuenos() { return listaDuenos; }
    public void setListaDuenos(List<Dueno> listaDuenos) { this.listaDuenos = listaDuenos; }
}

