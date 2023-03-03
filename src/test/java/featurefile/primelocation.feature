Feature: search validation
  Scenario: User want to search 3 bed property near ilford station
    Given User is on the application home page
    When User select the property options
    And search it
    Then user should be ale to find the house