Feature:CRM create new deal 
	Scenario:CRM new deal TestScenario
	Given  User is on login page 
	When  User enters the username and password 
	|Username|Password|
	|Mayuri_257|mayuri$257|
	Then  User click on login button 
	Then  User is on homepage 
	Then  mouse over on deals 
	Then  click on new deal 
	Then  enter the new deal details 
	|Title|Amount|Probability|Commission|
	|test deal1|1000|50|10|
	|test deal2|2000|60|20|
	|test deal3|3000|70|30|
	Then  close the browser 
