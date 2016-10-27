import java.awt.Color;
import java.awt.Graphics2D;
import java.awt.Rectangle;
import javax.swing.JOptionPane;


public class Ball {
    
    private static final int DIAMETER = 30;
    
    int x = 10;
    int y = 25;
    int xa = 1;
    int ya = 1;
    private Game game;
    
    private int bounce = 0;
    
    private int ballState = 0;
    
    public Ball(Game game){
        this.game = game;
    }
    
    //move logic of ball
    public void move(){
                
        if (x + xa < 0){
            xa = game.speed;
            Sound.WALLBOUNCE.play();
        }
            
        if (x + xa > game.getWidth() - DIAMETER){
            xa = -game.speed;
            Sound.WALLBOUNCE.play();
        }
            
      
        
        if (y + ya < 0){
            Sound.OUTOFBOUNDS.play();
            game.racquet2.setScore();
            game.racquet2.reset();
            game.racquet1.reset();
            x = 400;
            y = 500;
            game.scoreBoard();
            JOptionPane.showMessageDialog(game,"               PLAYER 1\n      WON THE ROUND !!!");
            Sound.BACK.loop();
        }
                
        if (y + ya > game.getHeight() - DIAMETER){
            Sound.OUTOFBOUNDS.play();
            game.racquet1.setScore();
            game.racquet1.reset();
            game.racquet2.reset();
            x = 10;
            y = 25;        
            game.scoreBoard();
            JOptionPane.showMessageDialog(game,"               PLAYER 2\n      WON THE ROUND !!!");
            Sound.BACK.loop();
        }
        
        if(collision1()){
            game.racquet1.setLenCnt();
            game.racquet1.setSpeedCnt();
            
            
            if (ballState == 1){
                ballState = 0;
                game.speed -= 2;
            }
            
            if(game.racquet1.getState() == 1 ||
                game.racquet1.getState() ==  3 ){
                Sound.SPEEDBOUNCE.play();
                game.speed += 4;
                ballState = 1;
                
            }
            else{
                Sound.PADDLEBOUNCE.play();
            }
            
            game.racquet1.StateFix();
            
            ya = -game.speed;
            y = game.racquet1.getTopY() - DIAMETER;
            
            bounce++;
            
            if(bounce % 3 == 0)
                game.speed++;
            
            
        }    
        if(collision2()){
            game.racquet2.setLenCnt();
            game.racquet2.setSpeedCnt();
            
            if (ballState == 1){
                ballState = 0;
                game.speed -= 2;
            }
            
            if(game.racquet2.getState() == 1 ||
                game.racquet2.getState() ==  3 ){
                Sound.SPEEDBOUNCE.play();
                game.speed += 4;
                ballState = 1;
                
            }
            else{
                Sound.PADDLEBOUNCE.play();
            }
            
            game.racquet2.StateFix();
            ya = game.speed;
            y = game.racquet2.getBottomY();
            
            bounce++;
            
            if(bounce % 3 == 0)
                game.speed++;
            
            
        }
        
        x = x + xa;
        y = y + ya;
    }
    
    //checks of the collision box of the racquet and the ball collided
    public boolean collision1(){
        return game.racquet1.getBounds().intersects(getBounds());
    }
    
    public boolean collision2(){
        return game.racquet2.getBounds().intersects(getBounds());
    }
       
    
    //returns the collison box of the circle
    public Rectangle getBounds(){
        return new Rectangle(x, y, DIAMETER, DIAMETER);
    }
    
    //over ride paint call for ball
    public void paint(Graphics2D g) {
        Graphics2D g2d = (Graphics2D) g;
        Color c;
        
        if (ballState == 0){
            g2d.setColor(Color.WHITE);
            g.fillOval(x, y, 30, 30);
        }
        else if (ballState == 1){
            g2d.setColor(Color.YELLOW);
            g.fillOval(x, y, 30, 30);
        }
        
        
    }
    
    public void resetXAYA(){
        if (game.racquet1.getScore() > game.racquet2.getScore()){
            xa = 1;
            ya = 1;
        }
        else{

            xa = -1;
            ya = -1;
        }
        
        ballState = 0;
        
    }
          

}
