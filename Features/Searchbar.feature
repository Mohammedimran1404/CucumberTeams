Feature: Searchbar
 Background:
 Given  the user on the teams sign in page and click on the signin button
   When  the user enter email id and click on next button
   And the user enter password and click on on signin button
   And the user click on text button to get otp
   And the user enter the otp and click on verify button
   And the user click on stay signed yes button
   When the user Click on search bar
  @sanity
 Scenario: Search bar validation
  Then the user should see the search bar get highlighted
  @Regression
 Scenario: Comparing search bar data and receive data
  When the user enter "<user name>" in search bar
  Then the user should see the same user name
   Examples:
   |user name|
   |Praneeth Reddy Katamreddy - Kairos|

