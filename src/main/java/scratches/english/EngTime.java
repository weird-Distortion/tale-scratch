package scratches.english;

public enum EngTime implements EngScratch {
    DEEP_PAST("Deep past"),
    PAST("Past"),
    NOWADAYS("Nowadays"),
    FUTURE("Future"),
    DEEP_FUTURE("Deep future");

    private String time;

    EngTime(String hero) {
        this.time = hero;
    }

    @Override
    public String toString() {
        return "The time is " + this.time;
    }
}
