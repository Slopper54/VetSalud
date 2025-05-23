/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Entidades;

import java.io.Serializable;
import java.util.Collection;
import javax.persistence.Basic;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.NamedQueries;
import javax.persistence.NamedQuery;
import javax.persistence.OneToMany;
import javax.persistence.Table;
import javax.validation.constraints.NotNull;
import javax.validation.constraints.Size;
import javax.xml.bind.annotation.XmlRootElement;
import javax.xml.bind.annotation.XmlTransient;

/**
 *
 * @author samuel
 */
@Entity
@Table(name = "dueno")
@XmlRootElement
@NamedQueries({
    @NamedQuery(name = "Dueno.findAll", query = "SELECT d FROM Dueno d")
    , @NamedQuery(name = "Dueno.findByIdDueno", query = "SELECT d FROM Dueno d WHERE d.idDueno = :idDueno")
    , @NamedQuery(name = "Dueno.findByNombre", query = "SELECT d FROM Dueno d WHERE d.nombre = :nombre")
    , @NamedQuery(name = "Dueno.findByEmail", query = "SELECT d FROM Dueno d WHERE d.email = :email")
    , @NamedQuery(name = "Dueno.findByTelefono", query = "SELECT d FROM Dueno d WHERE d.telefono = :telefono")})
public class Dueno implements Serializable {

    private static final long serialVersionUID = 1L;
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Basic(optional = false)
    @Column(name = "id_dueno")
    private Integer idDueno;
    @Basic(optional = false)
    @NotNull
    @Size(min = 1, max = 100)
    @Column(name = "nombre")
    private String nombre;
    // @Pattern(regexp="[a-z0-9!#$%&'*+/=?^_`{|}~-]+(?:\\.[a-z0-9!#$%&'*+/=?^_`{|}~-]+)*@(?:[a-z0-9](?:[a-z0-9-]*[a-z0-9])?\\.)+[a-z0-9](?:[a-z0-9-]*[a-z0-9])?", message="Correo electrónico no válido")//if the field contains email address consider using this annotation to enforce field validation
    @Size(max = 100)
    @Column(name = "email")
    private String email;
    @Size(max = 20)
    @Column(name = "telefono")
    private String telefono;
    @OneToMany(mappedBy = "idDueno")
    private Collection<Mascota> mascotaCollection;

    public Dueno() {
    }

    public Dueno(Integer idDueno) {
        this.idDueno = idDueno;
    }

    public Dueno(Integer idDueno, String nombre) {
        this.idDueno = idDueno;
        this.nombre = nombre;
    }

    public Integer getIdDueno() {
        return idDueno;
    }

    public void setIdDueno(Integer idDueno) {
        this.idDueno = idDueno;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getTelefono() {
        return telefono;
    }

    public void setTelefono(String telefono) {
        this.telefono = telefono;
    }

    @XmlTransient
    public Collection<Mascota> getMascotaCollection() {
        return mascotaCollection;
    }

    public void setMascotaCollection(Collection<Mascota> mascotaCollection) {
        this.mascotaCollection = mascotaCollection;
    }

    @Override
    public int hashCode() {
        int hash = 0;
        hash += (idDueno != null ? idDueno.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof Dueno)) {
            return false;
        }
        Dueno other = (Dueno) object;
        if ((this.idDueno == null && other.idDueno != null) || (this.idDueno != null && !this.idDueno.equals(other.idDueno))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "Entidades.Dueno[ idDueno=" + idDueno + " ]";
    }
    
}
