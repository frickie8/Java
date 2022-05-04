/*
 * @author vashishth
 * CIS-2571
 * 03/20/2022
 * Test Account Class
 * This program uses Account class and create accounts with provided data and 
 * prints the transcations and also prints monthly interest.
 */

package testaccountclass;

import java.util.Date;

public class TestAccountClass {
    public static void main(String[] args) {
        
        Date date = new java.util.Date();
        
        // Create an account with ID = 1122, balance = 20000, rate = 4.5%
        Account account1 = new Account(1122,20000,4.5,date);
        System.out.println("ACCOUNT #1");
        printDetails(account1,2500,3000);
        
        // Create accounts with balance above $5000 and rate 0.3% - 0.5%
        Account account2 = new Account(1130,15000,0.67,date);
        Account account3 = new Account(2019,10000,0.45,date);
        
        System.out.println("ACCOUNT #2");
        printDetails(account2,1600,900);
        System.out.println("ACCOUNT #3");
        printDetails(account3,2400,3700);
    }
    
    public static void printDetails(Account givenAccount, double withdrawal,
            double deposited) {
        
        System.out.printf("Account Balance before withdrawal : $%-20.2f",
                givenAccount.getBalance());
        System.out.println();
        givenAccount.withdraw(withdrawal);
        System.out.printf("Account Balance after withdrawal : $%-20.2f",
                givenAccount.getBalance());
        System.out.println();
        givenAccount.deposit(deposited);
        System.out.printf("Account Balance after deposit : $%-20.2f",
                givenAccount.getBalance());
        System.out.println();
        System.out.printf("Account Monthly Interest: $%-10.2f", 
                givenAccount.getMonthlyInterest());
        System.out.println();
        System.out.println("Account Date created: " 
                + givenAccount.getDateCreated());
        System.out.println();
    }
    
}