import logic.EngPrinter;
import logic.Printer;
import logic.RusPrinter;

public enum BasicEnum {

    ENG("Welcome") {
        @Override
        public void print() {
            Printer engPicker = new EngPrinter();
            engPicker.printScratch();
        }
    },
    RUS("Добро пожаловать") {
        @Override
        public void print() {
            Printer rusPicker = new RusPrinter();
            rusPicker.printScratch();
        }
    };

    private String message;

    BasicEnum(String message) {
        this.message = message;
    }

    public abstract void print();

    @Override
    public String toString() {
        return message;
    }
}
