package scratches.russian;

import scratches.english.EngScratch;

public enum RusTime implements RusScratch {
    DEEP_PAST("Далекое прошлое"),
    PAST("Прошлое"),
    NOWADAYS("Современность"),
    FUTURE("Будущее"),
    DEEP_FUTURE("Далекое будущее");

    private String time;

    RusTime(String hero) {
        this.time = hero;
    }

    @Override
    public String toString() {
        return "Период во времени: " + this.time;
    }
}
