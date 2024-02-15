import java.util.Scanner ; 

	class Calculate {
              double base , logbase , argument ; 
              int power ; 
             public Calculate(double logbase , double argument )
              {  
                 this.logbase = logbase ; 
                 this.argument = argument ; 
                 log() ; 
              }
             public  Calculate(double base , int power)
              {
                 this.base = base ;
                 this.power = power ;
                 power() ;
              }
              
              Calculate()
              {
                logbase = 2 ; 
                base =2 ; 
                power =2 ; 
                argument =2 ; 
              }
               private void power()
               {
                 System.out.println("The answer is "+ Math.pow(base ,power)) ; 
               }
               private void log() 
               {
                 System.out.println("The answer is "+(Math.log(argument)/Math.log(logbase))) ; 
               }
              
              
              
	}
	public class Test{
	 	public static void main(String []args) 
	 	{    Scanner in = new Scanner(System.in) ; 
	 	     int opt ; 
	 	    do{
	 	     System.out.println("Enter the operation option that you") ; 
	 	     System.out.println("1.Power") ; 
	 	     System.out.println("2.Log") ; 
	 	     System.out.println("3.Exit") ;
	 	     opt = in.nextInt() ; 
	 	     switch(opt) 
	 	     {
	 	        case 1 -> {
	 	                      System.out.println("Enter the base") ;
	 	                      double base = in.nextDouble() ; 
	 	                      System.out.println("Enter the integer power") ; 
	 	                      int pow = in.nextInt() ;
	 	                      Calculate c = new Calculate(base , pow) ; 
	 	                      
	 	                  }
	 	        case 2 -> {
	 	                      System.out.println("Enter the logbase") ; 
	 	                      double base = in.nextDouble() ; 
	 	                      System.out.println("Enter the argument") ;   
	 	                      double arg = in.nextDouble() ;   
	 	                      Calculate c = new Calculate(base ,arg) ;  
	 	                  }
	 	       case 3 -> {
	 	                      break ; 
	 	                   }
	 	        default ->{
	 	                     System.out.println("Enter the valid number") ; 
	 	                  }   
	 	    }
	 	    }while(opt!=3) ; 
                }
	}	
