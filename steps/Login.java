package week6.day1.assignments.steps;

import org.openqa.selenium.By;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class Login extends Base {
	
	
//	@Given("Open the Chrome Browser")
//	public void openBrowser() {
//		WebDriverManager.chromedriver().setup();
//		driver = new ChromeDriver();
//		driver.manage().window().maximize();
//		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(5));
//	}
//	@Given("Load the LeafTaps Application {string}")
//	public void loadApp(String url) {
//		driver.get(url);

	@Given("Username as {string}")
	public void Username(String username) {
		driver.findElement(By.id("username")).sendKeys(username);	

	}
	@Given("Password as {string}")
	public void Password(String password) {
		driver.findElement(By.id("password")).sendKeys(password);
	}
	@When("Click on the Login button")
	public void LoginButton() {
		driver.findElement(By.className("decorativeSubmit")).click();
	}
	@Then("Leaftaps Homepage Should be opened")
	public void VerifyPage() {
		String title = driver.getTitle();
		
		if (title.equals("Leaftaps - TestLeaf Automation Platform")	) {
			
		 System.out.println("Page Verified");

	}else {
		System.out.println("Page Not Verified");	
	
	}
			
	}
}
