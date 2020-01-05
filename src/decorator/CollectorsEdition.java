package decorator;
import objects.Purchase;

public class CollectorsEdition extends AddOnDecorator {
    public CollectorsEdition(Game game) {
        this.game = game;
    }

    @Override
    public String getDescription() {
        return game.getDescription() + " and Collector's Edition";
    }

    public double cost() {
        return game.cost() + 50;
    }
}
