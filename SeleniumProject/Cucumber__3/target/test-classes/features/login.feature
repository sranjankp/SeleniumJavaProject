Feature: Login Test

@all @ninja
Scenario: Login to the application using valid credentials
	Given User navigates to login page of the application
	When User enters Username as "arun.selenium@gmail.com" and Password as "Second@123" into the fields
	And Clicks on the Login button
	Then User should successfully login
