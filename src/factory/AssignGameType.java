package factory;

/*
 * David O'Connor
 * Software Design Patterns CA - GameShop
 * github link: https://github.com/DaithiLacha/GameShop
 */

import decorator.Game;

public class AssignGameType {
    private GameFactory factory;

    public AssignGameType(GameFactory factory) {
        this.factory = factory;
    }

    public Game determineGame(String type) {
        Game game;
        game = factory.createGame(type);

       game.assignName();
       game.assignGenre();


        return game;
    }
}
