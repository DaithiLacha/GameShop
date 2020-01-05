package decorator;

public class SeasonPass extends AddOnDecorator {
    public SeasonPass(Game game) {
        this.game = game;
    }

    @Override
    public String getDescription() {
        return game.getDescription() + " and Season Pass";
    }

    public double cost() {
        return game.cost() + 24.99;
    }
}
