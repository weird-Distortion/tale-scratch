package scratches.english;

public enum EngWeapon implements EngScratch {
    SWORD("a sword"),
    BOW("a bow");

    private String weapon;

    EngWeapon(String weapon) {
        this.weapon = weapon;
    }

    @Override
    public String toString() {
        return "the weapon is " + this.weapon;
    }
}
