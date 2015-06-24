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
public class ResourceScene implements Serializable {

    private Scene scene; 
    private String playerInventory;
    private String resourceList;
    private String description;

    public ResourceScene() {
    }
    
    
     //create getter and setter functions
    public Scene getScene() {
        return scene;
    }

    //class instance variables
    public void setScene(Scene scene) {
        this.scene = scene;
    }
    public String getPlayerInventory() {
        return playerInventory;
    }

    public void setPlayerInventory(String playerInventory) {
        this.playerInventory = playerInventory;
    }

    public String getResourceList() {
        return resourceList;
    }

    public void setResourceList(String resourceList) {
        this.resourceList = resourceList;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    @Override
    public String toString() {
        return "ResourceScene{" + "playerInventory=" + playerInventory + ", resourceList=" + resourceList + ", description=" + description + '}';
    }

    @Override
    public int hashCode() {
        int hash = 7;
        hash = 67 * hash + Objects.hashCode(this.playerInventory);
        hash = 67 * hash + Objects.hashCode(this.resourceList);
        hash = 67 * hash + Objects.hashCode(this.description);
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
        final ResourceScene other = (ResourceScene) obj;
        if (!Objects.equals(this.playerInventory, other.playerInventory)) {
            return false;
        }
        if (!Objects.equals(this.resourceList, other.resourceList)) {
            return false;
        }
        if (!Objects.equals(this.description, other.description)) {
            return false;
        }
        return true;
    }
    
    
}
