package pageObject;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class WHreviewPageTest {

	public WebDriver driver;

	By login = By.xpath("//span[@class='brgm-button brgm-signup brgm-signup-login']");
	By username = By.xpath("//input[@placeholder='Email Address']");
	By password = By.xpath("//input[@type='password']");
	By loginbutton = By.xpath("//button[@class='btn blue center reg-tabs-bt touch-element-cl']");
	
	By writereview = By.xpath("//nav[@class='profile-nav-module']/div[3]/button[1]");
	
	By reviewstars = By.xpath("//div[@class='ng-modal-container ready']/write-review/review-star/div");
	By selecting4thstar = By.xpath("//div[@class='ng-modal-container ready']/write-review/review-star/div/button[3]");
	By selecting_policy = By.xpath("//ng-dropdown[@class='wrev-drp']/div/span[1]");
	By policy_Health_Insurance = By.xpath("//ng-dropdown[@class='wrev-drp']/div/ul/li[2]");
	By PolicyReview = By.xpath("//div[@class='android']/textarea");
	By Review_submit = By.xpath("//div[@class='sub-nav-ct']/div[2]");
	By updated_review = By.xpath("//div[@class='ng-enter-element']/div[2]/div");
	By review_feed = By.xpath("//article[@class='rvtab-citem rvtab-item-user ng-enter-element']");

	public WHreviewPageTest(WebDriver driver) {
		// TODO Auto-generated constructor stub
		this.driver = driver;
	}

	public WebElement login()

	{
		return driver.findElement(login);

	}

	public WebElement username()

	{
		return driver.findElement(username);

	}

	public WebElement password()

	{
		return driver.findElement(password);

	}

	public WebElement loginbutton()

	{
		return driver.findElement(loginbutton);

	}

	public WebElement writereview()

	{
		return driver.findElement(writereview);

	}

	public WebElement reviewstars()

	{
		return driver.findElement(reviewstars);

	}

	public WebElement selecting4thstar()

	{
		return driver.findElement(selecting4thstar);

	}

	public WebElement selecting_policy()

	{
		return driver.findElement(selecting_policy);

	}

	public WebElement policy_Health_Insurance()

	{
		return driver.findElement(policy_Health_Insurance);

	}

	public WebElement PolicyReview()

	{
		return driver.findElement(PolicyReview);

	}

	public WebElement Review_submit()

	{
		return driver.findElement(Review_submit);

	}

	public WebElement updated_review()

	{
		return driver.findElement(updated_review);

	}

	public WebElement review_feed()

	{
		return driver.findElement(review_feed);

	}

}
