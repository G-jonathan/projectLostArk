package com.projetperso.projectlostark.models;

import javax.persistence.*;

@Entity
public class Item {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private int id;
    private String MainClass;
    private String name;
    private String rank;
    private int quality;
    private String engraving1;
    private String engraving2;
    private String characteristic1;
    private String characteristic2;
    private int tier;
}