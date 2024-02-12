package com.exp3;

import java.util.Scanner;

class Calculate{
    public double calculate(double base , int power)
    {   if(power==0)
    {
        return 1 ;
    }
        return base*calculate(base ,power-1) ;
    }
    public double calculate(int base , int argument){
        return Math.log(argument) / Math.log(base) ;
    }

}
public class Test {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in) ;
        System.out.println("Enter the thing that you want to do ?\n1.Power function\n2.Log funtion") ;
        int opt = in.nextInt() ;
        if(opt==1)
        {
            System.out.println("Enter the base") ;
            double base = in.nextDouble() ;
            System.out.println("Enter the power") ;
            int power = in.nextInt() ;
            Calculate c= new Calculate() ;
            System.out.println("The answer is "+c.calculate(base ,power)) ;
        }
        else if(opt==2)
        {
            System.out.println("Enter the base for log") ;
             int  base = in.nextInt() ;
             System.out.println("Enter the argument for log") ;
             int argument = in.nextInt() ;
            Calculate c= new Calculate() ;
            System.out.println("The answer is "+c.calculate(base , argument)) ;
        }
        else
        {
            System.out.println("Enter the valid number");
        }
    }
}
