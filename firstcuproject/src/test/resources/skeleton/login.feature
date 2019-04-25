Feature: Login feature
@valid
Scenario Outline: Valid user scenario
Given The URL of Test Me App
When user enters <username> as username
And user enters <Password> as password
Then user is in <page>
Examples:
|username|Password|page|
|Lalitha|Password123|Home|
|admin|Password456|Admin Home|
@invalid
Scenario: invalid user scenario
Given The URL of Test Me App
When user enters invalid data

|abcxyz|Password|
|Lalitha|Password123er|
|admhyin|Password56|
Then user is in loginpage
|abc|
|ddc|
|gth|

#Scenario: Valid admin user scenario
#Given The URL of Test Me App
#When user enters "admin" as username
#And user enters "Password456" as password
#Then user is in homepage
