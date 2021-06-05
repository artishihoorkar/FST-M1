package Examples;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebDriver.Window;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

import junit.framework.Assert;

public class GetPageDetails {
	
    public static void main(String args[]) throws InterruptedException {
    	
//Read the title of the website and verify the text
/*      WebDriver driver = new ChromeDriver();
        driver.get("https://alchemy.hguy.co/lms/");
        String ActualTitle = driver.getTitle();
        System.out.println(ActualTitle);
        String ExpectedTitle = "Alchemy LMS – An LMS Application";
        Assert.assertEquals(ActualTitle, ExpectedTitle);
       
//Read the heading of the website and verify the text
        
        WebElement heading = driver.findElement(By.xpath("/html/body/div/div/div/div/main/article/div/section[1]/div[2]/section/div[2]/div[2]/div[2]/div/div/div/div/div[1]/h1"));
        String ActualHeading = heading.getText();
        String ExpectedHeading = "Learn from Industry Experts";
        Assert.assertEquals(ActualHeading, ExpectedHeading);
        
//Read the title of the first info box on the website and verify the text     
        
        WebElement title_first_box;
        title_first_box = driver.findElement(By.xpath("/html/body/div/div/div/div/main/article/div/section[2]/div[2]/div[1]/div[2]/div/div/div/div/div[2]/h3"));	
        String ActualTitleFirstBox = title_first_box.getText();
        String ExpectedTitleFirstBox = "Actionable Training";
        Assert.assertEquals(ActualTitleFirstBox, ExpectedTitleFirstBox);*/
    	
//Verify the second most popular course
    	
    	/*Actions actionProvider = new Actions(driver);
    	actionProvider.moveToElement(driver.findElement(By.xpath("/html/body/div/div/div/div/main/article/div/section[4]/div[2]/div/div[2]/div/div/div/div[2]/article/div[2]/h3"))).build().perform();
    	Thread.sleep(2000);
    	String SecondMostPopularCourseName = driver.findElement(By.xpath("/html/body/div/div/div/div/main/article/div/section[4]/div[2]/div/div[2]/div/div/div/div[2]/article/div[2]/h3")).getText();
    	Assert.assertEquals(SecondMostPopularCourseName, "Email Marketing Strategies");*/
    	
//Verify MyAccount page
    	WebDriver driver = new ChromeDriver();
    	driver.get("https://alchemy.hguy.co/lms/");
    	driver.manage().window().maximize();
    	driver.findElement(By.xpath("/html/body/div[1]/header/div/div/div/div/div[3]/div/nav/div/ul/li[5]/a")).click();
    	String myAccountPageTitle = driver.findElement(By.xpath("/html/body/div[1]/div/div/div/main/article/div/section[1]/div[2]/div[2]/div[2]/div/div/div/div/div[1]/h1")).getText();
    	Assert.assertEquals(myAccountPageTitle, "My Account");
    	
//Login to LMS
    	/*WebDriver driver = new ChromeDriver();
    	driver.get("https://alchemy.hguy.co/lms/");
      WebElement Login;
        WebElement Password;
        WebElement LoginButton;
        String LoginCheck;
        driver.findElement(By.xpath("/html/body/div[1]/header/div/div/div/div/div[3]/div/nav/div/ul/li[5]/a")).click();
        driver.findElement(By.className("learndash-wrapper")).click();
       Login= driver.findElement(By.id("user_login"));
       Password = driver.findElement(By.id("user_pass"));
       Login.sendKeys("root");
       Password.sendKeys("pa$$w0rd");
       LoginButton = driver.findElement(By.id("wp-submit"));
       LoginButton.click();
       LoginCheck = driver.findElement(By.className("ld-profile-edit-link")).getText();
       Assert.assertEquals(LoginCheck, "Edit profile");*/

     
        Thread.sleep(1000);
        driver.close();
    }
}