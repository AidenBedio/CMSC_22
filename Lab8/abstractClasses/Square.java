/**
 * Aiden Justin Bedio
 * Earl Timothy Malaki
 * Timothy River Paler
 * BSCS - II    |    CMSC - 22
 * Laboratory
 */

package lab8.abstractClasses;

public class Square extends Rectangle {

    public Square(){
        super();
    }

    public Square(double side){
        super(side, side);
    }

    public Square(double side, String color, boolean filled){
        super(side, side, color, filled);
    }

    public double getSide(){
        return super.getWidth();
    }

    public void setSide(double side){
        super.setLength(side);
        super.setWidth(side);
    }

    public void setWidth(double side){
        super.setWidth(side);
        super.setLength(side);
    }

    public void setLength(double side){
        super.setWidth(side);
        super.setLength(side);
    }

    public String toString(){
        return String.format("A Square with side=%.2f, which is a subclass of %s", getLength(), super.toString());
    }


}
