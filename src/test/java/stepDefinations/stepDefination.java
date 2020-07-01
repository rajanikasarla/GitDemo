package stepDefinations;

import org.junit.Assert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;

public class stepDefination {

	public WebDriver driver;
	
	@Given("^enter salesforce url$")
	public void enter_salesforce_url() throws Throwable {
	    // Write code here that turns the phrase above into concrete actions
		System.setProperty("webdriver.chrome.driver", "C:\\\\chromedriver.exe");
		 driver=new ChromeDriver();
		driver.get("https://login.salesforce.com");
        String title=driver.getTitle();
        System.out.println(title);
        System.out.println("changes done from gitstuff");
        System.out.println("changes done from develop brach");
        System.out.println("changes done from develop branch");
        
	}

	@When("^user enter enters username as \"([^\"]*)\" and password as \"([^\"]*)\"$")
	public void user_enter_enters_username_as_and_password_as(String arg1, String arg2) throws Throwable {
	    // Write code here that turns the phrase above into concrete actions
		driver.findElement(By.id("username")).sendKeys(arg1);
		driver.findElement(By.id("password")).sendKeys(arg2);
		driver.findElement(By.id("Login")).click();
	}

	@Then("^Login is \"([^\"]*)\"$")
	public void login_is(String arg1) throws Throwable {
	    // Write code here that turns the phrase above into concrete actions
	    System.out.println(arg1);
	    System.out.println("changes done by asian team");
	    
	    
	    
	}

	@Then("^Login \"([^\"]*)\" when i enter \"([^\"]*)\" user name and password$")
	public void login_when_i_enter_user_name_and_password(String arg1, String arg2) throws Throwable {
	    // Write code here that turns the phrase above into concrete actions
	    
		System.out.println(arg1);
		System.out.println(arg2);
		System.out.println("changes done in Gitx");
		
	}

	


}


	
	
	

