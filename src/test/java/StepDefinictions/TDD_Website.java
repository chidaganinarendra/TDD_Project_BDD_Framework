package StepDefinictions;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.testng.Assert;

import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class TDD_Website {

	WebDriver driver;

	@Given("User is on TDD Website page")
	public void user_is_on_tdd_website_page() {
		driver = new ChromeDriver();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));
		driver.navigate().to("https://ttdevasthanams.ap.gov.in/home/dashboard");
		driver.manage().window().maximize();

	}

	@When("User Click on the About TTD Function")
	public void user_click_on_the_about_ttd_function() throws InterruptedException {

		// driver.findElement(By.linkText("About TTD")).click();
		driver.findElement(By.xpath("//*[@id=\'__next\']/div[2]/div[2]/div/div/div/ul/li[1]/span")).click();
		Thread.sleep(3000);

	}

	@Then("User is navigated to Home page TDD Website")
	public void user_is_navigated_to_home_page_tdd_website() throws InterruptedException {

		Assert.assertTrue(driver.findElements(By.xpath("//img [@alt ='TTD Logo']")).size() > 0,
				"User is navigated to Home page");
		Thread.sleep(3000);
	}

	@And("click on the Photo Gallery")
	public void click_on_the_photo_gallery() throws InterruptedException {

		WebElement webElement = driver.findElement(By.xpath("//*[@id=\'myslidemenu\']/ul/li[7]/a"));

		Actions actions = new Actions(driver);
		actions.moveToElement(webElement).perform();

		driver.findElement(By.xpath("//*[@id=\'myslidemenu\']/ul/li[7]/div/div/a[1]")).click();
		Thread.sleep(3000);
	}

	@And("Select the Past_Present")
	public void select_the_past_present() throws InterruptedException {
		
		JavascriptExecutor js = ((JavascriptExecutor) driver);
		js.executeScript("window.scrollBy(0,500)");
		Thread.sleep(2000);
		driver.findElement(By.xpath("//*[@id=\'Table1\']/tbody/tr[2]/td/table/tbody/tr/td/table/tbody/tr/td/table/tbody/tr[2]/td/div[3]/div[1]/a")).click();
		Thread.sleep(3000);
		driver.findElement(By.xpath("//*[@id=\'links\']/a[1]/img")).click();
		
		
		Thread.sleep(2000);
		driver.findElement(By.xpath("//*[@id=\'blueimp-gallery\']/a[2]")).click();
		Thread.sleep(2000);
		driver.findElement(By.xpath("//*[@id=\'blueimp-gallery\']/a[2]")).click();
		Thread.sleep(2000);
		driver.findElement(By.xpath("//*[@id=\'blueimp-gallery\']/a[2]")).click();
		Thread.sleep(2000);
		driver.findElement(By.xpath("//*[@id=\'blueimp-gallery\']/a[2]")).click();
		Thread.sleep(2000);
		driver.findElement(By.xpath("//*[@id=\'blueimp-gallery\']/a[2]")).click();
		Thread.sleep(2000);
		driver.findElement(By.xpath("//*[@id=\'blueimp-gallery\']/a[2]")).click();
		Thread.sleep(2000);
		driver.findElement(By.xpath("//*[@id=\'blueimp-gallery\']/a[2]")).click();
		Thread.sleep(2000);
		driver.findElement(By.xpath("//*[@id=\'blueimp-gallery\']/a[2]")).click();
		Thread.sleep(2000);
		driver.findElement(By.xpath("//*[@id=\'blueimp-gallery\']/a[2]")).click();
		Thread.sleep(2000);
		driver.findElement(By.xpath("//*[@id=\'blueimp-gallery\']/a[2]")).click();
		Thread.sleep(2000);
		driver.findElement(By.xpath("//*[@id=\'blueimp-gallery\']/a[2]")).click();
		Thread.sleep(2000);
		driver.findElement(By.xpath("//*[@id=\'blueimp-gallery\']/a[2]")).click();
		Thread.sleep(2000);
		driver.findElement(By.xpath("//*[@id=\'blueimp-gallery\']/a[2]")).click();
		Thread.sleep(2000);
		driver.findElement(By.xpath("//*[@id=\'blueimp-gallery\']/a[2]")).click();
		Thread.sleep(2000);
		driver.findElement(By.xpath("//*[@id=\'blueimp-gallery\']/a[2]")).click();
		
		System.out.println("  ***************** Thank For The Visited the website ******************    ");
		
		
		// Select dropdown = new Select(driver.findElement(By.tagName("a")));
		// dropdown.selectByValue("Past - Present");
		// dropdown.selectByVisibleText("Past - Present");
		// dropdown.selectByIndex(1);
		// Thread.sleep(3000);
        // dropdown.selectByVisibleText("Programmer ");
        // dropdown.selectByIndex(1);
        // dropdown.selectByValue("prog");
	}

	@And("Close The Browser")
	public void close_the_browser() {

		driver.close();
		
		
		

	}

	/*
	 * Select drpCountry = new Select(driver.findElement(By.name("country")));
	 * drpCountry.selectByVisibleText("ANTARCTICA");
	 * 
	 * //Selecting Items in a Multiple SELECT elements
	 * driver.get("http://jsbin.com/osebed/2"); Select fruits = new
	 * Select(driver.findElement(By.id("fruits")));
	 * fruits.selectByVisibleText("Banana"); fruits.selectByIndex(1);
	 */

}
