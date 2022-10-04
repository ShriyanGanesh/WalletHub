package pageObject;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class FBloginPageTest {

	public WebDriver driver;

	private By username = By.xpath(Messages.getString("FBloginPageTest.0")); //$NON-NLS-1$
	private By password = By.xpath(Messages.getString("FBloginPageTest.1")); //$NON-NLS-1$
	private By login = By.xpath(Messages.getString("FBloginPageTest.2")); //$NON-NLS-1$
	private By status = By.xpath(Messages.getString("FBloginPageTest.3")); //$NON-NLS-1$
	private By poststatus = By.xpath(Messages.getString("FBloginPageTest.4")); //$NON-NLS-1$
	private By postsubmit = By.xpath(
			Messages.getString("FBloginPageTest.5")); //$NON-NLS-1$
	private By postedstatus = By.xpath(Messages.getString("FBloginPageTest.6")); //$NON-NLS-1$

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
