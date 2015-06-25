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
public class Map implements Serializable {
    
    //private Game game;
    private Location[][] locations; 
    private String row;
    private String column;

    // default constructor function
    public Map() {
    }
    
    /*    public Game getGame() {
        return game;
    }

    public void setGame(Game game) {
        this.game = game;
    }*/

    public Location[][] getLocations() {
        return locations;
    }

    // class instance variables
    public void setLocations(Location[][] locations) {
        this.locations = locations;
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

    @Override
    public String toString() {
        return "Map{" + "row=" + row + ", column=" + column + '}';
    }

    @Override
    public int hashCode() {
        int hash = 7;
        hash = 19 * hash + Objects.hashCode(this.row);
        hash = 19 * hash + Objects.hashCode(this.column);
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
        final Map other = (Map) obj;
        if (!Objects.equals(this.row, other.row)) {
            return false;
        }
        if (!Objects.equals(this.column, other.column)) {
            return false;
        }
        return true;
    }
        
}
