package printers;

import logic.Picker;
import scratches.russian.*;

import java.util.List;

import static java.util.Arrays.asList;

public class RusPrinter extends Printer {

    private Picker picker = new Picker();
    private List<RusScratch[]> scratches;

    public RusPrinter() {
        this.scratches =
                asList(RusCharacterAmount.values(), RusMainCharacter.values(),
                        RusMainCharacter.values(), RusLocations.values(),
                        RusCountryType.values(), RusTime.values(),
                        RusGenre.values());
    }

    @Override
    public void printScratch() {
        scratches.forEach(scratch ->
                System.out.println(picker.pickElement(scratch)));
    }
}
