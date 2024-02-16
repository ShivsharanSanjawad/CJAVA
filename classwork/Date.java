//import java.util.Scanner ;
//	class SetDate{
//        int year, month,  date,  hrs,  min, sec ;
//
//
//         	 void setDate(int year, int month, int date)
//          	{
//                     this.year = year + month/12;
//                     this.month = month ;
//                     this.date = date ;
//                     display(1) ;
//         	 }
//
//		void setDate(int year, int month, int date, int hrs, int min)
//		{
//		     this.year = year ;
//		     this.month = month ;
//		     this.date = date ;
//		     this.hrs = hrs ;
//		     this.min = min ;
//		     display(2) ;
// 		}
//
//		void setDate(int year, int month, int date, int hrs, int min, int sec)
//		{
//		     this.year = year ;
//		     this.month = month ;
//		     this.date = date ;
//		     this.hrs = hrs ;
//		     this.min = min ;
//		     this.sec = sec ;
//		     display(3) ;
//		}
//
//		void display(int n )
//		{
//		    switch(n)
//		    {
//		         case 1 -> {
//		         		System.out.println("The Date and Time is ") ;
//		         		System.out.printf("year = %d\nmonth = %d\ndate = %d",year,month,date) ;
//		                   }
//		         case 2 -> {
//		         		System.out.println("The Date and Time is ") ;
//		          	System.out.printf("year = %d\nmonth = %d\ndate = %d\nhour=%d\nminute=%d",year,month,date,hrs,min) ;
//		         	   }
//		         case 3 ->{
//		         	System.out.println("The Date and Time is ") ;
//System.out.printf("year = %d\nmonth = %d\ndate = %d\nhours = %d\nminutes = %d\nseconds = %d",year,month,date,hrs,min,sec) ;
//		         }
//
//
//		    }
//		}
//	}
//
//	public class Date{
//		public static void main(String []arg)
//		{     Scanner in = new Scanner(System.in) ;
//		        int opt ;
//		        do{
//			System.out.println("Enter which the option in which you want to set date") ;
//			System.out.println("1.Year , month , date") ;
//			System.out.println("2.Year , month , date ,hours , minute") ;
//			System.out.println("3.Year , month . date ,hours , minute , second") ;
//			System.out.println("4.Exit") ;
//			opt = in.nextInt() ;
//			switch(opt)
//			{
//			   case 3 -> {
//			               System.out.println("Enter the year") ;
//			               int year = in.nextInt() ;
//			               System.out.println("Enter the month") ;
//			               int month = in.nextInt() ;
//			               System.out.println("Enter the date") ;
//			               int date = in.nextInt() ;
//			               System.out.println("Enter the hours") ;
//			               int hours = in.nextInt() ;
//			               System.out.println("Enter the minutes") ;
//			               int minutes = in.nextInt() ;
//			               System.out.println("Enter the seconds")  ;
//			               int seconds = in.nextInt() ;
//			               SetDate s = new SetDate() ;
//			               s.setDate(year,month,date,hours,minutes,seconds) ;
//			             }
//			case 2 ->  {
//			               System.out.println("Enter the year") ;
//			               int year = in.nextInt() ;
//			               System.out.println("Enter the month") ;
//			               int month = in.nextInt() ;
//			               System.out.println("Enter the date") ;
//			               int date = in.nextInt() ;
//			               System.out.println("Enter the hours") ;
//			               int hours = in.nextInt() ;
//			               System.out.println("Enter the minutes") ;
//			               int minutes = in.nextInt() ;
//			                SetDate s = new SetDate() ;
//			               s.setDate(year,month,date,hours,minutes) ;
//			             }
//			case 1 ->
//			               {
//			               System.out.println("Enter the year") ;
//			               int year = in.nextInt() ;
//			               System.out.println("Enter the month") ;
//			               int month = in.nextInt() ;
//			               System.out.println("Enter the date") ;
//			               int date = in.nextInt() ;
//			               SetDate s = new SetDate() ;
//			               s.setDate(year,month,date) ;
//			               }
//
//			default ->   {
//			System.out.println("Enter the valid number") ;
//
//
//			}
//			}
//			}while(opt!=4);
//			}
//			}
