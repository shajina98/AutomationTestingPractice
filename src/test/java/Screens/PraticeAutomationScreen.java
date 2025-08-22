package Screens;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class PraticeAutomationScreen {
	
	public static WebDriver driver;
	
	@FindBy(id = "name")
	WebElement nameTextField;
	
	
	public PraticeAutomationScreen(WebDriver driver) {
		this.driver = driver;
		PageFactory.initElements(driver, this);//initia
	}
    public void insertUserName() {
    	nameTextField.sendKeys("TestUser");
	}

}
