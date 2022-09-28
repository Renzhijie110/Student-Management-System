package com.zhijie.sm.controller;

import com.zhijie.sm.DAO.StudentDAO;
import com.zhijie.sm.api.Student;
import com.zhijie.sm.service.StudentService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestParam;

import java.util.List;

@Controller
public class StudentController {
    @Autowired
    private StudentService studentService;
    @GetMapping("/showStudent")
    public String showStudentList(Model model){
        List<Student> studentList = studentService.loadStudents();
        model.addAttribute("students", studentList);
        return "student-list";
    }
    @GetMapping("/showAddStudentPage")
    public String addStudent(Model model){
        Student student = new Student();
        model.addAttribute("student", student);
        return "add-student";
    }
    @PostMapping ("save-student")
        public String saveStudent(Student student){
        if(student.getId()==0){
            studentService.saveStudent(student);
        }else{
            studentService.update(student);
        }

            return "redirect:/showStudent";
        }

    @GetMapping("updateStudent")
    public String updateStudent(@RequestParam("userId") int id, Model model){
        Student theStudent = studentService.getStudent(id);
        model.addAttribute("student",theStudent);
        return "add-student";
    }
    @GetMapping("deleteStudent")
    public String deleteStudent(@RequestParam("userId") int id){
        studentService.delete(id);

        return "redirect:/showStudent";
    }
}
