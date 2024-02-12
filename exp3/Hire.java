package com.exp3;

import java.util.Scanner;

class Posting{
    int courseWork;
    int AptTest;
   int TechTest;
   int interview;
   Posting(int courseWork,int AptTest , int TechTest , int interview)
   {
       this.courseWork = courseWork ;
       this.AptTest = AptTest ;
       this.interview = interview ;
       this.TechTest = TechTest ;
   }
   Posting(int TechTest , int interview){
       this.TechTest = TechTest ;
       this.interview = interview ;
       this.AptTest = 0 ;
       this.courseWork = 0 ;
   }
   Posting(int interview){
       this.interview = interview ;
       this.AptTest = 0 ;
       this.courseWork = 0 ;
       this.TechTest = 0 ;
   }
   void isselected(){
       int sum = interview + AptTest + courseWork + TechTest ;
       if(sum>90&&TechTest==0){
           System.out.println("Candidate selected as Project Manager") ;
       }
       else if(sum>85&&courseWork==0)
       {
           System.out.println("Candidate selected as Team Manager") ;
       }
       else if(sum>80&&courseWork!=0)
       {
           System.out.println("Candidate selected as Programmer");
       }
       else
           System.out.println("Candidate not selected") ;
   }


}
public class Hire {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in) ;
        int opt ;
        do{
            System.out.println("Enter the post for which you want to hire") ;
            System.out.println("1.Project Manager");
            System.out.println("2.Team Manager") ;
            System.out.println("3.Programmer") ;
            System.out.println("4.exit") ;
            opt = in.nextInt() ;
            switch(opt){
                case 1 -> {
                    System.out.println("Enter CourseWork marks:");
                    int cw = in.nextInt();
                    System.out.println("Enter Aptitude Test marks:");
                    int at = in.nextInt();
                    System.out.println("Enter Technical Test marks:");
                    int tt = in.nextInt();
                    System.out.println("Enter Interview marks");
                    int i = in.nextInt();
                    Posting p = new Posting(cw, at, tt, i);
                    p.isselected();
                }
                case 2 -> {
                    System.out.println("Enter Technical Test marks:");
                    int tt = in.nextInt() ;
                    System.out.println("Enter Interview marks");
                    int i = in.nextInt() ;
                    Posting p = new Posting(tt,i) ;
                    p.isselected();
                }
                case 3 ->{
                    System.out.println("Enter Interview marks");
                    int i = in.nextInt() ;
                    Posting p = new Posting(i) ;
                    p.isselected();
                }
                case 4 -> {
                    break ;
                }
                default -> {
                    System.out.println("Enter the valid number") ;
                }
            }
        }while(opt!=4) ;

    }
}
