package actions;

import WS.citaWS;
import com.opensymphony.xwork2.ActionSupport;
import entidad.Cita;
import entidad.Mascota;
import entidad.Veterinario;
import java.text.SimpleDateFormat;
<<<<<<< HEAD
=======
<<<<<<< HEAD
import java.util.ArrayList;
=======
>>>>>>> 55e1046 (Vista veterinario)
>>>>>>> origin/main
import java.util.Date;
import java.util.List;
import javax.ws.rs.core.GenericType;

public class CitaAction extends ActionSupport {

    private int id;
    private String fecha;
    private String motivo;
    private int idMascota;
    private int idVeterinario;
    private List<Cita> listaCitas;
<<<<<<< HEAD
=======
<<<<<<< HEAD
    private citaWS ws = new citaWS();
    private String mensaje = "";
=======
>>>>>>> 55e1046 (Vista veterinario)
>>>>>>> origin/main

    // -------------------
    // MÉTODO CREAR
    // -------------------
    public String crear() {
<<<<<<< HEAD
        citaWS ws = new citaWS();
=======
<<<<<<< HEAD
=======
        citaWS ws = new citaWS();
>>>>>>> 55e1046 (Vista veterinario)
>>>>>>> origin/main
        try {
            SimpleDateFormat sdf = new SimpleDateFormat("yyyy-MM-dd'T'HH:mm");
            Date fechaParsed = sdf.parse(fecha);

            Cita cita = new Cita();
            cita.setFecha(fechaParsed);
            cita.setMotivo(motivo);
            cita.setIdMascota(new Mascota(idMascota));
            cita.setIdVeterinario(new Veterinario(idVeterinario));

            ws.create_XML(cita);
            return SUCCESS;

        } catch (Exception e) {
            e.printStackTrace();
<<<<<<< HEAD
=======
<<<<<<< HEAD
            mensaje = "Error al crear la cita: " + e.getMessage();
=======
>>>>>>> 55e1046 (Vista veterinario)
>>>>>>> origin/main
            return INPUT;
        } finally {
            ws.close();
        }
    }

<<<<<<< HEAD
    // -------------------
    // MÉTODO EDITAR
    // -------------------
    public String editar() {
        citaWS ws = new citaWS();
=======
<<<<<<< HEAD
// Método EDITAR
    public String editar() {
=======
    // -------------------
    // MÉTODO EDITAR
    // -------------------
    public String editar() {
        citaWS ws = new citaWS();
>>>>>>> 55e1046 (Vista veterinario)
>>>>>>> origin/main
        try {
            Cita cita = ws.find_XML(Cita.class, String.valueOf(id));

            SimpleDateFormat sdf = new SimpleDateFormat("yyyy-MM-dd'T'HH:mm");
            Date fechaParsed = sdf.parse(fecha);

            cita.setFecha(fechaParsed);
            cita.setMotivo(motivo);
            cita.setIdMascota(new Mascota(idMascota));
            cita.setIdVeterinario(new Veterinario(idVeterinario));

            ws.edit_XML(cita, String.valueOf(id));
            return SUCCESS;

        } catch (Exception e) {
            e.printStackTrace();
<<<<<<< HEAD
=======
<<<<<<< HEAD
            mensaje = "Error al editar la cita: " + e.getMessage();
=======
>>>>>>> 55e1046 (Vista veterinario)
>>>>>>> origin/main
            return INPUT;
        } finally {
            ws.close();
        }
    }

<<<<<<< HEAD
    // -------------------
    // MÉTODO ELIMINAR
    // -------------------
    public String eliminar() {
        citaWS ws = new citaWS();
=======
<<<<<<< HEAD
// Método ELIMINAR
    public String eliminar() {
=======
    // -------------------
    // MÉTODO ELIMINAR
    // -------------------
    public String eliminar() {
        citaWS ws = new citaWS();
>>>>>>> 55e1046 (Vista veterinario)
>>>>>>> origin/main
        try {
            ws.remove(String.valueOf(id));
            return SUCCESS;

        } catch (Exception e) {
            e.printStackTrace();
<<<<<<< HEAD
=======
<<<<<<< HEAD
            mensaje = "Error al eliminar la cita: " + e.getMessage();
=======
>>>>>>> 55e1046 (Vista veterinario)
>>>>>>> origin/main
            return ERROR;
        } finally {
            ws.close();
        }
    }

<<<<<<< HEAD
    // -------------------
    // MÉTODO LISTAR
    // -------------------
=======
<<<<<<< HEAD
// Método LISTAR
>>>>>>> origin/main
    public String listar() {
        citaWS ws = new citaWS();
        try {
<<<<<<< HEAD
            listaCitas = ws.findAll_XML(new GenericType<List<Cita>>() {});
=======
            listaCitas = ws.findAll_XML(new GenericType<List<Cita>>() {
            });
=======
    // -------------------
    // MÉTODO LISTAR
    // -------------------
    public String listar() {
        citaWS ws = new citaWS();
        try {
            listaCitas = ws.findAll_XML(new GenericType<List<Cita>>() {});
>>>>>>> 55e1046 (Vista veterinario)
>>>>>>> origin/main
            return SUCCESS;

        } catch (Exception e) {
            e.printStackTrace();
<<<<<<< HEAD
=======
<<<<<<< HEAD
            mensaje = "Error al listar citas: " + e.getMessage();
            return ERROR;
        } finally {
            ws.close();
        }
    }

// Método BUSCAR
    public String buscar() {
        try {
            listaCitas = new ArrayList<>();
            Cita cita = ws.find_XML(Cita.class, String.valueOf(id));
            listaCitas.add(cita);
            return SUCCESS;

        } catch (Exception e) {
            e.printStackTrace();
            mensaje = "Error al buscar citas: " + e.getMessage();
=======
>>>>>>> 55e1046 (Vista veterinario)
>>>>>>> origin/main
            return ERROR;
        } finally {
            ws.close();
        }
    }

    // -------------------
    // GETTERS y SETTERS
    // -------------------
<<<<<<< HEAD
    public void setId(int id) { this.id = id; }
    public void setFecha(String fecha) { this.fecha = fecha; }
    public void setMotivo(String motivo) { this.motivo = motivo; }
    public void setIdMascota(int idMascota) { this.idMascota = idMascota; }
    public void setIdVeterinario(int idVeterinario) { this.idVeterinario = idVeterinario; }
=======
<<<<<<< HEAD
    public void setId(int id) {
        this.id = id;
    }
>>>>>>> origin/main

    public int getId() { return id; }
    public String getFecha() { return fecha; }
    public String getMotivo() { return motivo; }
    public int getIdMascota() { return idMascota; }
    public int getIdVeterinario() { return idVeterinario; }

    public List<Cita> getListaCitas() { return listaCitas; }
}
<<<<<<< HEAD

=======
=======
    public void setId(int id) { this.id = id; }
    public void setFecha(String fecha) { this.fecha = fecha; }
    public void setMotivo(String motivo) { this.motivo = motivo; }
    public void setIdMascota(int idMascota) { this.idMascota = idMascota; }
    public void setIdVeterinario(int idVeterinario) { this.idVeterinario = idVeterinario; }

    public int getId() { return id; }
    public String getFecha() { return fecha; }
    public String getMotivo() { return motivo; }
    public int getIdMascota() { return idMascota; }
    public int getIdVeterinario() { return idVeterinario; }

    public List<Cita> getListaCitas() { return listaCitas; }
}

>>>>>>> 55e1046 (Vista veterinario)
>>>>>>> origin/main
