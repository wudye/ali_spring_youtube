package com.mwu.learn1.student;

import org.springframework.stereotype.Repository;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.IntStream;

@Repository
public class InMemoryStudentDao {
    private final List<Student> studentsList = new ArrayList<Student>();

    public Student save(Student student) {
         studentsList.add(student);
         return student;
    }

    public Student findByEmail(String email) {
        return studentsList.stream()
                .filter(student -> student.getEmail().equals(email))
                .findFirst()
                .orElse(null);
    }


    public void delete(String email) {
        var student = findByEmail(email);
        if (student != null) {
            studentsList.remove(student);
        }
    }

    public Student update(Student student) {
        var studentIndex = IntStream.range(0, studentsList.size())
                .filter(index -> studentsList.get(index).getEmail().equals(student.getEmail()))
                .findFirst()
                .orElse(-1);
        if (studentIndex != -1) {
            studentsList.set(studentIndex, student);
            return student;
        } else
            return null;

    }

    public List<Student> findAllStudents() {

        return studentsList;




    }



}
