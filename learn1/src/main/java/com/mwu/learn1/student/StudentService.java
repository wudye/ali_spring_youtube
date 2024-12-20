package com.mwu.learn1.student;

import org.springframework.stereotype.Service;

import java.lang.classfile.Interfaces;
import java.time.LocalDate;
import java.util.List;

public interface StudentService {


    Student save(Student student);
    Student findByEmail(String email);
    void delete(String email);
    Student update(Student student);
    public List<Student> findAllStudents();


}
