Feature: Home Page of duckduckgo page

Scenario: Validating Positive scenario
Given I navigate to the duckduckgo website
When I Search for Bahamas
Then the Screenshot is taken if the page is Bahamas
And Searches for Amsterdam