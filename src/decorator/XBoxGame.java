package decorator;

/*
 * David O'Connor
 * Software Design Patterns CA - GameShop
 * github link: https://github.com/DaithiLacha/GameShop
 */

public class XBoxGame extends Game {
    public XBoxGame() {
        description = "XBox";
    }

    public  double cost() {
        return 69.99;
    }
}
