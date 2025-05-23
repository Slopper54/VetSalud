/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Entidades.service;

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
        resources.add(Entidades.service.CitaFacadeREST.class);
        resources.add(Entidades.service.DuenoFacadeREST.class);
        resources.add(Entidades.service.FacturaFacadeREST.class);
        resources.add(Entidades.service.HistoriaclinicaFacadeREST.class);
        resources.add(Entidades.service.MascotaFacadeREST.class);
        resources.add(Entidades.service.TratamientoFacadeREST.class);
        resources.add(Entidades.service.VacunacionFacadeREST.class);
        resources.add(Entidades.service.VeterinarioFacadeREST.class);
    }
    
}
