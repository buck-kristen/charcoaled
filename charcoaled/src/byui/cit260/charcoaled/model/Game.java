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
    private Resource[] resources; 
    //private double totalTime;//should I include this since I don't want to use time in the game?
    
    // default constructor function
    public Game() {
        resources = new Resource[5]; 
        resources[0] = new Resource(Resources.rope, 2); 
        resources[1] = new Resource(Resources.axe, 4); 
        resources[2] = new Resource(Resources.water, 3); 
        resources[3] = new Resource(Resources.masterKey, 1); 
        resources[4] = new Resource(Resources.extinguisher, 2); 
    }

    public Resource[] getResources() {
        return resources;
    }

    public void setResources(Resource[] resources) {
        this.resources = resources;
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
