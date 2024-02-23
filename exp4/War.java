class War{
    void decode(String s){
        for(int key = 1 ; key<101 ; key++){
            char [] h = new char[s.length()] ;
            for(int i = 0 ; i<s.length();i++)
            {
                char c = s.charAt(i) ;
                if(c<=126&&c>=32+key)
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