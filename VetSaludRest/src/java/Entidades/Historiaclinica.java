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
import javax.persistence.Lob;
import javax.persistence.ManyToOne;
import javax.persistence.NamedQueries;
import javax.persistence.NamedQuery;
import javax.persistence.Table;
import javax.persistence.Temporal;
import javax.persistence.TemporalType;
import javax.validation.constraints.NotNull;
import javax.validation.constraints.Size;
import javax.xml.bind.annotation.XmlRootElement;

/**
 *
 * @author samuel
 */
@Entity
@Table(name = "historiaclinica")
@XmlRootElement
@NamedQueries({
    @NamedQuery(name = "Historiaclinica.findAll", query = "SELECT h FROM Historiaclinica h")
    , @NamedQuery(name = "Historiaclinica.findByIdHistoria", query = "SELECT h FROM Historiaclinica h WHERE h.idHistoria = :idHistoria")
    , @NamedQuery(name = "Historiaclinica.findByFecha", query = "SELECT h FROM Historiaclinica h WHERE h.fecha = :fecha")})
public class Historiaclinica implements Serializable {

    private static final long serialVersionUID = 1L;
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Basic(optional = false)
    @Column(name = "id_historia")
    private Integer idHistoria;
    @Basic(optional = false)
    @NotNull
    @Column(name = "fecha")
    @Temporal(TemporalType.DATE)
    private Date fecha;
    @Lob
    @Size(max = 65535)
    @Column(name = "resumen")
    private String resumen;
    @JoinColumn(name = "id_mascota", referencedColumnName = "id_mascota")
    @ManyToOne
    private Mascota idMascota;

    public Historiaclinica() {
    }

    public Historiaclinica(Integer idHistoria) {
        this.idHistoria = idHistoria;
    }

    public Historiaclinica(Integer idHistoria, Date fecha) {
        this.idHistoria = idHistoria;
        this.fecha = fecha;
    }

    public Integer getIdHistoria() {
        return idHistoria;
    }

    public void setIdHistoria(Integer idHistoria) {
        this.idHistoria = idHistoria;
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

    @Override
    public int hashCode() {
        int hash = 0;
        hash += (idHistoria != null ? idHistoria.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof Historiaclinica)) {
            return false;
        }
        Historiaclinica other = (Historiaclinica) object;
        if ((this.idHistoria == null && other.idHistoria != null) || (this.idHistoria != null && !this.idHistoria.equals(other.idHistoria))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "Entidades.Historiaclinica[ idHistoria=" + idHistoria + " ]";
    }
    
}
