package com.deloitte.lab4.ex2.com.cg.eis.pl;
import com.deloitte.lab4.ex2.com.cg.eis.bean.*;

public class Main {
	public static void main(String[] args) {
		EmployeeServiceImpl emp = new EmployeeServiceImpl();
		Employee emp1 = emp.getEmpDetails();
		String scheme = emp.insuranceScheme(emp1.designation, emp1.salary);
		Employee person = new Employee(emp1.id,emp1.name,emp1.designation,scheme,emp1.salary);
		
		//System.out.println(emp1.name);
		//emp.insuranceScheme();
		emp.EmpDetails(person);
		

	}
}