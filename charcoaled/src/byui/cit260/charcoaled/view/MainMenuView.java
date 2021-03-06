/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package byui.cit260.charcoaled.view;

import byui.cit260.charcoaled.control.GameControl;
import byui.cit260.charcoaled.control.QuestionsControl;
import byui.cit260.charcoaled.exceptions.QuestionsControlException;
import byui.cit260.charcoaled.model.Location;
import byui.cit260.charcoaled.model.Map;
import byui.cit260.charcoaled.model.Resource;
import charcoaled.Charcoaled;
import java.io.IOException;
import java.io.PrintWriter;
import java.util.InputMismatchException;
import java.util.Scanner;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author justdance2007
 */
public class MainMenuView extends View{
    //first menu that appears to user
    //added because it's on the wk8 tutorial pg 12
    public MainMenuView() {
    //private final String MENU = //deleted for step 7 p.10
            super("\n"+  //calling constructor in super class
            "\n----------------------"+
            "\n|Main Menu             |"+
            "\n----------------------"+
            "\nN - Start New Game"+
            "\nL - Load Existing Game"+
            "\nH - Help"+
            "\nS - Save Game"+
            "\nE - Exit"+
            "\n----------------------","NLHSE");
    }
    //menu appears if user types "H" from main menu
    private final String HELPMENU = "\n"+
            "\n----------------------"+
            "\n|Help Menu             |"+
            "\n----------------------"+
            "\nO - Display game objective"+
            "\nM - Display how to move between doors and floors"+
            "\nQ - Quit and return to Main Menu"+
            "\n----------------------";
    
    //menu appears if user types "N" from main menu for starting new game 
    private final String GAMEMAPMENU = "\n"+
             "\n--------------------------------------"+
            "\n|             Game Map Menu           |"+
             "\n--------------------------------------"+
            "\nU - Move Upstairs if possible"+
            "\nD - Move downstairs if possible"+
            "\nL - Move to door on left"+
            "\nR - Move to door on right"+
            "\nV - View items"+
            "\nI - Drop or Remove Inventory items"+
            "\nE - Enter Door"+
            "\nP - Print Report"+
            "\nX - Exit to Main Menu"+
            "\n--------------------------------------";
    //displays the main menu and gets user input keys typed
    /* DELETED FOR TEAM ASSIGNMENT PAGE 11 STEP 7
    public void displayMenu() {
        char selection = ' ';
        do {
            System.out.println(MENU);//Display main menu
            
            String input = this.getInput(); //get user's selection
            selection = input.charAt(0); //get first character of string
            this.doAction(selection); //do action based on selection
        } while (selection != 'E'); //and selection is not E
    }
    
    //gets user input entered from main menu and checks if invalid
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
       */
    //responds to user input entered from main menu
    @Override
    //public void doAction(char selection) old statement before next change
    public void doAction (Object obj)
    {
        Character selection = (Character) obj; //casting or type cast
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
            //System.out.println("\n*** Invalid selection. Try again. ***");
            this.console.println("\n*** Invalid selection. Try again. ***");
            break;
        }
    }
    
    //create stub functions for doAction() main menu selections
        private void startNewGame () {
            //System.out.println("startNewGame function called");
            //create new game
            GameControl.createNewGame(Charcoaled.getPlayer());
            //display game menu
            GameMenuView gameMenu = new GameMenuView();
            gameMenu.displayMenu();
    
    //I commented the above code because I wasn't sure when I needed to use create new game and 
    //if that would interfere with my game map menu
            //display the game map menu
            this.displayGameMap();
        }
    
    //do-while statement chosen for game map menu since I wanted to be checked at least once 
    public void displayGameMap() {
        char selection = ' ';
        do {
            this.displayMap();
           // System.out.println(GAMEMAPMENU);//Display Game map menu
            this.console.println(GAMEMAPMENU);//Display Game map menu
            
            String mapInput = this.getMapInput(); //get user's selection for Game map menu
            selection = mapInput.charAt(0); //get first character of string
            this.doMapAction(selection); //do action based on game map selection
        } while (selection != 'X'); //and selection is not X
    }
    public void displayMap() {
        Map gameMap = Charcoaled.getCurrentGame().getGameMap();//get Game map by retrieving current game
        Location[][] locations = gameMap.getLocations();//get locations inside map
        //System.out.println("Map\n");
        this.console.println("Map\n");
        //System.out.println("  | 0 | 1 | 2 | 3 | 4 |");
        this.console.println("  | 0 | 1 | 2 | 3 | 4 |");
            for (int r = 0; r < 5; r++) {
                //System.out.print(Integer.toString(r) + " |");
                this.console.print(Integer.toString(r) + " |");
                for (int c = 0; c < 5; c++) {
                    if (locations[r][c].isVisited() == false) {
                       //System.out.print("?? |");
                       this.console.print("?? |");
                    } 
                    else {
                       //System.out.print(locations[r][c].getScene().getSymbol() + "|");
                       this.console.print(locations[r][c].getScene().getSymbol() + "|");
                    }
                }
                //System.out.println("");
                this.console.println("");
            }
            
        
    }
    
    //get user input for Game map menu and check if invalid option entered 
        public String getMapInput() {
    
    //Scanner keyboard = new Scanner (System.in); //keyboard input stream            
    boolean valid = false; //shows if key has been entered??
    String selection = null;
  
    //while a valid value name has not been retrieved 
    while (!valid) {
        //prompt user to enter menu option 
        //System.out.println("Enter a game menu option");
        this.console.println("Enter a game menu option");
     
        try {
            //get value entered from keyboard and trim off blanks
            //selection = keyboard.nextLine();
            selection = this.keyboard.readLine();
        } catch (IOException ex) {
            Logger.getLogger(MainMenuView.class.getName()).log(Level.SEVERE, null, ex);
        }
         selection = selection.trim();
         selection = selection.toUpperCase();
         //invalid if user enters  
           if (!"UDLRVIEPX".contains(selection.toUpperCase())) {
               //System.out.println("Invalid menu option.");
               this.console.println("Invalid menu option.");
               continue;  
           }
           break;
       }
       //return name
       return selection;
    }
    //do action based on user input selection for game map menu 
    public void doMapAction(char selection)
    {
        switch (selection) {
        case 'U': //move up stairs
            this.moveUp();
            break;
        case 'L': //move left to door
            this.moveLeft();
            break;
        case 'D': //move down stairs
            this.moveDown();
            break;
        case 'R': //move right to door
            this.moveRight();
            break;
     	case 'E': //enter door
            this.enterDoor();
            break;
        case 'V': //view items
            this.viewItems();
            break;
        case 'I': //drop or remove items
            this.removeItems();
            break;
        case 'P': //print report
            this.printReport();
            break;
        case 'X': //Exit or Return to main menu
            return;
        default:
            //System.out.println("\n*** Invalid selection. Try again. ***");
            this.console.println("\n*** Invalid selection. Try again. ***");
            break;
        }
    }
        //created stub functions for game map menu
        private void moveUp () {
            int column = Integer.parseInt(Charcoaled.getCurrentGame().getGameMap().getRow());
            column = column - 1; 
                if (column < 0 ) {
                    this.console.println("Player cannot move up.\n");
             
                }
                else {
                    Charcoaled.getCurrentGame().getGameMap().setRow(Integer.toString(column));
                }
        }        
        private void moveLeft () {
            int column = Integer.parseInt(Charcoaled.getCurrentGame().getGameMap().getColumn());
            column = column - 1; 
                if (column < 0 ) {
                    this.console.println("Player cannot move left.\n");
             
                }
                else {
                    Charcoaled.getCurrentGame().getGameMap().setColumn(Integer.toString(column));
                }
        }
        private void moveDown () {
            int column = Integer.parseInt(Charcoaled.getCurrentGame().getGameMap().getRow());
            column = column + 1; 
                if (column > 4 ) {
                    this.console.println("Player cannot move down.\n");
             
                }
                else {
                    Charcoaled.getCurrentGame().getGameMap().setRow(Integer.toString(column));
                }
        }
        private void moveRight () {
         int column = Integer.parseInt(Charcoaled.getCurrentGame().getGameMap().getColumn());
            column = column + 1; 
                if (column > 4 ) {
                    this.console.println("Player cannot move right.\n");
             
                }
                else {
                    Charcoaled.getCurrentGame().getGameMap().setColumn(Integer.toString(column));
                }
        }
        //View 2 action if E is entered from game map menu
        private void enterDoor () {
            //created returnValue variable to be referenced in do-while loop
            //setting value to 0 instead of null since not a string
            double returnValue = 0; 
            do {
                double fahrenheit = getFahrenheitInput ();  //assign variable fahrenheit to value user entered
            try {
                returnValue = QuestionsControl.convertTemperature(fahrenheit); //assign returnValue variable to be checked in convertTemp() function
            } catch (QuestionsControlException ex) {
                System.out.println(ex.getMessage());
                returnValue = -1; 
            }
            } while (returnValue == -1); //check if returnValue is equal to return in convTemp function of -1- if so then invalid
                //display room menu
                RoomMenuView roomMenu = new RoomMenuView();
                roomMenu.display();
        int column = Integer.parseInt(Charcoaled.getCurrentGame().getGameMap().getColumn());
        int row = Integer.parseInt(Charcoaled.getCurrentGame().getGameMap().getRow());
        Location[][] locations = Charcoaled.getCurrentGame().getGameMap().getLocations();
        locations[row][column].setVisited(true);
        }
         
         private void viewItems () {
            //System.out.println("viewItems function called");
             Resource[] resources = Charcoaled.getCurrentGame().getResources(); 
             
             this.console.println("Resources\tQuantity");
             for (int i = 0; i<resources.length; i++) {
                 this.console.println(resources[i]);
             }
        }
         private void removeItems () {
           // System.out.println("removeItems function called");
            this.console.println("removeItems function called");
        }
   //end of game map menu code
        
   //stub functions for main menu  
         private void loadExistingGame () {
            //System.out.println("loadExistingGame function called");
            String filePath = this.getSaveInput();
                try {
                   //save game to file
                    GameControl.loadExistingGame(filePath);
                } catch (Exception ex) {
                    ErrorView.display("MainMenuView", ex.getMessage());
                }
        }
   //display help menu when selected from main menu "H"   
        public void displayHelpMenu () {
            char selection = ' ';
        do {
     
            //System.out.println(HELPMENU);//Display help menu
            this.console.println(HELPMENU);//Display help menu
            
            String helpInput = this.getHelpInput(); //get user's selection for help menu
            selection = helpInput.charAt(0); //get first character of string
            this.doHelpAction(selection); //do action based on help selection
        } while (selection != 'Q'); //and selection is not Q
        }
        private void saveGame () {
            //System.out.println("saveGame function called");
            
            String filePath = this.getSaveInput();
                try {
                   //save game to file
                    GameControl.saveGame(Charcoaled.getCurrentGame(), filePath);
                } catch (Exception ex) {
                    ErrorView.display("MainMenuView", ex.getMessage());
                }
        }
public String getSaveInput() {
        boolean valid = false; //shows if key has been entered??
    String helpMenuItem = null;
    //Scanner keyboard = new Scanner (System.in); //keyboard input stream
    
        //prompt user to enter menu option 
        //System.out.println("Enter a menu option");
        this.console.println("Enter a file path:");
     
            try {
                //get value entered from keyboard and trim off blanks
                //helpMenuItem = keyboard.nextLine();
                helpMenuItem = this.keyboard.readLine();
            } catch (IOException ex) {
                Logger.getLogger(MainMenuView.class.getName()).log(Level.SEVERE, null, ex);
            }
       //return name
       return helpMenuItem;
    }  
//get user input from help menu
    public String getHelpInput() {
        boolean valid = false; //shows if key has been entered??
    String helpMenuItem = null;
    //Scanner keyboard = new Scanner (System.in); //keyboard input stream
    
        while (!valid) {
        //prompt user to enter menu option 
        //System.out.println("Enter a menu option");
        this.console.println("Enter a menu option");
     
            try {
                //get value entered from keyboard and trim off blanks
                //helpMenuItem = keyboard.nextLine();
                helpMenuItem = this.keyboard.readLine();
            } catch (IOException ex) {
                Logger.getLogger(MainMenuView.class.getName()).log(Level.SEVERE, null, ex);
            }
         helpMenuItem = helpMenuItem.trim();
         helpMenuItem = helpMenuItem.toUpperCase();
         //invalid if user enters  
           if (!"OMDQ".contains(helpMenuItem.toUpperCase())) {
               //System.out.println("Invalid menu option.");
               this.console.println("Invalid menu option.");
               continue;  
           }
           break;
       }
       //return name
       return helpMenuItem;
    }
    //do action based on user input from help menu
    public void doHelpAction(char selection) {
        switch (selection) {
        case 'O': //display game objective
            this.displayGameObjective();
            break;
        case 'M': //describe how player moves in game
            this.describePlayerMove();
            break;
        case 'Q': //Exit or Return
            return;
        default:
            //System.out.println("\n*** Invalid selection. Try again. ***");
            this.console.println("\n*** Invalid selection. Try again. ***");
            break;
    }
    }
    //help menu stub function created

    private void describePlayerMove() {
        //System.out.println("describePlayerMove function called");
        this.console.println("\n*** To move player on board simply follow prompts of menu typing in either U,D,L,R. ***");
    }

    private void displayGameObjective() {
        //System.out.println("displayGameObjective function called");
        this.console.println("\n*** The objective of this game is to save as many people as possible before reaching the end of the game. ***");
    }
  
    //view 2 for individual wk7 response to Enter door in game map menu
    public double getFahrenheitInput() {
    
        //Scanner keyboard = new Scanner (System.in); //keyboard input stream            
        boolean valid = false; //shows if key has been entered??
        String selectionS = null; //?? do I keep string since the function I call uses a double?
        double selection = 0; 

        //while a valid value name has not been retrieved 
        while (!valid) {

            //prompt user to enter menu option 
            //System.out.println("Enter a temperature in degrees Fahrenheit to convert the temperature to Celsius");
            this.console.println("Enter a temperature in degrees Fahrenheit to convert the temperature to Celsius");

            //get value/number entered from keyboard 
            try { 
                selectionS = keyboard.readLine(); 
                selection = Double.parseDouble(selectionS);
                valid = true; 
            }
            catch(IOException ex){
                //System.out.println("Invalid- must enter a number");
                this.console.println("Invalid- must enter a number");
            }
        }
        //return name
        return selection;
    }

    private void printReport() {
           String filePath = this.getSaveInput();
                try {
                   //save game to file
                    PrintWriter out = new PrintWriter(filePath); 
                    Resource[] resources = Charcoaled.getCurrentGame().getResources();
                    
                    out.println("View List of Resources\n");
                    out.println("Resources\tQuantity");
                    
                    for (int i = 0; i<resources.length; i++) {
                        out.println(resources[i]); 
                    }
                    out.close();
                    this.console.println("A report has been saved to a file.");
                } catch (Exception ex) {
                    ErrorView.display("MainMenuView", ex.getMessage());
                }
    }
}
