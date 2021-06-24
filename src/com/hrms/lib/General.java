package com.hrms.lib;
import org.openqa.selenium.By;
import org.openqa.selenium.firefox.FirefoxDriver;
public class General extends Global {

	public void openApplication(){
	System.setProperty("webdriver.gecko.driver","D:\\Navya testing\\SELENIUM NEW\\geckodriver-v0.29.1-win64//geckodriver.exe");
	System.out.println("Browser launched");
	driver=new FirefoxDriver();
	driver.navigate().to(url);
	System.out.println("Application opened");
	}
	public void closeApplication() {
	driver.quit();
	System.out.println("Application closed");
}
	public void login() throws Exception{
		driver.findElement(By.name(txt_loginname)).sendKeys(un);
		driver.findElement(By.name(txt_password)).sendKeys(pw);
		driver.findElement(By.name(btn_login)).click();
	Thread.sleep(3000);
	System.out.println("Login completed");
	}
	public void logout() throws InterruptedException {
		driver.findElement(By.id("welcome")).click();
		Thread.sleep(3000);
		driver.findElement(By.linkText(link_logout)).click();
		System.out.println("Logout completed");
	}
public void addEmp(){
System.out.println("adding new employee");
}
public void delEmp(){
	System.out.println("Deleting an employee");
}
}
