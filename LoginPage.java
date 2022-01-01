package com.juaracoding.wptesting.page;

import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.WebDriverWait;

import com.juaracoding.wptesting.driver.DriverSingleton;

public class LoginPage {

private WebDriver driver;
	
	public LoginPage() {
		driver = DriverSingleton.getDriver();
		PageFactory.initElements(driver, this);
	}
	

	@FindBy(css="#user_login")
	private WebElement txtEmail;
	
	@FindBy(css="#user_pass")
	private WebElement txtPassword;
	
	@FindBy(css="#wp-submit")
	private WebElement btnLogin;
	
	
	public void goToMyaccount(String email, String password) {
	
		txtEmail.sendKeys(email);
		txtPassword.sendKeys(password);
		btnLogin.click();
	}
	
	
	
	
	
}
