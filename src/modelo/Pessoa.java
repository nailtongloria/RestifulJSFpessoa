/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package modelo;

import com.thoughtworks.xstream.XStream;
import java.io.Serializable;
import java.util.Calendar;
import java.util.Objects;
import javax.persistence.CascadeType;
import javax.persistence.Entity;
import javax.persistence.EnumType;
import javax.persistence.Enumerated;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.ManyToOne;
import javax.persistence.Temporal;
import javax.persistence.TemporalType;

/**
 *
 * @author nailton viana gloria
 */

@Entity
public class Pessoa implements Serializable {

    private static final long serialVersionUID = 1L;

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long id;
    private String nome;
    @Temporal(TemporalType.DATE)
    private Calendar data;
    private String idade;

    @Enumerated(EnumType.STRING)
    private SexoEnum sexo;

    @ManyToOne(cascade = CascadeType.PERSIST)
    private Logradouro logradouro;
    @ManyToOne(cascade = CascadeType.PERSIST)
    private Cidade cidade;
    private String ocupacao;

    public Pessoa() {
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public Calendar getData() {
        return data;
    }

    public void setData(Calendar data) {
        this.data = data;
    }

    public String getIdade() {
        return idade;
    }

    public void setIdade(String idade) {
        this.idade = idade;
    }

    public Logradouro getLogradouro() {
        return logradouro;
    }

    public void setLogradouro(Logradouro logradouro) {
        this.logradouro = logradouro;
    }

    public Cidade getCidade() {
        return cidade;
    }

    public void setCidade(Cidade cidade) {
        this.cidade = cidade;
    }

    public String getOcupacao() {
        return ocupacao;
    }

    public void setOcupacao(String ocupacao) {
        this.ocupacao = ocupacao;
    }

    public SexoEnum getSexo() {
        return sexo;
    }

    public void setSexo(SexoEnum sexo) {
        this.sexo = sexo;
    }

    @Override
    public String toString() {
        return id + " " + nome + " " + data + " " + idade + " " + sexo + " " + logradouro + " " + cidade + " " + ocupacao;
    }

    @Override
    public int hashCode() {
        int hash = 3;
        hash = 97 * hash + Objects.hashCode(this.id);
        hash = 97 * hash + Objects.hashCode(this.nome);
        hash = 97 * hash + Objects.hashCode(this.data);
        hash = 97 * hash + Objects.hashCode(this.idade);
        hash = 97 * hash + Objects.hashCode(this.sexo);
        hash = 97 * hash + Objects.hashCode(this.logradouro);
        hash = 97 * hash + Objects.hashCode(this.cidade);
        hash = 97 * hash + Objects.hashCode(this.ocupacao);
        return hash;
    }

    @Override
    public boolean equals(Object obj) {
        if (obj == null) {
            return false;
        }
        if (getClass() != obj.getClass()) {
            return false;
        }
        final Pessoa other = (Pessoa) obj;
        if (!Objects.equals(this.id, other.id)) {
            return false;
        }
        if (!Objects.equals(this.nome, other.nome)) {
            return false;
        }
        if (!Objects.equals(this.data, other.data)) {
            return false;
        }
        if (!Objects.equals(this.idade, other.idade)) {
            return false;
        }
        if (this.sexo != other.sexo) {
            return false;
        }
        if (!Objects.equals(this.logradouro, other.logradouro)) {
            return false;
        }
        if (!Objects.equals(this.cidade, other.cidade)) {
            return false;
        }
        if (!Objects.equals(this.ocupacao, other.ocupacao)) {
            return false;
        }
        return true;
    }
    
     public String toXML(){
              return new XStream().toXML(this);
             
           }

}
