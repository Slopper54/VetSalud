package actions;

import WS.duenoWS;
import com.opensymphony.xwork2.ActionSupport;
import entidad.Dueno;
<<<<<<< HEAD
import java.util.ArrayList;
=======
>>>>>>> 55e1046 (Vista veterinario)
import java.util.List;
import javax.ws.rs.core.GenericType;

public class DuenoAction extends ActionSupport {

    private int id;
    private String nombre;
    private String email;
    private String telefono;
    private String dni;
    private List<Dueno> listaDuenos;
<<<<<<< HEAD
    private duenoWS ws = new duenoWS();
    private String mensaje = "";
=======
>>>>>>> 55e1046 (Vista veterinario)

    // -------------------
    // MÉTODO CREAR
    // -------------------
    public String crear() {
<<<<<<< HEAD
=======
        duenoWS ws = new duenoWS();
>>>>>>> 55e1046 (Vista veterinario)
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
<<<<<<< HEAD
            mensaje = "Error al crear dueño: " + e.getMessage();
=======
>>>>>>> 55e1046 (Vista veterinario)
            return INPUT;

        } finally {
            ws.close();
        }
    }

    // -------------------
    // MÉTODO EDITAR
    // -------------------
    public String editar() {
<<<<<<< HEAD
        try {
            // Buscar dueño por DNI usando el método findbyDNI
            Dueno dueno = ws.find_XML(Dueno.class, String.valueOf(id));
=======
        duenoWS ws = new duenoWS();
        try {
            // Buscar dueño por DNI usando el método findbyDNI
            Dueno dueno = ws.findbyDNI(Dueno.class, dni);
>>>>>>> 55e1046 (Vista veterinario)

            dueno.setNombre(nombre);
            dueno.setTelefono(telefono);
            dueno.setEmail(email);

            // Actualizar usando dni como id
<<<<<<< HEAD
            ws.edit_XML(dueno, String.valueOf(id));
=======
            ws.editByDNI_XML(dueno, dni);
>>>>>>> 55e1046 (Vista veterinario)

            return SUCCESS;
        } catch (Exception e) {
            e.printStackTrace();
<<<<<<< HEAD
            mensaje = "Error al actualizar dueño: " + e.getMessage();
=======
>>>>>>> 55e1046 (Vista veterinario)
            return INPUT;
        } finally {
            ws.close();
        }
    }

    // -------------------
    // MÉTODO ELIMINAR
    // -------------------
    public String eliminar() {
<<<<<<< HEAD
        try {
            ws.remove(String.valueOf(id));
            return SUCCESS;
        } catch (Exception e) {
            e.printStackTrace();
            mensaje = "Error al eliminar dueño: " + e.getMessage();
=======
        duenoWS ws = new duenoWS();
        try {
            ws.removeByDNI(dni);
            return SUCCESS;
        } catch (Exception e) {
            e.printStackTrace();
>>>>>>> 55e1046 (Vista veterinario)
            return ERROR;
        } finally {
            ws.close();
        }
    }

    // -------------------
    // MÉTODO LISTAR
    // -------------------
    public String listar() {
<<<<<<< HEAD
=======
        duenoWS ws = new duenoWS();
>>>>>>> 55e1046 (Vista veterinario)
        try {
            listaDuenos = ws.findAll_XML(new GenericType<List<Dueno>>() {});
            return SUCCESS;
        } catch (Exception e) {
            e.printStackTrace();
<<<<<<< HEAD
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
=======
>>>>>>> 55e1046 (Vista veterinario)
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
<<<<<<< HEAD

    public String getMensaje() { return mensaje; }
    public void setMensaje(String mensaje) { this.mensaje = mensaje; }
    
    
=======
>>>>>>> 55e1046 (Vista veterinario)
}

