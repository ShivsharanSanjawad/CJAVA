import java.util.Scanner ;
	class SetDate{
        int year, month,  date,  hrs,  min, sec ;
        boolean isLeap()
        {
          if((year)%4==0)
          {
            if((year)%100==0)
            {
            if((year)%400==0)
            return true ;
            return false ;
            }
            return true ;
          }
          return false ;
        }
        boolean isright(){
            int a[]   ;
            if(isLeap()){
                 a = new int[]{31, 29, 31, 30, 31, 30, 31, 31, 30, 31, 30, 31};
            }
            else
            {
                 a = new int[]{31, 28, 31, 30, 31, 30, 31, 31, 30, 31, 30, 31};
            }
            if(year<0){
                return false ;
            }
            if(month>12||month<0){
                return false ;
            }else if(a[month-1]<date||date<0){
                return false ;
            }else if(hrs>23||hrs<0){
                return false ;
            }else if(min>59||min<0){
                return false ;
            }else  if(sec>59||sec<0){
                return false ;
            }
            return true ;
        }
         	 void setDate(int year, int month, int date)
          	{
                     this.year = year ;
                     this.month = month ;
                     this.date = date ;
                   if(isright())
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
		{
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
		{     Scanner in = new Scanner(System.in) ;
		        int opt ;
		        do{
			System.out.println("Enter which the option in which you want to set date") ;
			System.out.println("1.Year , month , date") ;
			System.out.println("2.Year , month , date ,hours , minute") ;
			System.out.println("3.Year , month . date ,hours , minute , second") ;
			System.out.println("4.Exit") ;
			opt = in.nextInt() ;
			switch(opt)
			{
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
