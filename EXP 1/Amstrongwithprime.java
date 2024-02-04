package com.exp1;

import java.util.Scanner;

class Amstrong {
    private int start ;
    private int end ;
    Amstrong(int start , int end){
        this.start = start ;
        this.end = end ;
    }
    private int nDigit(int i )
    {
        return Integer.toString(i).length() ;
    }

    public void print(){
        System.out.println("The armstrong numbers are as follows :");
        for(int i = start ; i<=end ; i++)
        {   int temp = i ;
            int sum = 0 ;
            int digit = nDigit(temp) ;
            while(temp>0)
            {
                sum = sum + (int)Math.pow((temp%10),digit) ;
                temp = temp /10  ;
            }
            if(sum==i)
            {
                System.out.print(i+" ");
            }
        }
    }



}

public class Amstrongwithprime {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in) ;
        System.out.println("Enter the start number:");
        int s = in.nextInt() ;
        System.out.println("Enter the last number :");
        int l = in.nextInt() ;
        Amstrong a = new Amstrong(s,l) ;
        a.print() ;
        System.out.println("\nprime numbers are as follows :");
        Sieve h = new Sieve(s,l) ;
        h.print() ;
    }
}
