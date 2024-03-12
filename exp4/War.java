//import java.util.Scanner ;
//import java.util.Random ;
//class Decrypt{
//    void decode(String s,int min , int max){
//        for(int key = min ; key<max ; key++){            /* try all key from min to maximum value */
//            char [] h = new char[s.length()] ;           /* create an array of characters so that we can manuculate the String copy */
//            for(int i = 0 ; i<s.length();i++)
//            {
//                char c = s.charAt(i) ;                  /* get character at ith index */
//                if(c<=126&&c>=32+key)                   /* after thinking in reverse manner got that if char have ascii between 32+key and 126 then substract key from that else subtract key and add 95 */
//                {
//                    h[i] = (char) (c - key);
//                }
//                else
//                {
//                    h[i] = (char)(c +95 - key) ;
//                }
//            }
//            System.out.print(key+":" );
//            for(int i = 0 ; i<s.length() ; i++){
//                System.out.print(h[i]) ;            /* print the char array that we got for a key along with key number */
//            }
//            System.out.println() ;
//        }
//    }
//    void encode(String s , int key ){               /* algorithm to encode */
//        char [] h = new char[s.length()] ;      /* create an array of characters so that we can manuculate the String copy */
//        for(int i = 0 ; i<s.length() ; i++)
//        {
//            char c = s.charAt(i) ;             /* get character at ith position */
//            if(c+key>126){                     /* according to given algo if character + key is greater than 126 then add key and subtract 95 else add only key */
//                h[i]  = (char)(c+key - 95) ;
//            }
//            else
//            {
//                h[i] = (char)(c+key) ;
//            }
//        }
//        for(int i = 0 ;i<s.length();i++){
//            System.out.print(h[i]) ;       /* print the character array */
//        }
//    }
//
//}
//public class War{
//  public static void main(String[] args) {
//        Scanner in = new Scanner(System.in);     /* create object of scanner class to get input */
//        int opt;
//		Decrypt d = new Decrypt() ;              /* creating object of Decrypt class to encode and decode*/
//        do {
//            System.out.println("1.encode\n2.decode\n3.exit");
//            opt = in.nextInt();                   /* take option what to do */
//            switch (opt) {
//                case 1:
//                    System.out.println("Enter the sentence");
//                    in.nextLine();              /* input sentence*/
//                    String s1 = in.nextLine();
//                    System.out.println("Enter the key if you want to get a random key then enter -1");
//                    int key = in.nextInt();  /* input key */
//                    if (key == -1) {
//                        Random r = new Random();
//                        key = r.nextInt(100000) + 1;  /* random key if user want */
//                    }
//                    d.encode(s1, key); /* call encode method from Decrypt class */
//                    System.out.println("\nKey is " + key);
//                    break;
//                case 2:
//                    System.out.println("Enter the coded string");
//                    in.nextLine();
//                    String s2 = in.nextLine();  /* input coded text*/
//                    System.out.println("Enter the minimum value of the key");
//                    int min = in.nextInt();  /* input minimum value of key */
//                    System.out.println("Enter the maximum value of the key");
//                    int max = in.nextInt();  /* input max value of key */
//                    d.decode(s2, min, max);   /*call decode method */
//                    break;
//                case 3:
//                    break;
//                default:
//                    System.out.println("Enter a valid number");
//            }
//        } while (opt != 3);
//    }
//
//
//
//}