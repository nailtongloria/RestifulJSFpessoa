package modelo;

import java.util.Calendar;
import javax.annotation.Generated;
import javax.persistence.metamodel.SingularAttribute;
import javax.persistence.metamodel.StaticMetamodel;

@Generated(value = "org.hibernate.jpamodelgen.JPAMetaModelEntityProcessor")
@StaticMetamodel(Pessoa.class)
public abstract class Pessoa_ {

	public static volatile SingularAttribute<Pessoa, Long> id;
	public static volatile SingularAttribute<Pessoa, Cidade> cidade;
	public static volatile SingularAttribute<Pessoa, String> idade;
	public static volatile SingularAttribute<Pessoa, Logradouro> logradouro;
	public static volatile SingularAttribute<Pessoa, Calendar> data;
	public static volatile SingularAttribute<Pessoa, String> ocupacao;
	public static volatile SingularAttribute<Pessoa, SexoEnum> sexo;
	public static volatile SingularAttribute<Pessoa, String> nome;

}

