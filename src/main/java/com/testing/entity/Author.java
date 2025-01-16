package com.testing.entity;

import jakarta.persistence.*;
import lombok.Data;

import java.util.Set;

@Data
@Entity
@Table(name = "Author")
public class Author {

    @Id
    private String id;

    private String authorName;

    @OneToMany(mappedBy = "author",cascade = CascadeType.ALL,orphanRemoval = true)
    private Set<Book>books;
}
