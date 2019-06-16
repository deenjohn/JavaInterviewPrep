package com.code.composition;

import java.util.HashSet;
import java.util.Set;

import org.hibernate.Session;  
import org.hibernate.SessionFactory;  
import org.hibernate.Transaction;  
import org.hibernate.boot.Metadata;  
import org.hibernate.boot.MetadataSources;  
import org.hibernate.boot.registry.StandardServiceRegistry;  
import org.hibernate.boot.registry.StandardServiceRegistryBuilder;


  
public class StoreDataPersonWithAdressSet {  
  
    public static void main( String[] args )  
    {  
         StandardServiceRegistry ssr = new StandardServiceRegistryBuilder().configure("hibernate.cfg.xml").build();  
         Metadata meta = new MetadataSources(ssr).getMetadataBuilder().build();  
          
        SessionFactory factory = meta.getSessionFactoryBuilder().build();  
        Session session = factory.openSession();  
        Transaction t = session.beginTransaction();  
          
        ManyAddress home = new ManyAddress("ivy estate","pune","41004");
        ManyAddress office = new ManyAddress("Eon","pune","411008");
        
        Set<ManyAddress> addressSet = new HashSet<ManyAddress>();
        addressSet.add(home);
        addressSet.add(office);
        
        PersonWithAddressSet p1=new PersonWithAddressSet("john",addressSet); 
        System.out.println(p1);
             
       session.save(p1); 
       
       System.out.println(p1);
    
       System.out.println("commit");
       t.commit();  
       System.out.println("successfully saved");    
        factory.close();  
        session.close();     
    }  
}  