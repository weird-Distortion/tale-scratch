package scratches.russian;

public enum RusLocations implements RusScratch {
    RUSSIA("россия"),
    USA("сша");

    private String loc;

    RusLocations(String loc) {
        this.loc = loc;
    }

    @Override
    public String toString() {
        return this.loc;
    }
}
