package factory;

import decorator.Game;
import decorator.PCGame;
import decorator.PlayStationGame;
import decorator.XBoxGame;


public class GameFactory {
    Game createGame(String gameTypeType) {
        Game game = null;

        if(gameTypeType.equalsIgnoreCase("PC")) {
            game = new PCGame();
        }else if(gameTypeType.equalsIgnoreCase("XBox")) {
            game = new XBoxGame();
        }else if(gameTypeType.equalsIgnoreCase("Play Station")) {
            game = new PlayStationGame();
        }else {
            game = new PCGame();
        }
        return game;
    }
}
