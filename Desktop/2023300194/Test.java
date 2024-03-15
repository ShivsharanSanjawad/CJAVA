import java.util.Scanner ; 
class Employee{
     private   String name ;
     private  String id ; 
     private  int age ; 


    Employee(String name , String id , int age )
    {
        this.name = name ; 
        this.id = id ; 
        this.age = age ;
    }
    Employee(){

    }

    public String getname()
    {
        return name ;
    }
    public String getid()
    {
        return id ;
    }
    public int getage (){
        return age ;
    }
    public void setage(int age)
    {
        this.age = age ; 
    }
    public void setname(String name){
        this.name = name ;
    }
    public void setid(String id)
    {
        this.id = id ;
    }
}
class Salariedemployee extends Employee {
    double salary ; 
  Salariedemployee(String name ,String id ,int age , double salary)
  {
    super(name, id, age) ;
    this.salary = salary ; 
     
  }
 
  Salariedemployee(){}
}

class PermantEmp extends Salariedemployee{
    PermantEmp(){

    }
    PermantEmp(String name , String id ,int age , double salary ){
           super(name , id , age , salary) ;
    }
}

class ContractEmp extends Salariedemployee{
    ContractEmp(){
    
    }
    ContractEmp(String name , String id , int age , double salary)
    {
        super( name , id , age , salary) ;
    }
}

public class Test {
   public static void main(String [] args) {
    String name , id ;
    int age ;
    double salary ; 
    int is_permant ; 
    int maxid = -1 ; 
    double max = 0; 
    Scanner in = new Scanner(System.in) ;
    Salariedemployee[] employee = new Salariedemployee[5] ;
    for(int i = 0 ; i<2 ; i++)
    {   System.out.println("For Employee "+(i+1));
        System.out.println("Enter the name ");
        if(i!=0)
        in.nextLine() ;
        name = in.nextLine() ;
        System.out.println("Enter the id ");
        id =in.next() ; 
        System.out.println("Enter the age");
        age =in.nextInt() ;
        System.out.println("Enter the salary");
        salary = in.nextDouble() ; 
        if(max<salary)
        {
            maxid = i ; 
            max = salary+2000 ;
        }
        System.out.println("Is employee permant press 1 for yes and 0 for no");
        is_permant = in.nextInt() ; 
        if(is_permant==1)
        {
            employee[i] = new PermantEmp(name , id , age, salary+2000) ; 
        }
        else{
            employee[i] = new ContractEmp(name , id ,age , salary) ;
        }
    }
    System.out.println("The person with highest salary is "+employee[maxid].getname());
    System.out.println("His/Her id is "+employee[maxid].getid());
    System.out.println("His/Her salary is "+max);
    System.out.println("His/her age is "+employee[maxid].getage());
   }
} 