import java.awt.Color;
import java.awt.Graphics2D;
import java.awt.Rectangle;
import java.awt.event.KeyEvent;

public class Racquet {
    
    private static final int WIDTH = 100;
    private static final int HEIGHT = 10;
    private int widthVar = 0;
    
    int y = 0;
    int x = 0;
    int xa = 0;
    
    int score = 0;
    String player;
    private Game game;
    
    private int speedPowerCnt = 0;
    private int lengthPowerCnt = 0;
    
    //state, conditions of power ups
    private int state = 0;
    /*
        state 0 = normal
        state 1 = speed;
        state 2 = length;
        state 3 = speed + length;
    */
    
    
    public Racquet(Game game, String player, Ball ball){
        this.game= game;
        if (player.equals("Player 1")){
            x = 380;
            y = 550;
        }
        else{
            x = 15;
            y = 10;
        }
        
        this.player = player;
        
    }
    
    //move logic of racquet
    public void move(){
        if(x + xa > 0 && x + xa < game.getWidth()- (WIDTH + widthVar))
            x = x + xa;
    }
    
    //overide paint call for the racquet
    public void paint(Graphics2D g){
        Graphics2D g2d = (Graphics2D) g;
        
        if (getState() == 0){
            g2d.setColor(Color.WHITE);
            g.fillRect(x, y, WIDTH, HEIGHT);
        }
        
        else if (getState() == 1){
            g2d.setColor(Color.YELLOW);
            g.fillRect(x, y, WIDTH, HEIGHT);
        }
        
        else if (getState() == 2){
            widthVar = 50;
            if (x + widthVar + WIDTH > game.getWidth()){
                x -=widthVar;
            }
            g2d.setColor(Color.CYAN);
            g.fillRect(x, y, (WIDTH + widthVar), HEIGHT);
        }
        
        else if (getState() == 3){
            widthVar = 50;
            if (x + widthVar + WIDTH > game.getWidth()){
                x -=widthVar;
            }
            g2d.setColor(Color.MAGENTA);
            g.fillRect(x, y, WIDTH + (widthVar), HEIGHT);
        }
        
    }
    
    
    //event listener 
    public void keyReleased(KeyEvent e){
        if (!(e.getKeyCode() == KeyEvent.VK_J || e.getKeyCode() == KeyEvent.VK_K ||
                e.getKeyCode() == KeyEvent.VK_X || e.getKeyCode() == KeyEvent.VK_Z ))
            xa = 0;

    }
    
    public void keyPressed(KeyEvent e){
        
        if (player.equals("Player 1")){
            if (e.getKeyCode() == KeyEvent.VK_LEFT)
                xa = -game.speed;
            if (e.getKeyCode() == KeyEvent.VK_RIGHT)
                xa = game.speed;
            if (e.getKeyCode() == KeyEvent.VK_J){
                if (speedPowerCnt == 3){
                    if (getState() == 2){
                        Sound.SLPOW.play();
                        state = 3;
                    }
                    else{
                        Sound.SPEEDPOW.play();
                        state = 1;
                    }
                    
                    speedPowerCnt = 0;
                }
            }
            
            if (e.getKeyCode() == KeyEvent.VK_K){
                if (lengthPowerCnt == 3){
                    if (getState() == 1){
                        Sound.SLPOW.play();
                        state = 3;
                    }
                    else{
                        Sound.LENPOW.play();
                        state = 2;
                    }
                    lengthPowerCnt = -3;
                }
            }
                
        }
        
        else if (player.equals("Player 2")){
            if (e.getKeyCode() == KeyEvent.VK_A)
                xa = -game.speed;
            if (e.getKeyCode() == KeyEvent.VK_D)
                xa = game.speed;
            if (e.getKeyCode() == KeyEvent.VK_Z){
                if (speedPowerCnt == 3){
                    if (getState() == 2){
                        Sound.SLPOW.play();
                        state = 3;
                    }
                    else{
                        Sound.SPEEDPOW.play();
                        state = 1;
                    }
                    
                    speedPowerCnt = 0;
                }
            }
            
            if (e.getKeyCode() == KeyEvent.VK_X){
                if (lengthPowerCnt == 3){
                    if (getState() == 1){
                        Sound.SLPOW.play();
                        state = 3;
                    }
                    else{
                        Sound.LENPOW.play();
                        state = 2;
                    }
                    lengthPowerCnt = -3;
                }
            }
        }
        
        
    }
    
    //returns a collision box with same size and location as the racquet
    public Rectangle getBounds(){
        return new Rectangle(x, y, (WIDTH + widthVar), HEIGHT);
    }
    
    //returns the position y to get the ball out of the collision box (after collision)
    public int getTopY(){
        return y;
    }
    
    public int getBottomY(){
        return y + HEIGHT;
    }
    
    public int getScore(){
        return score;
    }
    
    public void setScore(){
        this.score++;
    }
    
    public void reset(){
        if (player.equals("Player 1")){
            x = 380;
            y = 550;
        }
        else{
            x = 15;
            y = 10;
        }
        
        state = 0;
        speedPowerCnt = 0;
        lengthPowerCnt = 0;
        widthVar = 0;
    }
    
    public void resetXA(){
        xa = 0;
    }
    
    public int getState(){
        return state;
    }
     
    public int getspeedPowCnt(){
        return speedPowerCnt;
    }
    
    public int getlengthPowCnt(){
        return lengthPowerCnt;
    }
    
    public void setSpeedCnt(){
        if (speedPowerCnt != 3)
            speedPowerCnt++;
    }
    
    public void setLenCnt(){
        if (lengthPowerCnt != 3)
            lengthPowerCnt++;
    }
    
    public void StateFix(){
        
        
        if (lengthPowerCnt < 0){
            state = 2;
        }
        else{
            Sound.NORMALSTATE.play();
            widthVar = 0;
            state = 0;
        }
            
    }
    
}
