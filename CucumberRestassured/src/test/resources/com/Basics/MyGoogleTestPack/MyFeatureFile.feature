Feature: Testing Bascics

Scenario: 5. I want to test google is up and running
Given google have website
When hit google application
Then I validate status code

Scenario: 6.I want to test ergast.com up and running
Given ergastcom have website
When Hit ergastcom
Then Validate status for ergastcom



