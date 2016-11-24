/**
 * Created by HOME on 11/24/2016.
 */
public abstract class Character {

    private WeaponBehavior weapon;

    public void setWeaponBehavior(WeaponBehavior w) {
        this.weapon = w;
    }

    public void fight(){
        weapon.useWeapon();
    }
}
