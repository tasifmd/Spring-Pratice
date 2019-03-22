package com.tasif.spring;

import java.util.List;
import java.util.Map;
import java.util.Set;

public class Employee {
	private List<String> employeeList;
	private Set<String> employeeSet;
	private Map<String,String> employeeMap;
	public void getEmployeeList() {
		System.out.println("Employee List : " + employeeList);	
	}
	public void setEmployeeList(List<String> employeeList) {
		this.employeeList = employeeList;
	}
	public void getEmployeeSet() {
		System.out.println("Employee Set : " + employeeSet);
	}
	public void setEmployeeSet(Set<String> employeeSet) {
		this.employeeSet = employeeSet;
	}
	public void getEmployeeMap() {
		System.out.println("Employee Map : " + employeeMap);
	}
	public void setEmployeeMap(Map<String,String>  employeeMap) {
		this.employeeMap = employeeMap;
	}
}
