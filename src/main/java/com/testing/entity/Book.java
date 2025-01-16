package com.testing.entity;

import jakarta.persistence.*;
import lombok.Data;

@Data
@Entity
@Table(name = "Book")
public class Book {

    @Id
    private String id;
    private String name;
    @ManyToOne(cascade = CascadeType.PERSIST)
    private Author author;
}
