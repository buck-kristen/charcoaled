/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package byui.cit260.charcoaled.view;

import byui.cit260.charcoaled.control.GameControl;
import charcoaled.Charcoaled;
import java.util.Scanner;

/**
 *
 * @author justdance2007
 */
public class MainMenuView {
    
    private final String MENU = "\n"+
            "\n----------------------"+
            "\n|Main Menu             |"+
            "\n----------------------"+
            "\nN - Start New Game"+
            "\nL - Load Existing Game"+
            "\nH - Help"+
            "\nS - Save Game"+
            "\nE - Exit"+
            "\n----------------------";
    
    private final String HELPMENU = "\n"+
            "\n----------------------"+
            "\n|Help Menu             |"+
            "\n----------------------"+
            "\nO - Display game objective"+
            "\nM - Display how to move between doors and floors"+
            "\nD - Difference in difficulty levels"+
            "\nQ - Quit and return to Main Menu"+
            "\n----------------------";
    public void displayMenu() {
        char selection = ' ';
        do {
            System.out.println(MENU);//Display main menu
            
            String input = this.getInput(); //get user's selection
            selection = input.charAt(0); //get first character of string
            this.doAction(selection); //do action based on selection
        } while (selection != 'E'); //and selection is not E
    }

    public String getInput() {
                
    boolean valid = false; //shows if key has been entered??
    String menuItem = null;
    Scanner keyboard = new Scanner (System.in); //keyboard input stream
    
    while (!valid) {
        //prompt user to enter menu option 
        System.out.println("Enter a menu option");
     
        //get value entered from keyboard and trim off blanks
         menuItem = keyboard.nextLine(); 
         menuItem = menuItem.trim();
         menuItem = menuItem.toUpperCase();
         //invalid if user enters  
           if (!"NLHSE".contains(menuItem.toUpperCase())) {
               System.out.println("Invalid menu option.");
               continue;  
           }
           break;
       }
       //return name
       return menuItem;
}

    //private void doAction(char selection) { **This is what was here before I changed to match tutorial
    public void doAction(char selection)
    {
        switch (selection) {
        case 'N': //Start new game
            this.startNewGame();
            break;
        case 'L': //Load existing game
            this.loadExistingGame();
            break;
        case 'H': //display help menu
            this.displayHelpMenu();
            break;
        case 'S': //Save game
            this.saveGame();
            break;
        case 'E': //Exit or Return
            return;
        default:
            System.out.println("\n*** Invalid selection. Try again. ***");
            break;
    }
    }
    
    //create sub functions for doAction() page 40 of pdf
        private void startNewGame () {
            //System.out.println("startNewGame function called");
            //create new game
            GameControl.createNewGame(Charcoaled.getPlayer());
            //display game menu
            GameMenuView gameMenu = new GameMenuView();
            gameMenu.displayMenu();
        }
        
        private void loadExistingGame () {
            System.out.println("loadExistingGame function called");
        }
        
        public void displayHelpMenu () {
            char selection = ' ';
        do {
     
            System.out.println(HELPMENU);//Display help menu
            
            String helpInput = this.getHelpInput(); //get user's selection for help menu
            selection = helpInput.charAt(0); //get first character of string
            this.doHelpAction(selection); //do action based on help selection
        } while (selection != 'Q'); //and selection is not Q
        }
        private void saveGame () {
            System.out.println("saveGame function called");
        }

    public String getHelpInput() {
        boolean valid = false; //shows if key has been entered??
    String helpMenuItem = null;
    Scanner keyboard = new Scanner (System.in); //keyboard input stream
    
        while (!valid) {
        //prompt user to enter menu option 
        System.out.println("Enter a menu option");
     
        //get value entered from keyboard and trim off blanks
         helpMenuItem = keyboard.nextLine(); 
         helpMenuItem = helpMenuItem.trim();
         helpMenuItem = helpMenuItem.toUpperCase();
         //invalid if user enters  
           if (!"OMDQ".contains(helpMenuItem.toUpperCase())) {
               System.out.println("Invalid menu option.");
               continue;  
           }
           break;
       }
       //return name
       return helpMenuItem;
    }

    public void doHelpAction(char selection) {
        switch (selection) {
        case 'O': //display game objective
            this.displayGameObjective();
            break;
        case 'M': //describe how player moves in game
            this.describePlayerMove();
            break;
        case 'D': //describe difficulty level
            this.describeDifficulty();
            break;
        case 'Q': //Exit or Return
            return;
        default:
            System.out.println("\n*** Invalid selection. Try again. ***");
            break;
    }
    }

    private void describeDifficulty() {
        System.out.println("describeDifficulty function called");
    }

    private void describePlayerMove() {
        System.out.println("describePlayerMove function called");
    }

    private void displayGameObjective() {
        System.out.println("displayGameObjective function called");
    }
}
    


    

