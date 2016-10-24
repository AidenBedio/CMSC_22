///////////////////////////////////////////////////////////////////////////////////////Bedio Programming(c)///////////////////
////////////////////////////////////////////////////////////////////////////////////////9/24/16//////////////////////////
import java.util.Random;
import javax.swing.JOptionPane;

public class Gui extends javax.swing.JFrame {
    
    private String playerPick;
    private int playerScore = 0;
    private int aiScore = 0;

    public Gui() {
        initComponents();
        playerPick = "ROCK";
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        pickGroup = new javax.swing.ButtonGroup();
        gamePanel = new javax.swing.JPanel();
        Pick = new javax.swing.JLabel();
        Rock = new javax.swing.JRadioButton();
        Paper = new javax.swing.JRadioButton();
        Scissors = new javax.swing.JRadioButton();
        Lizard = new javax.swing.JRadioButton();
        Spock = new javax.swing.JRadioButton();
        Flavor = new javax.swing.JTextArea();
        RPSLS = new javax.swing.JButton();
        lblP1 = new javax.swing.JLabel();
        lblP2 = new javax.swing.JLabel();
        PlayerScore = new javax.swing.JTextField();
        AIScore = new javax.swing.JTextField();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setLocation(new java.awt.Point(400, 150));
        setMaximumSize(new java.awt.Dimension(500, 400));
        setMinimumSize(new java.awt.Dimension(500, 400));
        setPreferredSize(new java.awt.Dimension(500, 400));
        setSize(new java.awt.Dimension(500, 400));
        getContentPane().setLayout(null);

        gamePanel.setMaximumSize(new java.awt.Dimension(500, 400));
        gamePanel.setMinimumSize(new java.awt.Dimension(500, 400));
        gamePanel.setPreferredSize(new java.awt.Dimension(500, 400));

        Pick.setFont(new java.awt.Font("Courier New", 1, 18)); // NOI18N
        Pick.setText("Pick :");

        pickGroup.add(Rock);
        Rock.setSelected(true);
        Rock.setText("Rock");
        Rock.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                RockActionPerformed(evt);
            }
        });

        pickGroup.add(Paper);
        Paper.setText("Paper");
        Paper.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                PaperActionPerformed(evt);
            }
        });

        pickGroup.add(Scissors);
        Scissors.setText("Scissors");
        Scissors.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                ScissorsActionPerformed(evt);
            }
        });

        pickGroup.add(Lizard);
        Lizard.setText("Lizard");
        Lizard.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                LizardActionPerformed(evt);
            }
        });

        pickGroup.add(Spock);
        Spock.setText("Spock");
        Spock.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                SpockActionPerformed(evt);
            }
        });

        Flavor.setColumns(20);
        Flavor.setRows(5);
        Flavor.setFocusable(false);

        RPSLS.setText("RockPaperScissorLizardSpock!");
        RPSLS.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                RPSLSActionPerformed(evt);
            }
        });

        lblP1.setText("Player's Score");

        lblP2.setText("Computer's Score");

        PlayerScore.setFocusable(false);

        AIScore.setFocusable(false);

        javax.swing.GroupLayout gamePanelLayout = new javax.swing.GroupLayout(gamePanel);
        gamePanel.setLayout(gamePanelLayout);
        gamePanelLayout.setHorizontalGroup(
            gamePanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(gamePanelLayout.createSequentialGroup()
                .addGap(46, 46, 46)
                .addGroup(gamePanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(gamePanelLayout.createSequentialGroup()
                        .addGap(16, 16, 16)
                        .addGroup(gamePanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(lblP1, javax.swing.GroupLayout.PREFERRED_SIZE, 93, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(lblP2))
                        .addGap(39, 39, 39)
                        .addGroup(gamePanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(PlayerScore, javax.swing.GroupLayout.DEFAULT_SIZE, 75, Short.MAX_VALUE)
                            .addComponent(AIScore))
                        .addGap(0, 0, Short.MAX_VALUE))
                    .addGroup(gamePanelLayout.createSequentialGroup()
                        .addGroup(gamePanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(Lizard)
                            .addComponent(Spock)
                            .addComponent(Pick, javax.swing.GroupLayout.PREFERRED_SIZE, 82, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(Paper)
                            .addComponent(Scissors))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 93, Short.MAX_VALUE)
                        .addComponent(Flavor, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(58, 58, 58))
                    .addGroup(gamePanelLayout.createSequentialGroup()
                        .addComponent(Rock)
                        .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))))
            .addGroup(gamePanelLayout.createSequentialGroup()
                .addGap(107, 107, 107)
                .addComponent(RPSLS, javax.swing.GroupLayout.PREFERRED_SIZE, 275, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, Short.MAX_VALUE))
        );
        gamePanelLayout.setVerticalGroup(
            gamePanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(gamePanelLayout.createSequentialGroup()
                .addGap(10, 10, 10)
                .addGroup(gamePanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(Flavor, javax.swing.GroupLayout.PREFERRED_SIZE, 187, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(gamePanelLayout.createSequentialGroup()
                        .addComponent(Pick, javax.swing.GroupLayout.PREFERRED_SIZE, 31, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(Rock)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(Paper)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(Scissors)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(Lizard)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(Spock)
                        .addGap(12, 12, 12)))
                .addGap(18, 18, 18)
                .addComponent(RPSLS)
                .addGap(18, 18, 18)
                .addGroup(gamePanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(PlayerScore, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(lblP1))
                .addGap(20, 20, 20)
                .addGroup(gamePanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lblP2, javax.swing.GroupLayout.PREFERRED_SIZE, 16, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(AIScore, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(41, Short.MAX_VALUE))
        );

        getContentPane().add(gamePanel);
        gamePanel.setBounds(0, 0, 500, 400);

        pack();
    }// </editor-fold>//GEN-END:initComponents
    
    
    private String AIMove(){
        String Move[] = {"ROCK", "PAPER", "SCISSORS", "LIZARD", "SPOCK"};
        int x = this.Random();
        
        return Move[x];
    }
    
    private int Random(){
        Random rand = new Random();
        int n = rand.nextInt(4) + 0;
        System.out.println(n);
        return n;
    }
    
    private void SpockActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_SpockActionPerformed
        playerPick = "SPOCK";
    }//GEN-LAST:event_SpockActionPerformed

    private void LizardActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_LizardActionPerformed
        playerPick = "LIZARD";
    }//GEN-LAST:event_LizardActionPerformed

    private void ScissorsActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_ScissorsActionPerformed
        playerPick = "SCISSORS";
    }//GEN-LAST:event_ScissorsActionPerformed

    private void PaperActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_PaperActionPerformed
        playerPick = "PAPER";
    }//GEN-LAST:event_PaperActionPerformed

    private void RockActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_RockActionPerformed
        playerPick = "ROCK";
    }//GEN-LAST:event_RockActionPerformed

    private void RPSLSActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_RPSLSActionPerformed
        String aiMove = this.AIMove();
        String result = "";
        
        
        if (Rock.isSelected()){
            if (aiMove.equals("ROCK")){
                result = "THIS ROUND IS A DRAW";
            }
            else if (aiMove.equals("PAPER")){
                result = "YOU LOSE THIS ROUND";
                aiScore++;
                AIScore.setText(""+aiScore);
            }
            else if (aiMove.equals("SCISSORS")){
                playerScore++;
                PlayerScore.setText(""+playerScore);
                result = "YOU WIN THIS ROUND"; 
            }
            else if (aiMove.equals("LIZARD")){
                playerScore++;
                PlayerScore.setText(""+playerScore);
                result = "YOU WIN THIS ROUND";
            }
            else if (aiMove.equals("SPOCK")){
                aiScore++;
                AIScore.setText(""+aiScore);
                result = "YOU LOSE THIS ROUND";
            }
        }
        
        else if (Paper.isSelected()){
            if (aiMove.equals("ROCK")){
                playerScore++;
                PlayerScore.setText(""+playerScore);
                result = "YOU WIN THIS ROUND";
            }
            else if (aiMove.equals("PAPER")){
                result = "THIS ROUND IS A DRAW";
            }
            else if (aiMove.equals("SCISSORS")){
                aiScore++;
                AIScore.setText(""+aiScore);
                result = "YOU LOSE THIS ROUND";
            }
            else if (aiMove.equals("LIZARD")){
                aiScore++;
                AIScore.setText(""+aiScore);
                result = "YOU LOSE THIS ROUND";
            }
            else if (aiMove.equals("SPOCK")){
                playerScore++;
                PlayerScore.setText(""+playerScore);
                result = "YOU WIN THIS ROUND";
            }
        }
        
        else if (Scissors.isSelected()){
            if (aiMove.equals("ROCK")){
                aiScore++;
                AIScore.setText(""+aiScore);
                result = "YOU LOSE THIS ROUND";
            }
            else if (aiMove.equals("PAPER")){
                playerScore++;
                PlayerScore.setText(""+playerScore);
                result = "YOU WIN THIS ROUND";
            }
            else if (aiMove.equals("SCISSORS")){
                result = "THIS ROUND I A DRAW";
            }
            else if (aiMove.equals("LIZARD")){
                playerScore++;
                PlayerScore.setText(""+playerScore);
                result = "YOU WIN THIS ROUND";
            }
            else if (aiMove.equals("SPOCK")){
                aiScore++;
                AIScore.setText(""+aiScore);
                result = "YOU LOSE THIS ROUND";
            }
        }
        
        else if (Lizard.isSelected()){
            if (aiMove.equals("ROCK")){
                aiScore++;
                AIScore.setText(""+aiScore);
                result = "YOU LOSE THIS ROUND";
            }
            else if (aiMove.equals("PAPER")){
                playerScore++;
                PlayerScore.setText(""+playerScore);
                result = "YOU WIN THIS ROUND";
            }
            else if (aiMove.equals("SCISSORS")){
                aiScore++;
                AIScore.setText(""+aiScore);
                result = "YOU LOSE THIS ROUND";
            }
            else if (aiMove.equals("LIZARD")){
                result = "THIS ROUND IS A DRAW";
            }
            else if (aiMove.equals("SPOCK")){
                playerScore++;
                PlayerScore.setText(""+playerScore);
                result = "YOU WIN THIS ROUND";
            }
        }
        
        else if (Spock.isSelected()){
            if (aiMove.equals("ROCK")){
                playerScore++;
                PlayerScore.setText(""+playerScore);
                result = "YOU WIN THIS ROUND";
            }
            else if (aiMove.equals("PAPER")){
                aiScore++;
                AIScore.setText(""+aiScore);
                result = "YOU LOSE THIS ROUND";
            }
            else if (aiMove.equals("SCISSORS")){
                playerScore++;
                PlayerScore.setText(""+playerScore);
                result = "YOU WIN THIS ROUND";
            }
            else if (aiMove.equals("LIZARD")){
                aiScore++;
                AIScore.setText(""+aiScore);
                result = "YOU LOSE THIS ROUND";
            }
            else if (aiMove.equals("SPOCK")){
                result = "THIS ROUND IS A DRAW";
            }
        }
        
        Flavor.setText("RESULTS:\n Player chose " + playerPick + "\n"
                        + "Computer chose "+ aiMove +
                    "\n\n" + result);
        
        if (playerScore == 5 || aiScore == 5){

            int restart = JOptionPane.showConfirmDialog(null,"Restart Game?", "GAME OVER", JOptionPane.YES_NO_OPTION);
            
            if (restart == 0){
                playerScore = 0;
                aiScore = 0;
                PlayerScore.setText(""+playerScore);
                AIScore.setText(""+aiScore);
                Flavor.setText("");
            }
        }
    }//GEN-LAST:event_RPSLSActionPerformed
    
    
    /**
     * @param args the command line arguments
     */
    public static void main(String args[]) {
        /* Set the Nimbus look and feel */
        //<editor-fold defaultstate="collapsed" desc=" Look and feel setting code (optional) ">
        /* If Nimbus (introduced in Java SE 6) is not available, stay with the default look and feel.
         * For details see http://download.oracle.com/javase/tutorial/uiswing/lookandfeel/plaf.html 
         */
        try {
            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
                if ("Nimbus".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException ex) {
            java.util.logging.Logger.getLogger(Gui.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Gui.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Gui.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Gui.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Gui().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JTextField AIScore;
    private javax.swing.JTextArea Flavor;
    private javax.swing.JRadioButton Lizard;
    private javax.swing.JRadioButton Paper;
    private javax.swing.JLabel Pick;
    private javax.swing.JTextField PlayerScore;
    private javax.swing.JButton RPSLS;
    private javax.swing.JRadioButton Rock;
    private javax.swing.JRadioButton Scissors;
    private javax.swing.JRadioButton Spock;
    private javax.swing.JPanel gamePanel;
    private javax.swing.JLabel lblP1;
    private javax.swing.JLabel lblP2;
    private javax.swing.ButtonGroup pickGroup;
    // End of variables declaration//GEN-END:variables
}
