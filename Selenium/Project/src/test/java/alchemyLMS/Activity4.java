package alchemyLMS;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;


import junit.framework.Assert;

public class Activity4 {
		    public static void main(String args[]) throws InterruptedException {     
		    	WebDriver driver = new ChromeDriver();
		        driver.get("https://alchemy.hguy.co/lms/");
		        Actions actionProvider = new Actions(driver);
		    	actionProvider.moveToElement(driver.findElement(By.xpath("/html/body/div/div/div/div/main/article/div/section[4]/div[2]/div/div[2]/div/div/div/div[2]/article/div[2]/h3"))).build().perform();
		    	Thread.sleep(2000);
		    	String SecondMostPopularCourseName = driver.findElement(By.xpath("/html/body/div/div/div/div/main/article/div/section[4]/div[2]/div/div[2]/div/div/div/div[2]/article/div[2]/h3")).getText();
		    	Assert.assertEquals(SecondMostPopularCourseName, "Email Marketing Strategies");
	        
	        Thread.sleep(1000);
	        driver.close();
	    }
}