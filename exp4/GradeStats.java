package com.exp4;

import java.sql.SQLOutput;
import java.util.Scanner;

class Stats{
    private double a[] ;
    Stats(double []arr){
        a = new double[arr.length];
        for (int i = 0; i < arr.length ; i++) {
            a[i] = arr[i] ;
        }
        sort() ;
    }
    Stats(){

    }
    void sort(){
        for(int i = 0 ; i< a.length;i++)
        {
            boolean flag = true ;
            for(int j=0 ; j<a.length - i -1 ; j++)
            {
                if(a[j]>a[j+1])
                {
                    double temp = a[j] ;
                    a[j] = a[j+1] ;
                    a[j+1] = temp ;
                    flag = false ;
                }
            }
            if(flag){
                break ;
            }
        }
    }
    double average(){
       double sum = 0 ;
       for(int i = 0 ;i<a.length;i++) {
           sum = sum + a[i];
       }
       return sum/a.length ;
    }

    double min(){
        return a[0] ;
    }

    double max(){
        return a[a.length-1] ;
    }

    double median(){
        if(a.length%2==0)
        {
            return a[a.length/2] ;
        }
        return (a[(a.length+1)/2]+a[(a.length-1)/2])/2 ;
    }
    void standardDeviation(){
        double sda, sdm ;
        sda = 0 ;
        sdm = 0 ;
        double avg = average() ;
        double median = median() ;
        for(int i =  0 ;i<a.length;i++){
            sda += (a[i]-avg)*(a[i]-avg) ;
            sdm += (a[i]-avg)*(a[i]-avg) ;
        }
        System.out.println("Standard deviation about mean is "+(Math.sqrt(sda/a.length)));
        System.out.println("Standard deviation about median is "+(Math.sqrt(sdm/a.length)));
    }

    void analyise(){
        System.out.println("Average is "+average());
        System.out.println("Minimum is "+min());
        System.out.println("Maximum is "+max());
        System.out.println("Median is "+median()) ;
        standardDeviation();
    }

}

public class GradeStats {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in) ;
        System.out.println("Enter the number of Students :");
        int n = in.nextInt() ;
        double a[] = new double[n] ;
        for(int i = 0 ; i<n ; i++)
        {
            System.out.println("Enter the marks of student:"+(i+1));
              a[i] = in.nextDouble() ;
        }
        Stats s = new Stats(a) ;
        s.analyise();
    }
}
