/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Entidades;

import java.io.Serializable;
import java.util.Date;
import javax.persistence.Basic;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.NamedQueries;
import javax.persistence.NamedQuery;
import javax.persistence.Table;
import javax.persistence.Temporal;
import javax.persistence.TemporalType;
import javax.validation.constraints.Size;
import javax.xml.bind.annotation.XmlRootElement;

/**
 *
 * @author samuel
 */
@Entity
@Table(name = "vacunacion")
@XmlRootElement
@NamedQueries({
    @NamedQuery(name = "Vacunacion.findAll", query = "SELECT v FROM Vacunacion v")
    , @NamedQuery(name = "Vacunacion.findByIdVacunacion", query = "SELECT v FROM Vacunacion v WHERE v.idVacunacion = :idVacunacion")
    , @NamedQuery(name = "Vacunacion.findByTipoVacuna", query = "SELECT v FROM Vacunacion v WHERE v.tipoVacuna = :tipoVacuna")
    , @NamedQuery(name = "Vacunacion.findByFecha", query = "SELECT v FROM Vacunacion v WHERE v.fecha = :fecha")
    , @NamedQuery(name = "Vacunacion.findByDosis", query = "SELECT v FROM Vacunacion v WHERE v.dosis = :dosis")})
public class Vacunacion implements Serializable {

    private static final long serialVersionUID = 1L;
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Basic(optional = false)
    @Column(name = "id_vacunacion")
    private Integer idVacunacion;
    @Size(max = 100)
    @Column(name = "tipo_vacuna")
    private String tipoVacuna;
    @Column(name = "fecha")
    @Temporal(TemporalType.DATE)
    private Date fecha;
    @Size(max = 50)
    @Column(name = "dosis")
    private String dosis;
    @JoinColumn(name = "id_mascota", referencedColumnName = "id_mascota")
    @ManyToOne
    private Mascota idMascota;

    public Vacunacion() {
    }

    public Vacunacion(Integer idVacunacion) {
        this.idVacunacion = idVacunacion;
    }

    public Integer getIdVacunacion() {
        return idVacunacion;
    }

    public void setIdVacunacion(Integer idVacunacion) {
        this.idVacunacion = idVacunacion;
    }

    public String getTipoVacuna() {
        return tipoVacuna;
    }

    public void setTipoVacuna(String tipoVacuna) {
        this.tipoVacuna = tipoVacuna;
    }

    public Date getFecha() {
        return fecha;
    }

    public void setFecha(Date fecha) {
        this.fecha = fecha;
    }

    public String getDosis() {
        return dosis;
    }

    public void setDosis(String dosis) {
        this.dosis = dosis;
    }

    public Mascota getIdMascota() {
        return idMascota;
    }

    public void setIdMascota(Mascota idMascota) {
        this.idMascota = idMascota;
    }

    @Override
    public int hashCode() {
        int hash = 0;
        hash += (idVacunacion != null ? idVacunacion.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof Vacunacion)) {
            return false;
        }
        Vacunacion other = (Vacunacion) object;
        if ((this.idVacunacion == null && other.idVacunacion != null) || (this.idVacunacion != null && !this.idVacunacion.equals(other.idVacunacion))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "Entidades.Vacunacion[ idVacunacion=" + idVacunacion + " ]";
    }
    
}
