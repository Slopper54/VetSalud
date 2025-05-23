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
@Table(name = "veterinario")
@XmlRootElement
@NamedQueries({
    @NamedQuery(name = "Veterinario.findAll", query = "SELECT v FROM Veterinario v")
    , @NamedQuery(name = "Veterinario.findByIdVeterinario", query = "SELECT v FROM Veterinario v WHERE v.idVeterinario = :idVeterinario")
    , @NamedQuery(name = "Veterinario.findByNombre", query = "SELECT v FROM Veterinario v WHERE v.nombre = :nombre")
    , @NamedQuery(name = "Veterinario.findByEspecialidad", query = "SELECT v FROM Veterinario v WHERE v.especialidad = :especialidad")
    , @NamedQuery(name = "Veterinario.findByEmail", query = "SELECT v FROM Veterinario v WHERE v.email = :email")})
public class Veterinario implements Serializable {

    private static final long serialVersionUID = 1L;
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Basic(optional = false)
    @Column(name = "id_veterinario")
    private Integer idVeterinario;
    @Basic(optional = false)
    @NotNull
    @Size(min = 1, max = 100)
    @Column(name = "nombre")
    private String nombre;
    @Size(max = 100)
    @Column(name = "especialidad")
    private String especialidad;
    // @Pattern(regexp="[a-z0-9!#$%&'*+/=?^_`{|}~-]+(?:\\.[a-z0-9!#$%&'*+/=?^_`{|}~-]+)*@(?:[a-z0-9](?:[a-z0-9-]*[a-z0-9])?\\.)+[a-z0-9](?:[a-z0-9-]*[a-z0-9])?", message="Correo electrónico no válido")//if the field contains email address consider using this annotation to enforce field validation
    @Size(max = 100)
    @Column(name = "email")
    private String email;
    @OneToMany(mappedBy = "idVeterinario")
    private Collection<Cita> citaCollection;

    public Veterinario() {
    }

    public Veterinario(Integer idVeterinario) {
        this.idVeterinario = idVeterinario;
    }

    public Veterinario(Integer idVeterinario, String nombre) {
        this.idVeterinario = idVeterinario;
        this.nombre = nombre;
    }

    public Integer getIdVeterinario() {
        return idVeterinario;
    }

    public void setIdVeterinario(Integer idVeterinario) {
        this.idVeterinario = idVeterinario;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getEspecialidad() {
        return especialidad;
    }

    public void setEspecialidad(String especialidad) {
        this.especialidad = especialidad;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    @XmlTransient
    public Collection<Cita> getCitaCollection() {
        return citaCollection;
    }

    public void setCitaCollection(Collection<Cita> citaCollection) {
        this.citaCollection = citaCollection;
    }

    @Override
    public int hashCode() {
        int hash = 0;
        hash += (idVeterinario != null ? idVeterinario.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof Veterinario)) {
            return false;
        }
        Veterinario other = (Veterinario) object;
        if ((this.idVeterinario == null && other.idVeterinario != null) || (this.idVeterinario != null && !this.idVeterinario.equals(other.idVeterinario))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "Entidades.Veterinario[ idVeterinario=" + idVeterinario + " ]";
    }
    
}
