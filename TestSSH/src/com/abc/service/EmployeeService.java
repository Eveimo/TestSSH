package com.abc.service;

import com.abc.entity.Employee;
import com.abc.entity.PageBean;

public interface EmployeeService {

	Employee login(Employee employee);

	PageBean<Employee> findAll(int currPage);

}