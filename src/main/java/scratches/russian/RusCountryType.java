package scratches.russian;

public enum RusCountryType implements RusScratch {
    USA("США"),
    RUSSIA("Россия"),
    CHINA("Китай"),
    JAPAN("Япония"),
    UK("Соединенное Королевство"),
    HOLLAND("Голландия"),
    FRANCE("Франция"),
    ITALY("Италия"),
    SPAIN("Испания"),
    PORTUGAL("Португалия"),
    GERMANY("Германия"),
    POLAND("Польша"),
    CZECH("Чехия"),
    ROMAIN("Румыния"),
    HUNGARY("Венгрия"),
    INDIA("Индия"),
    AUSTRALIA("Австралия"),
    BELARUS("Беларусь"),
    EGYPT("Египет"),
    LIBIA("Ливия"),
    SIRYA("Сирия"),
    GEORGIA("Грузия"),
    UKRAINE("Украина"),
    AFRICA_COUNTRY("Африканская страна");

    private String countryType;

    RusCountryType(String countryType) {
        this.countryType = countryType;
    }

    @Override
    public String toString() {
        return "Тип страны: " + countryType;
    }
}
