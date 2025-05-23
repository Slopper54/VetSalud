/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package entidades;

import java.io.Serializable;
import java.util.Collection;
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
import javax.persistence.OneToMany;
import javax.persistence.Table;
import javax.persistence.Temporal;
import javax.persistence.TemporalType;
import javax.validation.constraints.NotNull;
import javax.validation.constraints.Size;
import javax.xml.bind.annotation.XmlRootElement;
import javax.xml.bind.annotation.XmlTransient;

/**
 *
 * @author samuel
 */
@Entity
@Table(name = "mascota")
@XmlRootElement
@NamedQueries({
    @NamedQuery(name = "Mascota.findAll", query = "SELECT m FROM Mascota m")
    , @NamedQuery(name = "Mascota.findById", query = "SELECT m FROM Mascota m WHERE m.id = :id")
    , @NamedQuery(name = "Mascota.findByNombre", query = "SELECT m FROM Mascota m WHERE m.nombre = :nombre")
    , @NamedQuery(name = "Mascota.findByEspecie", query = "SELECT m FROM Mascota m WHERE m.especie = :especie")
    , @NamedQuery(name = "Mascota.findByRaza", query = "SELECT m FROM Mascota m WHERE m.raza = :raza")
    , @NamedQuery(name = "Mascota.findByFechaNacimiento", query = "SELECT m FROM Mascota m WHERE m.fechaNacimiento = :fechaNacimiento")})
public class Mascota implements Serializable {

    private static final long serialVersionUID = 1L;
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Basic(optional = false)
    @Column(name = "id")
    private Integer id;
    @Basic(optional = false)
    @NotNull
    @Size(min = 1, max = 100)
    @Column(name = "nombre")
    private String nombre;
    @Size(max = 50)
    @Column(name = "especie")
    private String especie;
    @Size(max = 50)
    @Column(name = "raza")
    private String raza;
    @Column(name = "fecha_nacimiento")
    @Temporal(TemporalType.DATE)
    private Date fechaNacimiento;
    @OneToMany(mappedBy = "idMascota")
    private Collection<Vacunacion> vacunacionCollection;
    @JoinColumn(name = "id_dueno", referencedColumnName = "id")
    @ManyToOne
    private Dueno idDueno;
    @OneToMany(mappedBy = "idMascota")
    private Collection<Historiaclinica> historiaclinicaCollection;
    @OneToMany(mappedBy = "idMascota")
    private Collection<Cita> citaCollection;
    @OneToMany(mappedBy = "idMascota")
    private Collection<Tratamiento> tratamientoCollection;

    public Mascota() {
    }

    public Mascota(Integer id) {
        this.id = id;
    }

    public Mascota(Integer id, String nombre) {
        this.id = id;
        this.nombre = nombre;
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getEspecie() {
        return especie;
    }

    public void setEspecie(String especie) {
        this.especie = especie;
    }

    public String getRaza() {
        return raza;
    }

    public void setRaza(String raza) {
        this.raza = raza;
    }

    public Date getFechaNacimiento() {
        return fechaNacimiento;
    }

    public void setFechaNacimiento(Date fechaNacimiento) {
        this.fechaNacimiento = fechaNacimiento;
    }

    @XmlTransient
    public Collection<Vacunacion> getVacunacionCollection() {
        return vacunacionCollection;
    }

    public void setVacunacionCollection(Collection<Vacunacion> vacunacionCollection) {
        this.vacunacionCollection = vacunacionCollection;
    }

    public Dueno getIdDueno() {
        return idDueno;
    }

    public void setIdDueno(Dueno idDueno) {
        this.idDueno = idDueno;
    }

    @XmlTransient
    public Collection<Historiaclinica> getHistoriaclinicaCollection() {
        return historiaclinicaCollection;
    }

    public void setHistoriaclinicaCollection(Collection<Historiaclinica> historiaclinicaCollection) {
        this.historiaclinicaCollection = historiaclinicaCollection;
    }

    @XmlTransient
    public Collection<Cita> getCitaCollection() {
        return citaCollection;
    }

    public void setCitaCollection(Collection<Cita> citaCollection) {
        this.citaCollection = citaCollection;
    }

    @XmlTransient
    public Collection<Tratamiento> getTratamientoCollection() {
        return tratamientoCollection;
    }

    public void setTratamientoCollection(Collection<Tratamiento> tratamientoCollection) {
        this.tratamientoCollection = tratamientoCollection;
    }

    @Override
    public int hashCode() {
        int hash = 0;
        hash += (id != null ? id.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof Mascota)) {
            return false;
        }
        Mascota other = (Mascota) object;
        if ((this.id == null && other.id != null) || (this.id != null && !this.id.equals(other.id))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "entidades.Mascota[ id=" + id + " ]";
    }
    
}
