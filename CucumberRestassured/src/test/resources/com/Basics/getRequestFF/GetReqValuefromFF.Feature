Feature: Test Assured Get Basics

Scenario: 1.I want to test get request
Given race circuit app is running
When  i hit request to get response
Then I validate circuit "MRData.limit"  value as "30" present
Then I validate circuit "MRData.total"  value as "20" present
Then I validate circuit "MRData.CircuitTable.Circuits[0].circuitId"  value as "albert_park" present


