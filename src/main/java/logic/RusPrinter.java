package logic;

import scratches.russian.RusHeroes;
import scratches.russian.RusLocations;
import scratches.russian.RusScratch;

import java.util.List;

import static java.util.Arrays.asList;

public class RusPrinter extends Printer {

    private Picker picker = new Picker();
    private List<RusScratch[]> scratches;

    public RusPrinter() {
        this.scratches =
                asList(RusHeroes.values(), RusLocations.values());
    }

    @Override
    public void printScratch() {
        scratches.forEach(scratch ->
                System.out.println(picker.pickElement(scratch)));
    }
}
