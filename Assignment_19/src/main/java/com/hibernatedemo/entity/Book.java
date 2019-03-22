package com.hibernatedemo.entity;

import javax.persistence.*;
import java.util.HashSet;
import java.util.Set;

@Entity
public class Book {
    @Id @GeneratedValue(strategy = GenerationType.AUTO)
    int bookId;
    String bookName;
//    @ManyToOne
//    Author author;
    @ManyToMany(mappedBy = "bookSet")
    Set<Author> authors = new HashSet<>();
    
    public String getBookName() {
        return bookName;
    }
    
    public void setBookName(String bookName) {
        this.bookName = bookName;
    }
    
    public int getBookId() {
        return bookId;
    }
    
    public void setBookId(int bookId) {
        this.bookId = bookId;
    }
    
    public Book(String bookName) {
        this.bookName = bookName;
    }
    
//    public Author getAuthor() {
//        return author;
//    }
//
//    public void setAuthor(Author author) {
//        this.author = author;
//    }
}
