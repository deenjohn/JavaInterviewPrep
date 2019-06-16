package com.code.manyToOne;

import java.util.List;

import javax.persistence.Query;

import org.hibernate.Session;  
import org.hibernate.SessionFactory;  
import org.hibernate.Transaction;  
import org.hibernate.boot.Metadata;  
import org.hibernate.boot.MetadataSources;  
import org.hibernate.boot.registry.StandardServiceRegistry;  
import org.hibernate.boot.registry.StandardServiceRegistryBuilder;

 
public class StoreDataManyOne {  
  
    public static void main( String[] args )  
    {  
         StandardServiceRegistry ssr = new StandardServiceRegistryBuilder().configure("hibernate.cfg.xml").build();  
         Metadata meta = new MetadataSources(ssr).getMetadataBuilder().build();  
          
        SessionFactory factory = meta.getSessionFactoryBuilder().build();  
        Session session = factory.openSession();  
        Transaction t = session.beginTransaction();  
        
        Guide g1 = new Guide("g01","Mr.Samuel");
        Student s1 = new Student("s01","deen john",g1);
        Student s2 = new Student("s02","harish",g1);
        
             
       //session.save(g1); 
       session.save(s1);
       session.save(s2);
        
//        String hql = "FROM Student AS E";
//        Query query = session.createQuery(hql);
//        List results = ((org.hibernate.query.Query) query).list();
//       
//        System.out.println(results);
       System.out.println("commit");
       t.commit();  
       System.out.println("successfully saved");    
        factory.close();  
        session.close();     
    }  
}  