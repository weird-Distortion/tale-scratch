package scratches.russian;

import scratches.english.EngScratch;

public enum RusMainCharacter implements RusScratch {
    HUMAN("Человек"),
    CYBORG("Киборг"),
    DWARF("Гном"),
    AI("Искусственный интеллект"),
    CHILD("Ребенок"),
    ELF("Эльф"),
    ALIEN("Пришелец"),
    NERD("Ботан/задрот"),
    KILLER("Убийца"),
    THIEF("Вор"),
    GOBLIN("Гоблин"),
    GOD("Бог"),
    WRITER("Писатель"),
    WORKER("Рабочий"),
    ATHLETE("Спортсмен"),
    DEVELOPER("Разработчик"),
    GAMER("Игрок"),
    TEACHER("Учитель"),
    PROFESSOR("Профессор"),
    KNIGHT("Рыцарь"),
    VAMPIRE("Вампир"),
    ZOMBIE("Зомби"),
    WIZARD("Волшебник"),
    LAWYER("Адвокат"),
    KING("Король/Император"),
    GOVERNMENT("Правительство");

    private String mainCharacter;

    RusMainCharacter(String mainCharacter) {
        this.mainCharacter = mainCharacter;
    }

    @Override
    public String toString() {
        return "Антагонист/Протагонист: " + this.mainCharacter;
    }
}
