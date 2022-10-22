package com.example.worikingpractice.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;

import com.example.worikingpractice.entity.Student;
import com.example.worikingpractice.service.StudentService;

@RequestMapping(value = "/pages")
@Controller
public class StudentTemplateController {
   @Autowired
   StudentService studentService;

   @GetMapping("/index")
   public String getStudent(Model model) {
      List<Student> studentList = studentService.getStudentList();
      Student student = new Student();
      model.addAttribute("student", student);
      model.addAttribute("studentList", studentList);
      return "index";
   }

   @PostMapping("/student")
   public String postStudent(@ModelAttribute Student student, Model model) {
      student.setStudentId(0);
      studentService.saveStudent(student);
      return "redirect:/pages/index";
   }

   @GetMapping("/deleteStudent/{id}")
   public String deleteStudent(@PathVariable Integer id) {
      studentService.deleteStudentById(id);

      return "redirect:/pages/index";
   }

}
