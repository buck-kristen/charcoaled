/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package byui.cit260.charcoaled.control;

import byui.cit260.charcoaled.exceptions.ControlException;
import byui.cit260.charcoaled.model.Actor;
import byui.cit260.charcoaled.model.Game;
import byui.cit260.charcoaled.model.Map;
import byui.cit260.charcoaled.model.Player;
import charcoaled.Charcoaled;
import java.io.*;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author justdance2007
 */
public class GameControl {

    public static void createNewGame(Player player) {
        Game game = new Game();//create new game
        Charcoaled.setCurrentGame(game); //save in Charcoaled
        
        game.setPlayer(player); //save player in game
        
        Actor[] actors = GameControl.createActors();
        game.setActors(actors); // move actors to starting locations
        
        Map gameMap = MapControl.createMap();
        game.setGameMap(gameMap); //add map to game
    }

    private static Actor[] createActors() {
        return null;
    }
    public static void saveGame(Game game, String filepath)
            throws ControlException {
                try { 
                    FileOutputStream fops = new FileOutputStream(filepath); 
                    ObjectOutputStream output = new ObjectOutputStream(fops);
                    
                    output.writeObject(game);//write game object out to file
                } catch (IOException e) {
                    throw new ControlException(e.getMessage());
                }
    }
    
    public static void loadExistingGame(String filepath)
           throws ControlException {
                Game game = null;
                    try {
                        FileInputStream fips = new FileInputStream(filepath); 
                        ObjectInputStream output = new ObjectInputStream(fips);
                        
                        game = (Game) output.readObject(); //read game object from file
                    }
                    catch (FileNotFoundException fnfe){
                        throw new ControlException(fnfe.getMessage());
                    }
                    catch (Exception e) {
                        throw new ControlException(e.getMessage());
                    }
                    //close output file
                    Charcoaled.setCurrentGame(game); //save in Charcoaled 
    }
}
