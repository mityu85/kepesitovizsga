package hu.nive.ujratervezes.kepesitovizsga.army;

public class Archer extends MilitaryUnit {

    public Archer() {
        setHitPoints(50);
        setAttack(20);
        setShield(false);
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
}
