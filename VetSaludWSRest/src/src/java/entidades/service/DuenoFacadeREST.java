/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package entidades.service;

import entidades.Dueno;
import java.util.List;
import javax.ejb.Stateless;
import javax.persistence.EntityManager;
import javax.persistence.NoResultException;
import javax.persistence.PersistenceContext;
import javax.ws.rs.Consumes;
import javax.ws.rs.DELETE;
import javax.ws.rs.GET;
import javax.ws.rs.POST;
import javax.ws.rs.PUT;
import javax.ws.rs.Path;
import javax.ws.rs.PathParam;
import javax.ws.rs.Produces;
import javax.ws.rs.core.MediaType;
import javax.ws.rs.core.Response;

/**
 *
 * @author samuel
 */
@Stateless
@Path("entidades.dueno")
public class DuenoFacadeREST extends AbstractFacade<Dueno> {

    @PersistenceContext(unitName = "VetSaludWSRestPU")
    private EntityManager em;

    public DuenoFacadeREST() {
        super(Dueno.class);
    }

    @POST
    @Override
    @Consumes({MediaType.APPLICATION_XML, MediaType.APPLICATION_JSON})
    public void create(Dueno entity) {
        super.create(entity);
    }

    @PUT
    @Path("{id}")
    @Consumes({MediaType.APPLICATION_XML, MediaType.APPLICATION_JSON})
    public void edit(@PathParam("id") Integer id, Dueno entity) {
        super.edit(entity);
    }

    @PUT
    @Path("dni/{dni}")
    @Consumes({MediaType.APPLICATION_XML, MediaType.APPLICATION_JSON})
    public void editByDNI(@PathParam("dni") String dni, Dueno entity) {
        Dueno existente = em.createQuery("SELECT d FROM Dueno d WHERE d.dni = :dni", Dueno.class)
                .setParameter("dni", dni)
                .getSingleResult();
        existente.setNombre(entity.getNombre());
        existente.setTelefono(entity.getTelefono());
        existente.setEmail(entity.getEmail());
        em.merge(existente);
    }

    @DELETE
    @Path("{id}")
    public void remove(@PathParam("id") Integer id) {
        super.remove(super.find(id));
    }

    @DELETE
    @Path("dni/{dni}")
    public void removeByDNI(@PathParam("dni") String dni) {
        Dueno dueno = em.createQuery("SELECT d FROM Dueno d WHERE d.dni = :dni", Dueno.class)
                .setParameter("dni", dni)
                .getSingleResult();
        em.remove(dueno);
    }

    @GET
    @Path("id/{id}")
    @Produces({MediaType.APPLICATION_XML, MediaType.APPLICATION_JSON})
    public Dueno find(@PathParam("id") Integer id) {
        return super.find(id);
    }

    @GET
    @Override
    @Produces({MediaType.APPLICATION_XML, MediaType.APPLICATION_JSON})
    public List<Dueno> findAll() {
        return super.findAll();
    }

    @GET
    @Path("{from}/{to}")
    @Produces({MediaType.APPLICATION_XML, MediaType.APPLICATION_JSON})
    public List<Dueno> findRange(@PathParam("from") Integer from, @PathParam("to") Integer to) {
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

    @GET
    @Path("dni/{dni}")
    @Produces(MediaType.APPLICATION_XML)
    public Response findbyDNI(@PathParam("dni") String dni) {
        try {
            Dueno dueno = em
                    .createQuery("SELECT d FROM Dueno d WHERE d.dni = :dni", Dueno.class)
                    .setParameter("dni", dni)
                    .getSingleResult();

            return Response.ok(dueno).build();
        } catch (NoResultException e) {
            return Response.status(Response.Status.NOT_FOUND)
                    .entity("Dueño no encontrado: " + dni)
                    .build();
        }
    }
}
