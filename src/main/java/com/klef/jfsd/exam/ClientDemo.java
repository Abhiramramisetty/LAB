package com.klef.jfsd.exam;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;

public class ClientDemo 
{
	public static void main(String args[])
	  {
		  Configuration cfg = new Configuration();
	  	  cfg.configure("hibernate.cfg.xml");
	  	
	  	  SessionFactory sf = cfg.buildSessionFactory();
	  	  Session session = sf.openSession();
	  	
	  	  Transaction t = session.beginTransaction();
	  	  
	  	  Vehicle v = new Vehicle();
	  	  
	  	  v.setName("Fortuner");
	  	  v.setType("Car");
	  	  v.setSpeed(100);
	  	  v.setColor("RED");
	    
	  	 Truck tr = new Truck();
	  	 tr.setCapacity(7);
	  	 Car c = new Car();
	  	  
	  	 c.setDoors(4);
	  	  
	  	 session.persist(v);
	  	 session.persist(tr);
	  	 session.persist(c);
	  	 
	  	   t.commit();
	  	   System.out.println("SUCCESS....");
	  	
	  	session.close();
	  	sf.close();
	  }
	}



