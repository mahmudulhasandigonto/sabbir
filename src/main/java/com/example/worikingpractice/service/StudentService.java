package com.example.worikingpractice.service;

import java.util.List;

import com.example.worikingpractice.entity.Student;

public interface StudentService {

   List<Student> getStudentList();

   void saveStudent(Student student);

   void deleteStudentById(Integer id);

}
