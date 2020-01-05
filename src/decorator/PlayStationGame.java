package decorator;

public class PlayStationGame extends Game {
    public PlayStationGame() {
        description = "Play Station";
    }

    public  double cost() {
        return 74.99;
    }
}
