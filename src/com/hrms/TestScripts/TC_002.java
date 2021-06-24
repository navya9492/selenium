package com.hrms.TestScripts;
import org.testng.annotations.Test;

import com.hrms.lib.General;
public class TC_002 {
	
	
	@Test
	public void tc002() throws Exception {
		General obj =new General();
		obj.openApplication();
		obj.login();
		obj.addEmp();
		obj.delEmp();
		obj.logout();
		obj.closeApplication();
	}}
