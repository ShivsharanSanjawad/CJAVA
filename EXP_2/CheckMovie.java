package com.exp2;

import java.util.Scanner;

class Movie{
    private String Title ;
    private double AgeRestriction ;
    private double Cost ;

    Movie(String Title , double AgeRestriction ,double Cost ){
        this.Title = Title ;
        this.AgeRestriction = AgeRestriction ;
        this.Cost = Cost ;
    }

    public double getAgeRestriction() {
        return AgeRestriction;
    }

    public double getCost() {
        return Cost;
    }
}
class User {
    private String name ;
    private double age ;
    private double balance ;

    User(String name , double age , double balance){
        this.name = name ;
        this.age = age ;
        this.balance = balance ;
    }
    private boolean canWatch(Movie m){
        if(age< m.getAgeRestriction())
        {
            return false ;
        }
        return true ;
    }
    public void watch(Movie m){
        if(canWatch(m)) {
            if(balance>= m.getCost()) {
                balance -= m.getCost();
                System.out.println(name + " you can watch the movie\nYour current balance is "+balance);
            }
            else{
                System.out.println("Insufficient balance !");
            }
        }
        else {
            System.out.println("Sorry you can't watch movie because of age restriction");
        }
    }

}

public class CheckMovie {
    public static void main(String []args){
        Scanner in = new Scanner(System.in) ;
        System.out.println("Enter your name:");
        String name = in.nextLine() ;
        System.out.println("Enter your age:") ;
        Double age = in.nextDouble() ;
        System.out.println("Enter your account balance:");
        Double balance = in.nextDouble();
        User x = new User(name,age,balance);
        System.out.println("Enter the movie name of movie:");
        in.nextLine() ;
        String Title = in.nextLine();
        System.out.println("Enter the Age restriction:");
        double ageRes = in.nextDouble() ;
        System.out.println("Enter the ticket price of the movie") ;
        double cost = in.nextDouble() ;
        Movie m = new Movie(Title ,ageRes ,cost) ;
        x.watch(m) ;
    }
}
