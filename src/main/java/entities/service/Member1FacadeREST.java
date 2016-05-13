/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package entities.service;

import cloudinary.ImageHandler;
import com.cloudinary.Cloudinary;
import com.stormpath.sdk.account.Account;
import com.stormpath.sdk.application.Application;
import com.stormpath.sdk.client.Client;
import com.stormpath.sdk.client.Clients;
import entities.Member1;
import java.util.List;
import javax.ejb.Stateless;
import javax.persistence.EntityManager;
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

/**
 *
 * @author Gebruiker
 */
@Stateless
@Path("member")
public class Member1FacadeREST extends AbstractFacade<Member1> {

    @PersistenceContext(unitName = "fjvb_nl.paardenvriendjes2018_war_1.0-SNAPSHOTPU")
    private EntityManager em;

    public Member1FacadeREST() {
        super(Member1.class);
    }

    @POST
    @Override
    @Consumes({MediaType.APPLICATION_XML, MediaType.APPLICATION_JSON})
    public void create(Member1 entity) {
        
        // Handle account registration in StormPath
        try {
            System.out.println("CHECK THIS");
            System.out.println(entity);
            Client client = Clients.builder().build();
            Application application = client.getResource(System.getenv("STORMPATH_APPLICATION_HREF"), Application.class);
            Account account = client.instantiate(Account.class);
            account
                    .setGivenName(entity.getVoornaam())
                    .setSurname(entity.getAchternaam())
                    .setUsername(entity.getVoornaam() + " " + entity.getAchternaam())
                    .setEmail(entity.getInputemail13())
                    .setPassword(entity.getPassword())
                    .getCustomData().put("Id", entity.getId());
            account = application.createAccount(account);
            
        } catch (Exception e) {
            System.out.println("registration did not succeed" + e.getMessage());
        }
        
        // Handle image upload to Cloudinary; 
                 ImageHandler x = new ImageHandler(); 
        Cloudinary cloudinary = x.getImageHandler();
//        cloudinary.upload(fileRef, ObjectUtils.emptyMap());
//         
        
        
        super.create(entity);

    }

    @PUT
    @Path("{id}")
    @Consumes({MediaType.APPLICATION_XML, MediaType.APPLICATION_JSON})
    public void edit(@PathParam("id") Long id, Member1 entity) {
        super.edit(entity);
    }

    @DELETE
    @Path("{id}")
    public void remove(@PathParam("id") Long id) {
        super.remove(super.find(id));
    }

    @GET
    @Path("{id}")
    @Produces({MediaType.APPLICATION_XML, MediaType.APPLICATION_JSON})
    public Member1 find(@PathParam("id") Long id) {
        return super.find(id);
    }

    @GET
    @Override
    @Produces({MediaType.APPLICATION_XML, MediaType.APPLICATION_JSON})
    public List<Member1> findAll() {
        return super.findAll();
    }

    @GET
    @Path("{from}/{to}")
    @Produces({MediaType.APPLICATION_XML, MediaType.APPLICATION_JSON})
    public List<Member1> findRange(@PathParam("from") Integer from, @PathParam("to") Integer to) {
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
