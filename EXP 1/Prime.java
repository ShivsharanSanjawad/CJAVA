package com.exp1;
import java.util.Scanner;
class Sieve {
    private int s , e ;                  /* start , end numbers */
    Sieve(int s , int e){                /*  constructor */
        this.s = s;
        this.e = e ;
    }
     boolean prime(int n)
    {
        for(int i = 2 ; i<=Math.sqrt(n);i++)          /*If there is no divisor of number between 2 to sqrt of it then it is prime*/
        {
            if(n%i==0)              /*if any divisor found the number is not prime */
                return false ;
        }
        return true ;                 /*if no divisor found the number is orime */
    }

    public void print(){
        int [] a = new int [e+1] ;              /*declare array with includind all elments in the given range*/
        for(int i = 2 ; i<=Math.sqrt(e);i++)     /* for removing the multiples of numbers */
        {   int x = s ;
            while(x%i!=0)
            {
                x = x+1 ;                          /*to ensure we remove correct one */
            }
            int flag = 0 ;
            if(prime(i))
            {     if(x==i)
            {
                flag = 1 ;                     /*to ensure we do not remove prime one */
            }
                {for(int j = flag ; (x+i*j <=e) ; j++)
                {
                    a[x+i*j] = 1 ;                      /* to differentiate between non prime and prime */
                }
                }

            }
        }
        int count =0 ;                      /*to count prime numbers initialise count with 0*/
        int x = s ;
        if(s<=1)
        {
            x = 2 ;
        }                                 /* for edge case of 1 */
        for(int i = x ; i<=e ; i++)
        {
            if(a[i]==0)
            {System.out.print(i+" ");              /* print prime numbers and increase the count*/
                count++ ;
            }
        }
        System.out.println("\nThere are "+count+" count prime numbers in this given range.");
    }
}
public class Prime {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int s, e;
        System.out.println("Enter the starting number :");
        s = sc.nextInt();                                           /* Input  first number */
        System.out.println("Enter the last number :");
        e = sc.nextInt();                                          /* Input last number   */
        if(s>e||(s<0||e<0))                             /*to counter invalid range */
        {
            System.out.print("Enter valid Range");
            return ;
        }
        System.out.println("The prime numbers in the given range are as follows :");
        Sieve prime = new Sieve(s,e) ;                             /* make instance of sieve class */
        prime.print() ;
    }
}
