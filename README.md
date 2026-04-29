# FinSafe Transaction Validator 

## About the Project

This is a simple Core Java project I built to understand how transaction systems work in real apps like digital wallets.

The main idea is to make sure a user cannot spend more money than they have (to avoid overdraft errors).

---

## What this project does

* Allows user to deposit money
* Allows withdrawal only if enough balance is available
* Throws a custom error if balance is insufficient
* Keeps track of the last 5 transactions
* Shows a mini statement

---

## Concepts I used

* Encapsulation (keeping balance private)
* Custom Exception handling
* ArrayList for storing transaction history
* Basic Java OOP concepts
