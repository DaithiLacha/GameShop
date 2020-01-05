package factory;

/*
 * David O'Connor
 * Software Design Patterns CA - GameShop
 * github link: https://github.com/DaithiLacha/GameShop
 */

import decorator.Game;
import decorator.PCGame;
import decorator.PlayStationGame;
import decorator.XBoxGame;


public class GameFactory {
    Game createGame(String gameType) {
        Game game = null;

        if(gameType.equalsIgnoreCase("PC")) {
            game = new PCGame();
        }else if(gameType.equalsIgnoreCase("XBox")) {
            game = new XBoxGame();
        }else if(gameType.equalsIgnoreCase("Play Station")) {
            game = new PlayStationGame();
        }

        return game;
    }
}
