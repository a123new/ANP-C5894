package com.hiber2.demo;

import org.hibernate.Session;
import org.hibernate.Transaction;

//import com.anudip.hiber.appprop.entity
import com.hiber2.demo.entity.Employee;


/**
 * Hello world!
 *
 */
public class App 
{
    public static void main( String[] args )
    {
    	Session session = HiberUtil.getSessionFactory().openSession();
		//transaction object to start transaction
		Transaction t = session.beginTransaction();
		Employee emp = new Employee();
		emp.setEmpName("Prasanna"); //set values with object
		emp.setEmpSurname("Kolte");
		emp.setEmpPhone(747494830);
		emp.setEmpaddr("IT");
		emp.setDesignation("Developer");
		session.save(emp); //employee details get save in db table
		t.commit(); //permanently saved 
		System.out.println("inserted successfully");
		
		session.close();


    	
}
}
