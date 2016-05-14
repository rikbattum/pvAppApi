/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Account;

import com.stormpath.sdk.application.Application;
import com.stormpath.sdk.client.Client;
import com.stormpath.sdk.client.Clients;
import com.stormpath.sdk.account.Account;

/**
 *
 * @author Gebruiker
 */
public final class AccountHandler {

    private Client client;
    private Application application;

    public AccountHandler() {
        
    }

    public void createNewUser(String firstName, String surName, String userName, String email, String passWord, Long id) {
      try { 
       client = Clients.builder().build();
             application = client.getResource(System.getenv("STORMPATH_APPLICATION_HREF"), Application.class);
        Account account = this.client.instantiate(Account.class);
        account.setGivenName(firstName)
                .setSurname(surName)
                .setUsername(userName)
                .setEmail(email)
                .setPassword(passWord)
                .getCustomData().put("Id", id);
        account = this.application.createAccount(account);
    }
      catch (Exception e) { 
          System.err.println("this is shit" + e.getStackTrace());
      }
          
      }
}
