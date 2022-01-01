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

	public class ProsesCheckoutPage {

	private WebDriver driver;
		
		public ProsesCheckoutPage() {
			driver = DriverSingleton.getDriver();
			PageFactory.initElements(driver, this);
		}
		

		@FindBy(css="#billing_first_name")
		private WebElement txtFirstname;
		
		@FindBy(css="#billing_last_name")
		private WebElement txtLastname;
		
		@FindBy(css="#billing_company")
		private WebElement txtCompany;
		
		@FindBy(css="#billing_address_1")
		private WebElement txtaddress1;
		
		@FindBy(css="#billing_address_2")
		private WebElement txtaddress2;
		
		@FindBy(css="#billing_city")
		private WebElement txtcity;
		
		@FindBy(css="#billing_postcode")
		private WebElement txtkodepos;
		
		@FindBy(css="#billing_phone")
		private WebElement txtphone;
		
		@FindBy(css="#order_comments")
		private WebElement txtadditional;
		
		@FindBy(css="#terms")
		private WebElement checkbtntemrs;
		
		@FindBy(css="#place_order")
		private WebElement btncheckoutfinish;
		
		
		
		public void gotoFinish(String firstname, String lastname, String company, String alamat1, String alamat2, String kota, String kodepos, String tlp, String additional) {
			
			txtFirstname.sendKeys(firstname);
			txtLastname.sendKeys(lastname);
			txtCompany.sendKeys(company);		
			txtaddress1.sendKeys(alamat1);
			txtaddress2.sendKeys(alamat2);
			txtcity.sendKeys(kota);
			txtkodepos.sendKeys(kodepos);
			txtphone.sendKeys(tlp);
			txtadditional.sendKeys(additional);
		}
		
		public void gotofinish2() {
			checkbtntemrs.click();
			btncheckoutfinish.click();
		}
		
	}
		