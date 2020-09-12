Feature:Login to CRM
#Scenario:Login to CRM TestScenario
#Given User is on login page
#When User enters the "Mayuri_257" and "mayuri$257"
#Then User click on login button
#Then User is on homepage

Scenario Outline:Login to CRM TestScenario
Given User is on login page
When User enters the "<username>" and "<password>"
Then User click on login button
Then User is on homepage

Examples:

|username|password|
|Mayuri_257|mayuri$257|
|Tom|tom@123|