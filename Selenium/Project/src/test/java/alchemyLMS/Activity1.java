package alchemyLMS;

import org.openqa.selenium.WebDriver;

import org.openqa.selenium.chrome.ChromeDriver;


import junit.framework.Assert;


public class Activity1 {
	
    public static void main(String args[]) throws InterruptedException {
    	
//Read the title of the website and verify the text
 WebDriver driver = new ChromeDriver();
        driver.get("https://alchemy.hguy.co/lms/");
        String ActualTitle = driver.getTitle();
        System.out.println(ActualTitle);
        String ExpectedTitle = "Alchemy LMS – An LMS Application";
        Assert.assertEquals(ActualTitle, ExpectedTitle);
       Thread.sleep(1000);
        driver.close();
    }
}