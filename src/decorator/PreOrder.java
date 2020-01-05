package decorator;

public class PreOrder extends AddOnDecorator {
    public PreOrder(Game game) {
        this.game = game;
    }

    @Override
    public String getDescription() {
        return game.getDescription() + "and Preorder";
    }

    public double cost() {
        return game.cost() + 2.50;
    }
}
