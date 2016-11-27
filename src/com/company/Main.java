package com.company;

public class Main {

    public static void main(String[] args)
    {
	    BankAccount checkingAcc=new BankAccount(50, 0.01);
        BankAccount savingAcc=new BankAccount(100, 0.05);

        checkingAcc.deposit(50);
        savingAcc.deposit(50);
        
        checkingAcc.withdrawl(3.95);
        savingAcc.deposit(100);

        checkingAcc.addInterest();
        savingAcc.addInterest();

        checkingAcc.withdrawl(3.95);
        savingAcc.deposit(100);

        checkingAcc.addInterest();
        savingAcc.addInterest();


        System.out.println(checkingAcc.getBalance() + savingAcc.getBalance());
    }
}
