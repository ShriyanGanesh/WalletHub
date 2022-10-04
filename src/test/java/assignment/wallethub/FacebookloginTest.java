package assignment.wallethub;

import java.io.FileInputStream;
import java.io.IOException;
import java.util.Properties;
import java.util.concurrent.TimeUnit;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.remote.DesiredCapabilities;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.Assert;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import pageObject.FBloginPageTest;
import resource.BaseTest;

public class FacebookloginTest extends BaseTest {
	DesiredCapabilities caps = new DesiredCapabilities();
	
	public WebDriver driver;
	public static Logger log = LogManager.getLogger(BaseTest.class.getName());
	static String baseurl = "http://www.facebook.com";
	// please change username and password here for login
	String username = "";
	String password = "";
	String post_msg = "Hello World";
	
	

	@BeforeTest
	public void initialize() throws IOException {

		driver = initializeDriver();
		log.info("Driver initialized");

	}

	@Test

	public void basePagenavigation() throws IOException, InterruptedException {
		driver.get(baseurl);
		driver.manage().window().maximize();
		log.info("Navigated to homepage");
		WebDriverWait wait = new WebDriverWait(driver, 8);
		driver.manage().timeouts().implicitlyWait(8, TimeUnit.SECONDS);

		FBloginPageTest fb = new FBloginPageTest(driver);
		fb.username().sendKeys(username);
		fb.password().sendKeys(password);
		fb.login().click();
		log.info("Signed in to facebook page");

		WebElement status = fb.status();
		wait.until(ExpectedConditions.elementToBeClickable(status));
		fb.status().click();
		fb.poststatus().sendKeys(post_msg);
		fb.postsubmit().click();
		Assert.assertEquals(fb.postedstatus().getText(), post_msg);

		System.out.println("Passing Test!");

		log.info("Updated Status. Passing Test!");

	}

	@AfterMethod
	public void teardown() {

		driver.close();

	}
}
