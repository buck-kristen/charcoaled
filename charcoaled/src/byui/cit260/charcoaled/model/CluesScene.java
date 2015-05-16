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
public class CluesScene implements Serializable {
    //class instance variables
    private String description;
    private String cluesQuestion;

    public CluesScene() {
    }
    
    
    
     //create getter and setter functions

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public String getCluesQuestion() {
        return cluesQuestion;
    }

    public void setCluesQuestion(String cluesQuestion) {
        this.cluesQuestion = cluesQuestion;
    }

    @Override
    public String toString() {
        return "CluesScene{" + "description=" + description + ", cluesQuestion=" + cluesQuestion + '}';
    }

    @Override
    public int hashCode() {
        int hash = 3;
        hash = 59 * hash + Objects.hashCode(this.description);
        hash = 59 * hash + Objects.hashCode(this.cluesQuestion);
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
        final CluesScene other = (CluesScene) obj;
        if (!Objects.equals(this.description, other.description)) {
            return false;
        }
        if (!Objects.equals(this.cluesQuestion, other.cluesQuestion)) {
            return false;
        }
        return true;
    }
    
}
