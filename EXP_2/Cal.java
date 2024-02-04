import java.util.Scanner;

class Calculator {
    private double a;
    private double b;

    Calculator(double a, double b) {
        this.a = a;
        this.b = b;
    }

    void add() {
        System.out.println("The ans is " + (a + b));
    }

    void sub() {
        System.out.println("The ans is " + (a - b));
    }

    void multiply() {
        System.out.println("The ans is " + (a * b));
    }

    void Divide() {
        System.out.println("The ans is " + (a / b));
    }
}

public class Cal {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int ch;

        do {
            System.out.println("Enter the first number:");
            double a = sc.nextDouble();
            System.out.println("Enter the second number:");
            double b = sc.nextDouble();
            Calculator c = new Calculator(a, b);
            System.out.println("What do you want to do ?");
            System.out.println("1.add\n2.subtract\n3.multiply\n4.divide\n5.exit");
            ch = sc.nextInt();

            switch (ch) {
                case 1:
                    c.add();
                    break;
                case 2:
                    c.sub();
                    break;
                case 3:
                    c.multiply();
                    break;
                case 4:
                    c.Divide();
                    break;
                case 5:
                    break;
                default:
                    System.out.println("Enter a valid number:");
            }
        } while (ch != 5);
    }
}
