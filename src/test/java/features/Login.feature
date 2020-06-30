Feature: login into Fltpkart

Scenario: verify Login page
Given enter salesforce url
When user enter enters username as "user2" and password as "456"
Then Login is "succes"
And Login "succcess" when i enter "correct" user name and password
 

Scenario: verify Login page
Given enter salesforce url
When user enter enters username as "user1" and password as "213"
Then Login is "unsucces"
And Login "unsucccess" when i enter "wrong" user name and password