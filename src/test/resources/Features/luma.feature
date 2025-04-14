Feature: LUMA
 
 	Scenario Outline: Login
 	Given Open the WebSite
 	Then Enter Email "<Email>"
 	And Enter Password "<Password>"
 	Then Click SignIn
 
 Examples:
	
		|Email|Password|
		|baxaxo8734@naobk.com|Asdfgh@1234|
		
		
  Scenario: Bags
  	
  	Given Go to Gear and select Bags
  	And Filter any one of the features
  	Then Sort to any one of the options
  	
	