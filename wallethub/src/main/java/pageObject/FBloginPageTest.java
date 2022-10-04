package pageObject;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class FBloginPageTest {

	public WebDriver driver;

	By username = By.xpath("//*[@id='email']");
	By password = By.xpath("//*[@id='pass']");
	By login = By.xpath("//*[@name='login']");
	By status = By.xpath("//div[@aria-label='Create a post']/div[1]/div[1]");
	By poststatus = By.xpath("//div[@class='notranslate _5rpu']/div[1]/div[1]");
	By postsubmit = By.xpath(
			"//div[@class='j83agx80 cbu4d94t f0kvp8a6 mfofr4af l9j0dhe7 oh7imozk ij1vhnid smbo3krw']/div[3]/div[2]/div/div/div/div");
	By postedstatus = By.xpath("//div[@class='kvgmc6g5 cxmmr5t8 oygrvhab hcukyx3x c1et5uql']");

	public FBloginPageTest(WebDriver driver) {
		// TODO Auto-generated constructor stub
		this.driver = driver;
	}

	public WebElement username()

	{
		return driver.findElement(username);

	}

	public WebElement password()

	{
		return driver.findElement(password);

	}

	public WebElement login()

	{
		return driver.findElement(login);

	}

	public WebElement status()

	{
		return driver.findElement(status);

	}

	public WebElement poststatus()

	{
		return driver.findElement(poststatus);

	}

	public WebElement postsubmit()

	{
		return driver.findElement(postsubmit);

	}

	public WebElement postedstatus()

	{
		return driver.findElement(postedstatus);

	}
}
