package com.test.sample.db.repositories;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;

import com.test.sample.beans.Result;
import com.test.sample.db.entities.Employee;


public interface EmployeeRepository  extends JpaRepository<Employee, Integer> {
	
	@Query("select e from Employee e,Employee y where e.name in (:search)")
	public List<Employee> listall(@Param("search") List<String> names);

	
	@Query("select new com.test.sample.beans.Result(max(e.name)) from Employee e where e.name not in (:search)")
	public Result listall2(@Param("search") List<String> names);

}
