Write a JAVA Menu driven program that does the following:
You can ONLY have the below variables as global variables
--> Account Number
--> Account Holder Name
--> Account Balance
You MUST have the below as functions
--> To initialize the customer
--> To deposit money
--> To withdraw money
--> To print the transactions
--> To print account summary

How the code works:
With the help of menu driven program we perform the above required functions. We define 3 global variables ie, account number, account holder name and the amount in the account. We define the function initilaisecustomer to initilase the details of a single customer. Then we define a function depositMoney() to deposit the amount. We add the amount deposited to the current account balance and add that transaction to the transcations string array. Similary we define another function withdrawMoney() to withdraw an amount from the account. If the amount too be withdrawn is graeter than the account balance we raise a promt, otherwise subtract the amount from the balance. Add this transaction also to the arraylist.
Now we define a function printTransactions() to print the transaction happening in the account. This prints the transactions arrayList. Now we define another function printAccountSummary() which gives the account summary i.e, the account number, account holder name and the current balance in the account.
Now in the main function we call nitializeCustomer() and the initiate a count=0. While the count is not equal to 5 we perform a switch case for the menu. While the case is 1 we call the deposit function. 2 for withdrawal, 3 to print the transactions and 4 to show the account summary and 5 to exit.

