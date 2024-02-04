package com.exp2;

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
}
