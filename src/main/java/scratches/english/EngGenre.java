package scratches.english;

public enum EngGenre implements EngScratch{
    CRIME("Crime/detective"),
    FAIRY_TALE("Fairy tale"),
    FANTASY("Fantasy"),
    HORROR("Horror"),
    HUMOR("Humor"),
    MYSTERY("Mystery"),
    SCIFI("Sci-Fi"),
    WESTERN("Western"),
    THRILLER("Thriller"),
    ADVENTURE("Adventure"),
    CHILDRENS("Children's"),
    STEAMPUNK("Steampunk"),
    CYBERPUNK("Cyperpunk"),
    POST_APOCALYPTIC("Post apocaliptic"),
    SPACE_OPERA("Space opera");

    private String genre;

    EngGenre(String genre) {
        this.genre = genre;
    }

    @Override
    public String toString() {
        return "The genre is: " + this.genre;
    }
}
