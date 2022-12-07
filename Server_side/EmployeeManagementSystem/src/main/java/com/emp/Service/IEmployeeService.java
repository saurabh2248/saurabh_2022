package com.emp.Service;

import java.util.List;
import com.emp.Entity.Employee;

public interface IEmployeeService {

	public Integer saveEmployee(Employee employee);

	public List<Employee> getAllEmployees();

}