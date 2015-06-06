/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package charcoaled;

import byui.cit260.charcoaled.model.Actor;
import byui.cit260.charcoaled.model.Game;
import byui.cit260.charcoaled.model.Locations;
import byui.cit260.charcoaled.model.Map;
import byui.cit260.charcoaled.model.Player;
import byui.cit260.charcoaled.model.CluesScene;
import byui.cit260.charcoaled.model.PeopleScene;
import byui.cit260.charcoaled.model.ResourceScene;
import byui.cit260.charcoaled.model.Scene;
import byui.cit260.charcoaled.view.StartProgramView;

/**
 *
 * @author Family
 */ 
public class Charcoaled {
    private static Object totalTime;
    private static Game currentGame = null;
    private static Player player = null;

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        /** REMOVE IF NOT NEEDED 06/04/15
        // test Game class
        Game gameCharcoaled = new Game();
        
        gameCharcoaled.setTotalTime(15.50);
        
        String gameInfo = gameCharcoaled.toString();
        System.out.println(gameInfo);
        
        
        // test Player class
        Player playerOne = new Player();
        
        playerOne.setName("Kristen Buck");
        playerOne.setBestTime(7.00);
        
        String playerInfo = playerOne.toString();
        System.out.println(playerInfo);
        
        
        
        // test Map class
        Map gameMap = new Map();
        
        gameMap.setRow("R1");
        gameMap.setColumn("C1");
        
        String mapInfo = gameMap.toString();
        System.out.println(mapInfo);
        
        
        // test Actor class
        Actor nonplayerCharacter = new Actor();
        
        nonplayerCharacter.setName("Old Lady");
        nonplayerCharacter.setGender("Female");
        nonplayerCharacter.setCoordinates("R3" + " , " + "C4");
        
        String actorInfo = nonplayerCharacter.toString();
        System.out.println(actorInfo);
        
        
        // test Locations class
        Locations gameLocations = new Locations();
        
        gameLocations.setRow("R3");
        gameLocations.setColumn("C2");
        gameLocations.setVisited(false);
        gameLocations.setTimeRemaining(6.33);
        
        String locationsInfo = gameLocations.toString();
        System.out.println(locationsInfo);
        
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
        * 
        * */
    //create StartProgramView and start program
        StartProgramView startProgramView = new StartProgramView ();
        startProgramView.startProgram(); 
        
    //create function for getPlayersName; I removed this because it was repeating the name twice when running project
     //   StartProgramView playersName = new StartProgramView ();
       // playersName.getPlayersName();
    }

    public static Game getCurrentGame() {
        return currentGame;
    }

    public static void setCurrentGame(Game currentGame) {
        Charcoaled.currentGame = currentGame;
    }

    public static Player getPlayer() {
        return player;
    }

    public static void setPlayer(Player player) {
        Charcoaled.player = player;
    }
    
    
}
