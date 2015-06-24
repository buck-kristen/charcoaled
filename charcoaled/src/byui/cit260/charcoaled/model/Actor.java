/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package byui.cit260.charcoaled.model;

import java.awt.Point;
import java.io.Serializable;
import java.util.Objects;

/**
 *
 * @author Keller Z570 Laptop
 */
public enum Actor implements Serializable { //removed class inserted enum p3 of pdf wk 9
    
    Jake("Firefighter man coming to the rescue");

    private Game game;
    private Locations location; //on my map it shows 0..1 not just 1 so not sure if this is correct?
   // private String name; DELETE p3 
    private final String description;
    private final Point coordinates; //added final p.4

    // default constructor function
     Actor(String description) {
        this.description = description;
        coordinates = new Point (1,1);
}
   

        
    /*public String getName() {
        return name;
    } 

    public void setName(String name) {
        this.name = name;
    } DELETE p3 */
     
    public Game getGame() {
        return game;
    }

    public void setGame(Game game) {
        this.game = game;
    }

    public Locations getLocation() {
        return location;
    }

    // class instance variables
    public void setLocation(Locations location) {
        this.location = location;
    }
    public String getDescription() {
        return description; 
    }
    public Point getCoordinates() {
        return coordinates;
    }

    /*public void setCoordinates(String coordinates) {
        this.coordinates = coordinates;
    } DELETE p4*/

   /* @Override
    public String toString() {
        return "Actor{" + "name=" + name +  ", coordinates=" + coordinates + '}';
    }  NOT SURE IF I NEED THIS */
/*
    @Override
    public int hashCode() {
        int hash = 7;
        hash = 31 * hash + Objects.hashCode(this.name);
        hash = 31 * hash + Objects.hashCode(this.coordinates);
        return hash;
    }

    @Override
    public boolean equals(Object obj) {
        if (obj == null) {
            return false;
        }
        if (getClass() != obj.getClass()) {
            return false;
        }
        final Actor other = (Actor) obj;
        if (!Objects.equals(this.name, other.name)) {
            return false;
        }
        if (!Objects.equals(this.coordinates, other.coordinates)) {
            return false;
        }
        return true;
    }
     DELETE p5*/   
}
