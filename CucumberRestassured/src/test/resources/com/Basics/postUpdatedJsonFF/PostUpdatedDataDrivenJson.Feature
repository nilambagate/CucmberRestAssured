Feature: First Rest Assured test POST 


Scenario Outline: Test my POST request test11
Given  enter the post request with "<name>" name
Then enter the user "<post>" name
Then enter address "<address>"
Then validate the id is not null 

Examples:
|name|post|address|
|smith|Admin|UK|
|Robert|Sales|USA|
|laurel|IT Eng|Germany|
|Tokyo|Makt|Spain|

 



 

