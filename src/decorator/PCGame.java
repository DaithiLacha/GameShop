package decorator;

public class PCGame extends Game {
    public PCGame() {
        platform = "Unknown platform";
    }

    public double cost() {
        return 45;
    }
}
