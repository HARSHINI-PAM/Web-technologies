package com.MvcServletService;

import java.util.Arrays;
import java.util.List;

import com.MvcServletModel.Employee;

public class EmployeeService {

	public List<Employee> getEmployee() {
	    return Arrays.asList(
	        new Employee(1, "Arjun", "Reddy"),
	        new Employee(2, "Kabir", "Singh"),
	        new Employee(2, "Aryan", "Kabir")
	    );
	
}
}
