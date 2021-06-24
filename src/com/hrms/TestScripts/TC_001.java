package com.hrms.TestScripts;

import org.testng.annotations.Test;

import com.hrms.lib.General;

public class TC_001 {
@Test
	public void tc101() throws Exception {
		General obj =new General();
		obj.openApplication();
		obj.login();
		obj.logout();
		obj.closeApplication();
}
}