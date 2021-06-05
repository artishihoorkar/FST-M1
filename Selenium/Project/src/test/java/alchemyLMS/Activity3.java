package alchemyLMS;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import org.openqa.selenium.WebElement;

import junit.framework.Assert;

public class Activity3 {
		    public static void main(String args[]) throws InterruptedException {     
		    	WebDriver driver = new ChromeDriver();
		        driver.get("https://alchemy.hguy.co/lms/");
		    	WebElement title_first_box;
		        title_first_box = driver.findElement(By.xpath("/html/body/div/div/div/div/main/article/div/section[2]/div[2]/div[1]/div[2]/div/div/div/div/div[2]/h3"));	
		        String ActualTitleFirstBox = title_first_box.getText();
		        String ExpectedTitleFirstBox = "Actionable Training";
		        Assert.assertEquals(ActualTitleFirstBox, ExpectedTitleFirstBox);
	        
	        Thread.sleep(1000);
	        driver.close();
	    }
}