Feature: Login to teams Application
 @smoke
  Scenario: Successfull login with valid Credentials
   Given  the user on the teams sign in page and click on the signin button
   When  the user enter email id and click on next button
   And the user enter password and click on on signin button
   And the user click on text button to get otp
   And the user enter the otp and click on verify button
   And the user click on stay signed yes button
   Then the user should be redirected to the home page
  
  
  
 