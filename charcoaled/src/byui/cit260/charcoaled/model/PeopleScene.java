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
public class PeopleScene implements Serializable {

    private Scene scene; 
    private Integer noPeople;
    private String challenge;
    private String description;

    public PeopleScene() {
    }
    
    
    
     //create getter and setter functions
    public Scene getScene() {
        return scene;
    }

    //class instance variables
    public void setScene(Scene scene) {
        this.scene = scene;
    }
    public Integer getNoPeople() {
        return noPeople;
    }

    public void setNoPeople(Integer noPeople) {
        this.noPeople = noPeople;
    }

    public String getChallenge() {
        return challenge;
    }

    public void setChallenge(String challenge) {
        this.challenge = challenge;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    @Override
    public String toString() {
        return "PeopleScene{" + "noPeople=" + noPeople + ", challenge=" + challenge + ", description=" + description + '}';
    }

    @Override
    public int hashCode() {
        int hash = 7;
        hash = 29 * hash + Objects.hashCode(this.noPeople);
        hash = 29 * hash + Objects.hashCode(this.challenge);
        hash = 29 * hash + Objects.hashCode(this.description);
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
        final PeopleScene other = (PeopleScene) obj;
        if (!Objects.equals(this.noPeople, other.noPeople)) {
            return false;
        }
        if (!Objects.equals(this.challenge, other.challenge)) {
            return false;
        }
        if (!Objects.equals(this.description, other.description)) {
            return false;
        }
        return true;
    }
    
}
