package com.exp2;

import java.util.Scanner;

class Data{
    Scanner in = new Scanner(System.in) ;
    private double balance ;
    private double rate ;
    Data(double balance , double rate)
    {
        this.balance = balance ;
        this.rate = rate ;
    }
    void getbalance(){
        System.out.println("The current balance is "+balance);
    }
    void deposit(){
        System.out.println("Enter the amount to deposit :");
        double amount = in.nextDouble() ;
        balance +=amount ;
        getbalance() ;

    }
    void withdrawal(){
        System.out.println("Enter the amount to amount :");
        double amount = in.nextDouble() ;
        balance-=amount ;
        getbalance();
    }
    void compound(){
        System.out.println("Enter the number of years :");
        int year = in.nextInt() ;
        double amount = balance *Math.pow((1+(rate/100)),year);
        System.out.println("The total amount will be "+amount);
        System.out.println("The interest will be "+(amount-balance));
    }

}


public class Bank {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.println("Enter the balance :");
        double balance = in.nextDouble();
        System.out.println("Enter the rate of interest :");
        double interest = in.nextDouble();
        Data d = new Data(balance, interest);
        int option;
        do {
            System.out.println("Enter the thing that you want to do : ");
            System.out.println("1.deposit\n2.Withdrawal\n3.get Compound Intrest\n4.know Balance\n5.exit");
            option = in.nextInt();
            switch (option) {
                case 1 -> d.deposit();
                case 2 -> d.withdrawal();
                case 3 -> d.compound();
                case 4 -> d.getbalance();
                case 5 -> {
                    break;
                }
            }
        } while (option != 5);
    }
}
