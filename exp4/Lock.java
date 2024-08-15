import java.util.Scanner ; 
import java.util.Random ; 
class Decrypt{
    void decode(String s,int min , int max){
        for(int key = min ; key<max ; key++){            /* try all key from min to maximum value */
            char [] h = new char[s.length()] ;           /* create an array of characters so that we can manuculate the String copy */
            for(int i = 0 ; i<s.length();i++)
            {
                char c = s.charAt(i) ;                  /* get character at ith index */
                if(c<=126&&c>=32+key)                   /* after thinking in reverse manner got that if char have ascii between 32+key and 126 then substract key from that else subtract key and add 95 */
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
                System.out.print(h[i]) ;            /* print the char array that we got for a key along with key number */
            }
            System.out.println() ;
        }
    }
    void encode(String s , int key ){               /* algorithm to encode */
        char [] h = new char[s.length()] ;      /* create an array of characters so that we can manuculate the String copy */
        for(int i = 0 ; i<s.length() ; i++)
        {
            char c = s.charAt(i) ;             /* get character at ith position */
            if(c+key>126){                     /* according to given algo if character + key is greater than 126 then add key and subtract 95 else add only key */
                h[i]  = (char)(c+key - 95) ;
            }
            else
            {
                h[i] = (char)(c+key) ;
            }
        }
        for(int i = 0 ;i<s.length();i++){
            System.out.print(h[i]) ;       /* print the character array */
        }
    }

}
class Lock {
    static Scanner input = new Scanner(System.in);

    static String execute() {
        System.out.print("Enter the sentence: ");
        String line = input.nextLine();
        int ctr = 0;

        for (int i = 0; i < line.length(); i++) {
            if (String.valueOf(line.charAt(i)).equals(" ")) {
                char[] str = new char[4];
                for (int j = 0; j < 4; j++) {
                    str[j] = line.charAt(i + j + 1);
                }
                if (String.valueOf(str).equals("lock")) {
                    ctr++;
                }
            }
        }
       
        if (ctr >= 3) {
       
        Random r = new Random() ;
        Decrypt d = new Decrypt() ; 
        int key = r.nextInt(1000) +1;
        d.encode(line,key) ;
         System.out.println();
         System.out.println(key) ;
            return "You're Welcome to the group";
        }
        return "You can leave";
    }

    public static void main(String[] args) {
        System.out.println(execute());
        input.close();
        
    }
}
