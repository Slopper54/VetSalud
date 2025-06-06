/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package actions;

import WS.duenoWS;
import WS.mascotaWS;
import com.opensymphony.xwork2.ActionSupport;
import entidad.Dueno;
import entidad.Mascota;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.List;
import javax.ws.rs.core.GenericType;

/**
 *
 * @author samuel
 */
public class MascotaAction extends ActionSupport {
    
    private String id;
    private String nombreMascota;
    private String raza;
    private String especie;
    private String fechaNacimientoStr;
    private Date fechaNacimiento;
    private String dni;
    private String mensaje;
    private List<Mascota> listaMascota;
    private List<String> filtro;
    
    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getNombreMascota() {
        return nombreMascota;
    }

    public void setNombreMascota(String nombreMascota) {
        this.nombreMascota = nombreMascota;
    }

    public String getRaza() {
        return raza;
    }

    public void setRaza(String raza) {
        this.raza = raza;
    }

    public String getEspecie() {
        return especie;
    }

    public void setEspecie(String especie) {
        this.especie = especie;
    }

    public String getFechaNacimientoStr() {
        return fechaNacimientoStr;
    }

    public void setFechaNacimientoStr(String fechaNacimientoStr) {
        this.fechaNacimientoStr = fechaNacimientoStr;
    }

    public Date getFechaNacimiento() {
        return fechaNacimiento;
    }

    public void setFechaNacimiento(Date fechaNacimiento) {
        this.fechaNacimiento = fechaNacimiento;
    }

    public String getDni() {
        return dni;
    }

    public void setDni(String dni) {
        this.dni = dni;
    }

    public String getMensaje() {
        return mensaje;
    }

    public void setMensaje(String mensaje) {
        this.mensaje = mensaje;
    }

    public mascotaWS getMascotaClient() {
        return mascotaClient;
    }

    public void setMascotaClient(mascotaWS mascotaClient) {
        this.mascotaClient = mascotaClient;
    }

    public duenoWS getDuenoClient() {
        return duenoClient;
    }

    public void setDuenoClient(duenoWS duenoClient) {
        this.duenoClient = duenoClient;
    }

    public List<Mascota> getListaMascota() {
        return listaMascota;
    }

    public void setListaMascota(List<Mascota> listaMascota) {
        this.listaMascota = listaMascota;
    }
    
    
    
    private mascotaWS mascotaClient = new mascotaWS();
    private duenoWS duenoClient = new duenoWS();
    
    public MascotaAction() {
    }
    
    public String create() throws Exception {
        
        try{
            
            Dueno dueno = duenoClient.findbyDNI(new GenericType<Dueno>() {}, dni);
           
            if(dueno == null){
                mensaje="Dueño no encontrado";
                return ERROR;                
            }
            
            SimpleDateFormat sdf = new SimpleDateFormat("yyyy-MM-dd");
            fechaNacimiento = sdf.parse(fechaNacimientoStr);
            if(fechaNacimiento == null){
                mensaje="Erro en el formato de la fecha";
                return ERROR;                
            }
            Mascota mascota = new Mascota(nombreMascota,raza,especie,fechaNacimiento,dueno);    
            
            mascotaClient.create(mascota);
            
            return SUCCESS;
        } catch (Exception e){
            mensaje=""+e;
            return ERROR;
        }
    }
    
    public String upgrade() throws Exception {
        try{
            Mascota mascota = mascotaClient.find(new GenericType<Mascota>() {}, id);
            
            if(mascota == null){
                mensaje="No se ha encontrado la mascota";
                return ERROR;
            }
            
            if(nombreMascota != null && !nombreMascota.trim().isEmpty()){
                mascota.setNombre(nombreMascota);
            }
            
            if(raza != null && !raza.trim().isEmpty()){
                mascota.setRaza(raza);
            }
            
            if(especie != null && !especie.trim().isEmpty()){
                mascota.setEspecie(especie);
            }
            
            if(fechaNacimientoStr != null && !fechaNacimientoStr.trim().isEmpty()){
                SimpleDateFormat sdf = new SimpleDateFormat("yyyy-MM-dd");
                fechaNacimiento = sdf.parse(fechaNacimientoStr);
                
                if(fechaNacimiento == null){
                    mensaje="Erro en el formato de la fecha";
                    return ERROR;                
                }
                
                mascota.setFechaNacimiento(fechaNacimiento);
            }
            
            if(dni != null && !dni.trim().isEmpty()){
                Dueno dueno = duenoClient.findbyDNI(new GenericType<Dueno>() {}, dni);
           
                if(dueno == null){
                    mensaje="Dueño no encontrado";
                    return ERROR;                
                }
                
                mascota.setIdDueno(dueno);
            }
            
            mascotaClient.edit(mascota, Integer.toString(mascota.getId()));
            
            return SUCCESS;
        } catch(Exception e){
            mensaje=""+e;
            return ERROR;
        }
    }
    
    
    public String delete() throws Exception {
        
        try{
            Mascota mascota = mascotaClient.find(new GenericType<Mascota>() {}, id);
            
            if(mascota==null){
                mensaje="No se ha encontrado la mascota";
                return ERROR;
            }
            
            mascotaClient.remove(id);
            
            return SUCCESS;
        } catch (Exception e){
            mensaje=""+e;
            return ERROR;
        }
    }
    
    
    public String list() throws Exception {
        
        try{
            listaMascota = mascotaClient.findAll(new GenericType<List<Mascota>>() {});
            
            if(listaMascota==null){
                mensaje="No se han encontrado mascotas";
                return ERROR;
            }
            
            
            
            return SUCCESS;
        } catch (Exception e){
            mensaje=""+e;
            return ERROR;
        }
    }
    
    public String filter() throws Exception {
        
        try{
            listaMascota = mascotaClient.filtrar(new GenericType<List<Mascota>>() {}, especie, raza, id, nombreMascota);
            
            if(listaMascota==null){
                mensaje="No se han encontrado mascotas";
                return ERROR;
            }
            
            
            
            return SUCCESS;
        } catch (Exception e){
            mensaje=""+e;
            return ERROR;
        }
    }
}
