Feature: shout Feature
Scenario: Sean shouts 
Given Sean is 10 meters away from Lucia
When  Sean shouts "Free coffee"
Then  Lucia "listens" to the message

Scenario: Sean shouts away from Lucia
    Given Sean is 200 meters away from Lucia
    When Sean shouts "Free coffee"
    Then Lucia "cannot listen" to the message