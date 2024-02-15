import java.util.Scanner;
public class FractionCalculator {
    private int numerator;
    private int denominator;

    FractionCalculator(int numerator, int denominator) {
        if (denominator == 0) {
            System.out.println("Denominator cannot be zero :");
            return;
        }
        this.numerator = numerator;
        this.denominator = denominator;
        simply();
    }

    FractionCalculator() {
        this.numerator = 1;
        this.denominator = 1;
    }

    private void simply() {
        int gcd = findGcd(Math.abs(this.numerator), Math.abs(this.denominator));
        this.numerator = numerator / gcd;
        this.denominator = denominator / gcd;
        if (this.denominator < 0) {
            this.numerator = -this.numerator;
            this.denominator = -this.denominator;
        }
    }

    private int findGcd(int a, int b) {
        if (b == 0)
            return a;
        return findGcd(b, a % b);
    }

    public FractionCalculator addReturn(FractionCalculator other) {
        int num = this.numerator * other.denominator + this.denominator * other.numerator;
        int den = this.denominator * other.denominator;
        return new FractionCalculator(num, den);
    }

    public void addPrint(FractionCalculator other) {
        FractionCalculator ans = this.addReturn(other);
        display(ans);
    }

    public void display() {
        System.out.print(String.format("%3d/%-3d", this.numerator, this.denominator));
    }

    static void display(FractionCalculator other) {
        System.out.println(String.format("%3d/%-3d", other.numerator, other.denominator));
    }

    public FractionCalculator subtractReturn(FractionCalculator other) {
        int num = this.numerator * other.denominator - this.denominator * other.numerator;
        int den = this.denominator * other.denominator;
        return new FractionCalculator(num, den);
    }

    public void subtractPrint(FractionCalculator other) {
        FractionCalculator ans = this.subtractReturn(other);
        display(ans);
    }

    public FractionCalculator multiplyReturn(FractionCalculator other) {
        int num = this.numerator * other.numerator;
        int den = this.denominator * other.denominator;
        return new FractionCalculator(num, den);
    }

    public void multiplyPrint(FractionCalculator other) {
        FractionCalculator ans = this.multiplyReturn(other);
        display(ans);
    }

    public FractionCalculator divideReturn(FractionCalculator other) {
        int num = this.numerator * other.denominator;
        int den = this.denominator * other.numerator;
        return new FractionCalculator(num, den);
    }

    public void dividePrint(FractionCalculator other) {
        FractionCalculator ans = this.divideReturn(other);
        display(ans);
    }

    public double getDouble() {
        return numerator / (double) denominator;
    }

    public void showDouble() {
        System.out.println(numerator / (double) denominator);
    }
    
    
     public void print(int n ){
        FractionCalculator [][]f = new FractionCalculator[n][n];
        f[0][0] = new FractionCalculator() ;
        for(int i = 1 ; i<n ; i++)
        {
            f[0][i] = new FractionCalculator(i,n) ;
            f[i][0] = new FractionCalculator(i,n) ;
        }
        for(int i = 0 ;i<n ; i++)
        {
            for(int j = 0 ; j<n ;j++)
                f[i][j] =f[i][0].multiplyReturn(f[0][j]) ;
        }
        for(int i = 0 ; i<n ; i++)
        {
            for(int j =0 ;j<n ; j++)
            {
                if(i==0&&j==0)
                    System.out.print("       ");
                else
                    f[i][j].display();
            }
            System.out.println();
        }
    }
    
    public void Showmenu(){
    Scanner in = new Scanner(System.in) ; 
    int opt ;
    System.out.println("Enter the option that you want to do") ; 
    System.out.println("1.Add") ; 
    System.out.println("2.Substact") ; 
    System.out.println("3.Multiply") ; 
    System.out.println("4.Divide") ;
    System.out.println("5
    
   
    }
}

public class fractionTable {
    public static void main(String[] args) {
       
    }
}
