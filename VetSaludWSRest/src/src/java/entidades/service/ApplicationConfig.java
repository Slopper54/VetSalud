/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package entidades.service;

import java.util.Set;
import javax.ws.rs.core.Application;

/**
 *
 * @author samuel
 */
@javax.ws.rs.ApplicationPath("webresources")
public class ApplicationConfig extends Application {

    @Override
    public Set<Class<?>> getClasses() {
        Set<Class<?>> resources = new java.util.HashSet<>();
        addRestResourceClasses(resources);
        return resources;
    }

    /**
     * Do not modify addRestResourceClasses() method.
     * It is automatically populated with
     * all resources defined in the project.
     * If required, comment out calling this method in getClasses().
     */
    private void addRestResourceClasses(Set<Class<?>> resources) {
        resources.add(entidades.service.CitaFacadeREST.class);
        resources.add(entidades.service.DuenoFacadeREST.class);
        resources.add(entidades.service.FacturaFacadeREST.class);
        resources.add(entidades.service.HistoriaclinicaFacadeREST.class);
        resources.add(entidades.service.MascotaFacadeREST.class);
        resources.add(entidades.service.TratamientoFacadeREST.class);
        resources.add(entidades.service.VacunacionFacadeREST.class);
        resources.add(entidades.service.VeterinarioFacadeREST.class);
    }
    
}
