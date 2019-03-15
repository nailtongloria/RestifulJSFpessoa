/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package util;

import java.util.ArrayList;
import java.util.List;
import javax.persistence.EntityManager;
import javax.persistence.Query;
import javax.ws.rs.Consumes;
import javax.ws.rs.GET;
import static javax.ws.rs.HttpMethod.GET;
import static javax.ws.rs.HttpMethod.POST;
import javax.ws.rs.POST;
import javax.ws.rs.Path;
import javax.ws.rs.PathParam;
import javax.ws.rs.Produces;
import javax.ws.rs.QueryParam;
import javax.ws.rs.core.MediaType;
import modelo.Pessoa;

/**
 *
 * @author nailton viana gloria
 */
@Path("/Pessoa")
public class OperacaoResource {

    PessoaDao dao = new PessoaDao();
  @GET
    @Path("/consultar/xml/{id}")
    @Produces(MediaType.APPLICATION_XML)

    public String busca(@PathParam("id") long id) {

        Pessoa pessoa = new PessoaDao().visualizar(id);
        return pessoa.toXML();

    }

    @GET
    @Path("/Listar")
    @Produces(MediaType.APPLICATION_XML)

    public List<Pessoa> busca() {
        List<Pessoa> pessoas = new PessoaDao().listarPessoas();
       return pessoas;
    }
    
   
}
