/*
 * @author vashishth
 * CIS-2571
 * 03/20/2022
 * Account Class
 * This class is used for main class, this class provides accessors and mutators
 * method and also methods to calculate the monthly interest and withdraws and 
 * deposits on the balance.
 */

package testaccountclass;

import java.util.Date;

public class Account {
    
    private int id = 0;  //default id
    private double balance = 0.00; //default balance
    private double annualInterestRate = 0.0;  //default annual interest rate
    private Date dateCreated = new java.util.Date(); //default date
    
    /* No args Constructor */
    Account() {
    }
    
    /** Construct an Account with a specified data */
    Account(int newID, double initialBalance, double newInterest, Date newDate) {
        id = newID;
        balance = initialBalance;
        annualInterestRate = newInterest;
        dateCreated = newDate;
    }
    
    /*Accessors*/
    public double getID() {
        return id;
    }
    
    public double getBalance() {
        return balance;
    }
    
    public double getAnnualInterestRate() {
        return annualInterestRate;
    }
    
    public Date getDateCreated() {
        return dateCreated;
    }
    
    /*Mutators*/
    public void setID(int newId) {
        id = (newId >= 0) ? newId : 0;
    }
    
    public void setBalance(double newBalance) {
        balance = (newBalance >= 0) ? newBalance : 0;
    }
    
    public void setAnnualInterestRate(double newInterest) {
        annualInterestRate = (newInterest >= 0) ? newInterest : 0;
    }
    
    // 
    public double getMonthlyInterestRate() {
        return getAnnualInterestRate() / 12.0;
    }
    
    public double getMonthlyInterest() {
        return getBalance() * getMonthlyInterestRate() / 100.00;
    }
    
    public void withdraw(double withdrawAmount) {
        setBalance(getBalance() -  withdrawAmount);
    }
    
    public void deposit(double depositAmount) {
        setBalance(getBalance() +  depositAmount);
    }
}