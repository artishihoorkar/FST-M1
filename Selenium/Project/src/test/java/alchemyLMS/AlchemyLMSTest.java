package alchemyLMS;

import org.testng.annotations.Test;

import junit.framework.Assert;

import org.testng.annotations.BeforeTest;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterTest;

public class AlchemyLMSTest {
	WebDriver driver;
	
	@BeforeTest
	public void setUp() {
		 WebDriver driver = new ChromeDriver();
	      driver.get("https://alchemy.hguy.co/lms/");
	}
	
  @Test(priority= 1)
  public void verifyPageTitle() {
	  String ActualTitle = driver.getTitle();
      String ExpectedTitle = "Alchemy LMS – An LMS Application";
      Assert.assertEquals(ActualTitle, ExpectedTitle);	
      }
  @Test(priority= 2)
  public void verifyHeading() {
	  WebElement heading = driver.findElement(By.xpath("/html/body/div/div/div/div/main/article/div/section[1]/div[2]/section/div[2]/div[2]/div[2]/div/div/div/div/div[1]/h1"));
      String ActualHeading = heading.getText();
      String ExpectedHeading = "Learn from Industry Experts";
      Assert.assertEquals(ActualHeading, ExpectedHeading);
      }
  @Test(priority= 3)
  public void verifyFirstTitleInfoBox() throws InterruptedException{
	  WebElement title_first_box;
      title_first_box = driver.findElement(By.xpath("/html/body/div/div/div/div/main/article/div/section[2]/div[2]/div[1]/div[2]/div/div/div/div/div[2]/h3"));	
      String ActualTitleFirstBox = title_first_box.getText();
      Thread.sleep(2000);
      String ExpectedTitleFirstBox = "Actionable Training";
      Assert.assertEquals(ActualTitleFirstBox, ExpectedTitleFirstBox);	 
      }
  @Test(priority = 4)
  public void verifySecondMostPopularCourseName() throws InterruptedException {
	Actions actionProvider = new Actions(driver);
  	actionProvider.moveToElement(driver.findElement(By.xpath("/html/body/div/div/div/div/main/article/div/section[4]/div[2]/div/div[2]/div/div/div/div[2]/article/div[2]/h3"))).build().perform();
  	Thread.sleep(2000);
  	String SecondMostPopularCourseName = driver.findElement(By.xpath("/html/body/div/div/div/div/main/article/div/section[4]/div[2]/div/div[2]/div/div/div/div[2]/article/div[2]/h3")).getText();
  	Assert.assertEquals(SecondMostPopularCourseName, "Email Marketing Strategies");
   }
  @Test(priority = 5)
  public void verifyLogin() throws InterruptedException {
	  WebElement Login;
      WebElement Password;
      WebElement LoginButton;
      String LoginCheck;
      driver.findElement(By.xpath("/html/body/div[1]/header/div/div/div/div/div[3]/div/nav/div/ul/li[5]/a")).click();
      driver.findElement(By.className("learndash-wrapper")).click();
      Thread.sleep(2000);
     Login= driver.findElement(By.id("user_login"));
     Password = driver.findElement(By.id("user_pass"));
     Login.sendKeys("root");
     Password.sendKeys("pa$$w0rd");
     LoginButton = driver.findElement(By.id("wp-submit"));
     LoginButton.click();
     LoginCheck = driver.findElement(By.className("ld-profile-edit-link")).getText();
     Assert.assertEquals(LoginCheck, "Edit profile");
    }

}
