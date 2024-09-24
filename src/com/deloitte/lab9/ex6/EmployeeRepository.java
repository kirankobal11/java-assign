package com.deloitte.lab9.ex6;
import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;



public class EmployeeRepository {
	public static List<Department> deptList=new ArrayList<Department>();
	public static List<Employee> empList=new ArrayList<Employee>();
	/*
	 * method created to add sample values to the employee collection
	 */
	public static void create() {

		Department d=new Department(10,"Accounting",1200);
		Department d1=new Department(20,"Research",1211);
		Department d2=new Department(30,"Sales",1244);
		Department d3=new Department(40,"Operations",1213);
		deptList.add(d);
		deptList.add(d1);
		deptList.add(d2);
		deptList.add(d3);
		//eid,fName,lName,email,phoneNo,date,designation,sal,mid,null
		
		
		Employee e1=new Employee(7369,"Ganesh",
				"Rao","ganeshrao123@gmail.com","9123445661"
				,LocalDate.parse("2015-09-18"),"Clerk",6000.00,7902,d1);
		Employee e2=new Employee(7499,"Allen",
				"DSouza","abl@gmail.com","9433357572"
				,LocalDate.parse("1998-08-11"),"Salesman",16000.00,7698,d2);
		Employee e3=new Employee(7811,"Shiva",
				"Prasad","sp99@gmail.com","9884457772"
				,LocalDate.parse("1992-06-16"),"Salesman",126000.00,7698,d2);
		Employee e4=new Employee(7839,"Pawan",
				"Kalyan","pspk2024@gmail.com","91111111111"
				,LocalDate.parse("1989-01-20"),"President",526000.00,0,d);
		Employee e5=new Employee(7902,"Tharun",
				"Bhaskar","tb.uyu@gmail.com","987335892"
				,LocalDate.parse("1997-12-05"),"Analyst",526000.00,7369,null);
		Employee e6=new Employee(7698,"John",
				"Williams","jbillwill.uyu@gmail.com","9873390909"
				,LocalDate.parse("1992-06-11"),"Manager",826000.00,7839,d2);
		empList.add(e1);
		empList.add(e2);
		empList.add(e3);
		empList.add(e4);
		empList.add(e5);
		empList.add(e6);

	}
	public static void readEmp() {
		for(Employee i: empList) {
			System.out.println(i);
		}
	}
	public static void readDept() {
			for(Department i: deptList) {
				System.out.println(i);
			}
		}
}