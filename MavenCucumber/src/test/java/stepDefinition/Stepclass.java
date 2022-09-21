package stepDefinition;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class Stepclass 
{
	public static WebDriver driver;
	@Given("open browser and enter test url")
	public void open_browser_and_enter_test_url() 
	{
	    System.setProperty("webdriver.chrome.driver", "./softwares/chromedriver.exe");
	    driver=new ChromeDriver();
	    driver.get("http://localhost/login.do");
	}

	@Then("login page should be displayed")
	public void login_page_should_be_displayed() throws InterruptedException 
	{
	    String logintitle = driver.getTitle();
	    Thread.sleep(2000);
	    Assert.assertEquals(logintitle, "actiTIME - Login");
	}

	@When("enter valid username and password and click on login button")
	public void enter_valid_username_and_password_and_click_on_login_button() throws InterruptedException 
	{
	   driver.findElement(By.name("username")).sendKeys("admin");
	   Thread.sleep(2000);
	   driver.findElement(By.name("pwd")).sendKeys("admin");
	   Thread.sleep(2000);
	   driver.findElement(By.xpath("//div[.='Login ']")).click();
	   
	}

	@Then("Home page should be displayed.")
	public void home_page_should_be_displayed() throws InterruptedException 
	{
	   
		Thread.sleep(3000);
		String hometitle = driver.getTitle();
	    Assert.assertEquals(hometitle, "actiTIME - Enter Time-Track");
	}

}
