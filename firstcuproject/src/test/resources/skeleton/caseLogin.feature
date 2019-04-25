Feature: TestMeApp feature
Scenario: Login and addto cart scenario
    Given URL of TestMeApp
    When login credientials
    And  user adds new product
    Then product is added successfully
    