package alchemyLMS;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import org.openqa.selenium.WebElement;

import junit.framework.Assert;

public class Activity2 {
		    public static void main(String args[]) throws InterruptedException {     
		    WebDriver driver = new ChromeDriver();
		    driver.get("https://alchemy.hguy.co/lms/");
	        WebElement heading = driver.findElement(By.xpath("/html/body/div/div/div/div/main/article/div/section[1]/div[2]/section/div[2]/div[2]/div[2]/div/div/div/div/div[1]/h1"));
	        String ActualHeading = heading.getText();
	        String ExpectedHeading = "Learn from Industry Experts";
	        Assert.assertEquals(ActualHeading, ExpectedHeading);
	        
	        Thread.sleep(1000);
	        driver.close();
	    }
	}