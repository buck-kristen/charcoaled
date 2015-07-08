/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package byui.cit260.charcoaled.view;

import charcoaled.Charcoaled;
import java.io.BufferedReader;
import java.io.IOException;
import java.io.PrintWriter;
import java.util.Scanner;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author justdance2007
 */
public abstract class View implements ViewInterface {
    //added from wk 11 pg12 
    private String message; 
    
    private String promptMessage;
    private String menuOptions;
    
    //added from wk 11 pg 12
    protected final BufferedReader keyboard = Charcoaled.getInFile();
    protected final PrintWriter console = Charcoaled.getOutFile();
    
    public abstract void doAction(Object obj);
     
    public View(String promptMessage, String menuOptions) {
                this.promptMessage = promptMessage; 
                this.menuOptions = menuOptions;
            }       
    public String getPromptMessage() {
        return promptMessage; 
    }

    //generic name for menu
    public void setPromptMessage(String promptMessage) {
        this.promptMessage = promptMessage;
    }           

    //displays the main menu and gets user input keys typed
    @Override //Overrides and implements corresponding function signatures 
    public void display() { //changed from displayMenu to display()
        char selection = ' ';
        do {
            //System.out.println(promptMessage);//Display main menu
            this.console.println(promptMessage);//Display main menu
            String input = this.getInput(); //get user's selection
            selection = input.charAt(0); //get first character of string
            this.doAction(selection); //do action based on selection
        } while (selection != 'E'); //and selection is not E
    }
    
    //gets user input entered from main menu and checks if invalid
    @Override// add Override 
    public String getInput() {
                
    boolean valid = false; //shows if key has been entered??
    String menuItem = null;
    //Scanner keyboard = new Scanner (System.in); //keyboard input stream
    
    while (!valid) {
        //prompt user to enter menu option 
        //System.out.println("Enter a menu option");
        this.console.println("Enter a menu option");
     
        try {
            //get value entered from keyboard and trim off blanks
            //menuItem = keyboard.nextLine(); **commented out for below line wk 11
            //added instead of above
            menuItem = this.keyboard.readLine();
        } catch (IOException ex) {
            Logger.getLogger(View.class.getName()).log(Level.SEVERE, null, ex);
        }
         menuItem = menuItem.trim();
         menuItem = menuItem.toUpperCase();
         //invalid if user enters  
           if (!menuOptions.contains(menuItem.toUpperCase())) {
               //System.out.println("Invalid menu option.");
               this.console.println("Invalid menu option.");
               continue;  
           }
           break;
       }
       //return name
       return menuItem;
    }
}
