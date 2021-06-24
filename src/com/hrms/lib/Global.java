package com.hrms.lib;
import org.openqa.selenium.WebDriver;
public class Global {
//Test data
	public WebDriver driver;
	public String  url="https://opensource-demo.orangehrmlive.com/";
	public String un="Admin";
	public String pw= "admin123";

	//Objects
	
	public String txt_loginname="txtUsername";
	public String txt_password="txtPassword";
	public String btn_login="Submit";
	public String link_logout="Logout";
	
	
}
