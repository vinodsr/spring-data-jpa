package com.test.sample.db.service;

import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.test.sample.beans.Result;
import com.test.sample.db.entities.Employee;
import com.test.sample.db.repositories.EmployeeRepository;

@Service
public class EmployeeServiceImpl implements EmployeeService {
	
	@Autowired
	EmployeeRepository employeeRepository;
	
	/* (non-Javadoc)
	 * @see com.test.sample.EmployeeService#listAll()
	 */
	public List<Employee> listAll() {
		List<String> s = new ArrayList<String>();
		s.add("Jay");
		return employeeRepository.listall(s);
	}
	
	public Result listAll2() {
		List<String> s = new ArrayList<String>();
		s.add("Jay");
		return employeeRepository.listall2(s);
	}

}
