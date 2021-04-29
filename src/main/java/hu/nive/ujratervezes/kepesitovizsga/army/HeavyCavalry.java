package hu.nive.ujratervezes.kepesitovizsga.army;

public class HeavyCavalry extends MilitaryUnit{

    static int counter = 0;

    public HeavyCavalry() {
        hitPoints = 150;
        attack = 20;
        shield = true;
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
    public int doDamage() {
        if (counter == 0) {
            counter++;
            return super.doDamage()*3;
        }
        return super.doDamage();
    }
}
