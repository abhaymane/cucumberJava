Feature:CRM create new deal
Scenario:CRM new deal TestScenario
Given User is on login page
When User enters the username and password
|Mayuri_257|mayuri$257|
Then User click on login button
Then User is on homepage
Then mouse over on deals
Then click on new deal
Then enter the new deal details
|test deal|1000|50|10|
Then close the browser
