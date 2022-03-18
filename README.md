# Bank_Application / Assignment 13 / Coderscampus.com

For this assignment you will be implementing some more of the Online Bank functionality.

The source code from which you should start building can be found via https://github.com/tp02ga/java-bootcamp/tree/master/Assignment13

Modify the /users endpoint
Once you have this code checked out, your task will be to enhance the /users endpoint to allow the userId values to be clickable.

When clicked on, this will send a GET request to the /users/{userId} endpoint

Here’s what the /users page should look like:

 ![1](https://user-images.githubusercontent.com/65437249/158940692-af592a58-6053-42b8-a3f4-f3c3dda617fb.png)


Note: The accounts should be clickable too, but you can do that at the end of the assignment once you’ve created the /users/{userId}/accounts/{accountId} endpoint.




Modify the /users/{userId} endpoint
On the /users/{userId} screen, you should add the address and account information and make the address information editable / savable.

This will be the toughest part of the assignment, as you’ll have three different relationships being displayed and managed on one screen.

Here’s what the /users/{userId} screen should look like:
![2](https://user-images.githubusercontent.com/65437249/158940792-5fd41245-60ec-4da3-a6d3-1f7ba04d3e53.png)



When you click on the “Create New Bank Account” button, it should send a post to create a new bank account to the following url: /users/{userId}/accounts

 

Add the /users/{userId}/accounts/{accountId} endpoint
You will need to create a new account.html page where you’ll be able to modify the account’s name. Here’s what the screen should look like:
![3](https://user-images.githubusercontent.com/65437249/158940820-ea6bca93-cb01-44d5-83f4-92b91697b212.png)



