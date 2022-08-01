package com.cts.springboot.truyum.model;

import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class Main {
	
	public static void main(String[] args) {
		HashMap<Integer,Employee> emp = new HashMap<>();
		emp.put(1,new Employee("Maddy", 12,15000));
		emp.put(2,new Employee("Paddy", 45,17000));
		emp.put(3,new Employee("Saddy", 100,16678));
		emp.put(4,new Employee("Addy", 84,15674));
		emp.put(5,new Employee("Maddy", 72,15036));
		System.out.println(emp);

		List<Map.Entry<Integer, Employee>> listOfEmp = new ArrayList<>(emp.entrySet());
		Collections.sort(listOfEmp, (o1,o2) -> {
			return o1.getValue().getSalary()>o2.getValue().getSalary()?1:o1.getValue().getSalary()<o2.getValue().getSalary()?-1:0;
		});
		System.out.println(listOfEmp);

	}

}




class Employee{
	
	@Override
	public String toString() {
		return "Employee [empName=" + empName + ", empNo=" + empNo + ", salary=" + salary + "]";
	}
	public Employee(String empName, int empNo, int salary) {
		this.empName = empName;
		this.empNo = empNo;
		this.salary = salary;
	}
	private String empName;
	private int empNo;
	private int salary;
	public String getEmpName() {
		return empName;
	}
	public void setEmpName(String empName) {
		this.empName = empName;
	}
	public int getEmpNo() {
		return empNo;
	}
	public void setEmpNo(int empNo) {
		this.empNo = empNo;
	}
	public int getSalary() {
		return salary;
	}
	public void setSalary(int salary) {
		this.salary = salary;
	}
		
}