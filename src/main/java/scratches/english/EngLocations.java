package scratches.english;

public enum EngLocations implements EngScratch {
    WASTELAND("russia"),
    DESERT("usa"),
    SMALL_TOWN("Small town"),
    BIG_CITY("Big city"),
    ABANDONED_HOUSE("Abandoned house"),
    OFFICE("Office"),
    GLADE("Glade"),
    FOREST("Forest"),
    SCHOOL("School"),
    HOUSE("House"),
    GYM("Gym"),
    STORE("Store"),
    ELEVATOR("Elevator"),
    ARCTIC("Arctic"),
    FABRIC("Fabric"),
    SWAMP("Swamp"),
    RADIOACTIVE_WASTELAND("Radioactive wasteland"),
    KINGDOM("Kingdom"),
    BATTLEFIELD("Battlefield");

    private String location;

    EngLocations(String loc) {
        this.location = loc;
    }

    @Override
    public String toString() {
        return "The location is " + this.location;
    }
}
