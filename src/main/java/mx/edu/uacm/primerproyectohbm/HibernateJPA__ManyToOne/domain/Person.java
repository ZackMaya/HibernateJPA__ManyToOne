package mx.edu.uacm.primerproyectohbm.HibernateJPA__ManyToOne.domain;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;

@Entity
public class Person {

	@Id
	@GeneratedValue
	//Por default genera ID
	private long id;
	
	public Person() {
		super();
		// TODO Auto-generated constructor stub
	}

	/**
	 * @return the id
	 */
	public long getId() {
		return id;
	}

	/**
	 * @param id the id to set
	 */
	public void setId(long id) {
		this.id = id;
	}

	/**
	 * @return the name
	 */
	public String getName() {
		return name;
	}

	/**
	 * @param name the name to set
	 */
	public void setName(String name) {
		this.name = name;
	}

	private String name;
	
	public Person(String name) {
		this.name = name;
	}
}
