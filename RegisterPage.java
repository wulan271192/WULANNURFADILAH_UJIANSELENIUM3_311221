package com.juaracoding.wptesting.page;

import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.WebDriverWait;

import com.juaracoding.wptesting.driver.DriverSingleton;

public class RegisterPage {

private WebDriver driver;
	
	public RegisterPage() {
		driver = DriverSingleton.getDriver();
		PageFactory.initElements(driver, this);
	}

	@FindBy(css=".woocommerce-store-notice__dismiss-link")
	private WebElement btnDismiss;
	
	@FindBy(css="#noo-site > header > div.noo-topbar > div > ul.pull-right.noo-topbar-right > li:nth-child(2) > a")
	private WebElement btnMyaccount;
	
	@FindBy(css="#reg_username")
	private WebElement txtUsername;
	
	@FindBy(css="#reg_email")
	private WebElement txtEmail;
	
	@FindBy(css="#reg_password")
	private WebElement txtPassword;
	
	@FindBy(css="#customer_login > div.u-column2.col-2 > form > p:nth-child(5) > button")
	private WebElement btnRegister;
	
public void dismiss() {
		
	btnDismiss.click();
	}
	
	public void goToRegisterPage() {
		
		btnMyaccount.click();
	}
	
	public void goToRegisterPage2(String username, String email, String password) {
		JavascriptExecutor js = (JavascriptExecutor)driver;
		js.executeScript("window.scrollBy(0,400)");
		WebDriverWait wait = new WebDriverWait(driver,15);
	
		txtUsername.sendKeys(username);
		txtEmail.sendKeys(email);
		txtPassword.sendKeys(password);
		btnRegister.click();
	}
	
	
	
	
	
}
