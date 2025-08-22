package Scripts;

import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import Base.PraticeAutomation;

import Screens.PraticeAutomationScreen;

public class PraticeAutomationScript extends PraticeAutomation{
	
	public PraticeAutomationScreen automation;
	
	@BeforeTest
	public void setUp() {
		automation = new PraticeAutomationScreen(driver);
	}
	
	
	@Test
	public void launch() {
		driver.manage().window().maximize();
		automation.insertUserName();
		
	}

}
