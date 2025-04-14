
Feature: Open MRS

  Scenario: Login
  
  Given : Open the Browser
	Then : Enter Username "<Username>"
	And : Enter Password "<Password>"
	Then : Click on Login Button
	
	Scenario: Registration
	
	Given : Click on Registration button
	Then : Enter Name "<fname>","<mname>","<lname>"
	And : Enter Gender
	Then : Enter Birthdate
	And : Enter Address "<Address1>" , "<Address2>"
	Then : Enter Phone Number "<Number>"
	And : Enter Relatives
	Then : Click on Confirm button
	
	Examples:
	
		|Username|Password|fname|mname|lname|Address1|Address2|Number|
		|Admin|Admin123|Rohan|Rahul|Roy|Miami|USA|1111111111|