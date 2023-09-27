Feature: To hcek the flipcart site 
Scenario: create a new account
Given :user the on the flipacrt iste 
When :user click on the create new account button 
And : usr enter the personal details 
Then : suscessfully cretated new account


Scenario: log in with valid credentials 
Given: user in flipcart site 
When : u sers enter the valid email and password
And : click on the login button 
Then : log in must be suscefully 

Scenario: log in with invalid credentials
Given : user in flipcart site 
When : user enter the inavlid email and password 
And : click on the log in button 
Then : log in must be failed 

Scenario: search the product 
Given : user in flipcart site 
When : click on the serrch bar option 
And : enter the searvhing product name 
Then : as u wish u can able to see ur product 

Scenario: Add cart the  product 
Given :user in flip cart site 
When : user selects the product based on the search list 
And : click on the add cart button 
Then :	the product in now add cart page 