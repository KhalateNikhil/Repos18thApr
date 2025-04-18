package StepDefinition;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class Demo1 {

	
static	WebDriver driver;

@Given("user is on loginpage")
public void user_is_on_loginpage() 
{
	System.setProperty("webdriver.chrome.driver","C:\\Users\\91937\\Downloads\\chromedriver-win64\\chromedriver-win64\\chromedriver.exe");
      driver= new ChromeDriver();
      driver.manage().window().maximize();
      driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));
      driver.manage().timeouts().pageLoadTimeout(Duration.ofSeconds(30));
      driver.manage().deleteAllCookies();
      driver.get("https://opensource-demo.orangehrmlive.com/web/index.php/auth/login");
}

@When("user enter valid credentials")
public void user_enter_valid_credentials() 
{
   driver.findElement(By.name("username")).sendKeys("Admin");
   driver.findElement(By.name("password")).sendKeys("admin123");
   driver.findElement(By.xpath("//button[text()=' Login ']")).click();
   
	
}

@Then("user validate home page title")
public void user_validate_home_page_title() 
{
   String actualtitle=driver.getTitle();
   Assert.assertEquals(actualtitle, "OrangeHRM");
   System.out.println("TC 1 is created by Nikhil Tester");
   System.out.println("TC 2 is created by Sonali Tester");
   System.out.println("TC 3 is created by Nikhil Tester");
}

}
