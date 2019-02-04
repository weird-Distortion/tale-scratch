package logic;

import scratches.english.EngHeroes;
import scratches.english.EngLocations;
import scratches.english.EngScratch;
import scratches.english.EngWeapon;

import java.util.List;
import java.util.Random;

import static java.util.Arrays.asList;

public class EngPicker extends Picker{

    @Override
    public void printScratch() {
        System.out.println(pickElement(EngHeroes.values()));
        System.out.println(pickElement(EngLocations.values()));
        System.out.println(pickElement(EngWeapon.values()));
    }

    private String pickElement(EngScratch[] array) {
        List<EngScratch> testList = asList(array);

        Random random = new Random();
        int index = random.nextInt(testList.size());

        return testList.get(index).toString();
    }
}
