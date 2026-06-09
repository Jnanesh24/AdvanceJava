package com.jsp.springautowiring.springautowiring;

import org.springframework.beans.factory.annotation.Autowired;

public class Employee {
	private int empno;
	private double sal;
	private String name;
	
	private Address address;
	
	public int getEmpno() {
		return empno;
	}
	public void setEmpno(int empno) {
		this.empno = empno;
	}
	public double getSal() {
		return sal;
	}
	public void setSal(double sal) {
		this.sal = sal;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public Address getAddress() {
		return address;
	}
	@Autowired
	public void setAddress(Address address) {
		this.address = address;
	}
	
	@Override
	public String toString() {
		return "Employee [empno=" + empno + ", sal=" + sal + ", name=" + name + ", address=" + address + "]";
	}

}
