/*
 * Aiden Justin Bedio
 * Earl Timothy Malaki
 * Timothy River Paler
 * CMSC22 - Lab Act. # 7
 *
 */

public abstract class RPGCharacter {

    /*** Variables ***/
    private String name;
    private int hp;
    private int mp;
    private int hpMax;
    private int mpMax;
    private int level = 1;
    private int expGauge = 250;
    private int exp = 0;
    private int dodge;  
    private int armor;
    private int spareCounter = 0;
    private int money = 0;
    
    private int HPPCounter = 0;
    private int MPPCounter = 0;


    /*** End of Variables ***/



    /*** Constructor ***/
    // FOR HERO
    public RPGCharacter(String name, int hp, int mp, int dodge, int armor, int money) {
        this.name = name;
        this.hp = hp;
        this.mp = mp;
        this.hpMax = hp;
        this.mpMax = mp;
        this.dodge = dodge;
        this.armor = armor;
        this.money = money;
    }

    // FOR MONSTER
    public RPGCharacter(String name, int hp, int mp, int dodge, int armor, int level, int exp, int money) {
        this.name = name;
        this.hp = hp;
        this.mp = mp;
        this.hpMax = hp;
        this.mpMax = mp;
        this.dodge = dodge;
        this.armor = armor;
        this.level = level;
        this.exp = exp;
        this.money = money;
    }
    /*** End of Constructor ***/


    /*** Methods ***/
    // checks to see if character is still alive
    public boolean isAlive() {
        return hp > 0 ? true : false;
    }

    // may be overriden in subclass, damage is dependent on hero type
    public int takeDamage(int damage) {
        hp -= damage;
        return hp;
    }



    // FOR HERO
    public void levelUP(int hpRate, int mpRate, int armorRate){
        this.hp = hp + (hpRate * getLvl());
        this.mp = mp + (mpRate * getLvl());
        this.hpMax = hpMax + (hpRate * getLvl());
        this.mpMax = mpMax + (mpRate * getLvl());
        this.armor = armor + (armorRate * getLvl());
        expGauge *= 1.3;
        this.level++;
    }
    /*** End of Methods ***/


    /*** Abstract methods ***/
    
    public abstract int getDodgeRate();
    public abstract int attack(int randomInt);

    public abstract int getAttackMin();
    public abstract int getAttackMax();
    
    public abstract int getExpDrop();
    public abstract int getMoneyDrop();
    
    public abstract boolean canSpell(int currentMP);
    public abstract int castSpell();
    public abstract int getMpCost();
    public abstract String spare();
    /*** End of Abstract methods ***/



    /*** Getters & Setters ***/
    
    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getHp() {
        return hp;
    }

    public void setHp(int hp) {
        this.hp = hp;
    }

    public int getHpMax() {
        return hpMax;
    }

    public void setHpMax(int hpMax) {
        this.hpMax = hpMax;
    }

    public int getMpMax() {
        return mpMax;
    }

    public void setMpMax(int mpMax) {
        this.mpMax = mpMax;
    }

    public int getExp() {
        return exp;
    }

    public void setExp(int monsterExpDrop) {
        
        exp += monsterExpDrop;
        
        if (exp >= expGauge){  // IF LEVEL UP
              level += 1;
              exp -= expGauge;
              expGauge += (level * 100);

              hpMax += (level * 50);
              mpMax += (level * 40);
              
              hp = hpMax;
              mp = mpMax;
        }
    }
    

    public int getExpGauge() {
        return expGauge;
    }

    public int getMp() {
        return mp;
    }

    public void setMp(int mp) {
        this.mp = mp;
    }

    public int getLvl() {
        return level;
    }

    public void setLevel(int level) {
        this.level = level;
    }

    public int getDodge() {
        return dodge;
    }

    public void setDodge(int dodge) {
        this.dodge = dodge;
    }
    
    public void increaseDodge() {
        dodge += 2;
    }
    
    public void decreaseDodge() {
        dodge -= 2;
    }
    
    public void increaseArmor() {
        armor += 2;
    }
    
    public void decreaseArmor() {
        armor -= 2;
    }

    public int getArmor() {
        return armor;
    }

    public void setArmor(int armor) {
        this.armor = armor;
    }

    public void setExpGauge(int expGauge) {
        this.expGauge = expGauge;
    }
    
    public int getSpareCounter(){
        return spareCounter;
    }
    
    public void setSpareCounter(){
        this.spareCounter++;
    }
    
    public int getSpareLimit(){
        return 5;
    }
    
    public int getHPPCount(){
        return HPPCounter;
    }
    
    public void setHPPCount(int HPPCounter){
        this.HPPCounter = HPPCounter;
    }
    
    public int getMPPCount(){
        return MPPCounter;
    }
    
    public void setMPPCount(int MPPCounter){
        this.MPPCounter = MPPCounter;
    }


    /*** End of Getters & Setters ***/

    public void useHPPotion(){
        setHp(getHp() + 100);
        if (getHp() > getHpMax()){
            setHp(getHpMax());
        }
    }
    
    public void useMPPotion(){
        setMp(getMp() + 100);
        if (getMp() > getMpMax()){
            setMp(getMpMax());
        }
    }

    public int getMoney(){
        return money;
    }
    
    public void setMoney(int money){
        this.money = money;
    }


    @Override
    public String toString() {
        return "RPGCharacter{" +
                "name='" + name + '\'' +
                ", hp=" + hp +
                '}';
    }
}
