/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package charcoaled;

import byui.cit260.charcoaled.model.Actor;
import byui.cit260.charcoaled.model.Game;
import byui.cit260.charcoaled.model.Location;
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
    //create StartProgramView and start program
        StartProgramView startProgramView = new StartProgramView ();
        //pg11 wk10 team
        try {
        startProgramView.startProgram(); 
        } catch (Throwable te){
            System.out.println(te.getMessage());
            te.printStackTrace();
            startProgramView.startProgram(); 
        }
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
