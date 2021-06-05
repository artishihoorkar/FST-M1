package alchemyLMS;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import junit.framework.Assert;

public class Activity6 {
	
	public static void main(String args[]) throws InterruptedException {
		WebDriver driver = new ChromeDriver();
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
       Assert.assertEquals(LoginCheck, "Edit profile");

     
        Thread.sleep(1000);
        driver.close();
}
}
