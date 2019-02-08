package logic;

import java.util.List;
import java.util.Random;

public class Picker {

    public String pickElement(List<String> list) {

        Random random = new Random();
        int index = random.nextInt(list.size());

        return list.get(index);
    }
}
