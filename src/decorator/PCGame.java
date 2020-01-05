package decorator;

/*
 * David O'Connor
 * Software Design Patterns CA - GameShop
 * github link: https://github.com/DaithiLacha/GameShop
 */

public class PCGame extends Game {
    public PCGame() {
        description = "PC";
    }

    public double cost() {
        return 45;
    }
}
