/**
 * Created by HOME on 11/24/2016.
 */
public class CharacterTest {

    public static void main(String[] args) {

        Character Q = new Queen();
        Q.setWeaponBehavior(new KnifeBehavior());

        Character Ki = new King();
        Ki.setWeaponBehavior(new KnifeBehavior());

        Character Kn = new Knight();
        Kn.setWeaponBehavior(new KnifeBehavior());

        Character T = new Troll();
        T.setWeaponBehavior(new KnifeBehavior());

        Q.fight();
        Kn.fight();
        Ki.fight();
        T.fight();

        System.out.println("\n\n\n");
        Character Q2 = new Queen();
        Q2.setWeaponBehavior(new BowAndArrowBehavior());

        Character Ki2 = new King();
        Ki2.setWeaponBehavior(new KnifeBehavior());

        Character Kn2 = new Knight();
        Kn2.setWeaponBehavior(new SwordBehavior());

        Character T2 = new Troll();
        T2.setWeaponBehavior(new AxeBehavior());

        Q2.fight();
        Kn2.fight();
        Ki2.fight();
        T2.fight();
    }
}
