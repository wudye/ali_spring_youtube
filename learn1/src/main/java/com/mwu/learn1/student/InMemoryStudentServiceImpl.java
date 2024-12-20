package com.mwu.learn1.student;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.time.LocalDate;
import java.util.List;

@Service
public class InMemoryStudentServiceImpl implements StudentService{

    private final InMemoryStudentDao studentDao;

    public InMemoryStudentServiceImpl(InMemoryStudentDao inMemoryStudentDao) {
        this.studentDao = inMemoryStudentDao;
    }
    @Override
    public Student save(Student student) {
        return studentDao.save(student);
    }

    @Override
    public Student findByEmail(String email) {
        return studentDao.findByEmail(email);
    }

    @Override
    public void delete(String email) {
        studentDao.delete(email);
    }

    @Override
    public Student update(Student student) {
        return studentDao.update(student);
    }

    @Override
    public List<Student> findAllStudents() {

            return studentDao.findAllStudents();




    }



}
