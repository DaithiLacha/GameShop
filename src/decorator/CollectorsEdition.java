package decorator;

/*
 * David O'Connor
 * Software Design Patterns CA - GameShop
 * github link: https://github.com/DaithiLacha/GameShop
 */

public class CollectorsEdition extends AddOnDecorator {
    public CollectorsEdition(Game game) {
        this.game = game;
    }

    @Override
    public String getName() {
        return game.getName();
    }

    @Override
    public String getGenre() {
        return game.getGenre();
    }

    @Override
    public String getDescription() {
        return game.getDescription() +
                " and Collector's Edition";
    }

    public double cost() {
        return game.cost() + 50;
    }
}
