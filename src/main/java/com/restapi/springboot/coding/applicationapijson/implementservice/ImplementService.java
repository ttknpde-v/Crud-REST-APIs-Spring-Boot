package com.restapi.springboot.coding.applicationapijson.implementservice;

import com.restapi.springboot.coding.applicationapijson.model.Student;
import com.restapi.springboot.coding.applicationapijson.repository.StudentRepository;
import com.restapi.springboot.coding.applicationapijson.service.ServiceStudent;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class ImplementService implements ServiceStudent {
    @Autowired
    /* it is like working
    *  StudentRepository studentRepository = new StudentRepository();
    *  studentRepository this method can use anything method Crud */
    private StudentRepository studentRepository;

    @Override
    public Student create(Student student) {

        return studentRepository.save(student);

    }

    @Override
    public Student edite(Student editStudent) {

        return studentRepository.save(editStudent);
        /* all use Post(create) and Put(update) */
    }

    @Override
    public List<Student> view() {

        return studentRepository.findAll();
    }

    @Override
    public Optional<Student> viewId(Long id) {

        return this.studentRepository.findById(id);

    }

    @Override
    public void deleteId(Long id) {

        this.studentRepository.deleteById(id);

    }
}
