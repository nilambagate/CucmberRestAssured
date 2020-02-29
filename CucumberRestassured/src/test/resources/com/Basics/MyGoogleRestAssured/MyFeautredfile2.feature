Feature: Testing Bascics

Scenario: 3. I want to test google is up and running
Given google have website
When hit google application
Then I validate status code

Scenario: 4.I want to test ergast.com up and running
Given ergastcom have website
When Hit ergastcom
Then Validate status for ergastcom



