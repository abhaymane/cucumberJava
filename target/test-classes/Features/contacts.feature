Feature:Login to CRM and create new contact
Scenario Outline:Login to CRM Contacts TestScenario
Given User is on login page
When User enters the "<username>" and "<password>"
Then User click on login button
Then User is on homepage
Then mouse over on contacts
Then click on new contact
Then enter the new contact details "<firstname>" and "<lastname>" and "<position>"
Then close the browser

Examples:
|username  |password  |firstname|lastname|position|
|Mayuri_257|mayuri$257|John     |Peter   |Manager |
|Mayuri_257|mayuri$257|Smith    |Bhush   |Director|
