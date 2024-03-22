	class Employee {           /* class Employee with salary */
     double salary =10000  ;
     
     double getsalary(){    /* getter method for getsalary */
        return 10000 ; 
     }
		
     double getbonus(){
      return 0 ; 
     }
     
     void getsalarywithbonus(){    /*get salary with bonus */
     System.out.println("Salary with bonus is "+(getsalary()+getbonus())) ; 
     }
	}
	
	
	class Intern extends Employee {   /* class Intern that extends employee class */
	double salary  ;           /* attribute salary */

    double getsalary(){        /*overriden method of getsalary() and getbonus() and getsalarywithbonus() */
    this.salary = super.salary * 0.75 ; 
    return salary ;
    }
    
    double getbonus(){
    return 1000 ;  
    }
    
     void getsalarywithbonus(){
     System.out.println("Salary with bonus is "+(getsalary()+getbonus())) ; 
     }
	}
	
	
	
	class Clerk extends Employee {      /*class Clerk that extends Employee class */
	double salary  ; 

  
    double getsalary(){
    this.salary = super.salary * 0.5 ; 
    return salary ; 
    }
    
    double getbonus(){
    return 500 ;  
    }
    
     void getsalarywithbonus(){
     System.out.println("Salary with bonus is "+(getsalary()+getbonus())) ; 
     }
	}
	
	
	class Manager extends Employee {   /*class Manager that extends employee class */
	double salary  ; 
	
    double getsalary(){
    this.salary = super.salary * 2 ; 
    return salary ;  
    }
    
    double getbonus(){
    return 2000 ;  
    }
    
    void getsalarywithbonus(){
     System.out.println("Salary with bonus is "+(getsalary()+getbonus())) ; 
     }
	}
	
	
	/*all above class that are extending the employee class have only difference in the salary and bonus */
	class Main{
	
	public static void main (String []args) {
	  /* created objects of all the above classes and called the different methods */
	 Employee e = new Employee() ; 
	 System.out.println("Employee salary is "+ e.getsalary()) ; 
	 System.out.println("Employee has got bonus of "+e.getbonus()) ; 
	 e.getsalarywithbonus() ;
	 Intern i = new Intern() ; 
	  System.out.println("Intern salary is "+ i.getsalary()) ; 
	 System.out.println("Intern has got bonus of "+i.getbonus()) ; 
	 i.getsalarywithbonus() ;
	 Clerk c = new Clerk() ;
	  System.out.println("Clerk salary is "+ c.getsalary()) ; 
	 System.out.println("Clerk has got bonus of "+c.getbonus()) ; 
	 c.getsalarywithbonus() ;
	 Manager m = new Manager() ;
	  System.out.println("Manager salary is "+ m.getsalary()) ; 
	 System.out.println("Manager has got bonus of "+m.getbonus()) ; 
	m.getsalarywithbonus() ;
    }
   
	}
	
	
