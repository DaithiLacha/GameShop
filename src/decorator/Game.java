package decorator;

/*
 * David O'Connor
 * Software Design Patterns CA - GameShop
 * github link: https://github.com/DaithiLacha/GameShop
 */

import javax.swing.*;

public abstract class Game {
    private String name;
    String description = "Unknown Platform";
    private String genre;

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public void assignName() {
        name = JOptionPane.showInputDialog("Enter title");
    }

    public void assignGenre() {
        genre = JOptionPane.showInputDialog("Enter genre");
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getGenre() {
        return genre;
    }

    public void setGenre(String genre) {
        this.genre = genre;
    }

    public abstract double cost();
}
