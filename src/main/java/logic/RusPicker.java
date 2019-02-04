package logic;

import scratches.russian.RusHeroes;
import scratches.russian.RusLocations;
import scratches.russian.RusScratch;

import java.util.List;
import java.util.Random;

import static java.util.Arrays.asList;

public class RusPicker extends Picker {

    @Override
    public void printScratch() {
        System.out.println(pickElement(RusHeroes.values()));
        System.out.println(pickElement(RusLocations.values()));
    }

    private String pickElement(RusScratch[] array) {
        List<RusScratch> testList = asList(array);

        Random random = new Random();
        int index = random.nextInt(testList.size());

        return testList.get(index).toString();
    }
}
