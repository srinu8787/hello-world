package com.home.dao;

import org.springframework.data.repository.CrudRepository;

import com.home.bean.Employee;

public interface RestRepo extends CrudRepository<Employee, Integer>{

}
