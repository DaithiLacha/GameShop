package factory;

import decorator.Game;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class AssignGameType {
    private GameFactory factory;

    public AssignGameType(GameFactory factory) {
        this.factory = factory;
    }

    public Game determineGame(String type) {
        Game game;
        game = factory.createGame(type);

        return game;
    }
}
