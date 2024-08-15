import java.util.Scanner ;
class Movie{            /* class Movie to store all information related to movie */
     String name ;
	 String type ;
	 String Hero ;
	 String Heroine ;
	 double budget ;
	                           
	 Movie(String name , String type , String Hero , String Heroine , double budget) /* constructor to initilaize all varibles */ 
	 {
		 this.name = name ; 
		 this.type = type ;
		 this.Hero = Hero ;
		 this.Heroine = Heroine ; 
		 this.budget = budget ; 		 
	 }
	 Movie(){   /* default constructor */
	 }
     
	 static Movie input(){   /* method to take inputs */
		  Scanner in = new Scanner(System.in) ;  /* creating object of scanner class to take input */
		String name ;    /* declare all varibles and take thier input */
		String type ;
		String Hero ;
		String Heroine ;
		double budget ;
		System.out.println("Enter the name of Movie") ; 
		name = in.next() ;
		System.out.println("Enter the type of Movie") ;
		type = in.next() ; 
		System.out.println("Enter the name of Hero") ; 
		Hero = in.next() ; 
		System.out.println("Enter the name of Heroine") ;
		Heroine = in.next() ; 
		System.out.println("Enter the budget of movie") ; 
		budget = in.nextDouble() ;
		 return new Movie(name , type , Hero , Heroine , budget ) ; /* create an object of Movie class with taken input and return that */
	 }
     
	 static void print(Movie m)  /* method to print all information about movie */
	 {
		 System.out.println("name     ->"+m.name) ;
		 System.out.println("type     ->"+m.type) ;
		 System.out.println("Hero    ->"+m.Hero) ; 
		 System.out.println("Heroine  ->"+m.Heroine) ; 
		 System.out.println("Budget   ->"+m.budget) ; 
		 System.out.println("\n\n\n") ; 
	 }
}
public class Test{
      public static void main(String []args){
		  Scanner in = new Scanner(System.in) ;   /* creating object of scanner class to take input */
		  System.out.println("Enter the number of Movies") ; 
		  int n = in.nextInt() ;  /* input number of movies*/
		  Movie [] m = new Movie[n] ; /*create an array of movie class with elements as number of movies */
		  
		  for(int i = 0 ; i<n ; i++)         /* input all information about all movies */
		  {
			  System.out.println("\n\nFor movie"+(i+1)) ;
              m[i] = Movie.input() ; 	  
		  }
		  
		  for(int i = 0 ; i<n-1 ; i++)         /* used modified bubble sort to sort */
		  {    boolean flag = true ;           /* flag that changes if the array is not sorted */
			  for(int j = 0 ; j<n-1-i ; j++)   
			  {
				  if(m[j].budget<m[j+1].budget) /* swap positions if left one is smaller than right */
				  {
					  Movie temp = m[j] ; 
					  m[j] = m[j+1] ; 
					  m[j+1] = temp ;
					  flag = false ;            /*change flag as array was not sorted */
				  }
				  if(flag)             /* flag is true i.e. array is sorted so break the loop*/
					  break ; 
			  }
		  }
		  System.out.println("\n\nThe Movies you entered according to their budget area as follows ") ;
		  for(int i = 0 ; i<n ; i++)  /* print all movie with all info */
		  {
			  System.out.println("Movie "+(i+1)) ;
			  Movie.print(m[i]) ;  
		  }
	  }
}