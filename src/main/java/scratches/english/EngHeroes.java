package scratches.english;

public enum EngHeroes implements EngScratch {
    MAN("Some man"),
    WOMAN("Some woman");

    private String hero;

    EngHeroes(String hero) {
        this.hero = hero;
    }

    @Override
    public String toString() {
        return "The hero is " + this.hero;
    }
}
