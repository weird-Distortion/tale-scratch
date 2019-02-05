package scratches.russian;

public enum RusCharacterAmount implements RusScratch {
    ZERO("0"),
    ONE("1"),
    TWO("2"),
    THREE("3"),
    FOUR("4"),
    FIVE("5");

    private String number;

    RusCharacterAmount(String number) {
        this.number = number;
    }

    @Override
    public String toString() {
        return "Количество героев: " + this.number;
    }
}
