/**
 * Aiden Justin Bedio
 * Earl Timothy Malaki
 * Timothy River Paler
 * BSCS - II    |    CMSC - 22
 * Laboratory
 */

package lab8.abstractClasses;


public class Triangle extends Shape {

    private double a;
    private double b;
    private double c;

    public Triangle() {
        a = 1.0;
        b = 1.0;
        c = 1.0;
    }

    public Triangle(int a, int b, int c) {
        if (a + b >= c && b + c >= a && a + c >= b) {
            this.a = a;
            this.b = b;
            this.c = c;
        } else {
            throw new IllegalArgumentException("Invalid sides.");
        }
    }

    public Triangle(int a, int b, int c, String color, boolean filled) {
        super(color, filled);
        if (a + b >= c && b + c >= a && a + c >= b) {
            this.a = a;
            this.b = b;
            this.c = c;
        } else {
            throw new IllegalArgumentException("Invalid sides.");
        }
    }


    public double getArea() {
        double s = getPerimeter() / 2;
        return Math.sqrt((s) * (s - a) * (s - b) * (s - c));
    }

    public double getPerimeter() {
        return a + b + c;
    }

    public double getA() {
        return a;
    }

    public void setA(double a) {
        this.a = a;
    }

    public double getB() {
        return b;
    }

    public void setB(double b) {
        this.b = b;
    }

    public double getC() {
        return c;
    }

    public void setC(double c) {
        this.c = c;
    }


    public String toString() {
        return String.format("A Triangle with sides = %.2f, %.2f, %.2f which is a subclass of %s", a, b, c, super.toString());
    }
}
