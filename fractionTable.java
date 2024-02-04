package com.exp2;

import java.util.Scanner;

class PrintfTable{
    private final int n ;
    PrintfTable(int n){
        this.n = n ;
    }
    public void print(){
        FractionCalculator [][]f = new FractionCalculator[n][n];
        f[0][0] = new FractionCalculator() ;
        for(int i = 1 ; i<n ; i++)
        {
            f[0][i] = new FractionCalculator(i,n) ;
            f[i][0] = new FractionCalculator(i,n) ;
        }
        for(int i = 0 ;i<n ; i++)
        {
            for(int j = 0 ; j<n ;j++)
                f[i][j] =f[i][0].multiplyReturn(f[0][j]) ;
        }
        for(int i = 0 ; i<n ; i++)
        {
            for(int j =0 ;j<n ; j++)
            {
                if(i==0&&j==0)
                    System.out.print("       ");
                else
                    f[i][j].display();
            }
            System.out.println();
        }
    }

}

public class fractionTable {
    public static void main(String[] args) {
        System.out.println("Enter the denominator :");
        Scanner in = new Scanner(System.in);
        int n = in.nextInt();
        PrintfTable p = new PrintfTable(n);
        p.print();
    }
}
