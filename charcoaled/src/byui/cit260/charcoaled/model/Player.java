/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package byui.cit260.charcoaled.model;

import java.io.Serializable;
import java.util.Objects;

/**
 *
 * @author Family
 */
public class Player implements Serializable{

    private Game[] startGame;
    private Actor actor; 
    private String name;


    public Player() {
    }
    //getter setter functions
        public Game[] getStartGame() {
        return startGame;
    }

    public void setStartGame(Game[] startGame) {
        this.startGame = startGame;
    }

    public Actor getActor() {
        return actor;
    }

    // class instance variables
    public void setActor(Actor actor) {
        this.actor = actor;
    }
    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }


    @Override
    public String toString() {
        return "Player{" + "name=" + name + '}';
    }

    
    
    
}
