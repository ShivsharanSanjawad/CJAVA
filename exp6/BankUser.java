

import java.util.Calendar;
import java.util.Scanner;

class Bank {
    double rate_of_interest ;

    public double getRate_of_interest() {
        return rate_of_interest;
    }


}
class SBI_Bank extends Bank{
    int time_period ;
    double interest ;
    double amount  ;

    SBI_Bank(int time,double amount)
    {    if(time<7||time>180)
    {
        System.out.println("Error!");
        System.exit(1) ;
    }
    else this.time_period = time ;
        if(amount<=0||amount>20000000) {
            System.out.println("Error !");
            System.exit(1);
        }
        else this.amount = amount ;
        System.out.println("Deposited Successfully");
    }
    SBI_Bank(){}
    public double get_rate_of_interest()
    {
        int opt ;
        if(time_period>=7&&time_period<=45)
            this.interest = 3 ;
        else if(time_period>=46&&time_period<=90)
            this.interest = 4.05 ;
        else if (time_period>=91&&time_period<=180)
            this.interest = 4.10 ;
        return interest ;
    }
    public double getamount(){
        return  amount *Math.pow((1+(get_rate_of_interest())/100) , time_period) ;
    }
    public void get_details()
    {
        Calendar c = Calendar.getInstance() ;
        c.add(Calendar.DATE ,time_period) ;
        System.out.println("You will get the "+getamount()+"Rs. on"+c.getTime());
    }
}
class ICIC_Bank extends Bank{
    int time_period ;
    double interest ;
    double amount  ;
    ICIC_Bank(int time,double amount)
    {    if(time<7||time>180)
    {
        System.out.println("Error!");
        System.exit(1) ;
    }
    else this.time_period = time ;
        if(amount<=0||amount>20000000) {
            System.out.println("Error !");
            System.exit(1);
        }
        else this.amount = amount ;
        System.out.println("Deposited Successfully");
    }
    ICIC_Bank(){}

    public double get_rate_of_interest()
    {
        int opt ;
        if(time_period>=7&&time_period<=14)
            this.interest = 3.10 ;
        else if(time_period>=15&&time_period<=30)
            this.interest = 3.20 ;
        else if (time_period>=31&&time_period<=45)
            this.interest = 3.50;
        else if(time_period>=46&&time_period<=90)
            this.interest = 4.50 ;
        else if (time_period>=91&&time_period<=120)
            this.interest = 4.70 ;
        else if(time_period>=121&&time_period<=180)
            this.interest = 4.90 ;
        return interest ;
    }
    public double getamount(){
        return  amount *Math.pow((1+(get_rate_of_interest())/100) , time_period) ;
    }
    public void get_details()
    {
        Calendar c = Calendar.getInstance() ;
        c.add(Calendar.DATE ,time_period) ;
        System.out.println("You will get the "+getamount()+"Rs. on"+c.getTime());
    }
}
class AXIS_Bank extends Bank{
    int time_period ;
    double interest ;
    double amount  ;
    AXIS_Bank(int time,double amount)
    {    if(time<7||time>180)
    {
        System.out.println("Error!");
        System.exit(1) ;
    }
    else this.time_period = time ;
        if(amount<=0||amount>20000000) {
            System.out.println("Error !");
            System.exit(1);
        }
        else this.amount = amount ;
        System.out.println("Deposited Successfully");
    }
    AXIS_Bank(){}

    public double get_rate_of_interest()
    {
        int opt ;
        if(time_period>=7&&time_period<=14)
            this.interest = 3.15 ;
        else if(time_period>=15&&time_period<=30)
            this.interest = 3.15 ;
        else if (time_period>=31&&time_period<=45)
            this.interest = 3.45;
        else if(time_period>=46&&time_period<=90)
            this.interest = 4.05 ;
        else if (time_period>=91&&time_period<=120)
            this.interest = 4.70 ;
        else if(time_period>=121&&time_period<=180)
            this.interest = 5  ;
        return interest ;
    }
    public double getamount(){
        return  amount *Math.pow((1+(get_rate_of_interest())/100) , time_period) ;
    }
    public void get_details()
    {
        Calendar c = Calendar.getInstance() ;
        c.add(Calendar.DATE ,time_period) ;
        System.out.println("You will get the "+getamount()+"Rs. on"+c.getTime());
    }
}
public class BankUser {
    public static void showOptions() {
        System.out.println("Choose the option");
        System.out.println("1. Get rate of interest");
        System.out.println("2. Get total amount after maturity");
        System.out.println("3. Change the bank");
        System.out.println("4. Exit");
    }

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

        while (true) {
            System.out.println("Enter the amount you want to deposit");
            double amount = in.nextDouble();
            System.out.println("Enter the number of days for which you want to submit");
            int time = in.nextInt();
            System.out.println("Enter the number of the option that you want to choose");
            System.out.println("1. SBI BANK\n2. ICIC BANK\n3. AXIS BANK\n4. Exit");
            int opt = in.nextInt();
            int opt2 ;
            switch (opt) {
                case 1:
                    SBI_Bank sbiBank = new SBI_Bank(time, amount);
                    do{
                    showOptions();
                     opt2 = in.nextInt();
                    switch (opt2) {
                        case 1:
                            System.out.println("The rate of interest is " + sbiBank.get_rate_of_interest());
                            break;
                        case 2:
                            sbiBank.get_details();
                            break;
                        case 3:
                            break;
                        case 4:
                            System.exit(0);
                        default:
                            System.out.println("Invalid choice");
                            break;
                    }}while(opt2!=3) ;
                    break;
                case 2:
                    ICIC_Bank icicBank = new ICIC_Bank(time, amount);
                       do{
                        showOptions();
                        opt2 = in.nextInt();
                        switch (opt2) {
                            case 1:
                                System.out.println("The rate of interest is " + icicBank.get_rate_of_interest());
                                break;
                            case 2:
                                icicBank.get_details();
                                break;
                            case 3:
                                break;
                            case 4:
                                System.exit(0);
                            default:
                                System.out.println("Invalid choice");
                                break;
                        }}while(opt2!=3) ;
                        break;
                case 3:
                    AXIS_Bank axisBank = new AXIS_Bank(time, amount);
                    do{
                    showOptions();
                    opt2 = in.nextInt();
                    switch (opt2) {
                        case 1:
                            System.out.println("The rate of interest is " + axisBank.get_rate_of_interest());
                            break;
                        case 2:
                            axisBank.get_details();
                            break;
                        case 3:
                            break;
                        case 4:
                            System.exit(0);
                        default:
                            System.out.println("Invalid choice");
                            break;
                    }}while(opt2!=3) ;
                    break;
                case 4:
                    System.exit(0);
                default:
                    System.out.println("Invalid choice");
                    break;
            }
        }
    }
}


