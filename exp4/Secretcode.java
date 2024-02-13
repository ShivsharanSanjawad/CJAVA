package com.exp4;

import java.util.Random;
import java.util.Scanner;
class Secret{
    void decode(String s,int min,int max){
        for(int key = min ; key<max ; key++){
            char [] h = new char[s.length()] ;
            for(int i = 0 ; i<s.length();i++)
            {
                char c = s.charAt(i) ;
                if(c<=126&&c>34+key)
                {
                    h[i] = (char) (c - key);
                }
                else
                {
                    h[i] = (char)(c +95 - key) ;
                }
            }
            System.out.print(key+":" );
            for(int i = 0 ; i<s.length() ; i++){
                System.out.print(h[i]) ;
            }
            System.out.println() ;
        }
    }
    void decode(String s,int key){

        char [] h = new char[s.length()] ;
        for(int i = 0 ; i<s.length();i++)
        {
            char c = s.charAt(i) ;
            if(c<=126&&c>34+key)
            {
                h[i] = (char) (c - key);
            }
            else
            {
                h[i] = (char)(c +95 - key) ;
            }
        }
        for(int i = 0 ; i<s.length() ; i++){
            System.out.print(h[i]) ;
        }
        System.out.println() ;
    }

    void encode(String s , int key ){
        char [] h = new char[s.length()] ;
        for(int i = 0 ; i<s.length() ; i++)
        {
            char c = s.charAt(i) ;
            if(c+key>126){
                h[i]  = (char)(c+key - 95) ;
            }
            else
            {
                h[i] = (char)(c+key) ;
            }
        }
        for(int i = 0 ;i<s.length();i++){
            System.out.print(h[i]) ;
        }
    }

}
public class Secretcode
{
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int opt;
        do {
            System.out.println("1.encode\n2.decode\n3.exit");
            opt = in.nextInt();
            Secret sc = new Secret();
            switch (opt) {
                case 1 -> {
                    System.out.println("Enter the sentence");
                    in.nextLine();
                    String s = in.nextLine();
                    System.out.println("Enter the key if you want to get random key then enter -1");
                    int key = in.nextInt();
                    if (key == -1) {
                        Random r = new Random();
                        int rd = r.nextInt(1, 100000);
                        key = rd;
                        sc.encode(s, key);
                    } else {
                        sc.encode(s, key);
                    }
                    System.out.println("Key is " + key);
                }
                case 2 -> {
                    System.out.println("Enter the coded string");
                    in.nextLine();
                    String s = in.nextLine();
                    System.out.println("Enter the key (if you don`t know key enter 0)");
                    int key = in.nextInt();
                    if (key == 0) {
                        System.out.println("Enter minimum value of key");
                        int min = in.nextInt();
                        System.out.println("Enter the maximum value of key");
                        int max = in.nextInt();
                        sc.decode(s, min, max);
                    } else
                        sc.decode(s, key);
                }
                case 3 ->
                {
                    break ;
                }
                default ->{
                    System.out.println("Enter the valid number") ;
                }
            }
        }while(opt!=3) ;
    }
}