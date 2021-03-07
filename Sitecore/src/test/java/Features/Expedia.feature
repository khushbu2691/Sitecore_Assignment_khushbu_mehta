Feature: Search Page of the Expedia Website

Scenario: Validating Positive scenario
Given I navigate to the Expedia website
When I look for a flight and accommodation from Brussels to New York
Then the result page contains travel option for the chosen destination