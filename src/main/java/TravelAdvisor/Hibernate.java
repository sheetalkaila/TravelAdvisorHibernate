package TravelAdvisor;

import java.util.ArrayList;

import java.util.List;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.boot.MetadataSources;
import org.hibernate.boot.registry.StandardServiceRegistry;
import org.hibernate.boot.registry.StandardServiceRegistryBuilder;
import org.hibernate.query.Query;


public class Hibernate implements ITravelAdvisorData {

	protected SessionFactory sessionFactory; // used to manage sessions

	protected void setup() // setup hibernate
	{
		// configure setting from hibernate.cfg.xml
		final StandardServiceRegistry registry = new StandardServiceRegistryBuilder().configure().build();

		try {
			sessionFactory = new MetadataSources(registry).buildMetadata().buildSessionFactory();
		} catch (Exception e) {
			e.printStackTrace();
			StandardServiceRegistryBuilder.destroy(registry);
		}

	}

	protected void exit() {
		sessionFactory.close();
	}

	
	@Override
	public User getUser(String loginid, String psw) {
		setup();
		Session session = sessionFactory.openSession();
		session.beginTransaction();
		User u = session.get(User.class, loginid);
		
		if(u == null)
		{
			System.out.println("Your login ID is not found");
			session.close();
			exit();
			return null;
		}
		else 
		{
			if(psw.equals(u.getPassword()))
			{
				System.out.println("Your login is successful!");
				session.close();
				exit();
				return u;
			}
			else
			{
				System.out.println("Your password is incorrect!");
				session.close();
				exit();
				return null;
			}

			
		}

	}

	@Override
	public boolean isUserExists(String id) {

		setup();
		Session session = sessionFactory.openSession();
		session.beginTransaction();
		
		User u = session.get(User.class, id);
		
		if(u==null) 
		{
			session.close();
			exit();	
			return false;
		}
		
		if(id.equals(u.getUserID())) 
		{
			System.out.println("This loginID is already exist Please enter a different LoginId.");
			session.close();
			exit();		
			return true; 
		}
		
		return false;	
		
	}

	@Override
	public void createUser(User u) {
		
		setup();
		Session session = sessionFactory.openSession();
		session.beginTransaction();
		
		session.save(u);
		System.out.println("User created successfully!");

		session.getTransaction().commit();
		session.close();
		exit();
		
	}
	
	
		
		

	

}
