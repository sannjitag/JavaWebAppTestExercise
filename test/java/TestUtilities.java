import java.net.HttpURLConnection;
import java.net.URL;

import org.junit.Assert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class TestUtilities {
	
	public static boolean checkIflinkExists(String urlLink){
	    try 
	    {
	    	HttpURLConnection.setFollowRedirects(false);
	    	HttpURLConnection con = (HttpURLConnection) new URL(urlLink).openConnection();
	    	con.setRequestMethod("HEAD");
	    	System.out.println("con.getResponseCode(): =  " + con.getResponseCode());
	    	return (con.getResponseCode() == 302 );//HttpURLConnection.HTTP_OK);
	    }
	    catch (Exception e) {
	    	e.printStackTrace();
	    	return false;
	    }
	}
	
	public static boolean login(WebDriver driver, String name, String pwd, String message) {
		 
		 System.out.println("This is the test: " + new Object(){}.getClass().getEnclosingMethod().getName());
		 
		 
		 driver.findElement(By.id("username")).sendKeys(name);
		 driver.findElement(By.id("password")).sendKeys(pwd);
		 driver.findElement(By.tagName("button")).click();
	     return driver.getPageSource().contains(message);
		
	}
	
	public static void verifyLogonPageDisplay(WebDriver driver) {
		  WebElement username = driver.findElement(By.id("username")); 
		  WebElement password = driver.findElement(By.id("password")); 
		  WebElement submitButton = driver.findElement(By.tagName("button"));
		  
		  Assert.assertNotNull(username); 
		  Assert.assertNotNull(password); 
		  Assert.assertNotNull(submitButton); 
	}

}
