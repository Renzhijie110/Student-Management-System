package com.zhijie.sm.DAO;

import com.zhijie.sm.api.Student;
import com.zhijie.sm.api.StudentDTO;

import java.util.List;

public interface StudentDAO {
    List<Student> loadStudents();
    void saveStudent(Student student);
    Student getStudent(int id);
    void update(Student student);
    void delete(int id);

}
