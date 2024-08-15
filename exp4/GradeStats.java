import java.util.Scanner;

class Stats{                                          /* class for all methods and properties related to problem */
    private double a[] ;
    Stats(double []arr){                             /* constructor to initialize the varibles */
        a = new double[arr.length];
        for (int i = 0; i < arr.length ; i++) {
            a[i] = arr[i] ;
        }
        sort() ;                                    /* calling sort method to sort an array */
    }
    Stats(){                                        /* default constructor */

    }
    void sort(){                                   /* used modified bubble sort */
        for(int i = 0 ; i< a.length;i++)
        {
            boolean flag = true ;                 /* declared flag it changes if the swap between 2 elements happen at least once */
            for(int j=0 ; j<a.length - i -1 ; j++)
            {
                if(a[j]>a[j+1])                   /* swap to elements if left one is greater than right element */
                {
                    double temp = a[j] ;
                    a[j] = a[j+1] ;
                    a[j+1] = temp ;
                    flag = false ;                 /* change the flag as swap occured */
                }
            }
            if(flag){                                    /* if not swapped that means array already sorted so break the loop */
                break ;
            }
        }
    }
    double average(){                             /* method to find average */
       double sum = 0 ;                               
       for(int i = 0 ;i<a.length;i++) {
           sum = sum + a[i];                      /* finding sum of all elements using for loop */
       }
       return sum/a.length ;                       /* return average i.e. divide sum by number of elements and return */
    }

    double min(){                                  /* method to find minimum value which returns minimum value in sorted array */
        return a[0] ;
    }
 
    double max(){                                 /* method to find maximum value which returns maximum value in sorted array */
        return a[a.length-1] ;
    }

    double median(){                                /* method to find median */
        if(a.length%2==1)                            /* return middle element if number of element is odd */
        {
            return a[(a.length-1)/2] ;
        }
        return (a[(a.length)/2]+a[(a.length)/2 -1])/2.0 ;    /* return average of middle two elements if number of elements is even */
    }
    void standardDeviation(){                            /* method to find the standard deviation */
        double sda ;
        sda = 0 ;
        double avg = average() ;
        for(int i =  0 ;i<a.length;i++){                 /* find sum of square of deviation from mean */
            sda += (a[i]-avg)*(a[i]-avg) ;
        }
        System.out.println(String.format("Standard deviation about mean is %.2f",(Math.sqrt(sda/a.length)))); /* divide that sum by number of elements and get varience and square root of that is standard deviation*/
    }

    void analyise(){                                                   /* print all data related to data set through constructor */
        System.out.println(String.format("Average is %.2f",average()));
        System.out.println(String.format("Minimum is %.0f",min()));
        System.out.println(String.format("Maximum is %.0f",max()));
        System.out.println(String.format("Median is %.2f",median())) ;
        standardDeviation();
    }

}

public class GradeStats {
    public static void main(String[] args) {                              /* main method */
        Scanner in = new Scanner(System.in) ;                                  /* creating the object of Scanner class to take input */
        System.out.println("Enter the number of Students :");
        int n = in.nextInt() ;                        /* input number of students */
        double a[] = new double[n] ;
        for(int i = 0 ; i<n ; i++)
        {
            System.out.println("Enter the marks of student "+(i+1)+":");   /* input for marks of each student */
              a[i] = in.nextDouble() ;
        }
        Stats s = new Stats(a) ;          /* create a object of stats class */
        s.analyise();                     /* calling a method that print all information about input of students */
    }
}
