package com.codeup.review;

import javax.persistence.*;

@Entity
@Table(name="tickets")
public class Ticket {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private long ig;

    @Column(nullable = false)
    private String name;


    public Ticket() {}

    public long getIg() {
        return ig;
    }

    public void setIg(long ig) {
        this.ig = ig;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }
}
