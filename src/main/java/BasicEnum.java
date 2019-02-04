import logic.EngPicker;
import logic.Picker;
import logic.RusPicker;

public enum BasicEnum {

    ENG("Welcome") {
        @Override
        public void print() {
            Picker engPicker = new EngPicker();
            engPicker.printScratch();
        }
    },
    RUS("Добро пожаловать") {
        @Override
        public void print() {
            Picker rusPicker = new RusPicker();
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
