import org.junit.AfterClass;
import org.junit.Assert;
import org.junit.BeforeClass;
import org.junit.Test;
import org.openqa.selenium.firefox.FirefoxDriver;

public class IntegrationTestApplication {
	
	private static FirefoxDriver driver;
	
	@BeforeClass
	public static void setUp(){
		
		System.out.println("setUP method");
		driver = new FirefoxDriver(); 
		
	}
	
	@Test 
	public void PageNavagationTest() { 
  
		  System.out.println("This is the test: " + new Object(){}.getClass().getEnclosingMethod().getName());
		  
		  driver.get("http://localhost:8080/JavaWebAppExercise"); 
		  Assert.assertTrue(driver.getPageSource().contains("Hello"));
		  
		  driver.get("http://localhost:8080/JavaWebAppExercise/user");
		  TestUtilities.verifyLogonPageDisplay(driver);
		  
		  driver.get("http://localhost:8080/JavaWebAppExercise/admin");
		  TestUtilities.verifyLogonPageDisplay(driver);
		
		  driver.get("http://localhost:8080/JavaWebAppExercise/user");
		  TestUtilities.verifyLogonPageDisplay(driver);
		  
		  driver.get("http://localhost:8080/JavaWebAppExercise/admin");
		  TestUtilities.verifyLogonPageDisplay(driver);
		
		  driver.get("http://localhost:8080/JavaWebAppExercise"); 
		  Assert.assertTrue(driver.getPageSource().contains("Hello"));
			 
		  System.out.println("Test End " + new Object(){}.getClass().getEnclosingMethod().getName() ); 
	}
	
	@Test
	public void userPageDisplayTest(){
  
		  System.out.println("This is the test: " + new Object(){}.getClass().getEnclosingMethod().getName());
		  
		  driver.get("http://localhost:8080/JavaWebAppExercise/user");
		  TestUtilities.verifyLogonPageDisplay(driver);
		 
		  System.out.println("Test End " + new Object(){}.getClass().getEnclosingMethod().getName()); 
	}
		 
	@Test
	public void adminPageDisplayTest(){
  
		  System.out.println("This is the test: " + new Object(){}.getClass().getEnclosingMethod().getName());
		  
		  driver.get("http://localhost:8080/JavaWebAppExercise/admin");
		  TestUtilities.verifyLogonPageDisplay(driver);
			 
		 
		  System.out.println("Test End " + new Object(){}.getClass().getEnclosingMethod().getName()); 
	}
	
	@Test
	public void OnUserLoginShouldDisplayHelloUser(){
  
		  System.out.println("This is the test: " + new Object(){}.getClass().getEnclosingMethod().getName());
		  
		  driver.get("http://localhost:8080/JavaWebAppExercise/user");
		  Assert.assertTrue(TestUtilities.login(driver, "user","password", "Hello, User!"));
			 
		 
		  System.out.println("Test End " + new Object(){}.getClass().getEnclosingMethod().getName()); 
	}
	
	@Test
	public void OnAdminLoginShouldDisplayHelloAdmin(){
  
		  System.out.println("This is the test: " + new Object(){}.getClass().getEnclosingMethod().getName());
		  
		  driver.get("http://localhost:8080/JavaWebAppExercise/admin");
		  Assert.assertTrue(TestUtilities.login(driver, "admin","password", "Hello, Admin!"));
		 
		  System.out.println("Test End " + new Object(){}.getClass().getEnclosingMethod().getName()); 
	}
	
	
	@AfterClass
	public static void tearDown(){
		driver.close(); 
	}
}
