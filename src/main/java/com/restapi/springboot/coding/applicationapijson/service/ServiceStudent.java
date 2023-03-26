package com.restapi.springboot.coding.applicationapijson.service;

import com.restapi.springboot.coding.applicationapijson.model.Student;

import java.util.List;
import java.util.Optional;

public interface ServiceStudent {

    public Student create(Student obj); /* Create == POST == INSERT INTO */

    public Student edite(Student obj); /* Update == Put == UPDATE */

    public List<Student> view(); /* Read  == Get == SELECT */

    public Optional<Student> viewId(Long id); /* (By Id) Read  == Get == Select */
    /* Optional is Empty Class (when we are not using it) */

    public void deleteId (Long id); /**/
}
