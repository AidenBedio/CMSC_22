/**
 * Aiden Justin Bedio
 * Earl Timothy Malaki
 * Timothy River Paler
 * BSCS - II    |    CMSC - 22
 * Laboratory
 */

package lab8.inheritance;

public class ShapeTest {

    public static void main(String[] args) {

        Shape s1 = new Shape("RED", false);
        Shape s2 = new Shape();

        System.out.println(s1);
        System.out.println(s1.getColor());
        System.out.println("Filled status: "+s1.isFilled());

        System.out.println(s2);
        System.out.println(s2.getColor());
        System.out.println("Filled status: "+s2.isFilled());


        Shape c1 = new Circle();
        Shape c2 = new Circle(5.5, "green", true);
        System.out.println(c1);
        System.out.println(c2);
        System.out.println(c1.getColor());
        System.out.println(c2.getColor());
        System.out.println(c1.isFilled());
        System.out.println(c2.isFilled());
        Circle c3 = (Circle) c1;
        Circle c4 = (Circle) c2;
        System.out.println(c3);
        System.out.println(c4);
        System.out.println(c3.getRadius());
        System.out.println(c4.getRadius());
        System.out.println(c3.getArea());
        System.out.println(c4.getArea());
        System.out.println(c3.getPerimeter());
        System.out.println(c4.getPerimeter());


        Shape r1 = new Rectangle();
        Shape r2 = new Rectangle(5, 3, "pink", true);
        System.out.println(r1);
        System.out.println(r2);
        System.out.println(r1.getColor());
        System.out.println(r2.getColor());
        System.out.println(r1.isFilled());
        System.out.println(r2.isFilled());
        Rectangle r3 = (Rectangle) r1;
        Rectangle r4 = (Rectangle) r2;
        System.out.println(r3);
        System.out.println(r4);
        System.out.println(r3.getLength());
        System.out.println(r4.getWidth());
        System.out.println(r3.getArea());
        System.out.println(r4.getArea());
        System.out.println(r3.getPerimeter());
        System.out.println(r4.getPerimeter());


        Shape sq1 = new Square();
        Shape sq2 = new Square(5, "blue", true);
        System.out.println(sq1);
        System.out.println(sq2);
        System.out.println(sq1.getColor());
        System.out.println(sq2.getColor());
        System.out.println(sq1.isFilled());
        System.out.println(sq2.isFilled());
        Square sq3 = (Square) sq1;
        Square sq4 = (Square) sq2;
        System.out.println(sq3);
        System.out.println(sq4);
        System.out.println(sq3.getLength());
        System.out.println(sq4.getWidth());
        System.out.println(sq3.getArea());
        System.out.println(sq4.getArea());
        System.out.println(sq3.getPerimeter());
        System.out.println(sq4.getPerimeter());


        Shape t1 = new Triangle();
        Shape t2 = new Triangle(20, 5, 5, "purple", true);
        System.out.println(t1);
        System.out.println(t2);
        System.out.println(t1.getColor());
        System.out.println(t2.getColor());
        System.out.println(t1.isFilled());
        System.out.println(t2.isFilled());
        Triangle t3 = (Triangle) t1;
        Triangle t4 = (Triangle) t2;
        System.out.println(t3);
        System.out.println(t4);
        System.out.println(t3.getArea());
        System.out.println(t4.getArea());
        System.out.println(t3.getPerimeter());
        System.out.println(t4.getPerimeter());

    }
}
