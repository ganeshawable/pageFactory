package TestLayer;

import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

import BaseLayer.BaseClass;

public class orangeHRMTest extends BaseClass {

	@BeforeClass
	public void setup() {
		BaseClass.initilization();
	}

	@Test(priority=1)
	public void Login() {
		PageLayer.LoginPage log = new PageLayer.LoginPage();
		log.loginfunctionality("Admin", "admin123");
	}

	@Test(priority=2)
	public void Home()
	{
		PageLayer.HomePage hom=new PageLayer.HomePage();
		hom.addemployee("vaibhav", "Kadam");				
	}

	@AfterClass
	public void teardown()
	{
		driver.close();
		
	}
}
