package actions;

import WS.citaWS;
import com.opensymphony.xwork2.ActionSupport;
import entidad.Cita;
import entidad.Mascota;
import entidad.Veterinario;
import java.text.SimpleDateFormat;
<<<<<<< HEAD
import java.util.ArrayList;
=======
>>>>>>> 55e1046 (Vista veterinario)
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
    private citaWS ws = new citaWS();
    private String mensaje = "";
=======
>>>>>>> 55e1046 (Vista veterinario)

    // -------------------
    // MÉTODO CREAR
    // -------------------
    public String crear() {
<<<<<<< HEAD
=======
        citaWS ws = new citaWS();
>>>>>>> 55e1046 (Vista veterinario)
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
            mensaje = "Error al crear la cita: " + e.getMessage();
=======
>>>>>>> 55e1046 (Vista veterinario)
            return INPUT;
        } finally {
            ws.close();
        }
    }

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
            mensaje = "Error al editar la cita: " + e.getMessage();
=======
>>>>>>> 55e1046 (Vista veterinario)
            return INPUT;
        } finally {
            ws.close();
        }
    }

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
        try {
            ws.remove(String.valueOf(id));
            return SUCCESS;

        } catch (Exception e) {
            e.printStackTrace();
<<<<<<< HEAD
            mensaje = "Error al eliminar la cita: " + e.getMessage();
=======
>>>>>>> 55e1046 (Vista veterinario)
            return ERROR;
        } finally {
            ws.close();
        }
    }

<<<<<<< HEAD
// Método LISTAR
    public String listar() {
        try {
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
            return SUCCESS;

        } catch (Exception e) {
            e.printStackTrace();
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
            return ERROR;
        } finally {
            ws.close();
        }
    }

    // -------------------
    // GETTERS y SETTERS
    // -------------------
<<<<<<< HEAD
    public void setId(int id) {
        this.id = id;
    }

    public void setFecha(String fecha) {
        this.fecha = fecha;
    }

    public void setMotivo(String motivo) {
        this.motivo = motivo;
    }

    public void setIdMascota(int idMascota) {
        this.idMascota = idMascota;
    }

    public void setIdVeterinario(int idVeterinario) {
        this.idVeterinario = idVeterinario;
    }

    public void setMensaje(String mensaje) {
        this.mensaje = mensaje;
    }

    public int getId() {
        return id;
    }

    public String getFecha() {
        return fecha;
    }

    public String getMotivo() {
        return motivo;
    }

    public int getIdMascota() {
        return idMascota;
    }

    public int getIdVeterinario() {
        return idVeterinario;
    }

    public List<Cita> getListaCitas() {
        return listaCitas;
    }

    public String getMensaje() {
        return mensaje;
    }
}
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
