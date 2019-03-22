package com.hibernatedemo;

import com.hibernatedemo.entity.Address;
import com.hibernatedemo.entity.Author;
import com.hibernatedemo.entity.Book;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;

import java.util.Arrays;
import java.util.Date;
import java.util.HashSet;
import java.util.Set;

public class Application {
    public static void main(String[] args) {
        SessionFactory sessionFactory = new Configuration().configure().buildSessionFactory();
        Session session = sessionFactory.openSession();
    
        Author author = new Author();
//        author.setId(1);
        author.setFirstName("Dharmendra");
        author.setLastName("Saini");
        author.setAge(20);
        author.setDate(new Date());
//
//        Author author4 = new Author();
////        author4.setId(2);
//        author4.setFirstName("XYZ");
//        author4.setLastName("fefne");
//        author4.setAge(20);
//        author4.setDate(new Date());
//
//        Author author5 = new Author();
////        author5.setId(3);
//        author5.setFirstName("jbdh");
//        author5.setLastName("hbhjwd");
//        author5.setAge(20);
//        author5.setDate(new Date());
//
//        Author author6 = new Author();
////        author6.setId(4);
//        author6.setFirstName("Dddwra");
//        author6.setLastName("ndwsdi");
//        author6.setAge(20);
//        author6.setDate(new Date());
//
//        Author author7 = new Author();
////        author7.setId(5);
//        author7.setFirstName("Dwdwf");
//        author7.setLastName("Swdwd");
//        author7.setAge(20);
//        author7.setDate(new Date());
//
//        Question1,2and3/
//        create
        session.beginTransaction();
        session.save(author);
        session.getTransaction().commit();

//        read
        session.beginTransaction();
        Author author1 = session.get(Author.class,1);
        System.out.println(author1);
        session.getTransaction().commit();

//        update
        session.beginTransaction();
        Author author2 = session.get(Author.class,1);
        author2.setFirstName("ABC");
        session.getTransaction().commit();

//        delete
        session.beginTransaction();
        Author author3 = session.get(Author.class,1);
        session.delete(author3);
        session.getTransaction().commit();
//
//////        Question4
//        session.beginTransaction();
//        session.save(author4);
//        session.save(author5);
//        session.save(author6);
//        session.save(author7);
//        session.getTransaction().commit();
//
////        Question5
//        session.close();
//        sessionFactory.close();
        
////        Question12-15
//        Address address = new Address();
//        address.setLocation("Noida");
//        address.setStreetNumber(6);
//        address.setState("Uttar Pradesh");
//        author.setAddress(address);
//        author.setSubjects(Arrays.asList("Science","Java","COBOL"));
////        Book book = new Book();
////        book.setBookName("Java"); use for question15
////        author.setBook(book);
//        Book book1 = new Book("Java");
//        Book book2 = new Book("Alchemist");
//        Book book3 = new Book("Kite runner");
//        author.getBookSet().add(book1);
//        author.getBookSet().add(book2);
//        author.getBookSet().add(book3);
////        book1.setAuthor(author);
//        book2.setAuthor(author);
//        book3.setAuthor(author);
//        session.beginTransaction();
//        session.save(book);
//        session.save(book1);
//        session.save(book2);
//        session.save(book3);
//        session.save(author);
//        session.persist(author);
//        session.getTransaction().commit();
//
//        QUESTION16-17
//        Author author99 = new Author();
//        author99.setFirstName("Dhaskfsra");
//        author99.setLastName("Saifkefjkseni");
//        author99.setAge(20);
//        author99.setDate(new Date());
//        Address address2 = new Address();
//        address2.setLocation("Noidsca");
//        address2.setStreetNumber(9);
//        address2.setState("Uttar Prsxsadesh");
//        author99.setAddress(address2);
//        author99.setSubjects(Arrays.asList("Science","Python","COBOL"));
//        Book book11 = new Book("Java12");
//        Book book12 = new Book("Alchemist111");
//        Book book13 = new Book("Kite runner1111");
//        author99.getBookSet().add(book11);
//        author99.getBookSet().add(book12);
//        author99.getBookSet().add(book13);
//        session.beginTransaction();
//        session.save(author);
//        session.save(author99);
//        session.save(book1);
//        session.save(book2);
//        session.save(book3);
//        session.save(book11);
//        session.save(book12);
//        session.save(book13);
//        session.getTransaction().commit();
        
    }
    
}
