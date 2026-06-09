package com.jsp.springautowiring.springautowiring;

public class Address
{
	private int pincode;
	private String state;
	private String city;
	
	
	public Address(int pincode, String state, String city) {
		super();
		this.pincode = pincode;
		this.state = state;
		this.city = city;
	}
	public int getPincode() {
		return pincode;
	}
	public void setPincode(int pincode) {
		this.pincode = pincode;
	}
	public String getState() {
		return state;
	}
	public void setState(String state) {
		this.state = state;
	}
	public String getCity() {
		return city;
	}
	public void setCity(String city) {
		this.city = city;
	}
	
	@Override
	public String toString() {
		return "Address [pincode=" + pincode + ", state=" + state + ", city=" + city + "]";
	}
	

}
