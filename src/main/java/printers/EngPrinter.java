package printers;

import logic.Picker;
import scratches.english.*;

import java.util.List;

import static java.util.Arrays.asList;

public class EngPrinter extends Printer {

    private Picker picker = new Picker();
    private List<EngScratch[]> scratches;

    public EngPrinter() {
        this.scratches =
                asList(EngCharacterAmount.values(), EngMainCharacter.values(),
                        EngMainCharacter.values(), EngLocations.values(),
                        EngCountryType.values(), EngTime.values(),
                        EngGenre.values());
    }

    @Override
    public void printScratch() {
        scratches.forEach(scratch ->
                System.out.println(picker.pickElement(scratch)));
    }
}
