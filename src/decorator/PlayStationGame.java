package decorator;

/*
 * David O'Connor
 * Software Design Patterns CA - GameShop
 * github link: https://github.com/DaithiLacha/GameShop
 */

public class PlayStationGame extends Game {
    public PlayStationGame() {
        description = "Play Station";
    }

    public  double cost() {
        return 74.99;
    }
}
