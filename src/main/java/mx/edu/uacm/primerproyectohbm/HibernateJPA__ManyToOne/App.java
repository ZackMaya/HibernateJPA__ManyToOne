package mx.edu.uacm.primerproyectohbm.HibernateJPA__ManyToOne;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;

import mx.edu.uacm.primerproyectohbm.HibernateJPA__ManyToOne.domain.Person;
import mx.edu.uacm.primerproyectohbm.HibernateJPA__ManyToOne.domain.Phone;


/**
 * Hello world!
 *
 */
public class App 
{
	 public static void main( String[] args )
	    {
	    	//JPA proporciona dentro de la clase persistence un metodo createEntityManagerFactory que nos
	    	//permite cargar el archivo de configuraciÃ³n 
	    	EntityManagerFactory emf = Persistence.createEntityManagerFactory("HibernateJPA__ManyToOne");
	    	
	    	//Creamos un EntityManager
	    	//Similar al session de hibernate
	    	EntityManager em = emf.createEntityManager();
	    	

		Person person = new Person("Zack");
		em.getTransaction().begin();
		
		em.persist(person);

		Phone phone = new Phone("884848484");
		phone.setPerson(person);
		em.persist(phone);  

		em.flush();
		//phone.setPerson(null);	
	    	
	    	em.getTransaction().commit();
		
	    	//Metodos de cierre 
	    	em.close();
	    	emf.close();
	    	
	    }
}
