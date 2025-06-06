/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package actions;

import WS.veterinarioWS;
import com.opensymphony.xwork2.ActionSupport;
import entidad.Veterinario;
import java.util.List;
import javax.ws.rs.core.GenericType;

/**
 *
 * @author samuel
 */
public class VeterinarioAction extends ActionSupport {

    private String nombre, especialidad, email, mensaje, id;
    private List<Veterinario> listaVeterinario;

    private veterinarioWS veterinarioClient = new veterinarioWS();

    public VeterinarioAction() {
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

    public String getMensaje() {
        return mensaje;
    }

    public void setMensaje(String mensaje) {
        this.mensaje = mensaje;
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public List<Veterinario> getListaVeterinario() {
        return listaVeterinario;
    }

    public void setListaVeterinario(List<Veterinario> listaVeterinario) {
        this.listaVeterinario = listaVeterinario;
    }

    public veterinarioWS getVeterinarioClient() {
        return veterinarioClient;
    }

    public void setVeterinarioClient(veterinarioWS veterinarioClient) {
        this.veterinarioClient = veterinarioClient;
    }

    public String create() throws Exception {

        try {
            mensaje = "1";
            Veterinario veterinario = new Veterinario(nombre, especialidad, email);
            veterinarioClient.create_XML(veterinario);

            return SUCCESS;
        } catch (Exception e) {
            mensaje += " " + e;
            return ERROR;
        }
    }

    public String upgrade() throws Exception {
        try {
            Veterinario veterinario = veterinarioClient.find_XML(new GenericType<Veterinario>() {
            }, id);

            if (veterinario == null) {
                mensaje = "No se ha encontrado la veterinario";
                return ERROR;
            }

            if (nombre != null && !nombre.trim().isEmpty()) {
                veterinario.setNombre(nombre);
            }

            if (especialidad != null && !especialidad.trim().isEmpty()) {
                veterinario.setEspecialidad(especialidad);
            }

            if (email != null && !email.trim().isEmpty()) {
                veterinario.setEmail(email);
            }

            veterinarioClient.edit_XML(veterinario, Integer.toString(veterinario.getId()));

            return SUCCESS;
        } catch (Exception e) {
            mensaje = "" + e;
            return ERROR;
        }
    }

    public String delete() throws Exception {
        try {
            Veterinario veterinario = veterinarioClient.find_XML(new GenericType<Veterinario>() {
            }, id);

            if (veterinario == null) {
                mensaje = "No se ha encontrado la veterinario";
                return ERROR;
            }

            veterinarioClient.remove(id);

            return SUCCESS;
        } catch (Exception e) {
            mensaje = "" + e;
            return ERROR;
        }
    }

    public String list() throws Exception {

        try {
            listaVeterinario = veterinarioClient.findAll_XML(new GenericType<List<Veterinario>>() {
            });

            if (listaVeterinario == null) {
                mensaje = "No se han encontrado veterinarios";
                return ERROR;
            }

            return SUCCESS;
        } catch (Exception e) {
            mensaje = "" + e;
            return ERROR;
        }
    }

    public String filter() throws Exception {

        try {
            listaVeterinario = veterinarioClient.filtrar(new GenericType<List<Veterinario>>() {
            }, especialidad, email, id, nombre);

            if (listaVeterinario == null) {
                mensaje = "No se han encontrado veterinarios";
                return ERROR;
            }

            return SUCCESS;
        } catch (Exception e) {
            mensaje = "" + e;
            return ERROR;
        }
    }

}
