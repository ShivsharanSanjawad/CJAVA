import java.util.Scanner ;
	public class TestArray{
	
	static void printArray(double a[])
	{

          for(int i = 0 ; i<a.length ; i++)
          System.out.print(a[i]+" ") ;
          System.out.println() ; 
       }
       static double max(double a[]){
       
       double max= 0 ; 
       for(int i = 0 ; i<a.length ; i++)
       {
          if(a[i]>max)
          {
             max = a[i] ;
          }
       }
       return max ; 
       } 
       
       static void sort(double a[]) 
       {
           for(int i = 0 ; i<a.length -1 ; i++)
           {   boolean flag = true ;
               for(int j = 0 ; j<a.length -i-1 ; i++)
               {
                  if(a[j]>a[j+1])
                  {
 		     double temp = a[j] ; 
 		     a[j] = a[j+1];
 		     a[j+1] = temp ;
 		     flag = false ; 
 		     
                  }  
               }
               if(flag)
               {
               break ; 
               }
           }
      }
      static double min(double a[]){
            double min = a[0] ;
            for(int i = 0 ; i<a.length ;i++)
            {  
              if(a[i]<min)
                  min = a[i] ; 
            }
            return min ; 
      }
      
     static double median(double a[]) {
            sort(a); 
         if (a.length % 2 == 1)
        return a[(a.length + 1) / 2 - 1];
    return (a[a.length / 2] + a[a.length / 2 - 1]) / 2.0;
}

      
      static double mean(double a[])
      {
      
         double sum = 0 ;
         for(int i  = 0 ; i<a.length ; i++)
         sum = sum +a[i] ;  
        return sum/a.length ;
      }
      
      static double sd(double a[] , double num)
      {
            double ans = 0 ;
            
            for(int i = 0 ;i<a.length ; i++)
            {
            ans = ans + Math.pow((num - a[i]), 2)  ;
            }
      
            return Math.sqrt(ans/a.length) ; 
      }
	
			 	public static void main(String []args)
			 	{
			 	    Scanner in = new Scanner(System.in) ;
			 	    System.out.println("Enter the number of elements") ; 
			 	    int n = in.nextInt() ; 
			 	    if(n<=0)
			 	    {
			 	    System.out.println("Enter the valid number") ; 
			 	    main(null) ; 
			 	    }
			 	    double a[] = new double[n] ;
			 	    for(int i = 0 ;i<n;i++)
			 	    {
			 	    System.out.println("Enter the element for index "+i+":") ;
			 	    a[i] = in.nextDouble() ; 
			 	    }
			 	    
			 	    
			 	    
			 	  
			 	    System.out.println("The numbers you entered are as follows");
			 	    printArray(a) ; 
			 	    System.out.println(String.format("The average is :%.2f",mean(a))) ;
			 	    System.out.println(String.format("The minimum is :%.2f",min(a)));
			 	    System.out.println(String.format("The maximum is :%.2f",max(a))) ; 
			 	    System.out.println(String.format("The median  is :%.2f",median(a))) ;
                                    System.out.println(String.format("Standard deviation about mean is :%.2f",sd(a,mean(a))));
                                    System.out.println(String.format("Standard deviation about median is :%.2f",sd(a,median(a)))) ;
				}	
}
