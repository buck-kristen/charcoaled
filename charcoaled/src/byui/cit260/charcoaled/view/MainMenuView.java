/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package byui.cit260.charcoaled.view;

import byui.cit260.charcoaled.control.GameControl;
import byui.cit260.charcoaled.control.QuestionsControl;
import charcoaled.Charcoaled;
import java.util.Scanner;

/**
 *
 * @author justdance2007
 */
public class MainMenuView {
    //first menu that appears to user
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
    //menu appears if user types "H" from main menu
    private final String HELPMENU = "\n"+
            "\n----------------------"+
            "\n|Help Menu             |"+
            "\n----------------------"+
            "\nO - Display game objective"+
            "\nM - Display how to move between doors and floors"+
            "\nD - Difference in difficulty levels"+
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
            "\nX - Exit to Main Menu"+
            "\n--------------------------------------";
    //displays the main menu and gets user input keys typed
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

    //responds to user input entered from main menu
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
    
    //create stub functions for doAction() main menu selections
        private void startNewGame () {
    /*        //System.out.println("startNewGame function called");
            //create new game
            GameControl.createNewGame(Charcoaled.getPlayer());
            //display game menu
            GameMenuView gameMenu = new GameMenuView();
            gameMenu.displayMenu();
    */
    //I commented the above code because I wasn't sure when I needed to use create new game and 
    //if that would interfere with my game map menu
            //display the game map menu
            this.displayGameMap();
        }
    
//do-while statement chosen for game map menu since I wanted to be checked at least once 
    public void displayGameMap() {
        char selection = ' ';
        do {
            System.out.println(GAMEMAPMENU);//Display Game map menu
            
            String mapInput = this.getMapInput(); //get user's selection for Game map menu
            selection = mapInput.charAt(0); //get first character of string
            this.doMapAction(selection); //do action based on game map selection
        } while (selection != 'X'); //and selection is not X
    }
    
    //get user input for Game map menu and check if invalid option entered 
        public String getMapInput() {
    
    Scanner keyboard = new Scanner (System.in); //keyboard input stream            
    boolean valid = false; //shows if key has been entered??
    String selection = null;
  
    //while a valid value name has not been retrieved 
    while (!valid) {
        //prompt user to enter menu option 
        System.out.println("Enter a game menu option");
     
        //get value entered from keyboard and trim off blanks
         selection = keyboard.nextLine(); 
         selection = selection.trim();
         selection = selection.toUpperCase();
         //invalid if user enters  
           if (!"UDLRVIEX".contains(selection.toUpperCase())) {
               System.out.println("Invalid menu option.");
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
        case 'X': //Exit or Return to main menu
            return;
        default:
            System.out.println("\n*** Invalid selection. Try again. ***");
            break;
    }
    }
//created stub functions for game map menu
        private void moveUp () {
            System.out.println("moveUp function called");
        }        
        private void moveLeft () {
            System.out.println("moveLeft function called");
        }
        private void moveDown () {
            System.out.println("moveDown function called");
        }
         private void moveRight () {
            System.out.println("moveRight function called");
        }
   //View 2 action if E is entered from game map menu
         private void enterDoor () {
            //created returnValue variable to be referenced in do-while loop
            //setting value to 0 instead of null since not a string
            double returnValue = 0; 
             do {
               double fahrenheit = getFahrenheitInput ();  //assign variable fahrenheit to value user entered
               returnValue = QuestionsControl.convertTemperature(fahrenheit); //assign returnValue variable to be checked in convertTemp() function
            } while (returnValue == -1); //check if returnValue is equal to return in convTemp function of -1- if so then invalid
        }
         private void viewItems () {
            System.out.println("viewItems function called");
        }
         private void removeItems () {
            System.out.println("removeItems function called");
        }
   //end of game map menu code
        
   //stub functions for main menu  
         private void loadExistingGame () {
            System.out.println("loadExistingGame function called");
        }
   //display help menu when selected from main menu "H"   
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
  //get user input from help menu
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
    //do action based on user input from help menu
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
    //help menu stub function created
    private void describeDifficulty() {
        System.out.println("describeDifficulty function called");
    }

    private void describePlayerMove() {
        System.out.println("describePlayerMove function called");
    }

    private void displayGameObjective() {
        System.out.println("displayGameObjective function called");
    }
  
//view 2 for individual wk7 response to Enter door in game map menu
    public double getFahrenheitInput() {
    
    Scanner keyboard = new Scanner (System.in); //keyboard input stream            
    boolean valid = false; //shows if key has been entered??
    //String selection = null; ?? do I keep string since the function I call uses a double?
    double selection = 0; 
  
    //while a valid value name has not been retrieved 
        //prompt user to enter menu option 
        System.out.println("Enter a temperature in degrees Fahrenheit to convert the temperature to Celsius");
     
        //get value/number entered from keyboard 
         selection = keyboard.nextDouble(); 

       //return name
       return selection;
}
}
    


    

