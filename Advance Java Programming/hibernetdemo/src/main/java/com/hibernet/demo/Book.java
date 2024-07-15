package com.hibernet.demo;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;

@Entity
public class Book {

    @Id
    @Column(name = "Book_id")
    private int id;

}
