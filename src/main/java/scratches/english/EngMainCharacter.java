package scratches.english;

public enum EngMainCharacter implements EngScratch {
    HUMAN("Human"),
    CYBORG("Cyborg"),
    DWARF("Dwarf"),
    AI("Artificial intelligence"),
    CHILD("Child"),
    ELF("Elf"),
    ALIEN("Alien"),
    NERD("Nerd"),
    KILLER("Killer"),
    THIEF("Thief"),
    GOBLIN("Goblin"),
    GOD("God"),
    WRITER("Writer"),
    WORKER("Worker"),
    ATHLETE("Athlete"),
    DEVELOPER("Developer"),
    GAMER("Gamer"),
    TEACHER("Teacher"),
    PROFESSOR("Professor"),
    KNIGHT("Knight"),
    VAMPIRE("Vampire"),
    ZOMBIE("Zombie"),
    WIZARD("Wizard"),
    LAWYER("Lawyer"),
    KING("King"),
    GOVERNMENT("Government");

    private String mainCharacter;

    EngMainCharacter(String mainCharacter) {
        this.mainCharacter = mainCharacter;
    }

    @Override
    public String toString() {
        return "the antagonist/protagonist is " + this.mainCharacter;
    }
}
