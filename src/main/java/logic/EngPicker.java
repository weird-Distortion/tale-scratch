package logic;

import scratches.english.EngHeroes;
import scratches.english.EngLocations;
import scratches.english.EngScratch;
import scratches.english.EngWeapon;

import java.util.List;
import java.util.Random;

import static java.util.Arrays.asList;

public class EngPicker extends Picker {

    private List<EngScratch[]> scratches;

    public EngPicker() {
        this.scratches =
                asList(EngHeroes.values(), EngLocations.values(), EngWeapon.values());
    }

    @Override
    public void printScratch() {
        scratches.forEach(scratch ->
                System.out.println(pickElement(scratch)));
    }

    private String pickElement(EngScratch[] array) {
        List<EngScratch> testList = asList(array);

        Random random = new Random();
        int index = random.nextInt(testList.size());

        return testList.get(index).toString();
    }
}
