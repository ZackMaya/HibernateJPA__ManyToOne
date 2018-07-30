package mx.edu.uacm.primerproyectohbm.HibernateJPA__ManyToOne.domain;

import javax.persistence.Entity;
import javax.persistence.ForeignKey;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;


@Entity
public class Phone {

	@Id
	private long id;
	private String number;
	
	@ManyToOne
	
	/*Vamos a delimitar que la columna que va a unir ambas tablas de una clave externa
	 * El nombre de la restrcción externa a tráves de la anotación foreign key*/
	
	@JoinColumn(name="person_id", foreignKey = @ForeignKey(name="PERSON_ID_FK"))
	
	private Person person;
	
	

	public Phone() {
		super();
		// TODO Auto-generated constructor stub
	}
	
	public Phone (String number) {
		this.number= number;
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
	 * @return the number
	 */
	public String getNumber() {
		return number;
	}

	/**
	 * @param number the number to set
	 */
	public void setNumber(String number) {
		this.number = number;
	}

	/**
	 * @return the person
	 */
	public Person getPerson() {
		return person;
	}

	/**
	 * @param person the person to set
	 */
	public void setPerson(Person person) {
		this.person = person;
	}

}
