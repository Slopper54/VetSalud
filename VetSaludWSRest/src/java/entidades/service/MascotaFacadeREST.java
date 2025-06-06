/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package entidades.service;

import entidades.Mascota;
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
@Path("entidades.mascota")
public class MascotaFacadeREST extends AbstractFacade<Mascota> {

    @PersistenceContext(unitName = "VetSaludWSRestPU")
    private EntityManager em;

    public MascotaFacadeREST() {
        super(Mascota.class);
    }

    @POST
    @Override
    @Consumes(MediaType.APPLICATION_XML)
    public void create(Mascota entity) {
        super.create(entity);
    }

    @PUT
    @Path("{id}")
    @Consumes(MediaType.APPLICATION_XML)
    public void edit(@PathParam("id") Integer id, Mascota entity) {
        super.edit(entity);
    }

    @DELETE
    @Path("{id}")
    public void remove(@PathParam("id") Integer id) {
        super.remove(super.find(id));
    }

    @GET
    @Path("{id}")
    @Produces(MediaType.APPLICATION_XML)
    public Mascota find(@PathParam("id") Integer id) {
        return super.find(id);
    }

    @GET
    @Path("filtro")
    @Produces(MediaType.APPLICATION_XML)
    public List<Mascota> filtrar(@QueryParam("id") Integer id, @QueryParam("nombre") String nombre, @QueryParam("raza") String raza, @QueryParam("especie") String especie) {

        String jpql = "SELECT m FROM Mascota m WHERE 1=1";
        int comprobante = 0;

        if (id != null) {
            jpql += " AND m.id = :id";
            comprobante = 1;
        }
        if (nombre != null && !nombre.trim().isEmpty()) {
            jpql += " AND m.nombre = :nombre";
            comprobante = 1;
        }
        if (especie != null && !especie.trim().isEmpty()) {
            jpql += " AND m.especie = :especie";
            comprobante = 1;
        }

        if (raza != null && !raza.trim().isEmpty()) {
            jpql += " AND m.raza = :raza";
            comprobante = 1;
        }

        if (comprobante == 0) {
            return findAll();
        }

        TypedQuery<Mascota> query = em.createQuery(jpql, Mascota.class);

        if (id != null) {
            query.setParameter("id", id);
        }
        if (nombre != null && !nombre.trim().isEmpty()) {
            query.setParameter("nombre", nombre);
        }
        if (especie != null && !especie.trim().isEmpty()) {
            query.setParameter("especie", especie);
        }
        if (raza != null && !raza.trim().isEmpty()) {
            query.setParameter("raza", raza);
        }

        return query.getResultList();
    }

    @GET
    @Override
    @Produces(MediaType.APPLICATION_XML)
    public List<Mascota> findAll() {
        return super.findAll();
    }

    @GET
    @Path("{from}/{to}")
    @Produces(MediaType.APPLICATION_XML)
    public List<Mascota> findRange(@PathParam("from") Integer from, @PathParam("to") Integer to) {
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
