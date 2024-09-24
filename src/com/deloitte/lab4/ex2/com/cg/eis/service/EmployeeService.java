package com.deloitte.lab4.ex2.com.cg.eis.service;
import com.deloitte.lab4.ex2.com.cg.eis.bean.*;

public interface EmployeeService {
	public Employee getEmpDetails();
	public String insuranceScheme(String designation,double Salary);
	public void EmpDetails(Employee emp);
}