package com.btc.app.ui;

import java.time.LocalDate;
import java.util.InputMismatchException;
import java.util.Scanner;
import com.btc.app.mode1.Employee;
import com.btc.app.service.EmployeeService;
import com.btc.app.service.EmployeeServiceImp1;
import com.btc.app.exception.InvalidEmployeeId;
import com.btc.app.exception.NotFoundException;
public class EmployeeAppUi {

	private Scanner scanner=new Scanner(System.in);
	private static EmployeeService service=new EmployeeServiceImp1();


	public void addEmployee() {
		System.out.println("Enter Employee Details :  ");
		System.out.print("Employee ID : ");
		int employeeId=scanner.nextInt();
		System.out.print("Employee Name : ");
		String employeeName=scanner.next()+scanner.nextLine();
		System.out.print("Email : ");
		String email=scanner.next()+scanner.nextLine();

		System.out.print("Birth Date [yyyy-mm-dd] : ");
		String dobString=scanner.next()+scanner.nextLine();

		LocalDate dob=LocalDate.parse(dobString);

		Employee employee= new Employee(employeeId, employeeName, dob, email);
	
		Employee savedEmployee;
		try {
			savedEmployee = service.addEmployee(employee);
			System.out.println("Employee Added Successfully..");
			System.out.println(savedEmployee);
		} catch (Exception e) {
	
			e.printStackTrace();
		}
		
	}
	public void deleteEmployeeId()
	{
		System.out.println("Enter Employee Details :  ");
		System.out.print("Employee ID : ");
		int employeeId=0;
		try {
			employeeId=scanner.nextInt();
			if(employeeId<1000)
			{
				throw new InvalidEmployeeId("Enter four digit EmployeeId : "+employeeId);
			}
		} catch (InputMismatchException e) {
			// TODO: handle exception
			e.getMessage();
			System.out.println("Enter the Integer Value ");
		}
		boolean value = service.deleteEmployeeById(employeeId);
		if(value)
		{
			System.out.println("Deleted Successfully");
		}
		else {
			throw new NotFoundException("Employee ID Not Found : "+employeeId);
		}
	}
	public void updateEmployee()
	{
		System.out.println("Enter Employee Details :  ");
		System.out.print("Employee ID : ");
		int employeeId=0;
		try {
			employeeId=scanner.nextInt();
			if(employeeId<1000)
			{
				throw new InvalidEmployeeId("Enter four digit EmployeeId : "+employeeId);
			}
		} catch (InputMismatchException e) {
			// TODO: handle exception
			e.getMessage();
			System.out.println("Enter the Integer Value ");
		}
		Employee employee = service.searchEmployeeById(employeeId);
		if(employee!=null) {
		System.out.println(employee);
		System.out.print("Employee Name : ");
		String employeeName=scanner.next()+scanner.nextLine();
		System.out.print("Email : ");
		String email=scanner.next()+scanner.nextLine();
		System.out.print("Birth Date [yyyy-mm-dd] : ");
		String dobString=scanner.next()+scanner.nextLine();
		LocalDate dob=LocalDate.parse(dobString);
		Employee employee1= new Employee(employeeId, employeeName, dob, email);
		 service.updateEmployee(employee1);
		 System.out.println("Update Successfully");
		}
		else {
			throw new NotFoundException("Employee ID Not Found : "+employeeId);
		}
	}
	public void showEmployee() {
		System.out.println("Enter Employee Details :  ");
		System.out.print("Employee ID : ");
		int employeeId=scanner.nextInt();

		Employee employee = service.searchEmployeeById(employeeId);

		System.out.println(employee);
	}

}
