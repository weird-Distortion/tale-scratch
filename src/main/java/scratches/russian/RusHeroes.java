package scratches.russian;

public enum RusHeroes implements RusScratch{
    MAN("Мужчина"),
    WOMAN("Женщина");

    private String hero;

    RusHeroes(String hero) {
        this.hero = hero;
    }

    @Override
    public String toString() {
        return this.hero;
    }
}
