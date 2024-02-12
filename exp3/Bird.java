//Create a Class Bird. Consider data member as livenear, weight, beak, canfly, typeofbird. Write method to identify the type of birds. if user give livenear - water, canfly -no then typeofbird is ducks. if user give canfly-yes, weight - light, beak - sharp then typeofbird - eagles. if user give livenear - water, canfly -yes, weight - light then typeofbird is swans. Show method overloading for identifing the bird.
import java.util.Scanner;


class ird{
    String livenear;
    String  weight;
    String beak;
    String canfly;
    ird(String l , String c ,String d , String e)
    {
            this.livenear=l;
            this.canfly=c;
            this.beak=d;
            this.weight=e;
            if(livenear.equals("water")|| canfly.equals("no")){
                System.out.print("The bird is:-duck");
            }
            else if(canfly.equals("yes")|| weight.equals("light")|| beak.equals("sharp")){
                System.out.print(" Type of bird is:- Eagles");
            }
            else if(livenear.equals("water")|| canfly.equals("yes")|| weight.equals("light")){
                System.out.print(" Type of bird is:- swans");
            }
            else{
                System.out.println("Error");
            }




        }
        ird(){

        }

    }



public class Bird{
    public static void main(String [] args)
    {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter livenear:-");
        String b=sc.next();
        System.out.println("Enter canfly :-");
        String i=sc.next();
        System.out.println("Enter beak :-");
        String r=sc.next();
        System.out.println("Enter how wight is light or heavy :-");
        String d=sc.next();
        ird bi = new ird(b,i,r,d);
    }
}
