package com.code.oneToOne;

import org.hibernate.Session;  
import org.hibernate.SessionFactory;  
import org.hibernate.Transaction;  
import org.hibernate.boot.Metadata;  
import org.hibernate.boot.MetadataSources;  
import org.hibernate.boot.registry.StandardServiceRegistry;  
import org.hibernate.boot.registry.StandardServiceRegistryBuilder;

  
public class StoreDataOneOneBidirectional {  
  
    public static void main( String[] args )  
    {  
         StandardServiceRegistry ssr = new StandardServiceRegistryBuilder().configure("hibernate.cfg.xml").build();  
         Metadata meta = new MetadataSources(ssr).getMetadataBuilder().build();  
          
        SessionFactory factory = meta.getSessionFactoryBuilder().build();  
        Session session = factory.openSession();  
        Transaction t = session.beginTransaction();  
        
//        PassportDetailBidirectional pd = new PassportDetailBidirectional("k1123gmk34");
//        PersonBidirectional p1 = new PersonBidirectional("deen","deen.john@gmail.com",pd);
//        pd.setPerson(p1);
//        p1.setPd(pd);
//             
//       session.save(p1); 
      // session.save(pd); using cascade .all instead
       
   //    System.out.println(p1);
        PersonBidirectional person = session.get(PersonBidirectional.class, 1);
        System.out.println(person);
        
        System.out.println(person.getPd().getPassport_no());
//        
        session.delete(person);
       System.out.println("commit");
       t.commit();  
       System.out.println("successfully saved");    
        factory.close();  
        session.close();     
    }  
}  