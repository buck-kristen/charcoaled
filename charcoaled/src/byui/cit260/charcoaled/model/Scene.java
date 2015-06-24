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
 * @author justdance2007
 */
public class Scene implements Serializable {

    private CluesScene clues; 
    private ResourceScene resource;
    private PeopleScene people; 
    private String description;
    private double timeRemaining;

    public Scene() {
    }
    
    
    //create getter and setter functions
        public CluesScene getClues() {
        return clues;
    }

    public void setClues(CluesScene clues) {
        this.clues = clues;
    }

    public ResourceScene getResource() {
        return resource;
    }

    public void setResource(ResourceScene resource) {
        this.resource = resource;
    }

    public PeopleScene getPeople() {
        return people;
    }

    //class instance variables
    public void setPeople(PeopleScene people) {
        this.people = people;
    }
    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public double getTimeRemaining() {
        return timeRemaining;
    }

    public void setTimeRemaining(double timeRemaining) {
        this.timeRemaining = timeRemaining;
    }

    @Override
    public String toString() {
        return "Scene{" + "description=" + description + ", timeRemaining=" + timeRemaining + '}';
    }

    @Override
    public int hashCode() {
        int hash = 3;
        hash = 29 * hash + Objects.hashCode(this.description);
        hash = 29 * hash + (int) (Double.doubleToLongBits(this.timeRemaining) ^ (Double.doubleToLongBits(this.timeRemaining) >>> 32));
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
        final Scene other = (Scene) obj;
        if (!Objects.equals(this.description, other.description)) {
            return false;
        }
        if (Double.doubleToLongBits(this.timeRemaining) != Double.doubleToLongBits(other.timeRemaining)) {
            return false;
        }
        return true;
    }
    
}
