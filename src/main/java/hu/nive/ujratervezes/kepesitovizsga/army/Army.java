package hu.nive.ujratervezes.kepesitovizsga.army;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class Army {

    private List<MilitaryUnit> militaryUnits = new ArrayList<>();

    public List<MilitaryUnit> getMilitaryUnits() {
        return militaryUnits;
    }

    public void addUnit(MilitaryUnit militaryUnit) {
        militaryUnits.add(militaryUnit);
    }

    public void damageAll(int damage) {
        Iterator<MilitaryUnit> i = militaryUnits.iterator();
        while (i.hasNext()) {
            MilitaryUnit militaryUnit = i.next();
            militaryUnit.sufferDamage(damage);
            if (militaryUnit.getHitPoints() < 25) {
                i.remove();
            }
        }
    }

    public int getArmyDamage() {
        int sum = 0;
        for (MilitaryUnit militaryUnit: militaryUnits) {
            sum += militaryUnit.doDamage();
        }
        return sum;
    }

    public int getArmySize() {
        return militaryUnits.size();
    }
}
