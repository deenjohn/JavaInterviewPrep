package com.code.oneToMany;

import org.hibernate.Session;  
import org.hibernate.SessionFactory;  
import org.hibernate.Transaction;  
import org.hibernate.boot.Metadata;  
import org.hibernate.boot.MetadataSources;  
import org.hibernate.boot.registry.StandardServiceRegistry;  
import org.hibernate.boot.registry.StandardServiceRegistryBuilder;


  
public class StoreDataOneManyLibraryBooks {  
  
    public static void main( String[] args )  
    {  
         StandardServiceRegistry ssr = new StandardServiceRegistryBuilder().configure("hibernate.cfg.xml").build();  
         Metadata meta = new MetadataSources(ssr).getMetadataBuilder().build();  
          
        SessionFactory factory = meta.getSessionFactoryBuilder().build();  
        
        Session session = factory.openSession(); 
        Transaction t = session.beginTransaction();  
        
        Book book1 = new Book();
        book1.setTitle( "High-Performance Java Persistence" );
        book1.setAuthor("john");
        book1.setIsbn(125);
        
        Book book2 = new Book();
        book2.setTitle( "Java Persistence with Hibernate" );
        book2.setIsbn(126);
        book2.setAuthor("deen");
        
        Library library = new Library();
        library.setName("java");
        library.getBooks().add(book1);
        library.getBooks().add(book2);
        
             
       session.save(library); 
       
       
       System.out.println(library);
    
       System.out.println("commit");
       t.commit();  
       System.out.println("successfully saved");    
        
        session.close();  
        
//        Session sessionGet = factory.openSession();
//        
//        Library lib = (Library)sessionGet.get(Library.class, 1L);
      //  System.out.println(lib);
        //sessionGet.close();
        factory.close();  
       
    }  
}  