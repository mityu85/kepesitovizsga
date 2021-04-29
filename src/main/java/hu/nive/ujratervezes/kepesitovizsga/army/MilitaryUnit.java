package hu.nive.ujratervezes.kepesitovizsga.army;

public abstract class MilitaryUnit {

    private int hitPoints;
    private int attack;
    private boolean shield;

    public void setHitPoints(int hitPoints) {
        this.hitPoints = hitPoints;
    }

    public void setAttack(int attack) {
        this.attack = attack;
    }

    public void setShield(boolean shield) {
        this.shield = shield;
    }

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
