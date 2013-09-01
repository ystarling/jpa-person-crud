import javax.persistence.*;

import org.junit.Test;

import entity.Person;


public class JpaTest {

	@Test
	public void testUnit(){
		EntityManagerFactory factory =   Persistence.createEntityManagerFactory("jdbc_unit");
		EntityManager em = factory.createEntityManager();
		// Create it
		Person t = new Person();
		t.setFirstName("Test");
		t.setLastname("sss");
		t.setAge(234);
		// Add it
		EntityTransaction trans = em.getTransaction();
		trans.begin();
		em.persist(t);
		trans.commit();
		// Fetch them

		// Close the entity manager
		em.close();
		factory.close();
	}
	
	
	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		// Setup the entity manager
		EntityManagerFactory factory =   Persistence.createEntityManagerFactory("jdbc_unit");
		EntityManager em = factory.createEntityManager();
		// Create it
		Person t = new Person();
		t.setFirstName("Test");
		t.setLastname("sss");
		t.setAge(234);
		// Add it
		EntityTransaction trans = em.getTransaction();
		trans.begin();
		em.persist(t);
		trans.commit();
		// Fetch them

		// Close the entity manager
		em.close();
		factory.close();
	}

}
