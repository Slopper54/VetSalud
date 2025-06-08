/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package actions;

import WS.historiaclinicaWS;
import WS.mascotaWS;
import com.opensymphony.xwork2.ActionSupport;
import entidad.Factura;
import entidad.Historiaclinica;
import entidad.Mascota;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.List;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.ws.rs.core.GenericType;

/**
 *
 * @author danie
 */
public class HistoriaClinicaAction extends ActionSupport {

    private historiaclinicaWS ws = new historiaclinicaWS();
    private mascotaWS mascotaWS = new mascotaWS();
    private List<Historiaclinica> listaHistoriasClinicas;
    private Historiaclinica historiaClinica;
    private int size;
    private int id;
    private Date fecha;
    private String fechaInput;
    private String resumen;
    private Mascota idMascota;
    private int identificadorMascota;

    public HistoriaClinicaAction() {

    }

    public String listarHistoriasClinicas() {
        listaHistoriasClinicas = ws.findAll_XML(new GenericType<List<Historiaclinica>>() {
        });
        return SUCCESS;
    }

    public String obtenerHistoriaClinica() {
        historiaClinica = ws.find_XML(Historiaclinica.class, String.valueOf(id));

        if (historiaClinica == null) {
            return ERROR;
        } else {
            return SUCCESS;
        }
    }

    public String obtenerSizeLista() {
        size = Integer.parseInt(ws.countREST());
        return SUCCESS;
    }

    public String crearHistoriaClinica() {

        historiaClinica = new Historiaclinica();

        try {
            fecha = new SimpleDateFormat("yyyy-MM-dd").parse(fechaInput);
        } catch (ParseException ex) {
            return ERROR;
        }

        if (fecha != null) {
            historiaClinica.setFecha(fecha);
        }

        if (resumen != null && !resumen.isEmpty()) {
            historiaClinica.setResumen(resumen);
        }
        idMascota = mascotaWS.find(new GenericType<Mascota>() {}, String.valueOf(identificadorMascota));
        if (idMascota != null) {
            historiaClinica.setIdMascota(idMascota);
        }
        ws.create_XML(historiaClinica);
        return SUCCESS;
    }

    public String actualizarHistoriaClinica() {

        if (id == 0) {
            return ERROR;
        }

        obtenerHistoriaClinica();

        if (fechaInput != null) {
            try {
                fecha = new SimpleDateFormat("yyyy-MM-dd").parse(fechaInput);
                historiaClinica.setFecha(fecha);
            } catch (ParseException ex) {
                return ERROR;
            }
        }

        if (resumen != null && !resumen.isEmpty()) {
            historiaClinica.setResumen(resumen);
        }

        if (identificadorMascota != 0) {
            idMascota = mascotaWS.find(new GenericType<Mascota>() {}, String.valueOf(identificadorMascota));
            historiaClinica.setIdMascota(idMascota);
        }

        ws.edit_XML(historiaClinica, String.valueOf(id));
        return SUCCESS;
    }

    public String eliminarHistoriaClinica() {

        ws.remove(String.valueOf(id));
        return SUCCESS;

    }

    public historiaclinicaWS getWs() {
        return ws;
    }

    public void setWs(historiaclinicaWS ws) {
        this.ws = ws;
    }

    public List<Historiaclinica> getListaHistoriasClinicas() {
        return listaHistoriasClinicas;
    }

    public void setListaHistoriasClinicas(List<Historiaclinica> listaHistoriasClinicas) {
        this.listaHistoriasClinicas = listaHistoriasClinicas;
    }

    public Historiaclinica getHistoriaClinica() {
        return historiaClinica;
    }

    public void setHistoriaClinica(Historiaclinica historiaClinica) {
        this.historiaClinica = historiaClinica;
    }

    public int getId() {
        return id;
    }

    public void setId(String id) {
        this.id = Integer.parseInt(id);
    }

    public int getSize() {
        return size;
    }

    public void setSize(int size) {
        this.size = size;
    }

    public Date getFecha() {
        return fecha;
    }

    public void setFecha(Date fecha) {
        this.fecha = fecha;
    }

    public String getResumen() {
        return resumen;
    }

    public void setResumen(String resumen) {
        this.resumen = resumen;
    }

    public Mascota getIdMascota() {
        return idMascota;
    }

    public void setIdMascota(Mascota idMascota) {
        this.idMascota = idMascota;
    }

    public mascotaWS getMascotaWS() {
        return mascotaWS;
    }

    public void setMascotaWS(mascotaWS mascotaWS) {
        this.mascotaWS = mascotaWS;
    }

    public String getFechaInput() {
        return fechaInput;
    }

    public void setFechaInput(String fechaInput) {
        this.fechaInput = fechaInput;
    }

    public int getIdentificadorMascota() {
        return identificadorMascota;
    }

    public void setIdentificadorMascota(int identificadorMascota) {
        this.identificadorMascota = identificadorMascota;
    }

}
