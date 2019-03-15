/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package util;

import com.sun.jersey.api.container.httpserver.HttpServerFactory;
import com.sun.net.httpserver.HttpServer;
import java.io.IOException;

/**
 *
 * @author nailton viana gloria
 */
public class Publicador {
    
    public static void main(String[ ] args) throws IOException{
        
        HttpServer server =HttpServerFactory.create("http://localhost:1010/");
        System.out.println("Servidor HTTP para restful exeutando...");
        server.start();
        
    }
    
}
