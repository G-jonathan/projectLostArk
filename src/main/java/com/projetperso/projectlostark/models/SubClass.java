package com.projetperso.projectlostark.models;

import lombok.Data;
import javax.persistence.*;

@Entity
@Data
public class SubClass {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int id;
    private String name;
    private String archetype;
    private String engraving1;
    private String engraving2;
    private String characteristic1;
    private String characteristic2;
    private String optimization;
}