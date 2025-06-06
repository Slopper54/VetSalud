/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package entidades.service;

import entidades.Veterinario;
import java.util.List;
import javax.ejb.Stateless;
import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;
import javax.persistence.TypedQuery;
import javax.ws.rs.Consumes;
import javax.ws.rs.DELETE;
import javax.ws.rs.GET;
import javax.ws.rs.POST;
import javax.ws.rs.PUT;
import javax.ws.rs.Path;
import javax.ws.rs.PathParam;
import javax.ws.rs.Produces;
import javax.ws.rs.QueryParam;
import javax.ws.rs.core.MediaType;

/**
 *
 * @author samuel
 */
@Stateless
@Path("entidades.veterinario")
public class VeterinarioFacadeREST extends AbstractFacade<Veterinario> {

    @PersistenceContext(unitName = "VetSaludWSRestPU")
    private EntityManager em;

    public VeterinarioFacadeREST() {
        super(Veterinario.class);
    }

    @POST
    @Override
    @Consumes({MediaType.APPLICATION_XML, MediaType.APPLICATION_JSON})
    public void create(Veterinario entity) {
        super.create(entity);
    }

    @PUT
    @Path("{id}")
    @Consumes({MediaType.APPLICATION_XML, MediaType.APPLICATION_JSON})
    public void edit(@PathParam("id") Integer id, Veterinario entity) {
        super.edit(entity);
    }

    @DELETE
    @Path("{id}")
    public void remove(@PathParam("id") Integer id) {
        super.remove(super.find(id));
    }

    @GET
    @Path("{id}")
    @Produces({MediaType.APPLICATION_XML, MediaType.APPLICATION_JSON})
    public Veterinario find(@PathParam("id") Integer id) {
        return super.find(id);
    }
    
    @GET
    @Path("filtro")
    @Produces(MediaType.APPLICATION_XML)
    public List<Veterinario> filtrar(@QueryParam("id") Integer id, @QueryParam("nombre") String nombre, @QueryParam("especialidad") String especialidad, @QueryParam("email") String email) {

        String jpql = "SELECT v FROM Veterinario v WHERE 1=1";
        int comprobante = 0;

        if (id != null) {
            jpql += " AND v.id = :id";
            comprobante = 1;
        }
        if (nombre != null && !nombre.trim().isEmpty()) {
            jpql += " AND v.nombre = :nombre";
            comprobante = 1;
        }
        if (especialidad != null && !especialidad.trim().isEmpty()) {
            jpql += " AND v.especialidad = :especialidad";
            comprobante = 1;
        }

        if (email != null && !email.trim().isEmpty()) {
            jpql += " AND v.email = :email";
            comprobante = 1;
        }

        if (comprobante == 0) {
            return findAll();
        }

        TypedQuery<Veterinario> query = em.createQuery(jpql, Veterinario.class);

        if (id != null) {
            query.setParameter("id", id);
        }
        if (nombre != null && !nombre.trim().isEmpty()) {
            query.setParameter("nombre", nombre);
        }
        if (especialidad != null && !especialidad.trim().isEmpty()) {
            query.setParameter("especialidad", especialidad);
        }
        if (email != null && !email.trim().isEmpty()) {
            query.setParameter("email", email);
        }

        return query.getResultList();
    }

    @GET
    @Override
    @Produces({MediaType.APPLICATION_XML, MediaType.APPLICATION_JSON})
    public List<Veterinario> findAll() {
        return super.findAll();
    }

    @GET
    @Path("{from}/{to}")
    @Produces({MediaType.APPLICATION_XML, MediaType.APPLICATION_JSON})
    public List<Veterinario> findRange(@PathParam("from") Integer from, @PathParam("to") Integer to) {
        return super.findRange(new int[]{from, to});
    }

    @GET
    @Path("count")
    @Produces(MediaType.TEXT_PLAIN)
    public String countREST() {
        return String.valueOf(super.count());
    }

    @Override
    protected EntityManager getEntityManager() {
        return em;
    }
    
}
