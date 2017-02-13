package com.theironyard.novauc;

import java.util.HashMap;
import java.util.Scanner;



public class Main {



    public static void main(String[] args) {
        //write your code here


        HashMap<String, Double> account = new HashMap<String, Double>();

//      account.put("Alexa", new Customer("Alexa",421,true));
        account.put("Alexa", 1200.00);
        account.put("Karla", 2000.00);
        account.put("Hannibal", 2500.00);
        account.put("Sicario", 3200.00);

        System.out.println(account);

        Scanner input = new Scanner(System.in);
        HashMap<Integer, Account> accountMap = new HashMap<Integer, Account>();

        //Options
        while(true) {

            System.out.println("Enter the option for the operation you need:");
            System.out.println("****************************************************");
            System.out.println("[ Options: ne - New Account de - Delete Account ]");
            System.out.println("[       dp - Deposit    wi - Withdraw      ]");
            System.out.println("[           se - Select Account ex - Quit      ]");
            System.out.println("****************************************************");
            System.out.print("> ");  //indicator for user input

            String choice = input.next();
            System.out.println("Your choice: " + choice);

            if(choice.equals("ne")) {
                Integer newAccountNumber;
                Double initialBalance;
                Account newAccount;


                System.out.print("Insert account number: ");
                newAccountNumber = input.nextInt();
                System.out.print("Enter initial balance: ");
                initialBalance=input.nextDouble(); //--
                newAccount = new Account(newAccountNumber, initialBalance);
                accountMap.put(newAccountNumber, newAccount);
                System.out.println("New Account " + newAccountNumber + " created with balance: " + initialBalance);
            }

            else if(choice.equals("se")) {
                System.out.println("Enter number of account to be selected: ");
                Integer accountToGetNumber = input.nextInt();
                Account returnedAccount = accountMap.get(accountToGetNumber);
                if (returnedAccount != null)
                {
                    System.out.println("Account open. Current balance: " + returnedAccount.getBalance());
                }
                else
                {

                    System.out.println("Account does not exist.");
                }
            }

            else if(choice.equals("de"))
            {
                System.out.println("Enter number of account to be selected: ");
                Integer accountToDeleteNumber = input.nextInt();
                Account removedAccount = accountMap.remove(accountToDeleteNumber);
                if (removedAccount != null)
                {
                    System.out.println("Account " + removedAccount.getAccountNumber() + " has been closed with balance: " + removedAccount.getBalance());
                }
                else
                {

                    System.out.println("Account does not exist.");
                }
            }
            // deposit
            else if(choice.equals("dp")) {
                System.out.println("Enter number of account to deposit: ");
                Integer accountToDeposit = input.nextInt();
                System.out.print("Enter amount to deposit:  ");
                double amount = input.nextDouble();
                if(amount <= 0){
                    System.out.println("You must deposit an amount greater than 0.");
                } else {
                    accountMap.get(accountToDeposit).deposit(amount);
                    System.out.println("You have deposited " + (amount));
                    System.out.println("Current balance " + accountMap.get(accountToDeposit).getBalance());
                }
            }
            // withdrawal
            else if(choice.equals("wi")) {
                System.out.println("Enter number of account to withdraw: ");
                Integer accountToWithdraw = input.nextInt();
                System.out.print("Enter amount to withdraw:  ");
                double amount = input.nextDouble();
                if(amount <= 0) {
                    System.out.println("You must deposit an amount greater than 0.");
                } else {
                    accountMap.get(accountToWithdraw).withdraw(amount);
                    System.out.println("You have deposited " + (amount));
                    System.out.println("Current balance " + accountMap.get(accountToWithdraw).getBalance());
                }
            }
            //quit
            else if(choice.equals("ex")) {
                break;
            } else {
                System.out.println("Wrong option.");
            } //end of if
        } //end of loop

        input.close();
    } //end of main


    }









































