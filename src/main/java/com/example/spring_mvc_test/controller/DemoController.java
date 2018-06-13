package com.example.spring_mvc_test.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.context.ContextLoader;
import org.springframework.web.context.WebApplicationContext;

import com.example.spring_mvc_test.bean.Student;

@Controller
@RequestMapping("/index")
public class DemoController {

	@Autowired
	private Student student;

	@RequestMapping("/index")
	public String index() {
		System.err.println(student);
		WebApplicationContext webContext = ContextLoader.getCurrentWebApplicationContext();
		System.err.println(webContext);
		return "index";
	}
}