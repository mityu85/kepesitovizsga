package hu.nive.ujratervezes.kepesitovizsga.army;

public abstract class MilitaryUnit {

    public int hitPoints;
    public int attack;
    public boolean shield;

    public int getHitPoints() {
        return hitPoints;
    }

    public int getAttack() {
        return attack;
    }

    public boolean isShield() {
        return shield;
    }

    public int doDamage() {
        return attack;
    }

    public void sufferDamage(int damage) {
        if (shield) {
            hitPoints -= (damage/2);
        } else {
            hitPoints -= damage;
        }
    }
}
