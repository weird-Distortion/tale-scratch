package scratches.english;

public enum EngLocations implements EngScratch {
    RUSSIA("russia"),
    USA("usa");

    private String loc;

    EngLocations(String loc) {
        this.loc = loc;
    }

    @Override
    public String toString() {
        return "The location is " + this.loc;
    }
}
