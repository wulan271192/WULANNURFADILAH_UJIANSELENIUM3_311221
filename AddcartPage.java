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

	public class AddcartPage {

	private WebDriver driver;
		
		public AddcartPage() {
			driver = DriverSingleton.getDriver();
			PageFactory.initElements(driver, this);
		}
		

		@FindBy(css="#nav-menu-item-cart")
		private WebElement btnAddcart;
		
		@FindBy(css="#post-6 > div > div > p.return-to-shop > a")
		private WebElement btnReturnShop;
		

		@FindBy(css=".noo-search")
		private WebElement search;
		
		@FindBy(css="input[name='s']")
		private WebElement inputsearch;
		
		//glass
		@FindBy(css="#noo-site > div.noo-container-shop.noo-shop-wrap > div.noo-row > div > div > div.noo-product-item.one.noo-product-sm-4.not_featured.post-1348.product.type-product.status-publish.has-post-thumbnail.product_cat-sun-glasses.product_tag-sun-glasses.product_tag-women.has-featured.first.instock.shipping-taxable.purchasable.product-type-variable > div > div.noo-product-thumbnail > div.noo-product-slider.owl-carousel.owl-theme > div.owl-wrapper-outer.autoHeight > div > div.owl-item.active > a > img")
		private WebElement btnpilihglass;
		
		
		@FindBy(css="#pa_color > option.attached.enabled")
		private WebElement blackglass;
		
		@FindBy(css="#pa_size > option.attached.enabled")
		private WebElement sizeglass;
		
		@FindBy(css="#product-1348 > div.single-product-content > div.summary.entry-summary > form > div > div.woocommerce-variation-add-to-cart.variations_button.woocommerce-variation-add-to-cart-enabled > button")
		private WebElement addtocartglass;
		
		
		//sepatu
		@FindBy(css=".noo-search")
		private WebElement searchshoes;
		
		@FindBy(css="input[name='s']")
		private WebElement inputsearchshoes;
		
		
		@FindBy(css="#pa_color > option.attached.enabled")
		private WebElement btnblackshoes;
		

		@FindBy(css=".variations > tbody:nth-child(1) > tr:nth-child(2) > td:nth-child(2)")
		private WebElement btnsizeshoes;
		
		@FindBy(css=".single_add_to_cart_button")
		private WebElement addtocartshoes;
		
		
		
		
		
//////////		
	
		public void goToAddcart() {
			btnAddcart.click();
		}
		public void goToAddcart2() {
			JavascriptExecutor js = (JavascriptExecutor)driver;
			js.executeScript("window.scrollBy(0,300)");
			WebDriverWait wait = new WebDriverWait(driver,15);
		
			btnReturnShop.click();
		}

	
		public void search() {
			search.click();
		}
		public void inputsearch(String search) {
			
			inputsearch.sendKeys(search);
			inputsearch.sendKeys(Keys.ENTER);
		
		}
		public void pilihglass() {
			btnpilihglass.click();
		}
		
		public void dropdownglass() {
			blackglass.click();
			sizeglass.click();
			addtocartglass.click();
		}
		public void searchshoes() {
			searchshoes.click();
		}
		public void inputsearchshoes(String searchshoes) {
			
			inputsearchshoes.sendKeys(searchshoes);
			inputsearch.sendKeys(Keys.ENTER);
		
		}

		public void goToAddcart3() {

			btnblackshoes.click();
			
			

		}
		public void goToAddcart4(int selection) {
			btnsizeshoes.click();		
			this.driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);	
			List<Keys> lstSequence = new ArrayList<Keys>();
			for (int i = 0; i < selection; i++) {
				lstSequence.add(Keys.DOWN);
			}
			lstSequence.add(Keys.ENTER);
			CharSequence[] cs = lstSequence.toArray(new CharSequence[lstSequence.size()]);
			Actions keyDown = new Actions(driver); keyDown.sendKeys(Keys.chord(cs)).perform();
		}
		public void goToAddcart5() {
			addtocartshoes.click();
		}
		
		
		
		
	


}
