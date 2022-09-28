package com.zhijie.sm.service;

import com.zhijie.sm.DAO.StudentDAO;
import com.zhijie.sm.api.Student;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
@Service
public class StudentServiceImpl implements StudentService{

    @Autowired
    private StudentDAO studentDAO;
    @Override
    public List<Student> loadStudents() {
        List<Student> studentList = studentDAO.loadStudents();
        return studentList;
    }

    @Override
    public void saveStudent(Student student) {
        if(student.getCountry()=="UK"){
            System.out.println("mail sent to: " + student.getName());
        }

        studentDAO.saveStudent(student);
    }

    @Override
    public Student getStudent(int id) {
        return studentDAO.getStudent(id);
    }

    @Override
    public void update(Student student) {
        studentDAO.update(student);
    }

    @Override
    public void delete(int id) {
        studentDAO.delete(id);
    }


}
