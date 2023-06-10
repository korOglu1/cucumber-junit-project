Feature: Oscar app function

  @wip
  Scenario: functionality result title verification
    Given User is on hioscar page
    When user should click Search network
    And user from coverage year dropdown Select 2023 option
    And user coverage access dropdown Select Employer-provided option
    And user from Network partner dropdown Select Oscar option
    And user from Coverage area dropdown Select New Jersey
    And user should click Continue button
    Then user should verify title contains “Oscar”
