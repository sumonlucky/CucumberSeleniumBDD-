package stepDefinations;

import org.junit.Assert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;



public class LoginStepDefination {
	WebDriver driver;
	
	@Given("^Open the Chrome and launch the application$")
	public void open_the_Chrome_and_launch_the_application(){
	System.setProperty("webdriver.chrome.driver", "C:\\SeleniumJava\\Installers\\Drivers\\chromedriver.exe");
	driver = new ChromeDriver();
	driver.manage().window().maximize();
	driver.get("https://www.riteaid.com/");
	try {
		Thread.sleep(5000);
	} catch (InterruptedException e) {
		e.printStackTrace();    
	} 
	
	}
	
	@When("^User handle pop-up window$")
	public void user_handle_pop_up_window() throws Throwable {
		driver.findElement(By.xpath("//a[text()=\"No Thanks\"]")).click();
		Thread.sleep(2000);
	}
	
	@When("^Uesr click on login$")
	public void uesr_click_on_login() throws Throwable {
	  driver.findElement(By.xpath("//a[@id=\"btnOpen2\"]")).click();
	  Thread.sleep(3000);
	}
	
	@Then("^User Enter UserName and Password$")
	public void user_Enter_UserName_and_Password() throws Throwable {
		driver.findElement(By.xpath("//*[@title=\"Please enter your username\"]")).sendKeys("sumonlucky.sl@gmail.com");
		driver.findElement(By.xpath("(//input[@title=\"Please enter your password\"])[1]")).sendKeys("Sumon123");
		Thread.sleep(3000);
	}
	
	@When("^User click on Login button$")
	public void user_click_on_Login_button() throws Throwable {
	    driver.findElement(By.xpath("//button[@class=\"red-button2\"]")).click();
	    Thread.sleep(3000);
	}

	@Then("^User entered the Home page$")
	public void user_entered_the_Home_page() throws Throwable {
		String logintext = driver.findElement(By.xpath("(//a[@class=\"nav-link btn btn-xs2 seperator\"])[2]")).getText();
		System.out.println(logintext);
		Assert.assertEquals("Hello, MD MIA" , logintext);
		Thread.sleep(3000);
	    driver.close();
	}

	


}
