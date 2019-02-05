package scratches.english;

public enum EngCharacterAmount implements EngScratch {
    ZERO("0"),
    ONE("1"),
    TWO("2"),
    THREE("3"),
    FOUR("4"),
    FIVE("5");

    private String number;

    EngCharacterAmount(String number) {
        this.number = number;
    }

    @Override
    public String toString() {
        return "main characters: " + this.number;
    }
}
