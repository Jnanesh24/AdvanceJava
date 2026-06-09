package com.jspiders.springdependencyinjection;

import java.util.Set;

public class Branches
{
	private String branchCode;
	private String branchName;
	private Set<Students>students;
	
	
	public String getBranchCode() {
		return branchCode;
	}
	public void setBranchCode(String branchCode) {
		this.branchCode = branchCode;
	}
	public String getBranchName() {
		return branchName;
	}
	public void setBranchName(String branchName) {
		this.branchName = branchName;
	}
	public Set<Students> getStudents() {
		return students;
	}
	public void setStudents(Set<Students> students) {
		this.students = students;
	}
	
	
	@Override
	public String toString() {
		return "Branches [branchCode=" + branchCode + ", branchName=" + branchName + ", students=" + students + "]";
	}

}
