package com.juaracoding.wptesting.page;

import java.util.ArrayList;
import java.util.List;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
	import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.FindBy;
	import org.openqa.selenium.support.PageFactory;
	import org.openqa.selenium.support.ui.WebDriverWait;

	import com.juaracoding.wptesting.driver.DriverSingleton;

	public class CartPageFinish {

	private WebDriver driver;
		
		public CartPageFinish() {
			driver = DriverSingleton.getDriver();
			PageFactory.initElements(driver, this);
		}
		

		@FindBy(css=".cart-button")
		private WebElement btncartfinish;
		
		@FindBy(css="a.checkout-button:nth-child(1)")
		private WebElement btncheckout;
		
		public void goTocartpage() {
			btncartfinish.click();
		
	}
		public void goTocheckout() {
			btncheckout.click();
		
		
	
	}
	}
		
	