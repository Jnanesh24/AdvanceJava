package com.jspiders.springcollection;

import java.util.Map;

public class Country
{
	private String name;
	Map<String,String> stateandlanguages;
	
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public Map<String, String> getStateandlanguages() {
		return stateandlanguages;
	}
	public void setStateandlanguages(Map<String, String> stateandlanguages) {
		this.stateandlanguages = stateandlanguages;
	}
	
	@Override
	public String toString() {
		return "Country [name=" + name + ", stateandlanguages=" + stateandlanguages + "]";
	}
	

}
