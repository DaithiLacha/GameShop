package decorator;

public abstract class Game {
    private String name;
    String platform = "Unknown Platform";
    private String genre;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getGenre() {
        return genre;
    }

    public void setGenre(String genre) {
        this.genre = genre;
    }

    public abstract double cost();
}
