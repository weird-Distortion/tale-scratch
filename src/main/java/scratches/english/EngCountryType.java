package scratches.english;

public enum EngCountryType implements EngScratch {
    USA("USA"),
    RUSSIA("Russia"),
    CHINA("China"),
    JAPAN("Japan"),
    UK("United Kingdom"),
    HOLLAND("Holland"),
    FRANCE("France"),
    ITALY("Italy"),
    SPAIN("Spain"),
    PORTUGAL("Portugal"),
    GERMANY("Germany"),
    POLAND("Poland"),
    CZECH("Czech Republic"),
    ROMAIN("Romain"),
    HUNGARY("Hungary"),
    INDIA("India"),
    AUSTRALIA("Australia"),
    BELARUS("Belarus"),
    EGYPT("Egypt"),
    LIBIA("Libia"),
    SIRYA("Sirya"),
    GEORGIA("Georgia"),
    UKRAINE("Ukraine"),
    AFRICA_COUNTRY("African country");

    private String countryType;

    EngCountryType(String countryType) {
        this.countryType = countryType;
    }

    @Override
    public String toString() {
        return "The country type is: " + countryType;
    }
}
