package com.test;

public class test {
   static void hello(int n){
        System.out.println(n);
        hello(n+1) ;
    }
    public static void main(String[] args) {
        hello(1) ;
    }
}
