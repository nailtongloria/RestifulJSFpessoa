package modelo;

import javax.annotation.Generated;
import javax.persistence.metamodel.ListAttribute;
import javax.persistence.metamodel.SingularAttribute;
import javax.persistence.metamodel.StaticMetamodel;

@Generated(value = "org.hibernate.jpamodelgen.JPAMetaModelEntityProcessor")
@StaticMetamodel(Logradouro.class)
public abstract class Logradouro_ {

	public static volatile SingularAttribute<Logradouro, Long> id;
	public static volatile SingularAttribute<Logradouro, Cidade> cidade;
	public static volatile SingularAttribute<Logradouro, String> bairro;
	public static volatile SingularAttribute<Logradouro, Estado> estado;
	public static volatile SingularAttribute<Logradouro, String> cep;
	public static volatile SingularAttribute<Logradouro, String> uf;
	public static volatile SingularAttribute<Logradouro, String> logradouro;
	public static volatile ListAttribute<Logradouro, Pessoa> pessoas;

}

