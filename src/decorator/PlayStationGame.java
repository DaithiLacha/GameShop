package decorator;

public class PlayStationGame extends Game {
    public PlayStationGame() {
        platform = "Play Station";
    }

    public  double cost() {
        return 74.99;
    }
}
