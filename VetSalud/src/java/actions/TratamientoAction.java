package actions;

import WS.tratamientoWS;
import WS.mascotaWS;
import com.opensymphony.xwork2.ActionSupport;
import entidad.Tratamiento;
import entidad.Mascota;
import java.math.BigDecimal;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;
import javax.ws.rs.core.GenericType;
import org.apache.struts2.ServletActionContext;

/**
 * Action para CRUD de Tratamiento, usando el mismo patrón que FacturaAction.
 */
public class TratamientoAction extends ActionSupport {

    private List<Tratamiento> listaTratamientos;
    private tratamientoWS ws = new tratamientoWS();
    private mascotaWS mascotaWS = new mascotaWS();
    private Tratamiento tratamiento;
    private int size;
    private int id;
    private String descripcion;
    private String medicamento;
    private String fechaInicioInput;  // "yyyy-MM-dd"
    private String fechaFinInput;     // "yyyy-MM-dd"
    private String mensaje;
    private int idMascota;

    public TratamientoAction() {
    }

    /** Listar todos los tratamientos (GET /tratamientos) */
    public String listarTratamientos() {
        try {
            listaTratamientos = ws.findAll_XML(new GenericType<List<Tratamiento>>() {});
            return SUCCESS;
        } catch (Exception e) {
            return ERROR;
        }
    }

    /** Obtener un tratamiento por ID (GET /tratamientos/{id}) */
    public String obtenerTratamiento() {
        try {
            tratamiento = ws.find_XML(Tratamiento.class, String.valueOf(id));
            if (tratamiento == null) {
                mensaje = "tratamiento null";
                return ERROR;
            } else {
                listaTratamientos = new ArrayList<>();
                listaTratamientos.add(tratamiento);
                return SUCCESS;
            }
        } catch (Exception e) {
            mensaje = ""+e;
            return ERROR;
        }
    }

    /** Obtener tamaño de lista (GET /tratamientos/count) */
    public String obtenerSizeLista() {
        try {
            size = Integer.parseInt(ws.countREST());
            return SUCCESS;
        } catch (Exception e) {
            return ERROR;
        }
    }

    /** Crear nuevo tratamiento (POST /tratamientos) */
    public String crearTratamiento() {
        tratamiento = new Tratamiento();

        try {
            // Parsear fechas
            SimpleDateFormat sdf = new SimpleDateFormat("yyyy-MM-dd");
            if (fechaInicioInput != null && !fechaInicioInput.isEmpty()) {
                Date fi = sdf.parse(fechaInicioInput);
                tratamiento.setFechaInicio(fi);
            }
            if (fechaFinInput != null && !fechaFinInput.isEmpty()) {
                Date ff = sdf.parse(fechaFinInput);
                tratamiento.setFechaFin(ff);
            }
        } catch (ParseException ex) {
            return ERROR;
        }

        if (descripcion != null) {
            tratamiento.setDescripcion(descripcion);
        }
        if (medicamento != null) {
            tratamiento.setMedicamento(medicamento);
        }

        // Vincular mascota
        if (idMascota > 0) {
            Mascota m = mascotaWS.find(new GenericType<Mascota>() {}, String.valueOf(idMascota));
            if (m != null) {
                tratamiento.setIdMascota(m);
            }
        }

        ws.create_XML(tratamiento);
        return SUCCESS;
    }

    /** Actualizar tratamiento (PUT /tratamientos/{id}) */
    public String actualizarTratamiento() {
        if (id == 0) {
            return ERROR;
        }

        // Cargar el tratamiento existente
        tratamiento = ws.find_XML(Tratamiento.class, String.valueOf(id));
        if (tratamiento == null) {
            return ERROR;
        }

        // Actualizar campos si vienen en el formulario
        try {
            SimpleDateFormat sdf = new SimpleDateFormat("yyyy-MM-dd");
            if (fechaInicioInput != null && !fechaInicioInput.isEmpty()) {
                Date fi = sdf.parse(fechaInicioInput);
                tratamiento.setFechaInicio(fi);
            }
            if (fechaFinInput != null && !fechaFinInput.isEmpty()) {
                Date ff = sdf.parse(fechaFinInput);
                tratamiento.setFechaFin(ff);
            }
        } catch (ParseException ex) {
            return ERROR;
        }

        if (descripcion != null&& !descripcion.isEmpty()) {
            tratamiento.setDescripcion(descripcion);
        }

        if (medicamento != null && !medicamento.isEmpty()) {
            tratamiento.setMedicamento(medicamento);
        }

        if (idMascota > 0) {
            Mascota m = mascotaWS.find(new GenericType<Mascota>() {}, String.valueOf(idMascota));
            if (m != null) {
                tratamiento.setIdMascota(m);
            }
        }

        ws.edit_XML(tratamiento, String.valueOf(id));
        return SUCCESS;
    }

    /** Eliminar tratamiento (DELETE /tratamientos/{id}) */
    public String eliminarTratamiento() {
        try {
            ws.remove(String.valueOf(id));
            return SUCCESS;
        } catch (Exception e) {
            return ERROR;
        }
    }

    // --------------- GETTERS & SETTERS ---------------

    public List<Tratamiento> getListaTratamientos() {
        return listaTratamientos;
    }

    public void setListaTratamientos(List<Tratamiento> listaTratamientos) {
        this.listaTratamientos = listaTratamientos;
    }

    public tratamientoWS getWs() {
        return ws;
    }

    public void setWs(tratamientoWS ws) {
        this.ws = ws;
    }

    public Tratamiento getTratamiento() {
        return tratamiento;
    }

    public void setTratamiento(Tratamiento tratamiento) {
        this.tratamiento = tratamiento;
    }

    public int getSize() {
        return size;
    }

    public void setSize(int size) {
        this.size = size;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getDescripcion() {
        return descripcion;
    }

    public void setDescripcion(String descripcion) {
        this.descripcion = descripcion;
    }

    public String getMedicamento() {
        return medicamento;
    }

    public void setMedicamento(String medicamento) {
        this.medicamento = medicamento;
    }

    public String getFechaInicioInput() {
        return fechaInicioInput;
    }

    public void setFechaInicioInput(String fechaInicioInput) {
        this.fechaInicioInput = fechaInicioInput;
    }

    public String getFechaFinInput() {
        return fechaFinInput;
    }

    public void setFechaFinInput(String fechaFinInput) {
        this.fechaFinInput = fechaFinInput;
    }

    public int getIdMascota() {
        return idMascota;
    }

    public void setIdMascota(int idMascota) {
        this.idMascota = idMascota;
    }

    public mascotaWS getMascotaWS() {
        return mascotaWS;
    }

    public void setMascotaWS(mascotaWS mascotaWS) {
        this.mascotaWS = mascotaWS;
    }

    public String getMensaje() {
        return mensaje;
    }

    public void setMensaje(String mensaje) {
        this.mensaje = mensaje;
    }
    
    
}
