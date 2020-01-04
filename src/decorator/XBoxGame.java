package decorator;

public class XBoxGame extends Game {
    public XBoxGame() {
        platform = "XBox";
    }

    public  double cost() {
        return 69.99;
    }
}
