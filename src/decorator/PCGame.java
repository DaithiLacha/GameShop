package decorator;

public class PCGame extends Game {
    public PCGame() {
        description = "PC";
    }

    public double cost() {
        return 45;
    }
}
