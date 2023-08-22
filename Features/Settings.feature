Feature: Settings
 Background: common steps are put in background to reduce the same code
  Given  the user on the teams sign in page and click on the signin button
   When  the user enter email id and click on next button
   And the user enter password and click on on signin button
   And the user click on text button to get otp
   And the user enter the otp and click on verify button
   And the user click on stay signed yes button
   And the user click on three dots menu
   And the user click on settings icon
  @smoke
 Scenario: General settings
  Then the user should see the general page
  @Regression
 Scenario: Manage delegates
  When the user click on manage delegates
  And the user click on your delegate
  And the user enter "<delegate name>" in the search bar
  And the user click on add delegate
  Then the user should see the delegate name get added
  And the user click on threedots menu
  And the user click on remove delgates to remove delegate name
     Examples:
     |delegate name|
     |Bhasha Mahaboob|
