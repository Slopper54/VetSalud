<<<<<<< HEAD
package actions;

import WS.vacunacionWS;
import WS.mascotaWS;
import com.opensymphony.xwork2.ActionSupport;
import entidad.Vacunacion;
import entidad.Mascota;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;
import javax.ws.rs.core.GenericType;
import org.apache.struts2.ServletActionContext;

/**
 * Action para CRUD de Vacunación, siguiendo el mismo patrón que FacturaAction.
 */
public class VacunacionAction extends ActionSupport {

    private List<Vacunacion> listaVacunaciones;
    private vacunacionWS ws = new vacunacionWS();
    private mascotaWS mascotaWS = new mascotaWS();
    private Vacunacion vacunacion;
    private int size;
    private int id;
    private String tipoVacuna;
    private String fechaInput;  // "yyyy-MM-dd"
    private String dosis;
    private int idMascota;

    public VacunacionAction() {
    }

    /** Listar todas las vacunaciones (GET /vacunaciones) */
    public String listarVacunaciones() {
        try {
            listaVacunaciones = ws.findAll_XML(new GenericType<List<Vacunacion>>() {});
            return SUCCESS;
        } catch (Exception e) {
            return ERROR;
        }
    }

    /** Obtener una vacunación por ID (GET /vacunaciones/{id}) */
    public String obtenerVacunacion() {
        try {
            vacunacion = ws.find_XML(Vacunacion.class, String.valueOf(id));
            if (vacunacion == null) {
                return ERROR;
            } else {
                listaVacunaciones = new ArrayList<>();
                listaVacunaciones.add(vacunacion);
                return SUCCESS;
            }
        } catch (Exception e) {
            return ERROR;
        }
    }

    /** Obtener tamaño de lista (GET /vacunaciones/count) */
    public String obtenerSizeLista() {
        try {
            size = Integer.parseInt(ws.countREST());
            return SUCCESS;
        } catch (Exception e) {
            return ERROR;
        }
    }

    /** Crear nueva vacunación (POST /vacunaciones) */
    public String crearVacunacion() {
        vacunacion = new Vacunacion();

        try {
            SimpleDateFormat sdf = new SimpleDateFormat("yyyy-MM-dd");
            if (fechaInput != null && !fechaInput.isEmpty()) {
                Date f = sdf.parse(fechaInput);
                vacunacion.setFecha(f);
            }
        } catch (ParseException ex) {
            return ERROR;
        }

        if (tipoVacuna != null) {
            vacunacion.setTipoVacuna(tipoVacuna);
        }
        if (dosis != null) {
            vacunacion.setDosis(dosis);
        }

        if (idMascota > 0) {
            Mascota m = mascotaWS.find(new GenericType<Mascota>() {}, String.valueOf(idMascota));
            if (m != null) {
                vacunacion.setIdMascota(m);
            }
        }

        ws.create_XML(vacunacion);
        return SUCCESS;
    }

    /** Actualizar vacunación (PUT /vacunaciones/{id}) */
    public String actualizarVacunacion() {
        if (id == 0) {
            return ERROR;
        }

        vacunacion = ws.find_XML(Vacunacion.class, String.valueOf(id));
        if (vacunacion == null) {
            return ERROR;
        }

        try {
            SimpleDateFormat sdf = new SimpleDateFormat("yyyy-MM-dd");
            if (fechaInput != null && !fechaInput.isEmpty()) {
                Date f = sdf.parse(fechaInput);
                vacunacion.setFecha(f);
            }
        } catch (ParseException ex) {
            return ERROR;
        }

        if (tipoVacuna != null && !tipoVacuna.isEmpty()) {
            vacunacion.setTipoVacuna(tipoVacuna);
        }
        if (dosis != null && !dosis.isEmpty()) {
            vacunacion.setDosis(dosis);
        }

        if (idMascota > 0) {
            Mascota m = mascotaWS.find(new GenericType<Mascota>() {}, String.valueOf(idMascota));
            if (m != null) {
                vacunacion.setIdMascota(m);
            }
        }

        ws.edit_XML(vacunacion, String.valueOf(id));
        return SUCCESS;
    }

    /** Eliminar vacunación (DELETE /vacunaciones/{id}) */
    public String eliminarVacunacion() {
        try {
            ws.remove(String.valueOf(id));
            return SUCCESS;
        } catch (Exception e) {
            return ERROR;
        }
    }

    // --------------- GETTERS & SETTERS ---------------

    public List<Vacunacion> getListaVacunaciones() {
        return listaVacunaciones;
    }

    public void setListaVacunaciones(List<Vacunacion> listaVacunaciones) {
        this.listaVacunaciones = listaVacunaciones;
    }

    public vacunacionWS getWs() {
        return ws;
    }

    public void setWs(vacunacionWS ws) {
        this.ws = ws;
    }

    public Vacunacion getVacunacion() {
        return vacunacion;
    }

    public void setVacunacion(Vacunacion vacunacion) {
        this.vacunacion = vacunacion;
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

    public String getTipoVacuna() {
        return tipoVacuna;
    }

    public void setTipoVacuna(String tipoVacuna) {
        this.tipoVacuna = tipoVacuna;
    }

    public String getFechaInput() {
        return fechaInput;
    }

    public void setFechaInput(String fechaInput) {
        this.fechaInput = fechaInput;
    }

    public String getDosis() {
        return dosis;
    }

    public void setDosis(String dosis) {
        this.dosis = dosis;
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
    
    
}
=======
package actions;

import WS.vacunacionWS;
import WS.mascotaWS;
import com.opensymphony.xwork2.ActionSupport;
import entidad.Vacunacion;
import entidad.Mascota;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;
import javax.ws.rs.core.GenericType;
import org.apache.struts2.ServletActionContext;

/**
 * Action para CRUD de Vacunación, siguiendo el mismo patrón que FacturaAction.
 */
public class VacunacionAction extends ActionSupport {

    private List<Vacunacion> listaVacunaciones;
    private vacunacionWS ws = new vacunacionWS();
    private mascotaWS mascotaWS = new mascotaWS();
    private Vacunacion vacunacion;
    private int size;
    private int id;
    private String tipoVacuna;
    private String fechaInput;  // "yyyy-MM-dd"
    private String dosis;
    private int idMascota;

    public VacunacionAction() {
    }

    /** Listar todas las vacunaciones (GET /vacunaciones) */
    public String listarVacunaciones() {
        try {
            listaVacunaciones = ws.findAll_XML(new GenericType<List<Vacunacion>>() {});
            return SUCCESS;
        } catch (Exception e) {
            return ERROR;
        }
    }

    /** Obtener una vacunación por ID (GET /vacunaciones/{id}) */
    public String obtenerVacunacion() {
        try {
            vacunacion = ws.find_XML(Vacunacion.class, String.valueOf(id));
            if (vacunacion == null) {
                return ERROR;
            } else {
                listaVacunaciones = new ArrayList<>();
                listaVacunaciones.add(vacunacion);
                return SUCCESS;
            }
        } catch (Exception e) {
            return ERROR;
        }
    }

    /** Obtener tamaño de lista (GET /vacunaciones/count) */
    public String obtenerSizeLista() {
        try {
            size = Integer.parseInt(ws.countREST());
            return SUCCESS;
        } catch (Exception e) {
            return ERROR;
        }
    }

    /** Crear nueva vacunación (POST /vacunaciones) */
    public String crearVacunacion() {
        vacunacion = new Vacunacion();

        try {
            SimpleDateFormat sdf = new SimpleDateFormat("yyyy-MM-dd");
            if (fechaInput != null && !fechaInput.isEmpty()) {
                Date f = sdf.parse(fechaInput);
                vacunacion.setFecha(f);
            }
        } catch (ParseException ex) {
            return ERROR;
        }

        if (tipoVacuna != null) {
            vacunacion.setTipoVacuna(tipoVacuna);
        }
        if (dosis != null) {
            vacunacion.setDosis(dosis);
        }

        if (idMascota > 0) {
            Mascota m = mascotaWS.find(new GenericType<Mascota>() {}, String.valueOf(idMascota));
            if (m != null) {
                vacunacion.setIdMascota(m);
            }
        }

        ws.create_XML(vacunacion);
        return SUCCESS;
    }

    /** Actualizar vacunación (PUT /vacunaciones/{id}) */
    public String actualizarVacunacion() {
        if (id == 0) {
            return ERROR;
        }

        vacunacion = ws.find_XML(Vacunacion.class, String.valueOf(id));
        if (vacunacion == null) {
            return ERROR;
        }

        try {
            SimpleDateFormat sdf = new SimpleDateFormat("yyyy-MM-dd");
            if (fechaInput != null && !fechaInput.isEmpty()) {
                Date f = sdf.parse(fechaInput);
                vacunacion.setFecha(f);
            }
        } catch (ParseException ex) {
            return ERROR;
        }

        if (tipoVacuna != null && !tipoVacuna.isEmpty()) {
            vacunacion.setTipoVacuna(tipoVacuna);
        }
        if (dosis != null && !dosis.isEmpty()) {
            vacunacion.setDosis(dosis);
        }

        if (idMascota > 0) {
            Mascota m = mascotaWS.find(new GenericType<Mascota>() {}, String.valueOf(idMascota));
            if (m != null) {
                vacunacion.setIdMascota(m);
            }
        }

        ws.edit_XML(vacunacion, String.valueOf(id));
        return SUCCESS;
    }

    /** Eliminar vacunación (DELETE /vacunaciones/{id}) */
    public String eliminarVacunacion() {
        try {
            ws.remove(String.valueOf(id));
            return SUCCESS;
        } catch (Exception e) {
            return ERROR;
        }
    }

    // --------------- GETTERS & SETTERS ---------------

    public List<Vacunacion> getListaVacunaciones() {
        return listaVacunaciones;
    }

    public void setListaVacunaciones(List<Vacunacion> listaVacunaciones) {
        this.listaVacunaciones = listaVacunaciones;
    }

    public vacunacionWS getWs() {
        return ws;
    }

    public void setWs(vacunacionWS ws) {
        this.ws = ws;
    }

    public Vacunacion getVacunacion() {
        return vacunacion;
    }

    public void setVacunacion(Vacunacion vacunacion) {
        this.vacunacion = vacunacion;
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

    public String getTipoVacuna() {
        return tipoVacuna;
    }

    public void setTipoVacuna(String tipoVacuna) {
        this.tipoVacuna = tipoVacuna;
    }

    public String getFechaInput() {
        return fechaInput;
    }

    public void setFechaInput(String fechaInput) {
        this.fechaInput = fechaInput;
    }

    public String getDosis() {
        return dosis;
    }

    public void setDosis(String dosis) {
        this.dosis = dosis;
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
    
    
}
>>>>>>> 348acc6 (css y primeras vistas)
