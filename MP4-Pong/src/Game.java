import java.awt.Color;
import java.awt.Font;
import java.awt.Graphics;
import java.awt.Graphics2D;
import java.awt.RenderingHints;
import java.awt.event.KeyEvent;
import java.awt.event.KeyListener;
import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.JOptionPane;

public class Game extends JPanel {
    
    //instantiation of a ball and racquet
    Ball ball = new Ball(this);
    Racquet racquet1 = new Racquet(this, "Player 1", ball);
    Racquet racquet2 = new Racquet(this, "Player 2",ball);
     
    int speed = 2;
    
    private int getScore(){
        return speed - 1;
    }
    
    //registration of the KeyListener that informs the racquet
    public Game(){
        
        
        
        addKeyListener(new KeyListener(){
           
            public void keyTyped(KeyEvent e){
                
            }
            
            public void keyReleased(KeyEvent e){
                if (e.getKeyCode() == KeyEvent.VK_LEFT || e.getKeyCode() == KeyEvent.VK_RIGHT
                        || e.getKeyCode() == KeyEvent.VK_J || e.getKeyCode() == KeyEvent.VK_K)
                    racquet1.keyReleased(e);
                else if (e.getKeyCode() == KeyEvent.VK_A || e.getKeyCode() == KeyEvent.VK_D
                        || e.getKeyCode() == KeyEvent.VK_Z || e.getKeyCode() == KeyEvent.VK_X)
                    racquet2.keyReleased(e);
            }
            
            public void keyPressed(KeyEvent e){
                if (e.getKeyCode() == KeyEvent.VK_LEFT || e.getKeyCode() == KeyEvent.VK_RIGHT
                        || e.getKeyCode() == KeyEvent.VK_J || e.getKeyCode() == KeyEvent.VK_K)
                    racquet1.keyPressed(e);
                else if (e.getKeyCode() == KeyEvent.VK_A || e.getKeyCode() == KeyEvent.VK_D
                        || e.getKeyCode() == KeyEvent.VK_Z || e.getKeyCode() == KeyEvent.VK_X)
                    racquet2.keyPressed(e);
            }
            
            
        });
        
        
        setBackground(Color.DARK_GRAY);
        setFocusable(true);
        Sound.BACK.loop();
    }
    
    
    //calling the move method of a ball and racquet
    private void move() throws InterruptedException{
        ball.move();
        racquet1.move();
        racquet2.move();
    }

    
    //called to paint what appears on the screen
    public void paint(Graphics g){
        
        super.paint(g);
        Graphics2D g2d = (Graphics2D) g;
        g2d.setColor(Color.BLACK);
        g2d.setRenderingHint(RenderingHints.KEY_ANTIALIASING,
                RenderingHints.VALUE_ANTIALIAS_ON);
        
        g2d.setColor(Color.GRAY);
        g2d.setFont(new Font("Verdana", Font.BOLD, 20));
        g2d.drawString(String.valueOf(racquet1.getScore()),10,270);
        g2d.drawString(String.valueOf(racquet2.getScore()),10,320);
        
        g2d.setFont(new Font("Verdana", Font.BOLD, 30));
        g2d.drawString("-----------------------------------",0,294);
        g2d.drawString("-----------------------------------",0,295);
        g2d.drawString("-----------------------------------",0,296);
     
        paintPowerUps(g2d);
        
        ball.paint(g2d);
        racquet1.paint(g2d);
        racquet2.paint(g2d);
        
        
    }
    
    public void paintPowerUps(Graphics2D g2d){
        
        if (racquet1.getspeedPowCnt() == 3 && 
                ((racquet2.getState() != 1) || racquet2.getState() != 3) ){
            g2d.setColor(Color.YELLOW);
            g2d.fillOval(460, 560, 10, 10);
        }
        
       if (racquet1.getlengthPowCnt() == 3 && 
                ((racquet2.getState() != 2) || racquet2.getState() != 3) ){
            g2d.setColor(Color.CYAN);
            g2d.fillOval(480, 560, 10, 10);
        }
        
        
        if (racquet2.getspeedPowCnt() == 3 && 
                ((racquet2.getState() != 1) || racquet2.getState() != 3) ){
            g2d.setColor(Color.YELLOW);
            g2d.fillOval(1, 1, 10, 10);
        }
        
       if (racquet2.getlengthPowCnt() == 3 && 
                ((racquet2.getState() != 2) || racquet2.getState() != 3) ){
            g2d.setColor(Color.CYAN);
            g2d.fillOval(20, 1, 10, 10);
        }
        
    }
    
    //to be called by the ball, pops up a menu saying "Game Over"
    public void gameOver(){
        Sound.BACK.stop();
        Sound.GAMEOVER.play();
        
        if (racquet1.getScore() > racquet2.getScore()){
            JOptionPane.showMessageDialog(this,"               PLAYER 2\n      WON THE GAME !!!");         
        }
        else if (racquet2.getScore() > racquet1.getScore()){
            JOptionPane.showMessageDialog(this,"               PLAYER 1\n      WON THE GAME !!!");
        }
        
        int choice = JOptionPane.showConfirmDialog(this,"Play Again?","Game Over",JOptionPane.YES_NO_OPTION);
        
        if (choice == 0){
            racquet1.score = 0;
            racquet2.score = 0;
            speed = 2;
            Sound.BACK.loop();
        }
        
        else{
            System.exit(ABORT);      
        }
               
    }
    
    public void scoreBoard(){
        Sound.BACK.stop();
        speed = 2;
        ball.resetXAYA();
        racquet1.resetXA();
        racquet2.resetXA();
        
    }
    
    public boolean checkScore(){
        if (racquet1.getScore() < 3 && racquet2.getScore() < 3){
            return true;
        }
        else 
            return false;
    }
    
    public static void main(String[] args) throws InterruptedException {
        
        //setting up the window/canvass 
        JFrame frame = new JFrame("Mini Tennis");
        Game game = new Game();
        frame.add(game);
        frame.setSize(500, 600);
        frame.setLocationRelativeTo(null);
        frame.setVisible(true);
        frame.setResizable(false);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        
        
        //the game loop
        while(true){
           
            while (game.checkScore()){
                game.move();
                game.repaint();
                Thread.sleep(5);
            }
            game.gameOver();            
        }
        
    }
    
}
