package com.example.worikingpractice.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RequestMapping(value = "/api")
@RestController
public class StudentController {

   @GetMapping("/")
   public String getConnect() {
      return "Student";
   }

}
