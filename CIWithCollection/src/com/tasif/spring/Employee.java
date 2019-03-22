package com.tasif.spring;

import java.util.List;
import java.util.Map;
import java.util.Set;

public class Employee {
	private int id;
	private String name;
	private List<String> projectList;
	private Set<String> projectSet;
	private Map<Integer,String> projectMap;
	public Employee(int id, String name, List<String> projectList, Set<String> projectSet,
			Map<Integer, String> projectMap) {
		super();
		this.id = id;
		this.name = name;
		this.projectList = projectList;
		this.projectSet = projectSet;
		this.projectMap = projectMap;
	}
	@Override
	public String toString() {
		return "Employee [id=" + id + ", name=" + name + ", projectList=" + projectList + ", projectSet=" + projectSet
				+ ", projectMap=" + projectMap + "]";
	}
	
}
