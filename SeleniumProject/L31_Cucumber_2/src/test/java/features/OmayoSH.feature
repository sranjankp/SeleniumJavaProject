Feature: Login to the Omayo application
# for coment we can use # in feature
Scenario Outline: User should only be login with valid credentials 
Given I navigate to application URL
When I enter Username as "<someusername>" and password as "<somepassword>" into the field
And I click on login button
Then User should be able to login based on "<expected>" login status 
Examples:
|someusername  |somepassword|expected|
|arun          |1234     |failure|
|SeleniumByArun |Test143$ |success|
|test          |46782    |failure|