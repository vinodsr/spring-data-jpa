package com.test.sample;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

import com.test.sample.beans.Result;
import com.test.sample.db.entities.Employee;
import com.test.sample.db.service.EmployeeService;

@RestController
public class Controller {
	
	@Autowired
	EmployeeService employeeService;
	
    @RequestMapping("/")
    @ResponseBody
    List<Employee> home() {
        return employeeService.listAll();
    }
    
    @RequestMapping("/2")
    @ResponseBody
    Result home2() {
        return employeeService.listAll2();
    }

}
