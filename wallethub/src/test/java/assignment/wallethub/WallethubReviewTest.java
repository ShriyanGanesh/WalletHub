package assignment.wallethub;

import java.io.IOException;
import java.util.concurrent.TimeUnit;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.Assert;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import pageObject.WHreviewPageTest;
import resource.BaseTest;

public class WallethubReviewTest extends BaseTest {
	public WebDriver driver;
	public static Logger log = LogManager.getLogger(BaseTest.class.getName());
	// please change username and password here for login
	String username = "";
	String password = "";

	@BeforeTest
	public void initialize() throws IOException {

		driver = initializeDriver();
		log.info("Driver initialized");
		ChromeOptions options = new ChromeOptions();
		options.addArguments("--disable-notifications");
		driver = new ChromeDriver(options);
	}

	@Test

	public void basePagenavigation() throws IOException, InterruptedException {
		String baseurl = "https://wallethub.com/profile/test-insurance-company-13732055i";

		driver.get(baseurl);
		driver.manage().window().maximize();
		log.info("Navigated to homepage");
		WebDriverWait wait = new WebDriverWait(driver, 8);
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);

		WHreviewPageTest wh = new WHreviewPageTest(driver);

		wh.login().click();
		wh.username().sendKeys(username);
		wh.password().sendKeys(password);
		wh.loginbutton().click();
		Thread.sleep(6000);
		log.info("Signed in to walllethub page");

		wh.writereview().click();

		WebElement review_stars = wh.reviewstars();
		Actions builder = new Actions(driver);
		builder.moveToElement(review_stars);

		WebElement selecting_4thstar = wh.selecting4thstar();
		builder.moveToElement(selecting_4thstar).click().perform();

		WebElement selecting_policy = wh.selecting_policy();
		wait.until(ExpectedConditions.elementToBeClickable(selecting_policy));
		selecting_policy.click();
		wh.policy_Health_Insurance().click();
		WebElement PolicyReview = wh.PolicyReview();
		PolicyReview.clear();

		String msg = "Hello ";
		for (int i = 0; i < 10; i++) {
			msg += "Greetings to Everyone! ";
		}

		PolicyReview.sendKeys(msg);
		WebElement Review_submit = wh.Review_submit();
		Review_submit.click();
		log.info("Review updated");

		WebElement updated_review = wh.updated_review();
		Assert.assertTrue(updated_review.isDisplayed());
		String updated_review_text = updated_review.getText();
		System.out.println(updated_review_text);

		driver.navigate().to(baseurl);
		String review_feed = driver
				.findElement(By.xpath("//article[@class='rvtab-citem rvtab-item-user ng-enter-element']")).getText();
		Assert.assertTrue(review_feed.contains("Hello Greetings to Everyone!"));
		System.out.println("Review is updated, Passing Test!");
		log.info("Successfully updated the review. PassingTest!");

	}

	@AfterMethod
	public void teardown() {

		driver.close();

	}

}
