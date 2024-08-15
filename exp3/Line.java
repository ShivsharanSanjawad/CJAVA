package com.exp3;

import java.util.Scanner;
class sline{
    String y;
    sline(double m , double c )
    {
        y = "y+("+(-m)+")x+("+(-c)+")=0" ;
    }
    sline(double x1 , double y1 , double m)
    {
        y = "y+("+(-m)+")x+("+(-y1+ x1*m)+")=0" ;
    }
    sline(double x1 , double y1 , double x2 , double y2)
    {
        this(x1 , y1 , (x2-x1) / (y2-y1)  ) ;
    }
    public void display(){
        System.out.println(y) ;
    }


}

public class Line {
    public static void main(String[]args){
        Scanner in = new Scanner(System.in) ;
        System.out.println("Enter the line that you want:") ;
        System.out.println("1.Slope intercept form") ;
        System.out.println("2.Slop point form") ;
        System.out.println("3.Two point form") ;
        int opt  = in.nextInt() ;
        switch(opt){
            case 1 ->{
                System.out.println("Enter the slope") ;
                double m = in.nextDouble() ;
                System.out.println("Enter the intercept") ;
                double c = in.nextDouble() ;
                sline y = new sline(m,c) ;
                y.display();
            }
            case 2 -> {
                System.out.println("Enter the Slope") ;
                double m = in.nextDouble() ;
                System.out.println("Enter the x - coordinate :") ;
                double x1 = in.nextDouble() ;
                System.out.println("Enter the y - coordinate :");
                double y1 = in.nextDouble() ;
                sline y = new sline(m,x1,y1) ;
                y.display() ;
            }
            case 3 ->{
                System.out.println("Enter the x - coordinate") ;
                double x1 = in.nextDouble();
                System.out.println("Enter the y - coordinate") ;
                double y1 = in.nextDouble() ;
                System.out.println("Enter the x - coordinate") ;
                double x2 = in.nextDouble() ;
                System.out.println("Enter the y - coordinate") ;
                double y2 = in.nextDouble() ;
                sline y = new sline(x1,y1,x2,y2) ;
                y.display() ;
            }
            default ->{
                System.out.println("Enter the valid number") ;
            }
        }
    }
}
