package com.restapi.springboot.coding.applicationapijson.model;

import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor
@Entity
@Table(name = "room23")
public class Student {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long studentid;
    @Column(name = "studentname")
    private String studentname;
    @Column(name = "studentage")
    private Integer studentage;
    @Column(name = "studentphone")
    private String studentphone;

    /* name column shouldn't be uppercase !!!
    *  @Annotation case sensitive */

}
