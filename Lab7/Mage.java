/*
 * Aiden Justin Bedio
 * Earl Timothy Malaki
 * Timothy River Paler
 * CMSC22 - Lab Act. # 7
 *
 */
public class Mage extends RPGCharacter {

    private static int HP = 200;
    private static int MP = 300;
    private static int DODGE_RATE = 3;

    private static int attackMin = 20;
    private static int attackMax = 35;
    private static int ARMOR = 15;

    private static int hpRate = 15;
    private static int mpRate = 25;
    private static int armorRate = 5;
    
    private int manaCost = 100;
    private int spellDamage = 200;
    
    private static int MONEY = 200;

    public Mage(String name) {
        super(name, HP, MP, DODGE_RATE, ARMOR, MONEY);
    }

    public int attack(int randomNum) {
        int damage = (20 * getLvl()) + randomNum;
        // in main class, pass attack(randInt(.getAttackMax)
        return damage;
    }

    public int takeDamage(int damage) {
        // reduce damage because of armor!!! oh yeah!
        if (damage < ARMOR)
            damage = 0;
        else
            damage -= ARMOR;
        // set new hp
        return super.takeDamage(damage);
    }


    public int getDodgeRate(){
        return DODGE_RATE;
    }


    public static int getHpRate() {
        return hpRate;
    }

    public static int getMpRate() {
        return mpRate;
    }

    public static int getArmorRate() {
        return armorRate;
    }

    public int getAttackMin(){
      return attackMin;
    }

    public int getAttackMax(){
      return attackMax;
    }

    
    public int getExpDrop(){
        return 0;
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
        return "";
    }
    
    
    public int getMoneyDrop(){
        return 0;
    }
    
}
