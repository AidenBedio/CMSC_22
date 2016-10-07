/**
 * Aiden Justin Bedio
 * Earl Timothy Malaki
 * Timothy River Paler
 * BSCS - II    |    CMSC - 22
 * Laboratory
 */


package lab8.inheritance;

public class Shape {

    private String color;
    private boolean filled;

    public Shape(){
        color = "green";
        filled = true;
    }

    public Shape(String color, boolean filled){
        this.color = color;
        this.filled = filled;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public boolean isFilled() {
        return filled;
    }

    public void setFilled(boolean filled) {
        this.filled = filled;
    }

    public String toString(){
        String msg;
        if(filled)
            msg = String.format("A Shape with color of %s and filled", color);
        else
            msg = String.format("A Shape with color of %s and Not filled", color);

        return msg;
    }

}
