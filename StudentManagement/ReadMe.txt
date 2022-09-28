Maven dependency
================
1.Spring webmvc
2.Spring jdbc
3.mysql connector
4.jstl
5.servlet api

Build a webpage to display the students(db)
================
a.configure dispatcher servlet
b.create a configuration file
1.create controller (studentController)
2.design a view (student-list.jsp)

get the data from the database(get all the students)
=======================
    a)create a POJO or a domain class called Student
    Student
    -name
    -country
    -id
    -mobile

1.create the DAO called StudentDAO(I)
        List<Student> loadStudents()


insert a student record into the student table
==========================
1.create a controller handler method to display add-student.jsp
2.create a form (jsp) [add-student.jsp]

controller ---> service---> DAO ----> DB

update a student record
============================

create a controller handler method for update
        /update student
