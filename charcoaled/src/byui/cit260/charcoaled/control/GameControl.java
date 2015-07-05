/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package byui.cit260.charcoaled.control;

import byui.cit260.charcoaled.model.Actor;
import byui.cit260.charcoaled.model.Game;
import byui.cit260.charcoaled.model.Map;
import byui.cit260.charcoaled.model.Player;
import charcoaled.Charcoaled;

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
    
}
