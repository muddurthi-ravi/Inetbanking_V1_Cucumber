package Stepdefinitions;

import java.time.Duration;

import org.junit.Assert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class stepdefinitions 
{
	WebDriver driver;
	@Given("user open browser with url {string}")
	public void user_open_browser_with_url(String url) {
		System.setProperty("webdriver.chrome.driver", System.getProperty("user.dir")+"//Drivers//chromedriver.exe");
		driver = new ChromeDriver();
		driver.manage().deleteAllCookies();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(20));
		driver.get(url);	   
	}

	@When("user should see the loginpage")
	public void user_should_see_the_loginpage() {
		boolean res = driver.findElement(By.name("btnLogin")).isDisplayed();
		if(res==true)
		{
			Assert.assertTrue(true);
		}else
		{
			Assert.assertTrue(false);
		}
	}

	@Then("user enter {string} and {string}")
	public void user_enter_and(String username, String password) {
		driver.findElement(By.name("uid")).sendKeys(username);
		driver.findElement(By.name("password")).sendKeys(password);
	}

	@Then("user click login")
	public void user_click_login() {
		driver.findElement(By.name("btnLogin")).click();
	}

	@When("user should see admin page")
	public void user_should_see_admin_page() {
		boolean res = driver.findElement(By.linkText("Manager")).isDisplayed();
		if(res==true)
		{
			Assert.assertTrue(true);
		}else
		{
			Assert.assertTrue(false);
		}
	}

	@Then("user click logout")
	public void user_click_logout() {
		driver.findElement(By.linkText("Log out")).click();
		String alert = driver.switchTo().alert().getText();
		if(alert.contains("Logged Out"))
		{
			driver.switchTo().alert().accept();
		}else
		{
			driver.switchTo().alert().dismiss();
		}
	}

	@Then("user close browser")
	public void user_close_browser() {
		driver.close();
	}

}
