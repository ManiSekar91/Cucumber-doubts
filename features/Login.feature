Feature: Leaftaps Login Validation

#Background: 
#Given Open the Chrome Browser
#And Load the LeafTaps Application 'http://leaftaps.com/opentaps'

Scenario: Testing with Positive Credentials
Given Username as 'Demosalesmanager'
Given Password as 'crmsfa'
When Click on the Login button
Then Leaftaps Homepage Should be opened
