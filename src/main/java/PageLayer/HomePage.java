package PageLayer;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import BaseLayer.BaseClass;

public class HomePage extends BaseClass {

	@FindBy(xpath = "//a[@id='menu_pim_viewPimModule']")
	WebElement pim;

	@FindBy(xpath = "//a[@id='menu_pim_addEmployee']")
	WebElement addemp;

	@FindBy(id = "firstName")
	WebElement fname;

	@FindBy(id = "lastName")
	WebElement lname;

	@FindBy(id = "btnSave")
	WebElement save;

	public HomePage() {
		PageFactory.initElements(driver, this);
	}

	public void addemployee(String firstname, String lastname) {
		pim.click();
		addemp.click();
		fname.sendKeys(firstname);
		lname.sendKeys(lastname);
		save.click();
		
	}

}
