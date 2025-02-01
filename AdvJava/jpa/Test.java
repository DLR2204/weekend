package jpa;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;

public class Test {
	
	public static void main(String[] args) {
		
	EntityManagerFactory  factory =Persistence.createEntityManagerFactory("apple");
	
	EntityManager em = factory.createEntityManager();
	
	em.getTransaction().begin();
	
	System.out.println(em.find(Employee.class, 100));
	
//	em.persist(emp);      //insert 
	 
//	em.merge(emp);         //update
	
	Employee emp = em.find(Employee.class, 102);  //select 
	
	em.remove(emp);            //delete
	
	
	
	em.getTransaction().commit();
	
	em.close();
	}

}
