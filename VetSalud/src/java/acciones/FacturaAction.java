/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package acciones;

import WS.citaWS;
import WS.facturaWS;
import static com.opensymphony.xwork2.Action.ERROR;
import static com.opensymphony.xwork2.Action.SUCCESS;
import com.opensymphony.xwork2.ActionSupport;
import entidad.Cita;
import entidad.Factura;
import java.math.BigDecimal;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.List;
import javax.ws.rs.core.GenericType;

/**
 *
 * @author danie
 */
public class FacturaAction extends ActionSupport {

    private List<Factura> listaFacturas;
    private facturaWS ws = new facturaWS();
    private citaWS citaWS = new citaWS();
    private Factura factura;
    private int size;
    private int id;
    private Date fechaEmision;
    private String fechaInput;
    private BigDecimal total;
    private String metodoPago;
    private Cita idCita;
    private String identificadorCita;
    private String citaAsignada = "";

    public FacturaAction() {

    }

    public String listarFacturas() {
        listaFacturas = ws.findAll_XML(new GenericType<List<Factura>>() {
        });
        return SUCCESS;
    }

    public String obtenerFactura() {

        factura = ws.find_XML(Factura.class, String.valueOf(id));

        if (factura == null) {
            return ERROR;
        } else {
            return SUCCESS;
        }
    }

    public String obtenerSizeLista() {
        size = Integer.parseInt(ws.countREST());
        return SUCCESS;
    }

    public String crearFactura() {

        try {

            factura = new Factura();

            try {
                fechaEmision = new SimpleDateFormat("yyyy-MM-dd").parse(fechaInput);
            } catch (ParseException ex) {
                return ERROR;
            }

            if (fechaEmision != null) {
                factura.setFechaEmision(fechaEmision);
            }
            if (total != null) {
                factura.setTotal(total);
            }
            if (metodoPago != null && !metodoPago.isEmpty()) {
                factura.setMetodoPago(metodoPago);
            }

            idCita = citaWS.find_XML(Cita.class, identificadorCita);
            try {
                Factura f = ws.findByIdCita(Factura.class, identificadorCita);
                citaAsignada = "La cita ya se ha asignado a otra factura";
                return ERROR;
            } catch (Exception e) {
                citaAsignada = "";
                factura.setIdCita(idCita);
            }
            ws.create_XML(factura);
            return SUCCESS;
        } catch (Exception e) {
            return ERROR;
        }
    }

    public String actualizarFactura() {

        if (id == 0) {
            return ERROR;
        }

        obtenerFactura();

        if (fechaInput != null && !fechaInput.isEmpty()) {
            try {
                fechaEmision = new SimpleDateFormat("yyyy-MM-dd").parse(fechaInput);
                factura.setFechaEmision(fechaEmision);
            } catch (ParseException ex) {
                return ERROR;
            }
        }

        if (total != null) {
            factura.setTotal(total);
        }

        if (metodoPago != null) {
            factura.setMetodoPago(metodoPago);
        }
        if (identificadorCita != null && !identificadorCita.isEmpty()) {
            idCita = citaWS.find_XML(Cita.class, identificadorCita);
            try {
                Factura f = ws.findByIdCita(Factura.class, identificadorCita);
                citaAsignada = "La cita ya se ha asignado a otra factura";
                return ERROR;
            } catch (Exception e) {
                citaAsignada = "";
                factura.setIdCita(idCita);
            }
        }

        ws.edit_XML(factura, String.valueOf(id));
        return SUCCESS;
    }

    public String eliminarFactura() {
        ws.remove(String.valueOf(id));
        return SUCCESS;
    }

    public List<Factura> getListaFacturas() {
        return listaFacturas;
    }

    public void setListaFacturas(List<Factura> listaFacturas) {
        this.listaFacturas = listaFacturas;
    }

    public facturaWS getWs() {
        return ws;
    }

    public void setWs(facturaWS ws) {
        this.ws = ws;
    }

    public Factura getFactura() {
        return factura;
    }

    public void setFactura(Factura factura) {
        this.factura = factura;
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

    public Date getFechaEmision() {
        return fechaEmision;
    }

    public void setFechaEmision(Date fechaEmision) {
        this.fechaEmision = fechaEmision;
    }

    public BigDecimal getTotal() {
        return total;
    }

    public void setTotal(BigDecimal total) {
        this.total = total;
    }

    public String getMetodoPago() {
        return metodoPago;
    }

    public void setMetodoPago(String metodoPago) {
        this.metodoPago = metodoPago;
    }

    public Cita getIdCita() {
        return idCita;
    }

    public void setIdCita(Cita idCita) {
        this.idCita = idCita;
    }

    public citaWS getCitaWS() {
        return citaWS;
    }

    public void setCitaWS(citaWS citaWS) {
        this.citaWS = citaWS;
    }

    public String getFechaInput() {
        return fechaInput;
    }

    public void setFechaInput(String fechaInput) {
        this.fechaInput = fechaInput;
    }

    public String getIdentificadorCita() {
        return identificadorCita;
    }

    public void setIdentificadorCita(String identificadorCita) {
        this.identificadorCita = identificadorCita;
    }

    public String getCitaAsignada() {
        return citaAsignada;
    }

    public void setCitaAsignada(String citaAsignada) {
        this.citaAsignada = citaAsignada;
    }

}
