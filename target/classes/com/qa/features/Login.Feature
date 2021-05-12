Feature: QWikhome Login feature 

Background: 
	Given User present on Login Page 
	And Title of Login page is Qwikhome 
	
Scenario: Qwikhome Home Page Test scenario 
	And User Enters credentials
	#Data driven approach - without Examples Keyword 
	And User accept the consent 
	When User clicks on Login button 
	Then User is on home page 
	
	Scenario: 
	Validate the Logout Func On Qwikhome App Dashboard When User Accepts The Alert 
	And User Enters credentials
	And User accept the consent 
	And User clicks on Login button 
	And User click on Home Button 
	And User clicks on Logout Button 
	When User accepts the alert
	Then User Should redirect to signIn Page 
	And close the browser 