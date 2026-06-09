package com.jspiders.springset;

import java.util.Set;

public class Employee
{
   private int empno;
   private  String ename;
   private String salary;
   private Set<Long> contact;
   
   
public int getEmpno() {
	return empno;
}
public void setEmpno(int empno) {
	this.empno = empno;
}
public String getEname() {
	return ename;
}
public void setEname(String ename) {
	this.ename = ename;
}
public String getSalary() {
	return salary;
}
public void setSalary(String salary) {
	this.salary = salary;
}
public Set<Long> getContact() {
	return contact;
}
public void setContact(Set<Long> contact) {
	this.contact = contact;
}

@Override
public String toString() {
	return "Employee [empno=" + empno + ", ename=" + ename + ", salary=" + salary + ", contact=" + contact + "]";
}
   
    
}
