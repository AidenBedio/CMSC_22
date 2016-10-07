/**
 * Aiden Justin Bedio
 * Earl Timothy Malaki
 * Timothy River Paler
 * BSCS - II    |    CMSC - 22
 * Laboratory
 */


package lab8.inheritance;


public class Rectangle extends Shape {

    private double width = 1.0;
    private double length = 1.0;

    public Rectangle(){
        width = 1.0;
        length = 1.0;
    }

    public Rectangle(double width, double length){
        super();
        this.width = width;
        this.length = length;

    }

    public Rectangle(double width, double length, String color, boolean filled){
        super(color, filled);
        this.width = width;
        this.length = length;
    }

    public double getWidth() {
        return width;
    }

    public void setWidth(double width) {
        this.width = width;
    }

    public double getLength() {
        return length;
    }

    public void setLength(double length) {
        this.length = length;
    }

    public double getPerimeter(){
        return (2 * length) + (2 * width);
    }

    public double getArea(){
        return length * width;
    }

    public String toString(){
        return String.format("A Rectangle with width=%.2f and length=%.2f, which is a subclass of %s", width, length, super.toString());
    }


}
