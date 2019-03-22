package com.hibernatedemo.entity;

import javax.persistence.*;
import java.util.*;

@Entity
public class Author {
    @Id @GeneratedValue(strategy = GenerationType.IDENTITY)
//    @Id @GeneratedValue(strategy = GenerationType.TABLE)
    int id;
    
    @Column(name = "First_Name")
    String firstName;
    
    @Transient
    @Column(name = "Last_Name")
    String lastName;
    
    @Column(name = "Author_Age")
    int age;
    
    @Temporal(value = TemporalType.DATE)
    @Column(name = "Author_DOB")
    Date date;
    
    @Embedded
    Address address;
    
    @ElementCollection
    List<String> subjects = new ArrayList<>();
    
//    @OneToOne @JoinColumn(name = "book_join")
//    Book book;
//    @OneToMany @JoinTable(joinColumns = @JoinColumn(name = "Author_ID"), inverseJoinColumns = @JoinColumn(name="BookID"))
//    @OneToMany(mappedBy = "author")
//    @OneToMany(cascade = CascadeType.PERSIST)
//    @ManyToMany
    Set<Book> bookSet = new HashSet<>();
    
    public List<String> getSubjects() {
        return subjects;
    }
    
    public void setSubjects(List<String> subjects) {
        this.subjects = subjects;
    }
    
    public String getFirstName() {
        return firstName;
    }
    
    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }
    
    public String getLastName() {
        return lastName;
    }
    
    public void setLastName(String lastName) {
        this.lastName = lastName;
    }
    
    public int getAge() {
        return age;
    }
    
    @Override
    public String toString() {
        return "Author{" +
                "id=" + id +
                ", firstName='" + firstName + '\'' +
                ", lastName='" + lastName + '\'' +
                ", age=" + age +
                ", date=" + date +
                '}';
    }
    
    public Date getDate() {
        return date;
    }
    
    public void setDate(Date date) {
        this.date = date;
    }
    
    public void setAge(int age) {
        this.age = age;
    }
    
    public int getId() {
        return id;
    }
    
    public void setId(int id) {
        this.id = id;
    }
    
    public Address getAddress() {
        return address;
    }
    
    public void setAddress(Address address) {
        this.address = address;
    }
    
//    public Book getBook() {
//        return book;
//    }
//
//    public void setBook(Book book) {
//        this.book = book;
//    }
    
    
    public Set<Book> getBookSet() {
        return bookSet;
    }
    
    public void setBookSet(Set<Book> bookSet) {
        this.bookSet = bookSet;
    }
}
