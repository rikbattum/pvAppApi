/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package filter;

import javax.ws.rs.container.ContainerRequestContext;
import javax.ws.rs.container.ContainerResponseContext;
import javax.ws.rs.container.ContainerResponseFilter;
import java.io.IOException;
import javax.persistence.PersistenceContext;
import javax.ws.rs.ext.Provider;

/**
 *
 * @author Gebruiker
 */

@Provider

public class corsFilter implements ContainerResponseFilter {

    @PersistenceContext(unitName = "fjvb_nl.paardenvriendjes2018_war_1.0-SNAPSHOTPU")
    
    @Override
     public void filter(ContainerRequestContext requestContext, ContainerResponseContext responseContext)
            throws IOException {
        responseContext.getHeaders().add("Access-Control-Allow-Origin", "*");
        responseContext.getHeaders().add("Access-Control-Allow-Credentials", "true");
        responseContext.getHeaders().add("Access-Control-Allow-Methods", "GET, POST, PUT, DELETE, OPTIONS, HEAD");
        responseContext.getHeaders().add("Access-Control-Allow-Headers", "Origin, token, Accept, X-Requested-With, Content-Type, Access-Control-Request-Method, Access-Control-Request-Headers");
        responseContext.getHeaders().add("Access-Control-Max-Age", "1209600");

    }

}
