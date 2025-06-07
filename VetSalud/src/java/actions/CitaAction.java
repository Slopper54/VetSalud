<<<<<<< HEAD
package actions;

import WS.citaWS;
import com.opensymphony.xwork2.ActionSupport;
import entidad.Cita;
import entidad.Mascota;
import entidad.Veterinario;
import java.text.SimpleDateFormat;
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

    // -------------------
    // MÉTODO CREAR
    // -------------------
    public String crear() {
        citaWS ws = new citaWS();
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
            return INPUT;
        } finally {
            ws.close();
        }
    }

    // -------------------
    // MÉTODO EDITAR
    // -------------------
    public String editar() {
        citaWS ws = new citaWS();
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
            return INPUT;
        } finally {
            ws.close();
        }
    }

    // -------------------
    // MÉTODO ELIMINAR
    // -------------------
    public String eliminar() {
        citaWS ws = new citaWS();
        try {
            ws.remove(String.valueOf(id));
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
        citaWS ws = new citaWS();
        try {
            listaCitas = ws.findAll_XML(new GenericType<List<Cita>>() {});
            return SUCCESS;

        } catch (Exception e) {
            e.printStackTrace();
            return ERROR;
        } finally {
            ws.close();
        }
    }

    // -------------------
    // GETTERS y SETTERS
    // -------------------
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

=======
package actions;

import WS.citaWS;
import com.opensymphony.xwork2.ActionSupport;
import entidad.Cita;
import entidad.Mascota;
import entidad.Veterinario;
import java.text.SimpleDateFormat;
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

    // -------------------
    // MÉTODO CREAR
    // -------------------
    public String crear() {
        citaWS ws = new citaWS();
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
            return INPUT;
        } finally {
            ws.close();
        }
    }

    // -------------------
    // MÉTODO EDITAR
    // -------------------
    public String editar() {
        citaWS ws = new citaWS();
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
            return INPUT;
        } finally {
            ws.close();
        }
    }

    // -------------------
    // MÉTODO ELIMINAR
    // -------------------
    public String eliminar() {
        citaWS ws = new citaWS();
        try {
            ws.remove(String.valueOf(id));
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
        citaWS ws = new citaWS();
        try {
            listaCitas = ws.findAll_XML(new GenericType<List<Cita>>() {});
            return SUCCESS;

        } catch (Exception e) {
            e.printStackTrace();
            return ERROR;
        } finally {
            ws.close();
        }
    }

    // -------------------
    // GETTERS y SETTERS
    // -------------------
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

>>>>>>> 348acc6 (css y primeras vistas)
