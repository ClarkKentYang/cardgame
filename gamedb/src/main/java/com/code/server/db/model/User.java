package com.code.server.db.model;

import com.sun.istack.internal.NotNull;

import javax.persistence.*;

/**
 * Created by win7 on 2017/3/8.
 */
@Entity
@Table(name = "users")
public class User {
    // ==============
    // PRIVATE FIELDS
    // ==============
    // An autogenerated id (unique for each user in the db)
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private long id;
    // The user email
    @NotNull
    private String email;
    // The user name
    @NotNull
    private String name;
    // ==============
    // PUBLIC METHODS
    // ==============
    public User() { }
    public User(long id) {
        this.id = id;
    }
    // Getter and setter methods
    // ...
} // class User