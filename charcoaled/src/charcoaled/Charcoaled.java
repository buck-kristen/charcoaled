/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package charcoaled;

import byui.cit260.charcoaled.model.CluesScene;
import byui.cit260.charcoaled.model.PeopleScene;
import byui.cit260.charcoaled.model.Player;
import byui.cit260.charcoaled.model.ResourceScene;
import byui.cit260.charcoaled.model.Scene;

/**
 *
 * @author Family
 */
public class Charcoaled {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Player playerOne = new Player();
        
        playerOne.setName("Kristen Buck");
        playerOne.setBestTime(7.00);
        
        String playerInfo = playerOne.toString();
        System.out.println(playerInfo);
        
        //create instance for Scene
        Scene sceneOne = new Scene();
        
        sceneOne.setDescription("description");
        sceneOne.setTimeRemaining(2.00);
        
        //call system out function for Scene
        String sceneInfo = sceneOne.toString(); 
        System.out.println(sceneInfo);
        
        //create instance for ResourceScene
        ResourceScene resourceSceneOne = new ResourceScene();
        
        
        resourceSceneOne.setPlayerInventory("playerInventory");
        resourceSceneOne.setResourceList("resourceList");
        resourceSceneOne.setDescription("description");
        
        //call system out function for ResourceScene
        String resourceSceneInfo = resourceSceneOne.toString();
        System.out.println(resourceSceneInfo);
        
        //create instance for PeopleScene
        PeopleScene peopleSceneOne = new PeopleScene();
        
        peopleSceneOne.setNoPeople(1);
        peopleSceneOne.setChallenge("challenge");
        peopleSceneOne.setDescription("description");
        
          //call system out function for PeopleScene
        String peopleSceneInfo = peopleSceneOne.toString();
        System.out.println(peopleSceneInfo);
        
        //create instance for CluesScene
        CluesScene cluesSceneOne = new CluesScene();
        
        cluesSceneOne.setDescription("description");
        cluesSceneOne.setCluesQuestion("cluesQuestion");
        
          //call system out function for CluesScene
        String cluesSceneOneInfo = cluesSceneOne.toString();
        System.out.println(cluesSceneOneInfo);
        
    }
    
}
