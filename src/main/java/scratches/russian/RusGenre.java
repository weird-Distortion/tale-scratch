package scratches.russian;

import scratches.english.EngScratch;

public enum RusGenre implements RusScratch{
    CRIME("Криминал/Детектив"),
    FAIRY_TALE("Сказка"),
    FANTASY("Фэнтези"),
    HORROR("Ужасы"),
    HUMOR("Юмор"),
    MYSTERY("Мистика"),
    SCIFI("Псевдонаучная фантастика"),
    WESTERN("Вестерн"),
    THRILLER("Триллер"),
    ADVENTURE("Приключения"),
    CHILDRENS("Детская литература"),
    STEAMPUNK("Стимпанк"),
    CYBERPUNK("Киберпанк"),
    POST_APOCALYPTIC("Пост-апокалипсис"),
    SPACE_OPERA("Космическая опера");

    private String genre;

    RusGenre(String genre) {
        this.genre = genre;
    }

    @Override
    public String toString() {
        return "Жанр: " + this.genre;
    }
}
