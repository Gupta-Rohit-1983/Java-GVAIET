package com.practice;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;

import com.practice.association.Address;
import com.practice.association.Student;

/**
 * Hello world!
 *
 */
public class App {
    public static void main(String[] args) {
        Configuration config = new Configuration();
        config.configure("hibernate.cfg.xml");

        Address address1 = new Address();
        address1.setAdd_id(1);
        address1.setArea("GV College");
        address1.setLandMark("Shelu Railway Station");
        address1.setPincode(41010);
        address1.setCity("karjat");
        Student studetn1 = new Student(1, "Rohit",address1);
        address1.setStudent(studetn1);

        SessionFactory sessionFactory = config.buildSessionFactory();
        Session openSession = sessionFactory.openSession();

        Transaction transaction = openSession.beginTransaction();
        
        openSession.save(studetn1);
        transaction.commit();

        openSession.close();
        sessionFactory.close();

    }
}
