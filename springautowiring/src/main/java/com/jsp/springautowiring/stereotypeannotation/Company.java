package com.jsp.springautowiring.stereotypeannotation;

import java.util.List;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;

@Component("comp")
public class Company 
{
	@Value("jnana2411")
	private String companycode;
	@Value("KnowledgesTechnology")
	private String companyname;
	@Value("100")
	private int companynumber;
	
	@Value("#{name}")
	private List<String> departmentname;
	
	
	public String getCompanycode() {
		return companycode;
	}
	public void setCompanycode(String companycode) {
		this.companycode = companycode;
	}
	public String getCompanyname() {
		return companyname;
	}
	public void setCompanyname(String companyname) {
		this.companyname = companyname;
	}
	public int getCompanynumber() {
		return companynumber;
	}
	public void setCompanynumber(int companynumber) {
		this.companynumber = companynumber;
	}
	
	public List<String> getDepartmentname() {
		return departmentname;
	}
	public void setDepartmentname(List<String> departmentname) {
		this.departmentname = departmentname;
	}
	@Override
	public String toString() {
		return "Company [companycode=" + companycode + ", companyname=" + companyname + ", companynumber="
				+ companynumber + ", departmentname=" + departmentname + "]";
	}
	
}
