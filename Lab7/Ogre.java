/*
 * Aiden Justin Bedio
 * Earl Timothy Malaki
 * Timothy River Paler
 * CMSC22 - Lab Act. # 7
 *
 */

public class Ogre extends RPGCharacter{

    // Characteristics of an Ogre
    private static int HP = 200;
    private static int MP = 150;
    private static int DODGE_RATE = 2;

    private static int attackMin = 25;
    private static int attackMax = 40;
    private static int ARMOR = 25;

    private static int expDrop = 200;
    
    private int manaCost = 100;
    private int spellDamage = 200;
    private static int spareCounter = 0;
    
    private static int money = 150;
    
    public Ogre(String name, int level) {
        super(name, HP + (30 * level), MP + (12 * level), DODGE_RATE, ARMOR, level, expDrop + (20 * level), money + (10 * level));
    }

    public int attack(int randomNum) {
        int damage = (20 * getLvl()) + randomNum;
        // in main class, pass attack(randInt(.getAttackMax)
        return damage;
    }

    public int takeDamage(int damage) {
        if (damage < ARMOR)
            damage = 0;
        else
            damage -= ARMOR;

        return super.takeDamage(damage);
    }


    public int magicAttack(){
        return 150;

    }

    public int getDodgeRate(){
        return DODGE_RATE;
    }

    public int getExpDrop() {
        return expDrop;
    }

    public int getAttackMin(){
      return attackMin;
    }

    public int getAttackMax(){
      return attackMax;
    }
    
    public boolean canSpell(int currentMP){
        if (manaCost > currentMP){
            return false;
        }
        return true;
    }
    
    public int castSpell(){
        super.setMp(super.getMp() - manaCost);
        return spellDamage;
    }
    
    public int getMpCost(){
        return manaCost;
    }
    
    public String spare(){
        String toSay = "";
        if(getSpareCounter() == 1){
        toSay = "RAAAAAAAAAAAAAAAAAAWR";
        }
        if(getSpareCounter() == 2){
        toSay = "RAWR";
        }
        if(getSpareCounter() == 3){
        toSay = "rawr";
        }
        if(getSpareCounter() == 4){
        toSay = "ok";
        }
        if(getSpareCounter() == 5){
        toSay = "Yo nigga wassup";
        }
        return "" + toSay;
    }
    
    public int getMoneyDrop(){
        return money;
    }
    

}
