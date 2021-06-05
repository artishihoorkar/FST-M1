package alchemyLMS;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import junit.framework.Assert;

public class Activity5 {
	public static void main(String args[]) throws InterruptedException {
	WebDriver driver = new ChromeDriver();
	driver.get("https://alchemy.hguy.co/lms/");
	driver.manage().window().maximize();
	driver.findElement(By.xpath("/html/body/div[1]/header/div/div/div/div/div[3]/div/nav/div/ul/li[5]/a")).click();
	String myAccountPageTitle = driver.findElement(By.xpath("/html/body/div[1]/div/div/div/main/article/div/section[1]/div[2]/div[2]/div[2]/div/div/div/div/div[1]/h1")).getText();
	Assert.assertEquals(myAccountPageTitle, "My Account");
	Thread.sleep(1000);
    driver.close();
}
}