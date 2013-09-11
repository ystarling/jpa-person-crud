package dao;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;
import entity.Person;

public class PersonDao {
	private static EntityManagerFactory emf = Persistence
			.createEntityManagerFactory("person-unit");;
	private EntityManager em;

	public PersonDao() {
	}

	public void insert(Person person){
		em = emf.createEntityManager();
		em.getTransaction().begin();
		em.persist(person);
		em.getTransaction().commit();
		em.close();
	}
	
	public void update(Person person){
		em = emf.createEntityManager();
		em.getTransaction().begin();
		
		em.getTransaction().commit();
		em.close();
	}
	
	public void delete(Person person){
		em = emf.createEntityManager();
		em.getTransaction().begin();
		
		em.getTransaction().commit();
		em.close();
	}
	
	public void list(Person person){
		em = emf.createEntityManager();
		em.getTransaction().begin();
		
		em.getTransaction().commit();
		em.close();
	}

}
