/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package util;

import com.thoughtworks.xstream.XStream;
import java.util.List;
import javax.persistence.EntityManager;
import javax.persistence.Query;
import modelo.Pessoa;

/**
 *
 * @author nailton viana gloria
 */
public class PessoaDao {
    
    EntityManager em=JPAUtil.getJPAUtil();
    
    public List<Pessoa> listarPessoas() {
        Query query = em.createQuery("select p from  Pessoa  p");
        List<Pessoa> pessoas = query.getResultList();
        return pessoas;

    }
    
       public List<Pessoa> getPessoas(String pessoa) {
        String jpql = "select p from Pessoa  p  WHERE p.nome  like :buscaPessoa";
        Query query = em.createQuery(jpql);
        query.setParameter("buscaPessoa", "%" + pessoa + "%");
        return query.getResultList();

    }
       
          public List<Pessoa> getPessoas(long id) {
        String jpql = "select p from Pessoa  p  WHERE p.id ";
        Query query = em.createQuery(jpql);
        //query.setParameter("buscaPessoa" ,   id");
        return query.getResultList();

    }
           public Pessoa visualizar(long id) {
        return em.find(Pessoa.class, id);
    }
           
           public String toXML(){
              return new XStream().toXML(this);
           }
}
