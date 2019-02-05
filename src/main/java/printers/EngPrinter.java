package printers;

import logic.Picker;
import scratches.english.EngTime;
import scratches.english.EngLocations;
import scratches.english.EngScratch;
import scratches.english.EngMainCharacter;

import java.util.List;

import static java.util.Arrays.asList;

public class EngPrinter extends Printer {

    private Picker picker = new Picker();
    private List<EngScratch[]> scratches;

    public EngPrinter() {
        this.scratches =
                asList(EngTime.values(), EngLocations.values(), EngMainCharacter.values());
    }

    @Override
    public void printScratch() {
        scratches.forEach(scratch ->
                System.out.println(picker.pickElement(scratch)));
    }
}
