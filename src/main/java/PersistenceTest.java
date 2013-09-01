import java.util.HashMap;
import java.util.Map;

import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;


public class PersistenceTest {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Map<String, String> properties = new HashMap<String, String>();
		  properties.put("javax.persistence.jdbc.user", "");
		  properties.put("javax.persistence.jdbc.password", "");
		  EntityManagerFactory emf = Persistence.createEntityManagerFactory(
		      "jdbc:sqlite:person.db", properties);
		  
		  
	}

}
