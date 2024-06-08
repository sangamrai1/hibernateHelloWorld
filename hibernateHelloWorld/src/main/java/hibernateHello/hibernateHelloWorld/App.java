package hibernateHello.hibernateHelloWorld;


import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;

import hibernateFirst.entity.Employee;

public class App {

	public static void main(String[] args) {
		Employee emp = new Employee(1,"Abhay","Male",567890);
		
		Configuration cfg = new Configuration().configure("hibernate.cfg.xml");
		SessionFactory sessionFactory = cfg.buildSessionFactory();
		Session session = sessionFactory.openSession();
		Transaction tx = session.beginTransaction();
		session.save(emp);
		tx.commit();
		
	}

}