package com.home.test.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.home.bean.Employee;
import com.home.dao.RestRepo;

@RestController
@RequestMapping("boot")
public class RestService {

	@Autowired
	private RestRepo restRepo;

	@RequestMapping("add")
	@GetMapping
	public String add() {

		Employee emp = new Employee();
		emp.setId(3);
		emp.setName("Kasarla");
		emp.setAddress("hyd");
		restRepo.save(emp);
		return "Saved sucessfully";
	}

	@RequestMapping("getall")
	public List<Employee> getAllEmp() {
		return (List<Employee>) restRepo.findAll();
	}
}
