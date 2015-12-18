package com.test.sample.db.service;

import java.util.List;

import com.test.sample.beans.Result;
import com.test.sample.db.entities.Employee;

public interface EmployeeService {

	List<Employee> listAll();

	Result listAll2();

}