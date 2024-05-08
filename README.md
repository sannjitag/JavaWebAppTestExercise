# JavaWebAppTestExercise

implemented both unit and integration tests programmatically using Java, to cover the code and its functionality, including error cases and negative cases.

Unit Test case scenarios including negative and error cases: 


•	Validate all 3 URLs exists by checking response code.


•	When go to a web browser window at "localhost:8080/JavaWebAppExercise/" it should return message "Hello" in the browser content window. 

•	When go to a web browser to http://localhost:8080/JavaWebAppExercise/admin logon popup screen should be displayed.

•	On Logon Pop-up screen should have input text for name and password as well as button to Sign In

•	When entering "admin/password" for admin page should see on the content window "Hello, Admin!" 

•	When entering in-correct “user/password" for admin page should send message Bad Credentials 

•	When go to a web browser to http://localhost:8080/JavaWebAppExercise/ logon popup screen should be displayed.

•	On Logon Pop-up screen should have input text for name and password as well as button to Sign In

•	When entering correct “user/password" for user page should see on the content window "Hello, User!" 

•	When entering in-correct “user/password" for user page should send message Bad Credentials 

•	When clicking login button with-ought to enter anything in password field, it should give you message Please fill out this field – for both user and admin page.


Integration test:
•	Navigate to user page from home page, by entering the user page URL in the same browser window.
•	Navigate to user page from admin page, by entering the user page URL in the same browser window.
•	Navigate to admin page from home page, by entering the admin page url in the same browser window.
•	Navigate to admin page from user page, by entering the admin page URL in the same browser window.

