Feature: Testing Bascics

Scenario: 1. I want to test google is up and running
Given google have website
When hit google application
Then I validate status code

Scenario: 2.I want to test ergast.com up and running
Given ergastcom have website
When Hit ergastcom
Then Validate status for ergastcom



