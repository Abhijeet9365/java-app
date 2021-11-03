package com.btc.app.dao;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;
import com.btc.app.mode1.Employee;

import java.time.LocalDate;
import org.junit.jupiter.api.Test;
class EmployeeDaoImplementationTest {
EmployeeDao dao = new EmployeeDaoImp1();
	@Test
	void testAddEmployee() {
		Employee emp =new Employee(1001,"Abhi",LocalDate.parse("1996-04-23"),"abhi@gmail.com");
	//	assertEquals(emp,dao.addEmployee(emp));
	}
@Test
void testSearchEmployeeById() {

}
} 
