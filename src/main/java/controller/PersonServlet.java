package controller;

import java.io.IOException;
import javax.inject.Inject;
import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.PersistenceUnit;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import service.PersonService;
import dao.PersonDao;
import entity.Injectee;
import entity.Person;

@WebServlet("/PersonServlet")
public class PersonServlet extends HttpServlet {

	@Inject
	Injectee in;
	@Inject
	PersonService servcice;
	@Inject
	PersonDao dao;

	// This field injection is thread-safe
	@PersistenceUnit(unitName = "person-unit")
	private EntityManagerFactory emf;

	protected void doGet(HttpServletRequest request,
			HttpServletResponse response) throws ServletException, IOException {
		process(request, response);
	}

	protected void doPost(HttpServletRequest request,
			HttpServletResponse response) throws ServletException, IOException {
		process(request, response);
	}

	private void process(HttpServletRequest request,
			HttpServletResponse response) throws ServletException, IOException {
        dao.insert(new Person());

        String action = request.getServletPath();
        EntityManager emTest = emf.createEntityManager();
        if(action.equals("add")){
        	EntityManager em = emf.createEntityManager();
        	
        } else if(action.equals("update")){
        	EntityManager em = emf.createEntityManager();
        	
        } else if(action.equals("delete")){
        	EntityManager em = emf.createEntityManager();
        	
        } else if(action.equals("list")){
        	EntityManager em = emf.createEntityManager();
        	
        } else if(true){
        	
        }
	}
}
