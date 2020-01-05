package decorator;

/*
 * David O'Connor
 * Software Design Patterns CA - GameShop
 * github link: https://github.com/DaithiLacha/GameShop
 */

public abstract class AddOnDecorator extends Game {
    Game game;
    public abstract String getName();
    public abstract String getGenre();
    public abstract String getDescription();
}
