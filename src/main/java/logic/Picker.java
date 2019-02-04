package logic;

import scratches.Scratch;

import java.util.List;
import java.util.Random;

import static java.util.Arrays.asList;

public class Picker {

    public String pickElement(Scratch[] array) {
        List<Scratch> testList = asList(array);

        Random random = new Random();
        int index = random.nextInt(testList.size());

        return testList.get(index).toString();
    }
}
