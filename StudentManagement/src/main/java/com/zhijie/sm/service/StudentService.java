package com.zhijie.sm.service;

import com.zhijie.sm.api.Student;

import java.util.List;

public interface StudentService {
    List<Student> loadStudents();
    void saveStudent(Student student);
    Student getStudent(int id);
    void update(Student student);
    void delete(int id);

}
