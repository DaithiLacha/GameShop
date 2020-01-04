package decorator;
import objects.Purchase;

public class CollectorsEdition extends AddOnDecorator {
    public CollectorsEdition(Game game) {
        this.game = game;
    }

    @Override
    public String getDescripiton() {
        return "Collector's Edition";
    }

    public double cost() {
        return game.cost() + 50;
    }
}
