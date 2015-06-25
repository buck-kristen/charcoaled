/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package byui.cit260.charcoaled.model;

import java.io.Serializable;

/**
 *
 * @author Keller Z570 Laptop
 */
public class Game implements Serializable {
   
    private Player player; //create new player object in GameControl
    private Actor[] actors;
    private Map gameMap;
    //private double totalTime;//should I include this since I don't want to use time in the game?
    
    // default constructor function
    public Game() {
    }
    
    //getter setter functions
        public Player getPlayer() {
        return player;
    }

    public void setPlayer(Player player) {
        this.player = player;
    }

    public Actor[] getActors() {
        return actors;
    }

    public void setActors(Actor[] actors) {
        this.actors = actors;
    }

    public Map getGameMap() {
        return gameMap;
    }

    // class instance variables
    public void setGameMap(Map gameMap) {
        this.gameMap = gameMap;
    }



    @Override
    public String toString() {
        return "Game";
    }


    @Override
    public boolean equals(Object obj) {
        if (obj == null) {
            return false;
        }
        if (getClass() != obj.getClass()) {
            return false;
        }
        final Game other = (Game) obj;
        return true;
    }
        
}
