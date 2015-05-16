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

/**
 *
 * @author Family
 */
public class Charcoaled {
    private static Object totalTime;

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        
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
        
    }
    
}
