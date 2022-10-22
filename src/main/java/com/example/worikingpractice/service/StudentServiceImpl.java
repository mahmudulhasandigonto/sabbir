package com.example.worikingpractice.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.worikingpractice.entity.Student;
import com.example.worikingpractice.repository.StudentRepository;

@Service
public class StudentServiceImpl implements StudentService {

   @Autowired
   StudentRepository studentRepository;

   @Override
   public List<Student> getStudentList() {
      return studentRepository.findAll();
   }

   @Override
   public void saveStudent(Student student) {
      studentRepository.save(student);

   }

   @Override
   public void deleteStudentById(Integer id) {
      studentRepository.deleteById(id);

   }

}
