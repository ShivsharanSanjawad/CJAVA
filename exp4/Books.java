import java.util.Scanner ;
import java.util.ArrayList ; 
public class Books            
{    static double avg(double []a)                           /* method to get average rating of book by passing the 1D array of ratings of book as argument */
	{   double sum = 0 ; 
		for(int i = 0 ; i< a.length  ;i++)
		{
			sum = sum + a[i] ;                            /* sum of all ratings */
		}
		return sum/a.length ;                            /* return average */
	}
    public static void main(String []args){
         Scanner in = new Scanner(System.in);             /* create a object of Scanner class to take input */
		 System.out.println("Enter the number of books") ;
		 int row = in.nextInt() ;                         /* input number of books */
		 System.out.println("Enter the number of readers") ; 
		 int col = in.nextInt() ;                         /* input number of readers of each book */
		 String [] name = new String [row] ;              /* creating array of String to store the names */
		 double [][] books = new double[row][col] ;       /* creating a 2d aray for storing rating of books */
		 int n = row ; 
		 System.out.println("Warning enter the rating by readers between 1 to 5") ;
		 for(int i = 0 ; i< row ; i++){
			 System.out.println("Enter the name of Book "+(i+1)+" :") ; 
			 in.nextLine() ;
			 name[i]= in.nextLine() ;                     /* input name of movie */
			 
		 for(int j = 0 ; j< col ;j++){                    
              while (true) {
                    System.out.println("Enter the rating by reader " + (j + 1) + ":");
                    double rating = in.nextDouble();      /* input ratings */
                    if (rating >= 1 && rating <= 5) {     
                        books[i][j] = rating;
                        break;
                    } else {                             /* if rating is not valid take input again and again till valid input */
                        System.out.println("Please enter a valid rating between 1 to 5");
                    }	
		 }
		 }	}
		 double max = 0 ;                               
		 ArrayList<Integer> id = new ArrayList<>() ; 
         for( int i = 0 ; i< row ; i++)                   /* find maximum */
		 {
			 if(avg(books[i])>max)                        /* if the average book rating is greater than current max then create a new array list and add id(index) to it */
			 {
				 max = avg(books[i]) ;                   
				 id = new ArrayList<Integer>() ;
				 id.add(i) ;
			 }
			 else  
				 if(avg(books[i])==max)           /* if average is current max then add the id(index) to same arraylist */
				 {
					 id.add(i) ;
				 } 
		 }
		 if(id.size()==1)                       /* if only one book has maximum rating then print that book name along with rating */
		 {
			 System.out.println("Most popular book is '"+name[id.get(0)]+"' with rating of "+max) ;
		 }
		 else                                  /* if many books have same maximum rating then print all names */
		 {
			 System.out.println("The most popular books are as follows with rating of "+max) ;
			 for(int i = 0 ; i<id.size() ;i++)
			 {
				 System.out.println(name[id.get(i)]);
			 }
		 }
	}		
	}
