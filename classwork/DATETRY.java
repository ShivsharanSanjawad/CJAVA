import java.util.Scanner ;
	class SetDate{
        int year, month,  date,  hrs,  min, sec ;
        SetDate()
        {
           this.year = 2000 ; 
           this.month = 1; 
           this.date = 1 ;
           this.hrs = 0 ; 
           this.min = 0 ; 
           this.sec =  0 ; 


        }
        boolean isLeap()                                 /* check whether the year is leap or not */
        {
          if((year)%4==0)                                    
          {
            if((year)%100==0)
            {
            if((year)%400==0)                            /* if year is divisible by 4 and 100 then it should be divisible by 400 */
            return true ;
            return false ;                                /*else return false */
            }
            return true ;                                    /* if number is divisible by 4 but not by 100 then true */
          }
          return false ;                                 /* if not divisible by 4 then also false */
        }
        boolean isright(){
            int a[]   ;
            if(isLeap()){
                 a = new int[]{31, 29, 31, 30, 31, 30, 31, 31, 30, 31, 30, 31};           /*array will store the number of days in each month if year is leap if store 29 at index 2 else it stores 28 */
            }
            else
            {
                 a = new int[]{31, 28, 31, 30, 31, 30, 31, 31, 30, 31, 30, 31};
            }
            if(year<0){
                return false ;             /* if year is negative return false */
            }
            if(month>12||month<0){         /* if month is negative or the number of months is greater than 12 then false */
                return false ;
            }else if(a[month-1]<date||date<0){          /* if number of days is greater the number of days in that particular month or date is negative return false */
                return false ;
            }else if(hrs>23||hrs<0){              /* if hrs is greater than 23 or negative return false */
                return false ;
            }else if(min>59||min<0){                   /*if minutes is greater than 59 or negative return false */
                return false ;
            }else  if(sec>59||sec<0){                 /* if seconds is greater than 59 or negative return false */
                return false ;
            }
            return true ;                           /* by default return true */
        }
         	 void setDate(int year, int month, int date)
          	{
                     this.year = year ;              /* set the inputs to instance varibles */
                     this.month = month ;
                     this.date = date ;
                   if(isright())                       /* if inputs are valid then print the date depending on inputs  else show error message */
                     display(1) ;
                   else
                       System.out.println("Enter the valid numbers") ;
         	 }


		void setDate(int year, int month, int date, int hrs, int min)
		{
		     this.year = year ;
		     this.month = month ;
		     this.date = date ;
		     this.hrs = hrs ;
		     this.min = min ;
            if(isright())
		     display(2) ;
            else
                System.out.println("Enter the valid numbers") ;
        }

		void setDate(int year, int month, int date, int hrs, int min, int sec)
		{
		     this.year = year ;
		     this.month = month ;
		     this.date = date ;
		     this.hrs = hrs ;
		     this.min = min ;
		     this.sec = sec ;
            if(isright())
		     display(3) ;
            else
                System.out.println("Enter the valid numbers") ;
        }

		void display(int n )
		{                         /* depending on the inputs given print the date */
		    switch(n)
		    {
		         case 1 -> {
		         		System.out.println("The Date and Time is ") ;
		         		System.out.printf("year = %d\nmonth = %d\ndate = %d",year,month,date) ;
                         System.out.println() ;
		                   }
		         case 2 -> {
		         		System.out.println("The Date and Time is ") ;
		          	System.out.printf("year = %d\nmonth = %d\ndate = %d\nhour=%d\nminute=%d",year,month,date,hrs,min) ;
                     System.out.println() ;
                 }
		         case 3 ->{
		         	System.out.println("The Date and Time is ") ;
System.out.printf("year = %d\nmonth = %d\ndate = %d\nhours = %d\nminutes = %d\nseconds = %d",year,month,date,hrs,min,sec) ;
                     System.out.println() ;
                 }


		    }
		}
	}

	public class DATETRY{
		public static void main(String []arg)
		{     Scanner in = new Scanner(System.in) ;    /* create an object Scanner class to take the input */
		        int opt ;
		        do{                                   
			System.out.println("Enter which the option in which you want to set date") ;  /* show menu */
			System.out.println("1.Year , month , date") ;
			System.out.println("2.Year , month , date ,hours , minute") ;
			System.out.println("3.Year , month . date ,hours , minute , second") ;
			System.out.println("4.Exit") ; 
			opt = in.nextInt() ;                                            /*take option input */
			switch(opt)                                                     
			{                                                               /* take the inputs depending on option selected and create the object of class SetDate and call the method depending on the inputs */
			   case 3 -> { 
			               System.out.println("Enter the year") ;
			               int year = in.nextInt() ;
			               System.out.println("Enter the month") ;
			               int month = in.nextInt() ;
			               System.out.println("Enter the date") ;
			               int date = in.nextInt() ;
			               System.out.println("Enter the hours") ;
			               int hours = in.nextInt() ;
			               System.out.println("Enter the minutes") ;
			               int minutes = in.nextInt() ;
			               System.out.println("Enter the seconds")  ;
			               int seconds = in.nextInt() ;
			               SetDate s = new SetDate() ;
			               s.setDate(year,month,date,hours,minutes,seconds) ;
			             }
			case 2 ->  {
			               System.out.println("Enter the year") ;
			               int year = in.nextInt() ;
			               System.out.println("Enter the month") ;
			               int month = in.nextInt() ;
			               System.out.println("Enter the date") ;
			               int date = in.nextInt() ;
			               System.out.println("Enter the hours") ;
			               int hours = in.nextInt() ;
			               System.out.println("Enter the minutes") ;
			               int minutes = in.nextInt() ;
			                SetDate s = new SetDate() ;
			               s.setDate(year,month,date,hours,minutes) ;
			             }
			case 1 ->
			               {
			               System.out.println("Enter the year") ;
			               int year = in.nextInt() ;
			               System.out.println("Enter the month") ;
			               int month = in.nextInt() ;
			               System.out.println("Enter the date") ;
			               int date = in.nextInt() ;
			               SetDate s = new SetDate() ;
			               s.setDate(year,month,date) ;
			               }
            case 4 ->{
                   break ;
            }
			default ->   {
			System.out.println("Enter the valid number") ;


			}
			}


		}while(opt!=4);





	}}
