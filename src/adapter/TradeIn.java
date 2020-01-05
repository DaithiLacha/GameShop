package adapter;

import decorator.Game;
import factory.AssignGameType;
import factory.GameFactory;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class TradeIn {
    private double value;
    private Game gameTradingIn;

    public TradeIn() {
        String platform = "";
        BufferedReader info = new BufferedReader(new InputStreamReader(System.in));
        GameFactory gameFactory = new GameFactory();
        AssignGameType assignGameType = new AssignGameType(gameFactory);
        try {
            System.out.println("Platform: ");
            platform = (info.readLine());

        } catch (IOException e) {
            e.printStackTrace();
        }
        gameTradingIn = assignGameType.determineGame(platform);
    }

    public double getValue() {
        return value;
    }

    public void setValue(double value) {
        this.value = value;
    }

    public Game getGameTradingIn() {
        return gameTradingIn;
    }

    public void setGameTradingIn(Game gameTradingIn) {
        this.gameTradingIn = gameTradingIn;
    }

    public void makeTrade() {
        BufferedReader info = new BufferedReader(new InputStreamReader(System.in));
        try {
            System.out.println("Title: ");
            gameTradingIn.setName(info.readLine());

            System.out.println("Genre: ");
            gameTradingIn.setGenre(info.readLine());
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    @Override
    public String toString() {
        return "Title traded in: " + gameTradingIn.getName() +
                "\nPlatform: " + gameTradingIn.getDescription() +
                "\nGenre: " + gameTradingIn.getGenre();
    }
}
