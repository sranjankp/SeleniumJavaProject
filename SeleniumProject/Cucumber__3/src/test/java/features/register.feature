Feature: Register for an account in tutorialnija appliaction

@register
Scenario: Register for the application by providing valid details
	Given I navigates to Registration page
	When I enter the below details
		|firstName|arun											|
		|lastName |motoori									|
		|email		|arun.motoori@yahoo.co.in	|
		|Telephone|12345678									|
		|password	|SeleniumTester$					|
	And I selects the privacy policy option
	And I clicks on Continue button
	Then I should get successfully registered
