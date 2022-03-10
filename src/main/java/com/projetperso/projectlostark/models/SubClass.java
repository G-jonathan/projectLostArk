package com.projetperso.projectlostark.models;

import javax.persistence.*;

@Entity
public class SubClass {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private int id;
    private String name;
    private String engraving1;
    private String engraving2;
    private String characteristic1;
    private String characteristic2;
}