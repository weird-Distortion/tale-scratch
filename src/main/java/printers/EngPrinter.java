package printers;

import logic.Picker;
import scratches.english.EngHeroes;
import scratches.english.EngLocations;
import scratches.english.EngScratch;
import scratches.english.EngWeapon;

import java.util.List;

import static java.util.Arrays.asList;

public class EngPrinter extends Printer {

    private Picker picker = new Picker();
    private List<EngScratch[]> scratches;

    public EngPrinter() {
        this.scratches =
                asList(EngHeroes.values(), EngLocations.values(), EngWeapon.values());
    }

    @Override
    public void printScratch() {
        scratches.forEach(scratch ->
                System.out.println(picker.pickElement(scratch)));
    }
}
