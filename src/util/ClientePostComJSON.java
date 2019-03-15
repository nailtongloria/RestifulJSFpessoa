/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package util;

import com.sun.jersey.api.client.Client;
import com.sun.jersey.api.client.WebResource;
import modelo.Pessoa;



/**
 *
 * @author nailton viana gloria
 */
public class ClientePostComJSON {

    public static void main(String[] args){
    
      try{
        Pessoa p = new Pessoa();
        Client cliente =Client.create();
        WebResource recurso = cliente.resource("http://localhost:1010/Pessoa/consultar/xml/10");
        //String json = recurso.type("application/json").post(String.class,p);
         String recursoXML =recurso.get(String.class);
            System.out.println("recurso xml "+recursoXML);
            Pessoa recursoPessoa = recurso.get(Pessoa.class);
            System.out.println("recurso pessoa: "+recursoPessoa.getNome());
            System.out.println("pessoa nome: "+recursoPessoa.getOcupacao());
            
        
        }catch(Exception e){
            System.out.println("mensagem "+e.getMessage());
        }
    }

}
