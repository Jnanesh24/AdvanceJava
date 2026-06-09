package com.jsp.springjdbc.springjdbcreferancetype;

public class Employe 
{
	private int empno;
	private String ename;
	private double sal;
	Address address;
	
	
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
	public double getSal() {
		return sal;
	}
	public void setSal(double sal) {
		this.sal = sal;
	}
	public Address getAddress() {
		return address;
	}
	public void setAddress(Address address) {
		this.address = address;
	}
	
	@Override
	public String toString() {
		return "Employe [empno=" + empno + ", ename=" + ename + ", sal=" + sal + ", address=" + address + "]";
	}

}
