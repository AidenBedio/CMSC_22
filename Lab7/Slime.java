/*
 * Aiden Justin Bedio
 * Earl Timothy Malaki
 * Timothy River Paler
 * CMSC22 - Lab Act. # 7
 *
 */

public class Slime extends RPGCharacter {

    // Characteristics of a Witch
    private static int HP = 50;
    private static int MP = 150;
    private static int DODGE_RATE = 2;

    private static int attackMin = 15;
    private static int attackMax = 25;
    private static int ARMOR = 10;

    private static int expDrop = 100;

    private int manaCost = 100;
    private int spellDamage = 200;
    
    private static int money = 50;

    public Slime (String name, int level) {
        super(name, HP + (30 * level), MP + (12 * level), DODGE_RATE, ARMOR, level, expDrop + (20 * level), money + (5 * level));
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
        return 100;

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
