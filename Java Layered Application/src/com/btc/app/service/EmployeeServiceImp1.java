package com.btc.app.service;

import java.util.List;
import com.btc.app.dao.EmployeeDao;
import com.btc.app.dao.EmployeeDaoImp1;
import com.btc.app.dao.EmployeeDaoJdbcImp1;
import com.btc.app.mode1.Employee;
public class EmployeeServiceImp1 implements EmployeeService {

	private EmployeeDao daoObj;

	public EmployeeServiceImp1() {
		daoObj = new EmployeeDaoJdbcImp1();
	}

	@Override
	public Employee addEmployee(Employee employee) throws Exception {
		return daoObj.addEmployee(employee);
	}

	@Override
	public Employee searchEmployeeById(int employeeId) {
		return daoObj.searchEmployeeById(employeeId);
	}

	@Override
	public boolean deleteEmployeeById(int employeeId) {

		return daoObj.deleteEmployeeById(employeeId);
	}

	@Override
	public Employee updateEmployee(Employee employee) {

		return daoObj.updateEmployee(employee);
	}

	@Override
	public List<Employee> getAllEmployee() {
		 return daoObj.getAllEmployee();
	}




}
