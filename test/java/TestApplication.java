import org.junit.After;
import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;
import org.openqa.selenium.firefox.FirefoxDriver;

public class TestApplication {
	
	private static FirefoxDriver driver;
	
	@Before
	public void setUp(){
		
		System.out.println("setUP method");
		driver = new FirefoxDriver(); //Initializing the browser driver
		
	}
	
	@Test 
	public void checkHomeURL()
	{
		System.out.println("This is the test: " + new Object(){}.getClass().getEnclosingMethod().getName());
		  
		Assert.assertTrue(TestUtilities.checkIflinkExists("http://localhost:8080/JavaWebAppExercise"));
		  
	}
	
	@Test 
	public void checkUserURL()
	{
		System.out.println("This is the test: " + new Object(){}.getClass().getEnclosingMethod().getName());
		  
		Assert.assertTrue(TestUtilities.checkIflinkExists("http://localhost:8080/JavaWebAppExercise/user"));
		  
	}
	
	@Test 
	public void checkAdminURL()
	{
		System.out.println("This is the test: " + new Object(){}.getClass().getEnclosingMethod().getName());
		  
		Assert.assertTrue(TestUtilities.checkIflinkExists("http://localhost:8080/JavaWebAppExercise/admin"));
		  
	}
	
	@Test 
	public void onHomeShouldDisplayHello() { 
  
		  System.out.println("This is the test: " + new Object(){}.getClass().getEnclosingMethod().getName());
		  
		  driver.get("http://localhost:8080/JavaWebAppExercise");
		   
		  Assert.assertTrue(driver.getPageSource().contains("Hello"));
			 
		  System.out.println("Test End " + new Object(){}.getClass().getEnclosingMethod().getName() ); 
	}
	
	@Test
	public void onUserAppShouldDisplayLogonPage(){
  
		  System.out.println("This is the test: " + new Object(){}.getClass().getEnclosingMethod().getName());
		  
		  Assert.assertTrue(TestUtilities.checkIflinkExists("http://localhost:8080/JavaWebAppExercise/user"));
		  
		  driver.get("http://localhost:8080/JavaWebAppExercise/user");
		  TestUtilities.verifyLogonPageDisplay(driver);
		 
		  System.out.println("Test End " + new Object(){}.getClass().getEnclosingMethod().getName()); 
	}
		 
	@Test
	public void onAdminAppShouldDisplayLogonPage(){
  
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
	
	@Test
	public void invalidNameUserLoginTest(){
  
		  System.out.println("This is the test: " + new Object(){}.getClass().getEnclosingMethod().getName());
		  
		  driver.get("http://localhost:8080/JavaWebAppExercise/user");
		  Assert.assertTrue(TestUtilities.login(driver, "username","password", "Bad credentials")); // in correct value for username 
			 
		 
		  System.out.println("Test End " + new Object(){}.getClass().getEnclosingMethod().getName()); 
	}
	
	@Test
	public void invalidNameAdminLoginTest(){
  
		  System.out.println("This is the test: " + new Object(){}.getClass().getEnclosingMethod().getName());
		  
		  driver.get("http://localhost:8080/JavaWebAppExercise/admin"); //// in correct value for username 
		  Assert.assertTrue(TestUtilities.login(driver, "adminuser","password", "Bad credentials"));
			 
		 
		  System.out.println("Test End " + new Object(){}.getClass().getEnclosingMethod().getName()); 
	}
	
	@Test
	public void invalidPasswordUserLoginTest(){
  
		  System.out.println("This is the test: " + new Object(){}.getClass().getEnclosingMethod().getName());
		  
		  driver.get("http://localhost:8080/JavaWebAppExercise/user");
		  Assert.assertTrue(TestUtilities.login(driver, "user","pass", "Bad credentials")); // in correct value for password 
			 
		 
		  System.out.println("Test End " + new Object(){}.getClass().getEnclosingMethod().getName()); 
	}
	
	@Test
	public void invalidPasswordAdminLoginTest(){
  
		  System.out.println("This is the test: " + new Object(){}.getClass().getEnclosingMethod().getName());
		  
		  driver.get("http://localhost:8080/JavaWebAppExercise/admin"); //// in correct value for password 
		  Assert.assertTrue(TestUtilities.login(driver, "admin","pass", "Bad credentials"));
			 
		 
		  System.out.println("Test End " + new Object(){}.getClass().getEnclosingMethod().getName()); 
	}
	
	@Test
	public void invalidUserLoginTest(){
  
		  System.out.println("This is the test: " + new Object(){}.getClass().getEnclosingMethod().getName());
		  
		  driver.get("http://localhost:8080/JavaWebAppExercise/user");
		  Assert.assertTrue(TestUtilities.login(driver, "admin","pass", "Bad credentials")); // in correct value for both user name and password 
			 
		 
		  System.out.println("Test End " + new Object(){}.getClass().getEnclosingMethod().getName()); 
	}
	
	@Test
	public void invalidAdminLoginTest(){
  
		  System.out.println("This is the test: " + new Object(){}.getClass().getEnclosingMethod().getName());
		  
		  driver.get("http://localhost:8080/JavaWebAppExercise/admin"); //// in correct value for both user name and password 
		  Assert.assertTrue(TestUtilities.login(driver, "user","pass", "Bad credentials"));
			 
		 
		  System.out.println("Test End " + new Object(){}.getClass().getEnclosingMethod().getName()); 
	}
	
	@Test
	public void invalidUserLogin(){
  
		  System.out.println("This is the test: " + new Object(){}.getClass().getEnclosingMethod().getName());
		  
		  driver.get("http://localhost:8080/JavaWebAppExercise/user");
		  Assert.assertTrue(TestUtilities.login(driver, "sangita","Passw0rd", "Bad credentials")); // in correct value for both user name and password 
			 
		 
		  System.out.println("Test End " + new Object(){}.getClass().getEnclosingMethod().getName()); 
	}
	
	@Test
	public void invalidAdminLogin(){
  
		  System.out.println("This is the test: " + new Object(){}.getClass().getEnclosingMethod().getName());
		  
		  driver.get("http://localhost:8080/JavaWebAppExercise/admin"); //// in correct value for both user name and password 
		  Assert.assertTrue(TestUtilities.login(driver, "sangita","Passw0rd", "Bad credentials"));
			 
		 
		  System.out.println("Test End " + new Object(){}.getClass().getEnclosingMethod().getName()); 
	}
	
	@After
	public void tearDown(){
		driver.close(); 
	}
}
