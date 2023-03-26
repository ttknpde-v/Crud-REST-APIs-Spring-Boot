package com.restapi.springboot.coding.applicationapijson.controller;

import com.restapi.springboot.coding.applicationapijson.model.Student;
import com.restapi.springboot.coding.applicationapijson.service.ServiceStudent;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.Optional;


@RestController
@RequestMapping(value = "/api")
public class ControlStudent {

    @Autowired
    private ServiceStudent serviceStudent;


    @PostMapping(value = "/create")
    public Student create(@RequestBody Student student) {
        Student newStudent = this.serviceStudent.create(student);
        return newStudent; /* return data json */
    }

    @PutMapping(value = "/edit")
    public Student edite(@RequestBody Student student) {
        Student newStudent = this.serviceStudent.edite(student);
        return newStudent; /* return data json */
    }

    @GetMapping(value = "/view")
    public List<Student> view() {
        List<Student> list = this.serviceStudent.view();
        return list; /* return data array list json */
    }

    @GetMapping(value = "/view/{id}")
    public Optional<Student> viewId(@PathVariable Long id){
        Optional<Student> student = this.serviceStudent.viewId(id);
        return student;
    }

    @DeleteMapping(value = "/delete/{id}")
    public String deleteId(@PathVariable Long id) {
        this.serviceStudent.deleteId(id);
        return "finished deleteId";
    }




}
