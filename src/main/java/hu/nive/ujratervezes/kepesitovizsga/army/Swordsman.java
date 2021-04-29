package hu.nive.ujratervezes.kepesitovizsga.army;

public class Swordsman extends MilitaryUnit {

    static int counter = 0;

    public Swordsman(boolean shield) {
        setHitPoints(100);
        setAttack(10);
        setShield(shield);
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
            counter = 0;
        }
    }
}
