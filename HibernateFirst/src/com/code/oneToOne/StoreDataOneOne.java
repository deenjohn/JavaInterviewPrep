package com.code.oneToOne;

import org.hibernate.Session;  
import org.hibernate.SessionFactory;  
import org.hibernate.Transaction;  
import org.hibernate.boot.Metadata;  
import org.hibernate.boot.MetadataSources;  
import org.hibernate.boot.registry.StandardServiceRegistry;  
import org.hibernate.boot.registry.StandardServiceRegistryBuilder;

import com.code.manyToOne.Guide;
import com.code.manyToOne.Student;


  
public class StoreDataOneOne {  
  
    public static void main( String[] args )  
    {  
         StandardServiceRegistry ssr = new StandardServiceRegistryBuilder().configure("hibernate.cfg_oneone.xml").build();  
         Metadata meta = new MetadataSources(ssr).getMetadataBuilder().build();  
          
        SessionFactory factory = meta.getSessionFactoryBuilder().build();  
        Session session = factory.openSession();  
        Transaction t = session.beginTransaction();  
        
       PassportDetail pd = new PassportDetail();
       pd.setPassport_no("2k1123gmk34");
       
       Person p1 = new Person();
       p1.setEmail("2deen.john@gmail.com");
       p1.setName("deenjohn");
       p1.setPd(pd);
       
      // pd.setPerson(p1);
             
       session.save(p1); 
      // session.save(pd); using cascade .all instead
       
       System.out.println(p1);
    
       System.out.println("commit");
       t.commit();  
       System.out.println("successfully saved");    
        factory.close();  
        session.close();     
    }  
}  