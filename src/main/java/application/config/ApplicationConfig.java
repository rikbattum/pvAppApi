/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package application.config;

import java.util.Set;
import javax.ws.rs.core.Application;

/**
 *
 * @author Gebruiker
 */
@javax.ws.rs.ApplicationPath("paardenvriendjes")
public class ApplicationConfig extends Application {

    @Override
    public Set<Class<?>> getClasses() {
        Set<Class<?>> resources = new java.util.HashSet<>();
        addRestResourceClasses(resources);
       resources.add(filter.corsFilter.class);
       
        return resources;
    }
    private void addRestResourceClasses(Set<Class<?>> resources) {
    //Add filters for CROSS DOMAIN issues: 
        resources.add(entities.service.Member1FacadeREST.class);
        resources.add(entities.service.SessionFacadeREST.class);
        resources.add(filter.corsFilter.class);
    }
}
