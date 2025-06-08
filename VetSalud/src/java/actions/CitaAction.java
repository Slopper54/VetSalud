package actions;

import WS.citaWS;
import com.opensymphony.xwork2.ActionSupport;
import entidad.Cita;
import entidad.Mascota;
import entidad.Veterinario;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
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
    private citaWS ws = new citaWS();
    private String mensaje = "";

    // -------------------
    // MÉTODO CREAR
    // -------------------
    public String crear() {
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
            mensaje = "Error al crear la cita: " + e.getMessage();
            return INPUT;
        } finally {
            ws.close();
        }
    }

// Método EDITAR
    public String editar() {
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
            mensaje = "Error al editar la cita: " + e.getMessage();
            return INPUT;
        } finally {
            ws.close();
        }
    }

// Método ELIMINAR
    public String eliminar() {
        try {
            ws.remove(String.valueOf(id));
            return SUCCESS;

        } catch (Exception e) {
            e.printStackTrace();
            mensaje = "Error al eliminar la cita: " + e.getMessage();
            return ERROR;
        } finally {
            ws.close();
        }
    }

// Método LISTAR
    public String listar() {
        try {
            listaCitas = ws.findAll_XML(new GenericType<List<Cita>>() {
            });
            return SUCCESS;

        } catch (Exception e) {
            e.printStackTrace();
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
            return ERROR;
        } finally {
            ws.close();
        }
    }

    // -------------------
    // GETTERS y SETTERS
    // -------------------
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
