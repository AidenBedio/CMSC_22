/**
 * Aiden Justin Bedio
 * Earl Timothy Malaki
 * Timothy River Paler
 * BSCS - II    |    CMSC - 22
 * Laboratory
 */

package lab8.abstractClasses;

public class ShapeTest {

    public static void main(String[] args) {

        Shape s1 = new Circle(5.5, "RED", false);  // Upcast Circle to Shape
        System.out.println(s1);                    // which version?
        System.out.println(s1.getArea());          // which version?
        System.out.println(s1.getPerimeter());     // which version?
        System.out.println(s1.getColor());
        System.out.println(s1.isFilled());
//        System.out.println(s1.getRadius());
        // errs because the reference variable is a Shape object, and the getRadius method is unique to Circle class
        // thus it can't be called from the Shape reference
        // Need to downcast in order to access getRadius()

        Circle c1 = (Circle)s1;                   // Downcast back to Circle
        System.out.println(c1);
        System.out.println(c1.getArea());
        System.out.println(c1.getPerimeter());
        System.out.println(c1.getColor());
        System.out.println(c1.isFilled());
        System.out.println(c1.getRadius());

//        Shape s2 = new Shape();
        // errs because Shape is an abstract class, and one cannot create an object out of an abstract class

        Shape s3 = new Rectangle(1.0, 2.0, "RED", false);   // Upcast

        System.out.println(s3);
        System.out.println(s3.getArea());
        System.out.println(s3.getPerimeter());
        System.out.println(s3.getColor());
//        System.out.println(s3.getLength());
        // errs because the reference variable is a Shape object, and the getLength method is unique to Rectangle class
        // thus it can't be called from the Shape reference
        // Need to downcast in order to access getLength()

        Rectangle r1 = (Rectangle)s3;   // downcast
        System.out.println(r1);
        System.out.println(r1.getArea());
        System.out.println(r1.getColor());
        System.out.println(r1.getLength());

        Shape s4 = new Square(6.6);     // Upcast
        System.out.println(s4);
        System.out.println(s4.getArea());
        System.out.println(s4.getColor());
//        System.out.println(s4.getSide());
        // errs because the reference variable is a Shape object, and the getSide method is unique to Square class
        // thus it can't be called from the Shape reference
        // Need to downcast in order to access getSide()

// Take note that we downcast Shape s4 to Rectangle,
//  which is a superclass of Square, instead of Square
        Rectangle r2 = (Rectangle)s4;
        System.out.println(r2);
        System.out.println(r2.getArea());
        System.out.println(r2.getColor());
//        System.out.println(r2.getSide());
        System.out.println(r2.getLength());
        // errs because the reference variable is a Rectangle object, and the getSide method is unique to Square class
        // thus it can't be called from the Rectangle reference
        // Need to downcast to Square in order to access getLength()

// Downcast Rectangle r2 to Square
        Square sq1 = (Square)r2;
        System.out.println(sq1);
        System.out.println(sq1.getArea());
        System.out.println(sq1.getColor());
        System.out.println(sq1.getSide());
        System.out.println(sq1.getLength());


    }
}
