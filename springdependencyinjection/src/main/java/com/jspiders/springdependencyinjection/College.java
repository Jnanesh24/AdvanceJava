package com.jspiders.springdependencyinjection;

import java.util.Set;

public class College 
{
	private String collegeCode;
	private String collegeName;
	private Set<Branches> branches;
	
	public String getCollegeCode() {
		return collegeCode;
	}
	public void setCollegeCode(String collegeCode) {
		this.collegeCode = collegeCode;
	}
	public String getCollegeName() {
		return collegeName;
	}
	public void setCollegeName(String collegeName) {
		this.collegeName = collegeName;
	}
	public Set<Branches> getBranches() {
		return branches;
	}
	public void setBranches(Set<Branches> branches) {
		this.branches = branches;
	}
	
	@Override
	public String toString() {
		return "College [collegeCode=" + collegeCode + ", collegeName=" + collegeName + ", branches=" + branches + "]";
	}
	
	
	

}
