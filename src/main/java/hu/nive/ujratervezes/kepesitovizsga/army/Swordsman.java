package hu.nive.ujratervezes.kepesitovizsga.army;

public class Swordsman extends MilitaryUnit {

    static int counter = 0;

    public Swordsman(Boolean shield) {
        hitPoints = 100;
        attack = 10;
        super.shield = shield;
    }

    @Override
    public int getHitPoints() {
        return super.getHitPoints();
    }

    @Override
    public int getAttack() {
        return super.getAttack();
    }

    @Override
    public boolean isShield() {
        return super.isShield();
    }

    @Override
    public void sufferDamage(int damage) {
        if (counter == 0) {
            counter++;
        } else {
            super.sufferDamage(damage);
        }
    }
}
