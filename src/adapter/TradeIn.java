package adapter;

import decorator.Game;
import factory.AssignGameType;
import factory.GameFactory;

import javax.swing.*;

/*
 * David O'Connor
 * Software Design Patterns CA - GameShop
 * github link: https://github.com/DaithiLacha/GameShop
 */

public class TradeIn {
    private double value;
    private Game gameTradingIn;

    public TradeIn() {
        boolean isValid = false;
        String platform;
        GameFactory gameFactory = new GameFactory();
        AssignGameType assignGameType = new AssignGameType(gameFactory);
        platform = JOptionPane.showInputDialog("Enter Trade in Platform");

        while(!isValid) {
            if(!platform.equalsIgnoreCase("PC") && !platform.equalsIgnoreCase("xbox") &&
                !platform.equalsIgnoreCase("play station")) {
                platform = JOptionPane.showInputDialog("Platform not found please re-enter: ");
            }else {
                isValid = true;
            }
        }
        gameTradingIn = assignGameType.determineGame(platform);
    }

    String makeTrade() {
        return "Title traded in: " + gameTradingIn.getName() +
                "\nPlatform: " + gameTradingIn.getDescription() +
                "\nGenre: " + gameTradingIn.getGenre();
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
}
