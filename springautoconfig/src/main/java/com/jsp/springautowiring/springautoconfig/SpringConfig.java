package com.jsp.springautowiring.springautoconfig;

import org.springframework.jdbc.datasource.DriverManagerDataSource;

public class SpringConfig 
{
	public void getDataSource()
	{
		DriverManagerDataSource datasource=new DriverManagerDataSource();
	}

}
