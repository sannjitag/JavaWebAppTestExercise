import org.junit.AfterClass;
import org.junit.Assert;
import org.junit.BeforeClass;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;

public class TestApplicationNegativeCases {
	
	private static FirefoxDriver driver;
	
	@BeforeClass
	public static void  setUp(){
		driver = new FirefoxDriver(); //Initializing the browser driver
	}
	
	
	@Test
	public void whenClickSignInCheckPasswordNotEmpty(){ 
	
		System.out.println("This is the test: " + new Object(){}.getClass().getEnclosingMethod().getName());
		driver.get("http://localhost:8080/JavaWebAppExercise/user");
		
		driver.findElement(By.id("username")).sendKeys("user");
		  
		driver.findElement(By.tagName("button")).click();
		
		Assert.assertTrue(driver.getPageSource().contains("Please fill out this field"));
		  
		//System.out.println(driver.getPageSource());
		
		System.out.println("Test End " + new Object(){}.getClass().getEnclosingMethod().getName());
	}
	
	@Test
	public void whenClickSignInCheckUsernameNotEmpty(){ 
	
		System.out.println("This is the test: " + new Object(){}.getClass().getEnclosingMethod().getName());
		driver.get("http://localhost:8080/JavaWebAppExercise/user");
		
		driver.findElement(By.id("password")).sendKeys("password");
		  
		driver.findElement(By.tagName("button")).click();
		
		Assert.assertTrue(driver.getPageSource().contains("Please fill out this field"));
		  
		System.out.println(driver.getPageSource());
		
		System.out.println("Test End " + new Object(){}.getClass().getEnclosingMethod().getName());
	}
	
	//TODO DEBUG 
	@Test
	public void whenClickSignInCheckNotEmpty(){ 
	
		System.out.println("This is the test: " + new Object(){}.getClass().getEnclosingMethod().getName());
		driver.get("http://localhost:8080/JavaWebAppExercise/user");
		
		driver.findElement(By.tagName("button")).click();
		
		Assert.assertTrue(driver.getPageSource().contains("Please fill out this field"));
		  
		System.out.println(driver.getPageSource());
		
		System.out.println("Test End " + new Object(){}.getClass().getEnclosingMethod().getName());
	}
	
	@AfterClass
	public static void  tearDown(){
		driver.close(); 
	}
}
