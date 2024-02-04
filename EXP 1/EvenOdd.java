package com.exp1;
import java.util.Scanner ;
import java.util.ArrayList ;
class Number{
    private  int start , end ;
    Number(int start , int end){          /* using parameterised constructor*/
        this.start = start ;
        this.end = end ;
    }
    private boolean isEVen(int n){        /*checking number is even or odd*/
        return n%2==0 ;
    }
    public void print() {
        int count = 0 ;
        ArrayList<Integer> even = new ArrayList<>() ;
        ArrayList<Integer> odd = new ArrayList<>() ;
        for (int i = start; i <= end; i++)
        {
            if(isEVen(i))
            {
                even.add(i) ;    /*adding to the arraylist of even it is even*/
                count++ ;        /*increase count by count*/
            }
            else
            {
                odd.add(i) ;     /*add number to odd arraylist if number is odd*/
            }
        }
        System.out.println("The even numbers are as follows:");
        System.out.println(even);
        System.out.println("The odd numbers are as follows:");
        System.out.println(odd);
        System.out.println("There are "+count+" even numbers and "+(end-start-count+1)+" odd numbers in the given range");

    }

}

public class EvenOdd {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int a, b;
        System.out.println("Enter the starting number :");
        a = in.nextInt();                           /*Input number*/
        System.out.println("Enter the last number :");
        b = in.nextInt();                          /*Input number*/
        if(a>b) {
            System.out.println("Enter the valid numbers");
            return;                                 /*edge case*/
        }
        System.out.println("Enter the range in which you need the result\n1.["+a+","+b+"]\n2.["+a+","+b+")");
        System.out.println("3.("+a+","+b+"]\n4.("+a+","+b+")");
        int option = in.nextInt();                     /* Input option for to consider inclusive and exclusive*/
        switch (option)
        {
            case 1 ->  {}                                 /*for inclusive no changes needed*/
            case 2 ->  b--;                         /* for [) end = end -1 as end is not considered*/
            case 3 ->  a++  ;                          /* for [)    start = start +1 as start is not considered*/
            case 4 ->  {a = a+1 ; b= b-1 ;}                /*()     start = start+1 and end = end-1 as both are not considered*/
            default -> System.out.println("Enter the valid option");
        }
        Number n = new Number(a,b);
        n.print() ;
    }
}
