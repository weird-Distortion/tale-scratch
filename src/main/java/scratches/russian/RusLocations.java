package scratches.russian;

import scratches.english.EngScratch;

public enum RusLocations implements RusScratch {
    WASTELAND("Пустошь"),
    DESERT("Пустыня"),
    SMALL_TOWN("Небольшой городок"),
    BIG_CITY("Мегаполис"),
    ABANDONED_HOUSE("Заброшенный дом"),
    OFFICE("Офис"),
    GLADE("Поляна"),
    FOREST("Лес"),
    SCHOOL("Учебное заведение"),
    HOUSE("Дом"),
    GYM("Тренажерный зал"),
    STORE("Магазин/торговый центр и тд"),
    ELEVATOR("Лифт"),
    ARCTIC("Арктика/холод"),
    FABRIC("Завод"),
    SWAMP("Болото"),
    RADIOACTIVE_WASTELAND("Радиоактивная пустошь"),
    KINGDOM("Королевство"),
    BATTLEFIELD("Поле боя");

    private String location;

    RusLocations(String loc) {
        this.location = loc;
    }

    @Override
    public String toString() {
        return "Локация: " + this.location;
    }
}
