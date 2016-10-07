
/*
 * Aiden Justin Bedio
 * Earl Timothy Malaki
 * Timothy River Paler
 * CMSC22 - Lab Act. # 7
 *
 */


import java.awt.Color;
import java.util.*;

public class Menu extends javax.swing.JFrame {

    RPGCharacter playerhero;
    RPGCharacter monster;
    int turnCounter = 1;
    int potionCost = 100;

    public Menu() {
        initComponents();
        this.rand = new Random();
    }

        private Random rand = new Random();
        private int heroChoice;
        private String playerName;
        private int dodge;


        /*** Random monster name generator ***/
        public String getRandomMonsterName() {
            String[] monsters = {"Ogre", "Slime", "Witch"};
            List<String> mons = Arrays.asList(monsters);

            return mons.get(randInt(0, mons.size() - 1));
        }

        public String getRandomAdjective() {
            String[] adjectives = {"Green", "Slimy", "Bloody", "Smelly"};
            List<String> adjs = Arrays.asList(adjectives);

            return adjs.get(randInt(0, adjs.size() - 1));
        }
        /*** Random monster name generator ***/
        

//        Generate random level for next-level monster
//        possible level of monster is hero level + or - 2
        public int getRandomLevel(int level) {
          int min, max;
          if (level < 3)
          {
            min = level;
            max = level + 2;
          }
          else
          {
            min = level - 2;
            max = level + 2;
          }

          return randInt(min, max);
        }

//        Generate random integer, inclusive min - max
        public int randInt(int min, int max) {
            int randomNum = rand.nextInt((max - min) + 1) + min;
            return randomNum;
        }
        

//        true == hit
        public boolean hitMiss(RPGCharacter defender) {

            if(defender.getDodge() + randInt(0, 5) >= 7){
                return false;
            }

            return true;
        }
        


        // pause the game for awhile for dramatic effect!
        public void sleep(int x) {
            try {
                Thread.sleep(x);
            } catch (InterruptedException ex) {
                Thread.currentThread().interrupt();
            }
        }

        public void GameLoop(){

        }



    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        AvatarSelection = new javax.swing.JFrame();
        Title = new javax.swing.JLabel();
        Warrior = new javax.swing.JRadioButton();
        Assassin = new javax.swing.JRadioButton();
        Mage = new javax.swing.JRadioButton();
        Name = new javax.swing.JLabel();
        FlavorText = new javax.swing.JLabel();
        btnOKAvatar = new javax.swing.JButton();
        WarriorIcon = new javax.swing.JLabel();
        AssassinIcon = new javax.swing.JLabel();
        MageIcon = new javax.swing.JLabel();
        NameField = new javax.swing.JTextField();
        Lounge = new javax.swing.JFrame();
        HeroClasslbl = new javax.swing.JLabel();
        HeroNamelbl = new javax.swing.JLabel();
        hplbl = new javax.swing.JLabel();
        maxHplbl = new javax.swing.JLabel();
        mplbl = new javax.swing.JLabel();
        maxMplbl = new javax.swing.JLabel();
        hpProglbl = new javax.swing.JProgressBar();
        mpProglbl = new javax.swing.JProgressBar();
        expProglbl = new javax.swing.JProgressBar();
        exp = new javax.swing.JLabel();
        expgauge = new javax.swing.JLabel();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        btnOKLounge = new javax.swing.JButton();
        battle = new javax.swing.JRadioButton();
        shop = new javax.swing.JRadioButton();
        shoplbl = new javax.swing.JLabel();
        battlelbl = new javax.swing.JLabel();
        lvllbl = new javax.swing.JLabel();
        levelnumber = new javax.swing.JLabel();
        btnUseHP = new javax.swing.JButton();
        btnUseMP = new javax.swing.JButton();
        jLabel12 = new javax.swing.JLabel();
        lblXMP = new javax.swing.JLabel();
        iconHP = new javax.swing.JLabel();
        iconMP = new javax.swing.JLabel();
        lblXHP = new javax.swing.JLabel();
        Arena = new javax.swing.JFrame();
        mpProg = new javax.swing.JProgressBar();
        mp = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        maxMp = new javax.swing.JLabel();
        hp = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        maxHp = new javax.swing.JLabel();
        hpProg = new javax.swing.JProgressBar();
        jLabel7 = new javax.swing.JLabel();
        lvl = new javax.swing.JLabel();
        HeroClass = new javax.swing.JLabel();
        HeroName = new javax.swing.JLabel();
        monHp = new javax.swing.JLabel();
        jLabel9 = new javax.swing.JLabel();
        monMaxHp = new javax.swing.JLabel();
        monHpProg = new javax.swing.JProgressBar();
        jLabel10 = new javax.swing.JLabel();
        monLvl = new javax.swing.JLabel();
        monName = new javax.swing.JLabel();
        Attack = new javax.swing.JRadioButton();
        Spell = new javax.swing.JRadioButton();
        Dodge = new javax.swing.JRadioButton();
        Flavor = new javax.swing.JLabel();
        Block = new javax.swing.JRadioButton();
        Spare = new javax.swing.JRadioButton();
        OkArena = new javax.swing.JButton();
        Turn = new javax.swing.JLabel();
        lblMissed = new javax.swing.JLabel();
        PlayerDeath = new javax.swing.JFrame();
        jLabel4 = new javax.swing.JLabel();
        PlayerDOK = new javax.swing.JButton();
        MonsterDeath = new javax.swing.JFrame();
        jLabel8 = new javax.swing.JLabel();
        MonsterDeathOK = new javax.swing.JButton();
        expGainedText = new javax.swing.JLabel();
        jLabel11 = new javax.swing.JLabel();
        LevelUpText = new javax.swing.JLabel();
        lblLevelUp = new javax.swing.JLabel();
        CreditsFrame = new javax.swing.JFrame();
        jLabel13 = new javax.swing.JLabel();
        jLabel14 = new javax.swing.JLabel();
        jLabel15 = new javax.swing.JLabel();
        jLabel16 = new javax.swing.JLabel();
        btnBackCreds = new javax.swing.JButton();
        ShopFrame = new javax.swing.JFrame();
        lblMoney = new javax.swing.JLabel();
        lblDesc = new javax.swing.JLabel();
        btnHPPotion = new javax.swing.JButton();
        btnMPPotion = new javax.swing.JButton();
        btnBack = new javax.swing.JButton();
        GameTitle = new javax.swing.JLabel();
        Start = new javax.swing.JRadioButton();
        Credits = new javax.swing.JRadioButton();
        Exit = new javax.swing.JRadioButton();
        btnOKMenu = new javax.swing.JButton();

        AvatarSelection.setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        AvatarSelection.setBackground(new java.awt.Color(153, 153, 153));
        AvatarSelection.setLocation(new java.awt.Point(300, 100));
        AvatarSelection.setMinimumSize(new java.awt.Dimension(700, 450));
        AvatarSelection.setResizable(false);
        AvatarSelection.setSize(new java.awt.Dimension(700, 450));
        AvatarSelection.getContentPane().setLayout(null);

        Title.setFont(new java.awt.Font("OCR A Std", 1, 18)); // NOI18N
        Title.setText("Choose Your Avatar");
        AvatarSelection.getContentPane().add(Title);
        Title.setBounds(230, 40, 234, 22);

        Warrior.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        Warrior.setText("Warrior");
        Warrior.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                WarriorActionPerformed(evt);
            }
        });
        AvatarSelection.getContentPane().add(Warrior);
        Warrior.setBounds(80, 270, 70, 23);

        Assassin.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        Assassin.setText("Assassin");
        Assassin.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                AssassinActionPerformed(evt);
            }
        });
        AvatarSelection.getContentPane().add(Assassin);
        Assassin.setBounds(310, 270, 76, 23);

        Mage.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        Mage.setText("Mage");
        Mage.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                MageActionPerformed(evt);
            }
        });
        AvatarSelection.getContentPane().add(Mage);
        Mage.setBounds(530, 270, 58, 23);

        Name.setFont(new java.awt.Font("OCR A Std", 1, 14)); // NOI18N
        Name.setText("Input Avatar's Name:");
        AvatarSelection.getContentPane().add(Name);
        Name.setBounds(100, 350, 250, 40);

        FlavorText.setMaximumSize(new java.awt.Dimension(255, 55));
        FlavorText.setMinimumSize(new java.awt.Dimension(255, 55));
        FlavorText.setPreferredSize(new java.awt.Dimension(255, 55));
        AvatarSelection.getContentPane().add(FlavorText);
        FlavorText.setBounds(79, 303, 392, 38);

        btnOKAvatar.setFont(new java.awt.Font("OCR A Std", 1, 14)); // NOI18N
        btnOKAvatar.setText("OK");
        btnOKAvatar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnOKAvatarActionPerformed(evt);
            }
        });
        AvatarSelection.getContentPane().add(btnOKAvatar);
        btnOKAvatar.setBounds(450, 360, 110, 50);

        WarriorIcon.setIcon(new javax.swing.ImageIcon(getClass().getResource("/icons/Warrior.png"))); // NOI18N
        WarriorIcon.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(0, 0, 0), 3, true));
        AvatarSelection.getContentPane().add(WarriorIcon);
        WarriorIcon.setBounds(50, 100, 156, 156);

        AssassinIcon.setIcon(new javax.swing.ImageIcon(getClass().getResource("/icons/Assassin.png"))); // NOI18N
        AssassinIcon.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(0, 0, 0), 3, true));
        AvatarSelection.getContentPane().add(AssassinIcon);
        AssassinIcon.setBounds(270, 100, 156, 156);

        MageIcon.setIcon(new javax.swing.ImageIcon(getClass().getResource("/icons/Mage.png"))); // NOI18N
        MageIcon.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(0, 0, 0), 3, true));
        AvatarSelection.getContentPane().add(MageIcon);
        MageIcon.setBounds(490, 100, 156, 156);

        NameField.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        NameField.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                NameFieldActionPerformed(evt);
            }
        });
        AvatarSelection.getContentPane().add(NameField);
        NameField.setBounds(150, 390, 193, 33);

        Lounge.setLocation(new java.awt.Point(300, 100));
        Lounge.setMinimumSize(new java.awt.Dimension(700, 450));
        Lounge.setResizable(false);
        Lounge.setSize(new java.awt.Dimension(700, 450));
        Lounge.addPropertyChangeListener(new java.beans.PropertyChangeListener() {
            public void propertyChange(java.beans.PropertyChangeEvent evt) {
                LoungePropertyChange(evt);
            }
        });
        Lounge.getContentPane().setLayout(null);

        HeroClasslbl.setFont(new java.awt.Font("OCR A Std", 1, 12)); // NOI18N
        HeroClasslbl.setText("CLASS:");
        Lounge.getContentPane().add(HeroClasslbl);
        HeroClasslbl.setBounds(30, 10, 110, 30);

        HeroNamelbl.setFont(new java.awt.Font("OCR A Std", 1, 12)); // NOI18N
        HeroNamelbl.setText("AIDEN");
        Lounge.getContentPane().add(HeroNamelbl);
        HeroNamelbl.setBounds(145, 10, 250, 30);

        hplbl.setText("100");
        Lounge.getContentPane().add(hplbl);
        hplbl.setBounds(113, 103, 24, 15);

        maxHplbl.setText("100");
        Lounge.getContentPane().add(maxHplbl);
        maxHplbl.setBounds(156, 103, 24, 15);

        mplbl.setText("100");
        Lounge.getContentPane().add(mplbl);
        mplbl.setBounds(114, 161, 24, 15);

        maxMplbl.setText("100");
        Lounge.getContentPane().add(maxMplbl);
        maxMplbl.setBounds(156, 161, 24, 15);

        hpProglbl.setBackground(new java.awt.Color(255, 0, 0));
        hpProglbl.setForeground(new java.awt.Color(255, 0, 0));
        hpProglbl.setRequestFocusEnabled(false);
        hpProglbl.setString("");
        hpProglbl.setStringPainted(true);
        Lounge.getContentPane().add(hpProglbl);
        hpProglbl.setBounds(40, 80, 148, 24);

        mpProglbl.setBackground(new java.awt.Color(0, 51, 255));
        mpProglbl.setForeground(new java.awt.Color(0, 51, 255));
        mpProglbl.setMaximumSize(new java.awt.Dimension(10, 14));
        mpProglbl.setString("");
        mpProglbl.setStringPainted(true);
        Lounge.getContentPane().add(mpProglbl);
        mpProglbl.setBounds(40, 140, 148, 24);

        expProglbl.setBackground(new java.awt.Color(102, 0, 204));
        expProglbl.setForeground(new java.awt.Color(153, 0, 204));
        expProglbl.setMaximumSize(new java.awt.Dimension(10, 14));
        expProglbl.setString("");
        expProglbl.setStringPainted(true);
        Lounge.getContentPane().add(expProglbl);
        expProglbl.setBounds(40, 200, 148, 24);

        exp.setText("100");
        Lounge.getContentPane().add(exp);
        exp.setBounds(114, 225, 24, 15);

        expgauge.setText("100");
        Lounge.getContentPane().add(expgauge);
        expgauge.setBounds(156, 225, 24, 15);

        jLabel1.setText("/");
        Lounge.getContentPane().add(jLabel1);
        jLabel1.setBounds(143, 103, 12, 15);

        jLabel2.setText("/");
        Lounge.getContentPane().add(jLabel2);
        jLabel2.setBounds(143, 161, 12, 15);

        jLabel3.setText("/");
        Lounge.getContentPane().add(jLabel3);
        jLabel3.setBounds(143, 225, 12, 15);

        btnOKLounge.setFont(new java.awt.Font("OCR A Std", 0, 13)); // NOI18N
        btnOKLounge.setText("OK");
        btnOKLounge.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnOKLoungeActionPerformed(evt);
            }
        });
        Lounge.getContentPane().add(btnOKLounge);
        btnOKLounge.setBounds(420, 340, 88, 44);

        battle.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        battle.setText(" BATTLE");
        battle.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                battleActionPerformed(evt);
            }
        });
        Lounge.getContentPane().add(battle);
        battle.setBounds(544, 257, 71, 22);

        shop.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        shop.setText(" SHOP");
        shop.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                shopActionPerformed(evt);
            }
        });
        Lounge.getContentPane().add(shop);
        shop.setBounds(316, 257, 58, 22);

        shoplbl.setIcon(new javax.swing.ImageIcon(getClass().getResource("/icons/shop.png"))); // NOI18N
        Lounge.getContentPane().add(shoplbl);
        shoplbl.setBounds(273, 89, 150, 150);

        battlelbl.setIcon(new javax.swing.ImageIcon(getClass().getResource("/icons/Battle.png"))); // NOI18N
        Lounge.getContentPane().add(battlelbl);
        battlelbl.setBounds(508, 89, 150, 150);

        lvllbl.setFont(new java.awt.Font("OCR A Std", 1, 12)); // NOI18N
        lvllbl.setText("LEVEL: ");
        Lounge.getContentPane().add(lvllbl);
        lvllbl.setBounds(30, 40, 70, 20);

        levelnumber.setFont(new java.awt.Font("OCR A Std", 1, 12)); // NOI18N
        levelnumber.setText("1");
        Lounge.getContentPane().add(levelnumber);
        levelnumber.setBounds(150, 40, 60, 20);

        btnUseHP.setFont(new java.awt.Font("OCR A Std", 0, 13)); // NOI18N
        btnUseHP.setText("USE");
        btnUseHP.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnUseHPActionPerformed(evt);
            }
        });
        Lounge.getContentPane().add(btnUseHP);
        btnUseHP.setBounds(200, 350, 97, 27);

        btnUseMP.setFont(new java.awt.Font("OCR A Std", 0, 13)); // NOI18N
        btnUseMP.setText("USE");
        btnUseMP.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnUseMPActionPerformed(evt);
            }
        });
        Lounge.getContentPane().add(btnUseMP);
        btnUseMP.setBounds(200, 390, 100, 27);

        jLabel12.setFont(new java.awt.Font("OCR A Std", 0, 13)); // NOI18N
        jLabel12.setText("INVENTORY:");
        Lounge.getContentPane().add(jLabel12);
        jLabel12.setBounds(30, 310, 90, 17);

        lblXMP.setText("X 4");
        Lounge.getContentPane().add(lblXMP);
        lblXMP.setBounds(130, 400, 53, 15);

        iconHP.setIcon(new javax.swing.ImageIcon(getClass().getResource("/icons/hp.jpg"))); // NOI18N
        iconHP.setText("jLabel15");
        iconHP.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        iconHP.setMaximumSize(new java.awt.Dimension(32, 32));
        iconHP.setMinimumSize(new java.awt.Dimension(32, 32));
        iconHP.setPreferredSize(new java.awt.Dimension(32, 32));
        Lounge.getContentPane().add(iconHP);
        iconHP.setBounds(60, 340, 30, 30);

        iconMP.setIcon(new javax.swing.ImageIcon(getClass().getResource("/icons/mp.jpg"))); // NOI18N
        iconMP.setText("jLabel16");
        iconMP.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        iconMP.setMaximumSize(new java.awt.Dimension(32, 32));
        iconMP.setMinimumSize(new java.awt.Dimension(32, 32));
        iconMP.setPreferredSize(new java.awt.Dimension(32, 32));
        iconMP.setSize(new java.awt.Dimension(32, 32));
        Lounge.getContentPane().add(iconMP);
        iconMP.setBounds(60, 390, 32, 32);

        lblXHP.setText("X 4");
        Lounge.getContentPane().add(lblXHP);
        lblXHP.setBounds(130, 350, 53, 15);

        Arena.setLocation(new java.awt.Point(300, 100));
        Arena.setMinimumSize(new java.awt.Dimension(700, 450));
        Arena.setResizable(false);
        Arena.setSize(new java.awt.Dimension(700, 450));
        Arena.addMouseMotionListener(new java.awt.event.MouseMotionAdapter() {
            public void mouseMoved(java.awt.event.MouseEvent evt) {
                ArenaMouseMoved(evt);
            }
        });
        Arena.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusGained(java.awt.event.FocusEvent evt) {
                ArenaFocusGained(evt);
            }
        });
        Arena.addPropertyChangeListener(new java.beans.PropertyChangeListener() {
            public void propertyChange(java.beans.PropertyChangeEvent evt) {
                ArenaPropertyChange(evt);
            }
        });
        Arena.getContentPane().setLayout(null);

        mpProg.setBackground(new java.awt.Color(0, 51, 255));
        mpProg.setForeground(new java.awt.Color(0, 51, 255));
        mpProg.setValue(100);
        mpProg.setMaximumSize(new java.awt.Dimension(10, 14));
        mpProg.setString("");
        mpProg.setStringPainted(true);
        Arena.getContentPane().add(mpProg);
        mpProg.setBounds(40, 170, 148, 24);

        mp.setFont(new java.awt.Font("OCR A Std", 1, 12)); // NOI18N
        mp.setText("100");
        Arena.getContentPane().add(mp);
        mp.setBounds(40, 200, 40, 16);

        jLabel5.setFont(new java.awt.Font("OCR A Std", 0, 13)); // NOI18N
        jLabel5.setText("/");
        Arena.getContentPane().add(jLabel5);
        jLabel5.setBounds(90, 200, 12, 17);

        maxMp.setFont(new java.awt.Font("OCR A Std", 1, 12)); // NOI18N
        maxMp.setText("100");
        Arena.getContentPane().add(maxMp);
        maxMp.setBounds(120, 200, 60, 16);

        hp.setFont(new java.awt.Font("OCR A Std", 1, 12)); // NOI18N
        hp.setText("100");
        Arena.getContentPane().add(hp);
        hp.setBounds(40, 140, 40, 16);

        jLabel6.setFont(new java.awt.Font("OCR A Std", 0, 13)); // NOI18N
        jLabel6.setText("/");
        Arena.getContentPane().add(jLabel6);
        jLabel6.setBounds(90, 140, 10, 16);

        maxHp.setFont(new java.awt.Font("OCR A Std", 1, 12)); // NOI18N
        maxHp.setText("100");
        Arena.getContentPane().add(maxHp);
        maxHp.setBounds(120, 140, 40, 16);

        hpProg.setBackground(new java.awt.Color(255, 0, 0));
        hpProg.setForeground(new java.awt.Color(255, 0, 0));
        hpProg.setRequestFocusEnabled(false);
        hpProg.setString("");
        hpProg.setStringPainted(true);
        Arena.getContentPane().add(hpProg);
        hpProg.setBounds(40, 110, 148, 24);

        jLabel7.setFont(new java.awt.Font("OCR A Std", 1, 12)); // NOI18N
        jLabel7.setText("Level: ");
        Arena.getContentPane().add(jLabel7);
        jLabel7.setBounds(40, 66, 70, 20);

        lvl.setFont(new java.awt.Font("OCR A Std", 1, 12)); // NOI18N
        lvl.setText("1");
        Arena.getContentPane().add(lvl);
        lvl.setBounds(150, 70, 60, 16);

        HeroClass.setFont(new java.awt.Font("OCR A Std", 1, 12)); // NOI18N
        HeroClass.setText("CLASS:");
        Arena.getContentPane().add(HeroClass);
        HeroClass.setBounds(39, 28, 100, 30);

        HeroName.setFont(new java.awt.Font("OCR A Std", 1, 12)); // NOI18N
        HeroName.setText("classname here");
        Arena.getContentPane().add(HeroName);
        HeroName.setBounds(140, 30, 131, 30);

        monHp.setFont(new java.awt.Font("OCR A Std", 1, 12)); // NOI18N
        monHp.setText("100");
        Arena.getContentPane().add(monHp);
        monHp.setBounds(530, 140, 50, 16);

        jLabel9.setFont(new java.awt.Font("OCR A Std", 1, 12)); // NOI18N
        jLabel9.setText("/");
        Arena.getContentPane().add(jLabel9);
        jLabel9.setBounds(580, 140, 12, 16);

        monMaxHp.setFont(new java.awt.Font("OCR A Std", 1, 12)); // NOI18N
        monMaxHp.setText("100");
        Arena.getContentPane().add(monMaxHp);
        monMaxHp.setBounds(600, 140, 40, 16);

        monHpProg.setBackground(new java.awt.Color(255, 0, 0));
        monHpProg.setForeground(new java.awt.Color(255, 0, 0));
        monHpProg.setValue(100);
        monHpProg.setRequestFocusEnabled(false);
        monHpProg.setString("");
        monHpProg.setStringPainted(true);
        Arena.getContentPane().add(monHpProg);
        monHpProg.setBounds(500, 110, 148, 24);

        jLabel10.setFont(new java.awt.Font("OCR A Std", 1, 12)); // NOI18N
        jLabel10.setText("Level: ");
        Arena.getContentPane().add(jLabel10);
        jLabel10.setBounds(470, 70, 70, 15);

        monLvl.setFont(new java.awt.Font("OCR A Std", 1, 12)); // NOI18N
        monLvl.setText("1");
        Arena.getContentPane().add(monLvl);
        monLvl.setBounds(570, 70, 70, 15);

        monName.setFont(new java.awt.Font("OCR A Std", 1, 12)); // NOI18N
        monName.setText("monstername here");
        Arena.getContentPane().add(monName);
        monName.setBounds(470, 30, 160, 30);

        Attack.setFont(new java.awt.Font("OCR A Std", 1, 12)); // NOI18N
        Attack.setText("ATTACK");
        Attack.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                AttackActionPerformed(evt);
            }
        });
        Arena.getContentPane().add(Attack);
        Attack.setBounds(300, 260, 79, 24);

        Spell.setFont(new java.awt.Font("OCR A Std", 1, 12)); // NOI18N
        Spell.setText("SPELL");
        Spell.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                SpellActionPerformed(evt);
            }
        });
        Arena.getContentPane().add(Spell);
        Spell.setBounds(190, 260, 70, 24);

        Dodge.setFont(new java.awt.Font("OCR A Std", 1, 12)); // NOI18N
        Dodge.setText("DODGE");
        Dodge.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                DodgeActionPerformed(evt);
            }
        });
        Arena.getContentPane().add(Dodge);
        Dodge.setBounds(190, 310, 70, 24);

        Flavor.setFont(new java.awt.Font("OCR A Std", 1, 12)); // NOI18N
        Flavor.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        Arena.getContentPane().add(Flavor);
        Flavor.setBounds(110, 190, 470, 45);

        Block.setFont(new java.awt.Font("OCR A Std", 1, 12)); // NOI18N
        Block.setText("BLOCK");
        Block.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                BlockActionPerformed(evt);
            }
        });
        Arena.getContentPane().add(Block);
        Block.setBounds(430, 310, 70, 24);

        Spare.setFont(new java.awt.Font("OCR A Std", 1, 12)); // NOI18N
        Spare.setText("SPARE");
        Spare.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                SpareActionPerformed(evt);
            }
        });
        Arena.getContentPane().add(Spare);
        Spare.setBounds(430, 260, 70, 24);

        OkArena.setFont(new java.awt.Font("OCR A Std", 1, 18)); // NOI18N
        OkArena.setText("OK");
        OkArena.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                OkArenaMouseClicked(evt);
            }
        });
        OkArena.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                OkArenaActionPerformed(evt);
            }
        });
        Arena.getContentPane().add(OkArena);
        OkArena.setBounds(300, 310, 90, 50);

        Turn.setFont(new java.awt.Font("OCR A Std", 0, 18)); // NOI18N
        Turn.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        Turn.setText("Turn 1");
        Arena.getContentPane().add(Turn);
        Turn.setBounds(280, 60, 120, 50);

        lblMissed.setFont(new java.awt.Font("OCR A Std", 3, 18)); // NOI18N
        lblMissed.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        lblMissed.setText("MISSED!");
        Arena.getContentPane().add(lblMissed);
        lblMissed.setBounds(280, 130, 110, 40);

        PlayerDeath.setLocation(new java.awt.Point(300, 100));
        PlayerDeath.setMinimumSize(new java.awt.Dimension(700, 450));

        jLabel4.setFont(new java.awt.Font("OCR A Std", 0, 48)); // NOI18N
        jLabel4.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel4.setText("Game Over!");

        PlayerDOK.setFont(new java.awt.Font("OCR A Std", 0, 24)); // NOI18N
        PlayerDOK.setText("OK");
        PlayerDOK.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                PlayerDOKActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout PlayerDeathLayout = new javax.swing.GroupLayout(PlayerDeath.getContentPane());
        PlayerDeath.getContentPane().setLayout(PlayerDeathLayout);
        PlayerDeathLayout.setHorizontalGroup(
            PlayerDeathLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(PlayerDeathLayout.createSequentialGroup()
                .addGroup(PlayerDeathLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(PlayerDeathLayout.createSequentialGroup()
                        .addGap(156, 156, 156)
                        .addComponent(jLabel4, javax.swing.GroupLayout.PREFERRED_SIZE, 383, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(PlayerDeathLayout.createSequentialGroup()
                        .addGap(290, 290, 290)
                        .addComponent(PlayerDOK, javax.swing.GroupLayout.PREFERRED_SIZE, 90, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(161, Short.MAX_VALUE))
        );
        PlayerDeathLayout.setVerticalGroup(
            PlayerDeathLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(PlayerDeathLayout.createSequentialGroup()
                .addGap(82, 82, 82)
                .addComponent(jLabel4, javax.swing.GroupLayout.PREFERRED_SIZE, 142, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(37, 37, 37)
                .addComponent(PlayerDOK, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(139, Short.MAX_VALUE))
        );

        MonsterDeath.setLocation(new java.awt.Point(300, 100));
        MonsterDeath.setMinimumSize(new java.awt.Dimension(700, 450));
        MonsterDeath.getContentPane().setLayout(null);

        jLabel8.setFont(new java.awt.Font("OCR A Std", 0, 36)); // NOI18N
        jLabel8.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel8.setText("Victory!");
        MonsterDeath.getContentPane().add(jLabel8);
        jLabel8.setBounds(156, 52, 383, 83);

        MonsterDeathOK.setFont(new java.awt.Font("OCR A Std", 0, 24)); // NOI18N
        MonsterDeathOK.setText("OK");
        MonsterDeathOK.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                MonsterDeathOKActionPerformed(evt);
            }
        });
        MonsterDeath.getContentPane().add(MonsterDeathOK);
        MonsterDeathOK.setBounds(295, 335, 103, 48);

        expGainedText.setFont(new java.awt.Font("OCR A Std", 0, 24)); // NOI18N
        expGainedText.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        expGainedText.setText("jLabel11");
        MonsterDeath.getContentPane().add(expGainedText);
        expGainedText.setBounds(240, 190, 210, 30);

        jLabel11.setFont(new java.awt.Font("OCR A Std", 0, 24)); // NOI18N
        jLabel11.setText("EXP Gained:");
        MonsterDeath.getContentPane().add(jLabel11);
        jLabel11.setBounds(250, 150, 187, 30);
        MonsterDeath.getContentPane().add(LevelUpText);
        LevelUpText.setBounds(340, 283, 192, 0);

        lblLevelUp.setFont(new java.awt.Font("OCR A Std", 0, 24)); // NOI18N
        lblLevelUp.setText("LEVEL UP!");
        MonsterDeath.getContentPane().add(lblLevelUp);
        lblLevelUp.setBounds(270, 260, 153, 30);

        CreditsFrame.setLocation(new java.awt.Point(300, 100));
        CreditsFrame.setMinimumSize(new java.awt.Dimension(700, 450));

        jLabel13.setFont(new java.awt.Font("OCR A Std", 0, 14)); // NOI18N
        jLabel13.setText("Aiden Justin Bedio\n"); // NOI18N
        jLabel13.setVerticalAlignment(javax.swing.SwingConstants.TOP);

        jLabel14.setFont(new java.awt.Font("OCR A Std", 0, 14)); // NOI18N
        jLabel14.setText("Timothy River Paler"); // NOI18N
        jLabel14.setVerticalAlignment(javax.swing.SwingConstants.TOP);

        jLabel15.setFont(new java.awt.Font("OCR A Std", 0, 14)); // NOI18N
        jLabel15.setText("Earl Timothy Malaki"); // NOI18N
        jLabel15.setVerticalAlignment(javax.swing.SwingConstants.TOP);

        jLabel16.setFont(new java.awt.Font("OCR A Std", 0, 18)); // NOI18N
        jLabel16.setText("CMSC22 - Lab Act. #7"); // NOI18N
        jLabel16.setVerticalAlignment(javax.swing.SwingConstants.TOP);

        btnBackCreds.setFont(new java.awt.Font("OCR A Std", 0, 14)); // NOI18N
        btnBackCreds.setText("Back");
        btnBackCreds.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnBackCredsActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout CreditsFrameLayout = new javax.swing.GroupLayout(CreditsFrame.getContentPane());
        CreditsFrame.getContentPane().setLayout(CreditsFrameLayout);
        CreditsFrameLayout.setHorizontalGroup(
            CreditsFrameLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(CreditsFrameLayout.createSequentialGroup()
                .addGroup(CreditsFrameLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(CreditsFrameLayout.createSequentialGroup()
                        .addGap(70, 70, 70)
                        .addGroup(CreditsFrameLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel15)
                            .addComponent(jLabel14)
                            .addComponent(jLabel13)
                            .addComponent(jLabel16, javax.swing.GroupLayout.PREFERRED_SIZE, 275, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addGroup(CreditsFrameLayout.createSequentialGroup()
                        .addGap(29, 29, 29)
                        .addComponent(btnBackCreds, javax.swing.GroupLayout.PREFERRED_SIZE, 93, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(355, Short.MAX_VALUE))
        );
        CreditsFrameLayout.setVerticalGroup(
            CreditsFrameLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(CreditsFrameLayout.createSequentialGroup()
                .addGap(98, 98, 98)
                .addComponent(jLabel13)
                .addGap(15, 15, 15)
                .addComponent(jLabel15)
                .addGap(18, 18, 18)
                .addComponent(jLabel14)
                .addGap(30, 30, 30)
                .addComponent(jLabel16, javax.swing.GroupLayout.PREFERRED_SIZE, 49, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 124, Short.MAX_VALUE)
                .addComponent(btnBackCreds, javax.swing.GroupLayout.PREFERRED_SIZE, 37, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(28, 28, 28))
        );

        ShopFrame.setLocation(new java.awt.Point(300, 100));
        ShopFrame.setMinimumSize(new java.awt.Dimension(700, 450));

        lblMoney.setFont(new java.awt.Font("OCR A Std", 0, 18)); // NOI18N
        lblMoney.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        lblMoney.setText("Money");

        lblDesc.setFont(new java.awt.Font("OCR A Std", 0, 18)); // NOI18N
        lblDesc.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);

        btnHPPotion.setIcon(new javax.swing.ImageIcon(getClass().getResource("/icons/14593754_120300000466370222_194767502_n.png.jpeg"))); // NOI18N
        btnHPPotion.setText("HP Potion");
        btnHPPotion.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED, java.awt.Color.red, java.awt.Color.red, java.awt.Color.red, java.awt.Color.red));
        btnHPPotion.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseExited(java.awt.event.MouseEvent evt) {
                btnHPPotionMouseExited(evt);
            }
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                btnHPPotionMouseEntered(evt);
            }
        });
        btnHPPotion.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnHPPotionActionPerformed(evt);
            }
        });

        btnMPPotion.setIcon(new javax.swing.ImageIcon(getClass().getResource("/icons/14585305_120300000467954432_946059141_n.png.jpeg"))); // NOI18N
        btnMPPotion.setText("MP Potion");
        btnMPPotion.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED, java.awt.Color.blue, java.awt.Color.blue, java.awt.Color.blue, java.awt.Color.blue));
        btnMPPotion.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseExited(java.awt.event.MouseEvent evt) {
                btnMPPotionMouseExited(evt);
            }
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                btnMPPotionMouseEntered(evt);
            }
        });
        btnMPPotion.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnMPPotionActionPerformed(evt);
            }
        });

        btnBack.setFont(new java.awt.Font("OCR A Std", 0, 13)); // NOI18N
        btnBack.setText("Back");
        btnBack.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnBackActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout ShopFrameLayout = new javax.swing.GroupLayout(ShopFrame.getContentPane());
        ShopFrame.getContentPane().setLayout(ShopFrameLayout);
        ShopFrameLayout.setHorizontalGroup(
            ShopFrameLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(lblDesc, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 700, javax.swing.GroupLayout.PREFERRED_SIZE)
            .addGroup(ShopFrameLayout.createSequentialGroup()
                .addGroup(ShopFrameLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(ShopFrameLayout.createSequentialGroup()
                        .addGap(260, 260, 260)
                        .addComponent(lblMoney, javax.swing.GroupLayout.PREFERRED_SIZE, 170, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(ShopFrameLayout.createSequentialGroup()
                        .addGap(180, 180, 180)
                        .addComponent(btnHPPotion, javax.swing.GroupLayout.PREFERRED_SIZE, 128, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(72, 72, 72)
                        .addComponent(btnMPPotion, javax.swing.GroupLayout.PREFERRED_SIZE, 128, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(ShopFrameLayout.createSequentialGroup()
                        .addGap(22, 22, 22)
                        .addComponent(btnBack)))
                .addGap(192, 192, 192))
        );
        ShopFrameLayout.setVerticalGroup(
            ShopFrameLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(ShopFrameLayout.createSequentialGroup()
                .addGap(60, 60, 60)
                .addComponent(lblMoney, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(30, 30, 30)
                .addGroup(ShopFrameLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(btnHPPotion, javax.swing.GroupLayout.PREFERRED_SIZE, 128, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btnMPPotion, javax.swing.GroupLayout.PREFERRED_SIZE, 128, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(46, 46, 46)
                .addComponent(lblDesc, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(btnBack, javax.swing.GroupLayout.PREFERRED_SIZE, 46, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(22, 22, 22))
        );

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setLocation(new java.awt.Point(300, 100));
        setMaximumSize(new java.awt.Dimension(700, 450));
        setMinimumSize(new java.awt.Dimension(700, 450));
        setPreferredSize(new java.awt.Dimension(700, 450));
        setResizable(false);
        setSize(new java.awt.Dimension(700, 450));
        getContentPane().setLayout(null);

        GameTitle.setFont(new java.awt.Font("OCR A Std", 1, 48)); // NOI18N
        GameTitle.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        GameTitle.setText("RPG Simulator");
        getContentPane().add(GameTitle);
        GameTitle.setBounds(117, 74, 483, 55);

        Start.setFont(new java.awt.Font("OCR A Std", 1, 12)); // NOI18N
        Start.setText("Start");
        Start.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                StartActionPerformed(evt);
            }
        });
        getContentPane().add(Start);
        Start.setBounds(290, 160, 86, 24);

        Credits.setFont(new java.awt.Font("OCR A Std", 1, 12)); // NOI18N
        Credits.setText("Credits");
        Credits.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                CreditsActionPerformed(evt);
            }
        });
        getContentPane().add(Credits);
        Credits.setBounds(290, 200, 120, 24);

        Exit.setFont(new java.awt.Font("OCR A Std", 1, 12)); // NOI18N
        Exit.setText("Exit");
        Exit.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                ExitActionPerformed(evt);
            }
        });
        getContentPane().add(Exit);
        Exit.setBounds(290, 240, 80, 24);

        btnOKMenu.setFont(new java.awt.Font("OCR A Std", 1, 12)); // NOI18N
        btnOKMenu.setText("OK");
        btnOKMenu.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        btnOKMenu.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnOKMenuActionPerformed(evt);
            }
        });
        getContentPane().add(btnOKMenu);
        btnOKMenu.setBounds(280, 290, 110, 40);

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void StartActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_StartActionPerformed
        // TODO add your handling code here:
        Credits.setSelected(false);
        Exit.setSelected(false);
    }//GEN-LAST:event_StartActionPerformed

    private void CreditsActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_CreditsActionPerformed
        // TODO add your handling code here:
        Start.setSelected(false);
        Exit.setSelected(false);
    }//GEN-LAST:event_CreditsActionPerformed

    private void ExitActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_ExitActionPerformed
        // TODO add your handling code here:
        Credits.setSelected(false);
        Start.setSelected(false);
    }//GEN-LAST:event_ExitActionPerformed

    private void btnOKMenuActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnOKMenuActionPerformed
        // TODO add your handling code here:
        if (Start.isSelected())
        {
            AvatarSelection.setVisible(true);
            this.hide();
        }
        else if (Credits.isSelected())
        {
          this.setVisible(false);
          CreditsFrame.setVisible(true);
        }
        else if (Exit.isSelected())
        {
          System.exit(0);
        }
    }//GEN-LAST:event_btnOKMenuActionPerformed

    private void WarriorActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_WarriorActionPerformed
        // TODO add your handling code here:
        Assassin.setSelected(false);
        Mage.setSelected(false);
        FlavorText.setText("A Warrior is known for its high health and Strong amor");
    }//GEN-LAST:event_WarriorActionPerformed

    private void AssassinActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_AssassinActionPerformed
        // TODO add your handling code here:
        Warrior.setSelected(false);
        Mage.setSelected(false);
        FlavorText.setText("An Assassin is known for its high damage output and dodge rate");
    }//GEN-LAST:event_AssassinActionPerformed

    private void MageActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_MageActionPerformed
        // TODO add your handling code here:
        Assassin.setSelected(false);
        Warrior.setSelected(false);
        FlavorText.setText("A Mage is known for its high damage output huge mana pool");
    }//GEN-LAST:event_MageActionPerformed

    private void NameFieldActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_NameFieldActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_NameFieldActionPerformed

    private void btnOKAvatarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnOKAvatarActionPerformed
        // TODO add your handling code here:
        if ( (Assassin.isSelected() || Mage.isSelected() || Warrior.isSelected()) && !NameField.getText().equals("")){
            if (Warrior.isSelected())
            {
                playerhero = new Warrior(NameField.getText());
                HeroClasslbl.setText("Warrior: ");
                HeroClass.setText("Warrior: ");
            }
            else if (Assassin.isSelected())
            {
                playerhero = new Assassin(NameField.getText());
                HeroClasslbl.setText("Assassin: ");
                HeroClass.setText("Assassin: ");
            }
            else if (Mage.isSelected())
            {
                playerhero = new Mage(NameField.getText());
                HeroClasslbl.setText("Mage: ");
                HeroClass.setText("Mage: ");
            }
            
            updateUILounge();
            AvatarSelection.setVisible(false);
            Lounge.setVisible(true);
            
            lblXHP.setText("X 0");
            lblXMP.setText("X 0");
            btnUseHP.setEnabled(false);
            btnUseMP.setEnabled(false);
        }
    }//GEN-LAST:event_btnOKAvatarActionPerformed

    
    private void btnOKLoungeActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnOKLoungeActionPerformed
        // TODO add your handling code here:
        turnCounter = 1;
        if (battle.isSelected()){

            // Instantiate/Summon random monster
            String monsterName = getRandomMonsterName();
            switch (monsterName) {
                case "Ogre":
                    monster = new Ogre(getRandomAdjective() +" Ogre", getRandomLevel(playerhero.getLvl()) );
                    break;
                case "Slime":
                    monster = new Slime(getRandomAdjective() +" Slime", getRandomLevel(playerhero.getLvl()) );
                    break;
                case "Witch":
                    monster = new Witch(getRandomAdjective() +" Witch", getRandomLevel(playerhero.getLvl()) );
                    break;
                default:
                    break;
            }

            updateUIArena();

            Lounge.setVisible(false);
            Arena.setVisible(true);
            
            lblMissed.setVisible(false);
            Turn.setText("Turn "+turnCounter);

        }
        else if (shop.isSelected())
        {
            Lounge.setVisible(false);
            ShopFrame.setVisible(true);
            
            lblMoney.setText("Money: " +playerhero.getMoney());
        }
        
        OkArena.setEnabled(false);
        
        
        
        

    }//GEN-LAST:event_btnOKLoungeActionPerformed

    private void battleActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_battleActionPerformed
        // TODO add your handling code here:
        shop.setSelected(false);
    }//GEN-LAST:event_battleActionPerformed

    private void shopActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_shopActionPerformed
        // TODO add your handling code here:
        battle.setSelected(false);
    }//GEN-LAST:event_shopActionPerformed

    private void AttackActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_AttackActionPerformed
        // TODO add your handling code here:
        OkArena.setEnabled(true);
        Spell.setSelected(false);
        Dodge.setSelected(false);
        Block.setSelected(false);
        Spare.setSelected(false);
        
        Flavor.setText("Use a normal attack!");
    }//GEN-LAST:event_AttackActionPerformed

    private void SpellActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_SpellActionPerformed
        // TODO add your handling code here:
        OkArena.setEnabled(true);
        Attack.setSelected(false);
        Dodge.setSelected(false);
        Block.setSelected(false);
        Spare.setSelected(false);
        
        if (playerhero.canSpell(playerhero.getMp())){
            if (Warrior.isSelected()){
                Flavor.setText("Triple slash! Damage = 200");
            }
            else if (Assassin.isSelected()){
                Flavor.setText("Burikanimeroy! Damage = 250");
            }
            else if (Mage.isSelected()){
                Flavor.setText("MAGE MAGIC SARAP! Damage = 300");
            }
        }
        else{
            Flavor.setText("Not enough mana!");
            OkArena.setEnabled(false);
        }
    }//GEN-LAST:event_SpellActionPerformed

    private void DodgeActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_DodgeActionPerformed
        // TODO add your handling code here:
        OkArena.setEnabled(true);
        Attack.setSelected(false);
        Spell.setSelected(false);
        Block.setSelected(false);
        Spare.setSelected(false);
        Flavor.setText("Increase dodge rate for a turn!");
    }//GEN-LAST:event_DodgeActionPerformed

    private void BlockActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_BlockActionPerformed
        // TODO add your handling code here:
        OkArena.setEnabled(true);
        Spell.setSelected(false);
        Dodge.setSelected(false);
        Attack.setSelected(false);
        Spare.setSelected(false);
        Flavor.setText("Increase armor for a turn!");
    }//GEN-LAST:event_BlockActionPerformed

    private void SpareActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_SpareActionPerformed
        // TODO add your handling code here:
        OkArena.setEnabled(true);
        Spell.setSelected(false);
        Dodge.setSelected(false);
        Block.setSelected(false);
        Attack.setSelected(false);
        Flavor.setText("Spare the monster!");
        
        
    }//GEN-LAST:event_SpareActionPerformed


    public void playerMove(){
        
        
      if (Attack.isSelected()){
        int damage = playerhero.attack(randInt(playerhero.getAttackMin(), playerhero.getAttackMax()));

        if (hitMiss(monster)){  // HIT
          monster.takeDamage(damage);
        }
        else{
            lblMissed.setVisible(true);
        }
      }
      else if (Spell.isSelected()){     
            monster.takeDamage(playerhero.castSpell());
      }
      else if (Dodge.isSelected()){
        playerhero.increaseDodge();
          
      }
      else if (Block.isSelected()){
        playerhero.increaseArmor();
      }
      else if(Spare.isSelected()){
                
            if(monster.getSpareCounter() < monster.getSpareLimit()){
                    monster.setSpareCounter();
                    Flavor.setText(monster.spare());
                }
                else{
                monster.setHp(0);
                }
              
         }
             
    }

    public void monsterMove(){
        
      int damage = monster.attack(randInt(monster.getAttackMin(), monster.getAttackMax()));

      if (hitMiss(playerhero)){
        playerhero.takeDamage(damage);
      }
      else{   
          lblMissed.setVisible(true);   
      }
      
      if (Dodge.isSelected()){
          playerhero.decreaseDodge();
      }
      else if (Block.isSelected()){
          playerhero.decreaseArmor();
      }
      
    }

    public void updateUIArena(){
      
      // HERO UI STATS
      HeroName.setText(playerhero.getName());
      lvl.setText(""+playerhero.getLvl());
      hpProg.setForeground(Color.green);
      mpProg.setForeground(Color.blue);
      hpProg.setMaximum(playerhero.getHpMax());
      mpProg.setMaximum(playerhero.getMpMax());
      hpProg.setValue(playerhero.getHp());
      mpProg.setValue(playerhero.getMp());
      maxHp.setText(""+playerhero.getHpMax());
      maxMp.setText(""+playerhero.getMpMax());
      hp.setText(""+playerhero.getHp());
      mp.setText(""+playerhero.getMp());
      

      // MONSTER UI STATS 
      monName.setText(monster.getName());
      monLvl.setText(""+monster.getLvl());
      monHpProg.setForeground(Color.red);
      monHpProg.setMaximum(monster.getHpMax());
      monHpProg.setValue(monster.getHp());      
      monMaxHp.setText(""+monster.getHpMax());
      monHp.setText(""+monster.getHp());
    }
    
    public void updateUILounge(){
        HeroNamelbl.setText(NameField.getText());
        levelnumber.setText(""+playerhero.getLvl());
        hplbl.setText(""+playerhero.getHp());
        mplbl.setText(""+playerhero.getMp());
        maxHplbl.setText(""+playerhero.getHpMax());
        maxMplbl.setText(""+playerhero.getMpMax());
        exp.setText(""+playerhero.getExp());
        expgauge.setText(""+playerhero.getExpGauge());
        
        hpProglbl.setForeground(Color.green);
        hpProglbl.setBackground(Color.green);
        mpProglbl.setForeground(Color.blue);
        mpProglbl.setBackground(Color.blue);
        hpProglbl.setMaximum(playerhero.getHpMax());
        mpProglbl.setMaximum(playerhero.getMpMax());
        hpProglbl.setValue(playerhero.getHp());
        mpProglbl.setValue(playerhero.getMp());
        
        expProglbl.setMaximum(playerhero.getExpGauge());
        expProglbl.setValue(playerhero.getExp());
    }

    private void OkArenaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_OkArenaActionPerformed
        // TODO add your handling code here:
            
            playerMove();       // Player's turn

            sleep(300);
            monsterMove();      // Monster's turn
            
            Attack.setSelected(false);
            Block.setSelected(false);
            Spell.setSelected(false);
            Spare.setSelected(false);
            Dodge.setSelected(false);
            OkArena.setEnabled(false);
            
            updateUIArena();


        if (playerhero.getHp() <= 0) {  // If Game Over
            Arena.setVisible(false);
            PlayerDeath.setVisible(true);
        }
        else if (monster.getHp() <= 0) {  // If Monster kill, exp gain, money gain
          Arena.setVisible(false);
          MonsterDeath.setVisible(true);
          
          int oldLevel = playerhero.getLvl();
          expGainedText.setText(""+monster.getExpDrop());
          playerhero.setExp(monster.getExpDrop()); 
          playerhero.setMoney(playerhero.getMoney() + monster.getMoneyDrop());
          if (oldLevel < playerhero.getLvl()){
              lblLevelUp.setVisible(true);
          }else{
              lblLevelUp.setVisible(false);
          }
        }

        Turn.setText("TURN " + ++turnCounter);

    }//GEN-LAST:event_OkArenaActionPerformed

    private void OkArenaMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_OkArenaMouseClicked
        // TODO add your handling code here:
    }//GEN-LAST:event_OkArenaMouseClicked

    private void MonsterDeathOKActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_MonsterDeathOKActionPerformed
        // TODO add your handling code here:
        updateUILounge();
        MonsterDeath.setVisible(false);
        Lounge.setVisible(true);
        
        if (playerhero.getHPPCount() == 0){
            btnUseHP.setEnabled(false);
        }
        else{
            btnUseHP.setEnabled(true);
        }
        
        if (playerhero.getMPPCount() == 0){
            btnUseMP.setEnabled(false);
        }
        else{
            btnUseMP.setEnabled(true);
        }
        
        lblXHP.setText("X " +playerhero.getHPPCount());
        lblXMP.setText("X " +playerhero.getMPPCount());
        
    }//GEN-LAST:event_MonsterDeathOKActionPerformed

    private void PlayerDOKActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_PlayerDOKActionPerformed
        // TODO add your handling code here:
        PlayerDeath.setVisible(false);
        this.setVisible(true);
    }//GEN-LAST:event_PlayerDOKActionPerformed

    private void ArenaFocusGained(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_ArenaFocusGained
        // TODO add your handling code here:
    }//GEN-LAST:event_ArenaFocusGained

    private void ArenaPropertyChange(java.beans.PropertyChangeEvent evt) {//GEN-FIRST:event_ArenaPropertyChange
        // TODO add your handling code here:
    }//GEN-LAST:event_ArenaPropertyChange

    private void LoungePropertyChange(java.beans.PropertyChangeEvent evt) {//GEN-FIRST:event_LoungePropertyChange
        // TODO add your handling code here:
    }//GEN-LAST:event_LoungePropertyChange

    private void ArenaMouseMoved(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_ArenaMouseMoved
        // TODO add your handling code here:
        lblMissed.setVisible(false);
    }//GEN-LAST:event_ArenaMouseMoved

    private void btnBackActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnBackActionPerformed
        // TODO add your handling code here:
        ShopFrame.setVisible(false);
        Lounge.setVisible(true);
        
        if (playerhero.getHPPCount() == 0){
            btnUseHP.setEnabled(false);
        }
        else{
            btnUseHP.setEnabled(true);
        }
        
        if (playerhero.getMPPCount() == 0){
            btnUseMP.setEnabled(false);
        }
        else{
            btnUseMP.setEnabled(true);
        }
        
        lblXHP.setText("X " +playerhero.getHPPCount());
        lblXMP.setText("X " +playerhero.getMPPCount());
    }//GEN-LAST:event_btnBackActionPerformed

    private void btnHPPotionActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnHPPotionActionPerformed
        // TODO add your handling code here:
        if (playerhero.getMoney() >= potionCost){
            playerhero.setHPPCount(playerhero.getHPPCount() + 1);
            playerhero.setMoney(playerhero.getMoney() - potionCost);
            lblMoney.setText("Money: "+playerhero.getMoney());
        }
        else{
            btnHPPotion.setEnabled(false);
        }
    }//GEN-LAST:event_btnHPPotionActionPerformed

    private void btnUseHPActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnUseHPActionPerformed
        // TODO add your handling code here:
        playerhero.useHPPotion();
        playerhero.setHPPCount(playerhero.getHPPCount() - 1);
        lblXHP.setText("X "+playerhero.getHPPCount());
        updateUILounge();
        if (playerhero.getHPPCount() <= 0){  //
            btnUseHP.setEnabled(false);
        }
        else{
            btnUseHP.setEnabled(true);
        }
    }//GEN-LAST:event_btnUseHPActionPerformed

    private void btnUseMPActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnUseMPActionPerformed
        // TODO add your handling code here:
        playerhero.useMPPotion();
        playerhero.setMPPCount(playerhero.getMPPCount() - 1);
        lblXMP.setText("X "+playerhero.getMPPCount());
        updateUILounge();
        if (playerhero.getMPPCount() <= 0){
            btnUseMP.setEnabled(false);
        }
        else{
            btnUseMP.setEnabled(true);
        }
    }//GEN-LAST:event_btnUseMPActionPerformed

    private void btnMPPotionActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnMPPotionActionPerformed
        // TODO add your handling code here:
        if (playerhero.getMoney() >= potionCost){
            playerhero.setMPPCount(playerhero.getMPPCount() + 1);
            playerhero.setMoney(playerhero.getMoney() - potionCost);
            lblMoney.setText("Money: "+playerhero.getMoney());
        }
        else{
            btnMPPotion.setEnabled(false);
        }
    }//GEN-LAST:event_btnMPPotionActionPerformed

    private void btnBackCredsActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnBackCredsActionPerformed
        // TODO add your handling code here:
        CreditsFrame.setVisible(false);
        this.setVisible(true);
    }//GEN-LAST:event_btnBackCredsActionPerformed

    private void btnHPPotionMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnHPPotionMouseEntered
        // TODO add your handling code here:
        lblDesc.setText("Recover 100HP instantly! Cost: 100G");
    }//GEN-LAST:event_btnHPPotionMouseEntered

    private void btnMPPotionMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnMPPotionMouseEntered
        // TODO add your handling code here:
        lblDesc.setText("Recover 100MP instantly! Cost: 100G");
    }//GEN-LAST:event_btnMPPotionMouseEntered

    private void btnHPPotionMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnHPPotionMouseExited
        // TODO add your handling code here:
        lblDesc.setText("");
    }//GEN-LAST:event_btnHPPotionMouseExited

    private void btnMPPotionMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnMPPotionMouseExited
        // TODO add your handling code here:
        lblDesc.setText("");
    }//GEN-LAST:event_btnMPPotionMouseExited

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
            java.util.logging.Logger.getLogger(Menu.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Menu.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Menu.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Menu.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Menu().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JFrame Arena;
    private javax.swing.JRadioButton Assassin;
    private javax.swing.JLabel AssassinIcon;
    private javax.swing.JRadioButton Attack;
    private javax.swing.JFrame AvatarSelection;
    private javax.swing.JRadioButton Block;
    private javax.swing.JRadioButton Credits;
    private javax.swing.JFrame CreditsFrame;
    private javax.swing.JRadioButton Dodge;
    private javax.swing.JRadioButton Exit;
    private javax.swing.JLabel Flavor;
    private javax.swing.JLabel FlavorText;
    private javax.swing.JLabel GameTitle;
    private javax.swing.JLabel HeroClass;
    private javax.swing.JLabel HeroClasslbl;
    private javax.swing.JLabel HeroName;
    private javax.swing.JLabel HeroNamelbl;
    private javax.swing.JLabel LevelUpText;
    private javax.swing.JFrame Lounge;
    private javax.swing.JRadioButton Mage;
    private javax.swing.JLabel MageIcon;
    private javax.swing.JFrame MonsterDeath;
    private javax.swing.JButton MonsterDeathOK;
    private javax.swing.JLabel Name;
    private javax.swing.JTextField NameField;
    private javax.swing.JButton OkArena;
    private javax.swing.JButton PlayerDOK;
    private javax.swing.JFrame PlayerDeath;
    private javax.swing.JFrame ShopFrame;
    private javax.swing.JRadioButton Spare;
    private javax.swing.JRadioButton Spell;
    private javax.swing.JRadioButton Start;
    private javax.swing.JLabel Title;
    private javax.swing.JLabel Turn;
    private javax.swing.JRadioButton Warrior;
    private javax.swing.JLabel WarriorIcon;
    private javax.swing.JRadioButton battle;
    private javax.swing.JLabel battlelbl;
    private javax.swing.JButton btnBack;
    private javax.swing.JButton btnBackCreds;
    private javax.swing.JButton btnHPPotion;
    private javax.swing.JButton btnMPPotion;
    private javax.swing.JButton btnOKAvatar;
    private javax.swing.JButton btnOKLounge;
    private javax.swing.JButton btnOKMenu;
    private javax.swing.JButton btnUseHP;
    private javax.swing.JButton btnUseMP;
    private javax.swing.JLabel exp;
    private javax.swing.JLabel expGainedText;
    private javax.swing.JProgressBar expProglbl;
    private javax.swing.JLabel expgauge;
    private javax.swing.JLabel hp;
    private javax.swing.JProgressBar hpProg;
    private javax.swing.JProgressBar hpProglbl;
    private javax.swing.JLabel hplbl;
    private javax.swing.JLabel iconHP;
    private javax.swing.JLabel iconMP;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel11;
    private javax.swing.JLabel jLabel12;
    private javax.swing.JLabel jLabel13;
    private javax.swing.JLabel jLabel14;
    private javax.swing.JLabel jLabel15;
    private javax.swing.JLabel jLabel16;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JLabel lblDesc;
    private javax.swing.JLabel lblLevelUp;
    private javax.swing.JLabel lblMissed;
    private javax.swing.JLabel lblMoney;
    private javax.swing.JLabel lblXHP;
    private javax.swing.JLabel lblXMP;
    private javax.swing.JLabel levelnumber;
    private javax.swing.JLabel lvl;
    private javax.swing.JLabel lvllbl;
    private javax.swing.JLabel maxHp;
    private javax.swing.JLabel maxHplbl;
    private javax.swing.JLabel maxMp;
    private javax.swing.JLabel maxMplbl;
    private javax.swing.JLabel monHp;
    private javax.swing.JProgressBar monHpProg;
    private javax.swing.JLabel monLvl;
    private javax.swing.JLabel monMaxHp;
    private javax.swing.JLabel monName;
    private javax.swing.JLabel mp;
    private javax.swing.JProgressBar mpProg;
    private javax.swing.JProgressBar mpProglbl;
    private javax.swing.JLabel mplbl;
    private javax.swing.JRadioButton shop;
    private javax.swing.JLabel shoplbl;
    // End of variables declaration//GEN-END:variables
}
