package com.restapi.springboot.coding.applicationapijson.repository;

import com.restapi.springboot.coding.applicationapijson.model.Student;
import org.springframework.data.jpa.repository.JpaRepository;

public interface StudentRepository extends JpaRepository< Student , Long >  {
    /* this interface class for using Jpa
    *  Jpa have method for Crud */
}
