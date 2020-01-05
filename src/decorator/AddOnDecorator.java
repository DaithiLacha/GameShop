package decorator;

public abstract class AddOnDecorator extends Game {
    Game game;
    public abstract String getName();
    public abstract String getGenre();
    public abstract String getDescription();
}
