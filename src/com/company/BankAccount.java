package com.company;

/**
 * Created by gracebarth on 11/26/16.
 */
public class BankAccount
{
    //connstructor (default)
    public BankAccount()
    {
       balance=0;
        interest=0;
    }
    //constructor - intializes state variables
    public BankAccount(double b, double i)
    {
        balance = b;
        interest = i;
    }
    //methods - perform some action / make change
    public double getBalance()
    {
        return balance;
    }
    //methods
    public void deposit(double d)
    {
        balance+=d;
    }
    //methods
    public void withdrawl(double w)
    {
        balance-=w;
    }
    //methods
    public void addInterest()
    {
       balance+=balance*interest;
    }
    //state variable
    private double balance;
    private double interest;

}
