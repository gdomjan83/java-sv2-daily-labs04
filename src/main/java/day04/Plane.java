package day04;

import java.util.ArrayList;
import java.util.List;

public class Plane {
    private int maxCapacity;
    private List<Passanger> passangerList = new ArrayList<>();

    public Plane(int maxCapacity) {
        this.maxCapacity = maxCapacity;
    }

    public boolean addPassanger(Passanger passanger) {
        if (passangerList.size() < maxCapacity) {
            passangerList.add(passanger);
            return true;
        }
        return false;
    }

    public int numberOfPackages() {
        int packages = 0;
        for (Passanger person : passangerList) {
            packages += person.getLuggage();
        }
        return packages;
    }
}
