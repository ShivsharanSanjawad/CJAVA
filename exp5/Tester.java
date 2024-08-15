import java.util.Scanner;

class Recruitment 
	{

	static void rules(double marks,double total_marks){
   		if(marks>(0.6*total_marks))
   		{
      		System.out.println("Congratulations . You are selected . Your marks are  "+marks) ;
   		}
   		else 
   		{
   			System.out.println("Sorry you are not selected . Your marks are "+marks) ; 
   		}
		}
	}
	
	class Testing extends Recruitment {
        Scanner in = new Scanner(System.in) ;
         double marks ;
         double options [] = new double[8] ; 
         double correct [] = {4,4,2,1,3,4,1,2};
          
          
          void taketest(){
          
          System.out.println("Round 1 :") ; 
          System.out.println("What is the vision of the company?");
          System.out.println("1.To destroy the world");
          System.out.println("2.To provide right education to world");
          System.out.println("3.To make people rich");
          System.out.println("4.To provide the softwares for work with ease");
          options[0] = in.nextDouble() ; 
          System.out.println("How long will you stay in this role?");
          System.out.println("1.  1 year");
          System.out.println("2.  3 year");
          System.out.println("3.  5 year"); 
          System.out.println("4.  10 year");
          options[1] = in.nextDouble() ; 
          System.out.println("What is final method in Java?");
          System.out.println("1.Final methods can be overriden");
          System.out.println("2.Final methods cannot be overriden");
          System.out.println("3.Final method cannot be inherited");
          System.out.println("4.No idea");
          options[2] = in.nextDouble() ; 
          System.out.println("What is the latest version of Java?");
          System.out.println("1.21");
          System.out.println("2.24");
          System.out.println("3.22");
          System.out.println("4.17");
          options[3] = in.nextDouble() ; 
          System.out.println("What did you learn about Java in last job?");
          System.out.println("1. How to solve differential equations");
          System.out.println("2.How to build the house");
          System.out.println("3.About object oriented programming");
          System.out.println("4.How to read a book");
          options[4] = in.nextDouble() ; 
          System.out.println("What do you wish to learn?");
          System.out.println("1.How to write a book");
          System.out.println("2.How to build huge buildings");
          System.out.println("3.Applications of differential equations");
          System.out.println("4.How to use java efficiently");
          options[5] = in.nextDouble() ; 
          System.out.println("What makes a team successful?");
          System.out.println("1.By listening each persons view ");
          System.out.println("2.being hitler");
          System.out.println("3.None");
          options[6] = in.nextDouble() ; 
          System.out.println("Do you work faster in team or as individual?");
          System.out.println("1.Individual");
          System.out.println("2.Team");
          options[7] = in.nextDouble() ; 
          System.out.println("Thank you for giving test you will able to check your result soon");
      }
    	
 	   void generateresult()
       {
        for(int i = 0 ; i<8 ; i++)
        {
            if(options[i]==correct[i])
            {
                marks ++ ; 
            }
        }
        rules(marks,8);
       }
	
	
	
	
	
	
	
	}
	
	public class Tester{
	public static void main(String[] args) {
        Testing t = new Testing(); 
        t.taketest();
        t.generateresult();
    }
	
	
	
	
	
	
	}


