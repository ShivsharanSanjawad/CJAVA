package com.exp6;

class vehicle{
    double milege ;
    double price ;

    vehicle(double milege , double price){
        this.milege = milege ;
        this.price = price ;
    }
    vehicle()
    {}

    public String toString() {
        String s = "milege=" + milege + "\nprice=" + price + '\n';
        return s ;
    }
}
class car extends vehicle{
    double ownershipCost ;
    double warranty ;
    int seatingCapacity ;
    String fuelType ;

    car(){}
    car(double ownershipCost , double warranty , int seatingCapacity ,String fuelType )
    {
        this.ownershipCost = ownershipCost ;
        this.warranty = warranty ;
        this.seatingCapacity = seatingCapacity ;
        this.fuelType = fuelType ;
    }
    car(double ownershipCost , double warranty , int seatingCapacity ,String fuelType , double milege , double price )
    {  super(milege , price) ;
        this.ownershipCost = ownershipCost ;
        this.warranty = warranty ;
        this.seatingCapacity = seatingCapacity ;
        this.fuelType = fuelType ;
    }
    public String toString() {
        String s =super.toString() +"Ownership cost :"+ownershipCost+"\nwarranty (in years) :"+warranty+"\nSeating capacity :"+seatingCapacity+"\nfuel type :"+fuelType+"\nmilege :"+milege+"\nprice :"+price+"\n" ;
        return s ;
    }

}

class Bike extends vehicle{
    int noCylinders ;
    int nogears ;
    String coolingType ;
    String wheelType ;
    double tankSize ;

    Bike()
    {}

    Bike(int noCylinders , int nogears , String coolingType , String wheelType ,double tankSize)
    {
        this.noCylinders = noCylinders ;
        this.nogears = nogears ;
        this.coolingType = coolingType ;
        this.wheelType = wheelType ;
        this.tankSize = tankSize ;
    }
    Bike(int noCylinders , int nogears , String coolingType , String wheelType ,double tankSize,double milege , double price)
    {   super(milege, price);
        this.noCylinders = noCylinders ;
        this.nogears = nogears ;
        this.coolingType = coolingType ;
        this.wheelType = wheelType ;
        this.tankSize = tankSize ;
    }
    public String toString() {
        String s =super.toString() +"number of Cylinders :"+noCylinders+"\nnumber of gears :"+nogears+"\ncooling type :"+coolingType+"\nwheel type :"+wheelType+"\nfuel tank size :"+tankSize+"\n" ;
        return s ;
    }
}
class Audi extends car {
    String modelType ;
    Audi(){}
    Audi(double ownershipCost , double warranty , int seatingCapacity ,String fuelType , double milege , double price ,String modelType )
    {
        super(ownershipCost , warranty , seatingCapacity ,fuelType , milege ,  price ) ;
        this.modelType = modelType ;
    }
    Audi(String modelType){
        this.modelType = modelType ;
    }
    public String toString() {
        String s =super.toString() +"model type :"+modelType ;
        return s ;
    }
}
class Ford extends car
{
    String modelType ;
    Ford(){}
    Ford(double ownershipCost , double warranty , int seatingCapacity ,String fuelType , double milege , double price ,String modelType )
    {
        super(ownershipCost , warranty , seatingCapacity ,fuelType , milege ,  price ) ;
        this.modelType = modelType ;
    }
    Ford(String modelType){
        this.modelType = modelType ;
    }
    public String toString() {
        String s =super.toString() +"model type :"+modelType ;
        return s ;
    }
}
class Bajaj extends Bike{
    String modelType ;
    Bajaj(int noCylinders , int nogears , String coolingType , String wheelType ,double tankSize,double milege , double price, String modelType)
    {
        super(noCylinders,nogears,coolingType,wheelType,tankSize,milege,price) ;
        this.modelType = modelType ;
    }
    Bajaj(){}
    public String toString() {
        String s =super.toString() +"model type :"+modelType ;
        return s ;
    }

}
class TVS extends Bike{
    String modelType ;
    TVS(int noCylinders , int nogears , String coolingType , String wheelType ,double tankSize,double milege , double price, String modelType)
    {
        super(noCylinders,nogears,coolingType,wheelType,tankSize,milege,price) ;
        this.modelType = modelType ;
    }
    TVS(){}

    public String toString() {
        String s =super.toString() +"model type :"+modelType ;
        return s ;
    }
}

public class Test {
    public static void main(String[] args) {
        Ford f = new Ford(3500000,20,5,"Diesel",12,3000000,"Endeavour") ;
        System.out.println("\nFord :\n"+f);
        Audi a = new Audi(4500000,2,5,"Petrol",14,4200000,"Q5") ;
        System.out.println("\nAudi :\n"+a);
        Bajaj b = new Bajaj(1,5,"Air cooled","Alloy wheels",15,50,115000,"Puslar 150") ;
        System.out.println("\nBajaj :\n"+b);
        TVS t = new TVS(1,5,"Air cooled","alloy",10,67,100000,"Raider");
        System.out.println("\nTVS :\n"+t);
    }
}
