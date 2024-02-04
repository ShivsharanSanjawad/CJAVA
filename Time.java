package com.exp2;

import java.util.Scanner;

class Calculate{
    private int time ;
    Calculate(int time){
        this.time = time ;
    }
    private int hours() {
        return time/3600 ;
    }
    private int minute(){
        return(time%3600)/60 ;
    }
    private int second(){
        return (time%3600)%60 ;
    }
    public void print(){
        System.out.println("Hours:"+hours()+"\nMinutes:"+minute()+"\nSeconds:"+second()) ;
    }
}

public class Time {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in)  ;
        System.out.println("Enter the seconds :");
        int time = sc.nextInt() ;
        Calculate t = new Calculate(time) ;
        t.print() ;
    }
}
