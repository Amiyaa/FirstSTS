package com.example.demo.controller;

import javax.servlet.http.HttpSession;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import com.example.demo.Repository.EmpRepo;
import com.example.demo.model.Employee;
import com.example.demo.model.loginUser;
import com.fasterxml.jackson.core.JsonProcessingException;

@Controller
public class usercontroller {

	@Autowired
	EmpRepo repo;
	
	
	@RequestMapping("/")
	public String home()
	{
		return "home.html";
	}
	
	@RequestMapping("/abc")
	public String homer()
	{
		return "registration.html";
	}

	@RequestMapping("/adduser")
	public String addUser(Employee emp)
	{
		//System.out.println(emp);
		repo.save(emp);
		return "home.html";
	}
	
	@PostMapping("/login")
	@ResponseBody
	public ResponseEntity<Employee> getResult(@RequestBody loginUser loginuser, HttpSession status) throws JsonProcessingException,NullPointerException
	{
		System.out.println("loginUser iiiiiisssssssssssssss    "+loginuser.getUserid());
		System.out.println("loginUser iiiiiisssssssssssssss    "+loginuser.getPassword());
		Employee empdemo= repo.findById(loginuser.getUserid()).orElse(null);
		System.out.println("empdemo isssssssssssssssssssss   "+empdemo);
		if((empdemo.getPassword()).equals(loginuser.getPassword()))
				{
					System.out.println("Goooooooooooooodddddddddd");
					return new ResponseEntity<> (empdemo, HttpStatus.OK);
				}
		else
		{
			return new ResponseEntity<Employee> (empdemo, HttpStatus.NOT_FOUND);
		}
	}
	
}
