/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package byui.cit260.charcoaled.view;

import byui.cit260.charcoaled.control.ProgramControl;
import byui.cit260.charcoaled.model.Player;
import java.util.Scanner;

/**
 *
 * @author justdance2007
 */
public class StartProgramView {
    public StartProgramView () {
   //may not need this function?
    }
    public void startProgram() {
        //display banner screen
        this.displayBanner();
        //Prompt the user to enter name and retrieve name of player
        String playersName = this.getPlayersName ();
        //Create and save player object
        Player player = ProgramControl.createPlayer(playersName); 
        //Display a personalized welcome message
        this.displayWelcomeMessage(player);
        //display main menu
        MainMenuView mainmenu = new MainMenuView();
        mainmenu.display(); //changed to display() from displayMenu()
        
    }

    public void displayBanner() {
        System.out.println("\n\n*************************************************************");
        System.out.println("\n* This is a game where you get to be a fireman and *"+
                "\n* respond to an emergency located in a large apartment complex. *"+
                "\n* You are required to save the people or pets in the building *"+
                "\n* before it burns down. There will be several rooms on each floor *"+
                "\n* and you have to use detective work to figure out what rooms the *"+
                "\n* people are in. *");
        System.out.println("\n\n* You will be required to overcome a number of obstacles *"+
                "\n* by solving calculations of problems, or answering questions in order *"+
                "\n* to unlock, resuscitate an unconscious person or to figure out if a *"+
                "\n* room is too hot to enter. *");
        System.out.println("\n\n* Enjoy the game! *");
        System.out.println("\n\n*************************************************************");
        
    }

    public String getPlayersName() {
       boolean valid = false; //shows if name has been retrieved
       String playersName = null;
       Scanner keyboard = new Scanner(System.in); //keyboard input stream
       
       while (!valid) {
           //prompt players name
           System.out.println("Enter player's name below: ");
           //get name from keyboard trim off blanks
           playersName = keyboard.nextLine();
           playersName = playersName.trim(); 
           
           //invalid if user enters less than two characters 
           if (playersName.length ()< 1) {
               System.out.println("Invalid name- must enter a name.");
               continue;  
           }
           break;
       }
       //return name
       return playersName;
       }

    public void displayWelcomeMessage(Player player) {
        System.out.println("\n\n==============================================");
        System.out.println("\tWelcome to Charcoaled " + player.getName());
        System.out.println("\nEnjoy your rescue assignments!");
        System.out.println("==============================================");
    }
       
       
    }
    

