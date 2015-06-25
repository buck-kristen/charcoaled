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
 * @author Keller Z570 Laptop
 */
public class Location implements Serializable {
    
    private Actor actor;
    private Scene scene;
    private String row;
    private String column;
    private boolean visited;


    // default constructor function
    public Location() {
    }
        
    //getter setter functions

    public Actor getActor() {
        return actor;
    }

    public void setActor(Actor actor) {
        this.actor = actor;
    }

    public Scene getScene() {
        return scene;
    }

    // class instance variables
    public void setScene(Scene scene) {
        this.scene = scene;
    }
    public String getRow() {
        return row;
    }

    public void setRow(String row) {
        this.row = row;
    }

    public String getColumn() {
        return column;
    }

    public void setColumn(String column) {
        this.column = column;
    }

    public boolean isVisited() {
        return visited;
    }

    public void setVisited(boolean visited) {
        this.visited = visited;
    }

    @Override
    public String toString() {
        return "Locations{" + "row=" + row + ", column=" + column + ", visited=" + visited + '}';
    }

    @Override
    public boolean equals(Object obj) {
        if (obj == null) {
            return false;
        }
        if (getClass() != obj.getClass()) {
            return false;
        }
        final Location other = (Location) obj;
        if (!Objects.equals(this.row, other.row)) {
            return false;
        }
        if (!Objects.equals(this.column, other.column)) {
            return false;
        }
        if (this.visited != other.visited) {
            return false;
        }
        return true;
    }
        
}
