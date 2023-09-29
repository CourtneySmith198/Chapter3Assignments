/**
 * @class: Bank
 * @Author: Courtney Smith
 * @version: 0.1
 * @written on: September 17, 2023
 * course: ITEC 2140 - 13 Saturday Class
 * Write a program that simulates a basic banking system.
 * The user can choose between "deposit", "withdraw",
 * and "check balance". If the user chooses to "withdraw",
 * you will need to make sure the account has enough funds.
 * If the user chooses deposit, then you will need to make
 * your program to ensure the user does not exceed a deposit
 * limit of $10,000.  The  initial balance is $5000.00
 * (class name: Bank)  - Hint: you can use if -else if
 * -else and nested if -else
 * References: https://github.com/desaibijon/ATM-Program/blob/master/ATM.java
 */
import java.util.Scanner;
public class Bank {
    public static void main(String[] args){

        int balance = 5000, withdraw, deposit;

        Scanner sc = new Scanner(System.in);

        while(true)
        {
            System.out.println("Automated Teller Machine");
            System.out.println("1: Withdraw");
            System.out.println("2: Deposit");
            System.out.println("3: Check Balance");
            System.out.println("4: EXIT");
            System.out.println("Select what you would like to do.");

            int choice = sc.nextInt();
            switch(choice)
            {
                case 1:
                    System.out.println("Enter money to be withdrawn:");
                            withdraw = sc.nextInt();
                    if(balance >= withdraw)
                    {
                        balance = balance - withdraw;
                        System.out.println("Collect your money");
                    }
                    else
                    {
                        System.out.println("Insufficient Balance");
                    }
                    break;

                case 2:
                    System.out.println("Enter money to be deposited:");

                    deposit = sc.nextInt();

                    balance = balance + deposit;
                    if(deposit <= 10000) {
                        System.out.println("Your money has been deposited");
                    } else {
                        System.out.println("ERROR: You have reached the limit for maximum deposit.");
                        balance -= deposit;
                    }
                        System.out.println("");
                        break;

                case 3:
                    System.out.println("Balance: " + balance);
                    System.out.println("");
                    break;

                case 4:
                    System.exit(0);
            }
        }
    }
}
