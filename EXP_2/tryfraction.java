package com.exp2;

import java.util.Scanner;
class Fraction {
    private int numerator;
    private int denominator;

    public Fraction(int numerator, int denominator) {
        if (denominator == 0) {
           System.out.println("Enter valid number :") ;
           return ;
        }

        this.numerator = numerator;
        this.denominator = denominator;
        simplify();
    }

    private void simplify() {
        int gcd = findGCD(numerator, denominator);
        numerator /= gcd;
        denominator /= gcd;
    }

    private int findGCD(int a, int b) {
        if(b==0)
            return a ;
        return findGCD(b, a%b) ;
    }

    public Fraction multiply(Fraction other) {
        int newNumerator = this.numerator * other.numerator;
        int newDenominator = this.denominator * other.denominator;
        return new Fraction(newNumerator, newDenominator);
    }

    public void displayFraction() {
        System.out.print(String.format("%3d/%-3d", numerator, denominator));
    }
}

public class tryfraction
{
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.println("Enter the number n:");
        int n = in.nextInt();
        Fraction[][] a = new Fraction[n][n];
        a[0][0] = new Fraction(0, 1);
        for (int i = 1; i < n; i++) {
            a[0][i] = new Fraction(i, n);
        }
        for (int i = 1; i < n; i++) {
            a[i][0] = new Fraction(i, n);
        }
        for (int i = 1; i < n; i++) {
            for(int j = 1 ; j<n ; j++)
            {
                a[i][j] = a[i][0].multiply(a[0][j]) ;
            }
        }
        for(int i = 0 ; i<n ; i++)
        {
            for(int j = 0 ;j<n ; j++)
            {
                if(i==0&&j==0)
                {
                    System.out.print("       ");
                }else
               // System.out.print(" ") ;
              a[i][j].displayFraction();
               // System.out.print(" ") ;
            }
            System.out.println() ;
        }
    }
}
