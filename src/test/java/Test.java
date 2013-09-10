import java.util.List;
import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.EntityTransaction;
import javax.persistence.Persistence;
import javax.persistence.TypedQuery;
import entity.Person;

public class Test {
	
@org.junit.Test
	public void testall(){
	
	
	EntityManagerFactory factory =   Persistence.createEntityManagerFactory("person-unit");
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
	
	trans.begin();
	//t.setFirstName("ds");
	em.persist(t);
	trans.commit();
	// Fetch them
	TypedQuery<Person> q = em.createQuery("select p from Person p", Person.class);
	List<Person> results = q.getResultList();
	for (Person p : results) {
	  System.out.println(p.getId() + ": " + p.getFirstName());
	}
	
	// Close the entity manager
	em.close();
	factory.close();
	}
}
