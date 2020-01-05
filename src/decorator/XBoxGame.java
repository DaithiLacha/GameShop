package decorator;

public class XBoxGame extends Game {
    public XBoxGame() {
        description = "XBox";
    }

    public  double cost() {
        return 69.99;
    }
}
