package com.juaracoding.wptesting.glue;

import static org.hamcrest.CoreMatchers.containsString;
import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertThat;

import org.openqa.selenium.WebDriver;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.test.context.ContextConfiguration;

import com.juaracoding.wptesting.driver.DriverSingleton;
import com.juaracoding.wptesting.utils.ConfigurationProperties;
import com.juaracoding.wptesting.utils.Constants;
import com.juaracoding.wptesting.utils.TestCases;
import com.juaracoding.wptesting.utils.Utils;
import com.juaracoding.wptesting.config.AutomationFrameWorkConfiguration;
import com.juaracoding.wptesting.page.AddcartPage;
import com.juaracoding.wptesting.page.CartPageFinish;
import com.juaracoding.wptesting.page.LoginPage;
import com.juaracoding.wptesting.page.ProsesCheckoutPage;
import com.juaracoding.wptesting.page.RegisterPage;

import com.relevantcodes.extentreports.ExtentReports;
import com.relevantcodes.extentreports.ExtentTest;
import com.relevantcodes.extentreports.LogStatus;

import io.cucumber.java.After;
import io.cucumber.java.Before;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import io.cucumber.spring.CucumberContextConfiguration;
@CucumberContextConfiguration
@ContextConfiguration(classes= AutomationFrameWorkConfiguration.class)

public class StepDefinition {
	
	private WebDriver driver;
	private RegisterPage registerPage;
	private LoginPage loginPage;
	private AddcartPage addcartPage;
	private CartPageFinish cartPageFinish;
	private ProsesCheckoutPage prosesCheckoutPage;
	ExtentTest extentTest;
	static ExtentReports report = new ExtentReports("src/main/resources/TestReport.html");
	
	@Autowired
	ConfigurationProperties configurationProperties;
	
	@Before
	public void initializeObjects() {
		DriverSingleton.getInstance(configurationProperties.getBrowser());
		registerPage = new RegisterPage();
		loginPage = new LoginPage();
		addcartPage = new AddcartPage();
		cartPageFinish = new CartPageFinish();
		prosesCheckoutPage = new ProsesCheckoutPage();
		TestCases[] tests = TestCases.values();
		extentTest = report.startTest(tests[Utils.testCount].getTestName());
		Utils.testCount++;
	}
	
	@Given("^User go to the Website")
	public void user_go_to_the_Website() {
		driver = DriverSingleton.getDriver();
		driver.get(Constants.URL);
		extentTest.log(LogStatus.PASS, "Navigating to " + Constants.URL);
	}
	
	//HALAMAN register
	
	@When("^User click Dismiss button")
	public void user_click_Dismiss_button() {
		registerPage.dismiss();
		extentTest.log(LogStatus.PASS, "User click Dismiss button");
	}
	
	@When("^User click Myaccount page button")
	public void user_click_Myaccount_page_button() {
		registerPage.goToRegisterPage();
		extentTest.log(LogStatus.PASS, "User click Myaccount page button");
	}
	
	@When("^User input username email password and click Register")
	public void user_input_username_email_password_and_click_Register() {
		registerPage.goToRegisterPage2(configurationProperties.getUserName(), configurationProperties.getEmail(), configurationProperties.getPassword());
		extentTest.log(LogStatus.PASS, "User input username email password and click Register");
	}
	
	@Then("^User can Register to the Website")
	public void user_can_Register_to_the_Website() {
		 extentTest.log(LogStatus.PASS, "User can Register to the Website");
	}
	
	
	//halamanLogin
	
	@When("^User memasukan email dan password dan klik Login")
	public void User_memasukan_email_dan_password_dan_klik_Login() {
		loginPage.goToMyaccount(configurationProperties.getEmail(), configurationProperties.getPassword());
		extentTest.log(LogStatus.PASS, "User memasukan email dan password dan klik Login");
	}
	@Then("^User dapat masuk myaccount")
	public void User_dapat_masuk_myaccount() {
		 extentTest.log(LogStatus.PASS, "User dapat masuk myaccount");
	}
	
	//halamanaddcart
	

	@When("^User klik addcart")
	public void User_klik_addcart() {
		addcartPage.goToAddcart();
		extentTest.log(LogStatus.PASS, "User klik addcart");
	}
	@When("^User masuk ke menu addcart")
	public void User_masuk_ke_menu_addcart() {
		 extentTest.log(LogStatus.PASS, "User masuk ke menu addcart");
	}
	@When("^User klik returnshop")
	public void User_klik_returnshop() {
		addcartPage.goToAddcart2();
		extentTest.log(LogStatus.PASS, "User klik returnshop");
	}

//glass
	@When("^User klik search")
	public void User_klik_search() {
	addcartPage.search();
	extentTest.log(LogStatus.PASS, "User klik search");
}
	@When("^User masukan search")
	public void User_masukan_glass() {
	addcartPage.inputsearch(configurationProperties.getSearch());
	extentTest.log(LogStatus.PASS, "User masukan search");
	}
	
	@When("^User klik gambarglass")
	public void User_klik_gambarglass() {
	addcartPage.pilihglass();
	extentTest.log(LogStatus.PASS, "User klik gambarglass");
	}
	
	@When("^User pilih warna dan ukuran glass")
	public void User_pilih_warna_dan_ukuran_glass() {
	addcartPage.dropdownglass();	
	extentTest.log(LogStatus.PASS, "User pilih warna dan ukuran glass");
	}
	
	@When("^User klik addtocart")
	public void User_klik_addtocart() {
	addcartPage.dropdownglass();	
	extentTest.log(LogStatus.PASS, "User klik addtocart");
	}
	
	//sepatu
	
	@When("^User klik searchshoes")
	public void User_klik_searchshoes() {
	addcartPage.searchshoes();
	extentTest.log(LogStatus.PASS, "User klik searchshoes");
}
	@When("^User masukan searchshoes")
	public void User_masukan_searchshoes() {
	addcartPage.inputsearchshoes(configurationProperties.getSearchshoes());
	extentTest.log(LogStatus.PASS, "User masukan searchshoes");
	}
//	@When("^User klik shoes")
//	public void User_klik_shoes() {
//		addcartPage.goToAddcart3();
//		extentTest.log(LogStatus.PASS, "User klik shoes");
//	}
	@When("^User klik nude")
	public void User_klik_nude() {
		addcartPage.goToAddcart3();
		extentTest.log(LogStatus.PASS, "User klik nude");
	}
	@When("^User klik tigadelapan")
	public void User_klik_tigadelapan() {
		addcartPage.goToAddcart4(1);
		extentTest.log(LogStatus.PASS, "User klik tigadelapan");
	}
	@Then("^User klik addtocartshoes")
	public void User_klik_addtocartshoes() {
		addcartPage.goToAddcart5();
		extentTest.log(LogStatus.PASS, "User klik addtocartshoes");
	}
	
//cartfinish
	
	@When("^User klik addcartkeranjang")
	public void User_klik_addcartkeranjang() {
		cartPageFinish.goTocartpage();
		extentTest.log(LogStatus.PASS, "User klik addcartkeranjang");
	}
	@When("^User masuk halaman cartfinish")
	public void User_masuk_halaman_cartfinish() {
		 extentTest.log(LogStatus.PASS, "User masuk halaman cartfinish");
	}
	@Then("^User klik checkout")
	public void User_klik_checkout() {
		cartPageFinish.goTocheckout();
		 extentTest.log(LogStatus.PASS, "User klik checkout");
	}
	
	//checkout
	
	@When("^User isi firstname lastname company alamat1 alamat2 kota kodepos tlp additional")
	public void User_isi_firstname_lastname_company_alamat1_alamat2_kota_kodepos_tlp_additional() {
		prosesCheckoutPage.gotoFinish(configurationProperties.getFirstname(), configurationProperties.getLastname(),  configurationProperties.getCompany(), configurationProperties.getAlamat1(), configurationProperties.getAlamat2(),configurationProperties.getKota(),configurationProperties.getKodepos(), configurationProperties.getTelepon(), configurationProperties.getAdditional());
		extentTest.log(LogStatus.PASS, "User klik addcartkeranjang");
	}
	@Then("^User klik tombol check terms dan checkoutfinish")
	public void User_klik_tombol_check_terms_dan_checkoutfinish() {
		prosesCheckoutPage.gotofinish2();
		 extentTest.log(LogStatus.PASS, "User klik tombol check terms dan checkoutfinish");
	}
	
	
	
	
	
	
	
	@After
	public void closeObject() {
		report.endTest(extentTest);
		report.flush();
	}
}



