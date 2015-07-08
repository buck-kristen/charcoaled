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
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.PrintWriter;

/**
 *
 * @author Family
 */ 
public class Charcoaled {
    private static Object totalTime;
    private static Game currentGame = null;
    private static Player player = null;
     //added for wk 11 team assignment
    private static PrintWriter outFile = null; 
    private static BufferedReader inFile = null; 
    
    //added wk 11 page 9
    private static PrintWriter logFile = null;

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
   
        //pg11 wk10 team
        try {
            //added from page 3; open character stream files for end user input and output
            //wk11
            Charcoaled.inFile = 
                    new BufferedReader(new InputStreamReader(System.in));
            Charcoaled.outFile = new PrintWriter (System.out, true);
            
            //wk 11 page 10 open log file
            String filePath = "log.txt"; 
            Charcoaled.logFile = new PrintWriter(filePath); 
            
               //create StartProgramView and start program
            StartProgramView startProgramView = new StartProgramView ();
            startProgramView.startProgram(); 
            
        }catch (Exception e) {
            System.out.println("Exception: " + e.toString() +
                        "\nCause: " + e.getCause() +
                        "\nMessage: " + e.getMessage());   
              e.printStackTrace();
        }
        
        catch (Throwable te){
            System.out.println(te.getMessage());
            te.printStackTrace();
        }
        //wk 11 page 4
        finally {
            try {
                if (Charcoaled.inFile != null)
                    Charcoaled.inFile.close();
                if (Charcoaled.outFile !=null)
                    Charcoaled.outFile.close();
                if (Charcoaled.logFile != null)
                    Charcoaled.logFile.close();
            } catch (IOException ex) {
                System.out.println("error closing files");
                return; 
            }
        }
    //create function for getPlayersName; I removed this because it was repeating the name twice when running project
        //StartProgramView playersName = new StartProgramView ();
        //playersName.getPlayersName();
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
    
        public static PrintWriter getOutFile() {
        return outFile;
    }

    public static void setOutFile(PrintWriter outFile) {
        Charcoaled.outFile = outFile;
    }

    public static BufferedReader getInFile() {
        return inFile;
    }

    public static void setInFile(BufferedReader inFile) {
        Charcoaled.inFile = inFile;
    }
        public static PrintWriter getLogFile() {
        return logFile;
    }

    public static void setLogFile(PrintWriter logFile) {
        Charcoaled.logFile = logFile;
    }
}
