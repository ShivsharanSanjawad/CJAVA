
class A{
  void hi(){
      System.out.println("Hi") ;
    }
    void by(){
        System.out.println("ki");
    }
    int a =10 ;
}
class B extends A{
    void hi(){
        System.out.println("by") ;
    }
    int a = 40 ;
}
public class  Demo {
    public static void main(String[] args) {
       A b = new B() ;
        b.hi();
        A a = new A() ;

        //a.hi() ;
        B c = new B() ;
        c.hi() ;
        System.out.println(c.a);
    }
}
