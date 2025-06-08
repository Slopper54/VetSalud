package actions;

import WS.duenoWS;
import com.opensymphony.xwork2.ActionSupport;
import entidad.Dueno;
import java.util.ArrayList;
import java.util.List;
import javax.ws.rs.core.GenericType;

public class DuenoAction extends ActionSupport {

    private int id;
    private String nombre;
    private String email;
    private String telefono;
    private String dni;
    private List<Dueno> listaDuenos;
    private duenoWS ws = new duenoWS();
    private String mensaje = "";

    // -------------------
    // MÉTODO CREAR
    // -------------------
    public String crear() {
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
            mensaje = "Error al crear dueño: " + e.getMessage();
            return INPUT;

        } finally {
            ws.close();
        }
    }

    // -------------------
    // MÉTODO EDITAR
    // -------------------
    public String editar() {
        try {
            // Buscar dueño por DNI usando el método findbyDNI
            Dueno dueno = ws.find_XML(Dueno.class, String.valueOf(id));

            dueno.setNombre(nombre);
            dueno.setTelefono(telefono);
            dueno.setEmail(email);

            // Actualizar usando dni como id
            ws.edit_XML(dueno, String.valueOf(id));

            return SUCCESS;
        } catch (Exception e) {
            e.printStackTrace();
            mensaje = "Error al actualizar dueño: " + e.getMessage();
            return INPUT;
        } finally {
            ws.close();
        }
    }

    // -------------------
    // MÉTODO ELIMINAR
    // -------------------
    public String eliminar() {
        try {
            ws.remove(String.valueOf(id));
            return SUCCESS;
        } catch (Exception e) {
            e.printStackTrace();
            mensaje = "Error al eliminar dueño: " + e.getMessage();
            return ERROR;
        } finally {
            ws.close();
        }
    }

    // -------------------
    // MÉTODO LISTAR
    // -------------------
    public String listar() {
        try {
            listaDuenos = ws.findAll_XML(new GenericType<List<Dueno>>() {});
            return SUCCESS;
        } catch (Exception e) {
            e.printStackTrace();
            mensaje = "Error al listar dueños: " + e.getMessage();
            return ERROR;
        } finally {
            ws.close();
        }
    }
    
    public String buscar() {
        try {
            listaDuenos = new ArrayList<>();
            Dueno dueno = ws.findbyDNI(Dueno.class, dni);
            if(dueno == null){
                mensaje = "Error al buscar dueño";
                return ERROR;
            }
            listaDuenos.add(dueno);
            return SUCCESS;

        } catch (Exception e) {
            e.printStackTrace();
            mensaje = "Error al buscar dueños: " + e.getMessage();
            return ERROR;
        } finally {
            ws.close();
        }
    }

    // -------------------
    // GETTERS y SETTERS
    // -------------------
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

    public String getMensaje() { return mensaje; }
    public void setMensaje(String mensaje) { this.mensaje = mensaje; }
    
    
}

