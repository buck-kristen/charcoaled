/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package byui.cit260.charcoaled.view;

import byui.cit260.charcoaled.control.QuestionsControl;
import java.io.IOException;
import java.util.InputMismatchException;
import java.util.Scanner;

/**
 *
 * @author justdance2007
 */
public class RoomMenuView extends View { //add extends View after RoomMenuView
    private QuestionsControl questions;
    
    public RoomMenuView () { //not sure if I need this? 
        //menu appears after inputing a temperature for equation entering room 
        super("\n"+ //add super in place of private...ROOMMENU=
             "\n--------------------------------------"+
            "\n|             Room Menu           |"+
             "\n--------------------------------------"+
            "\nU - Use an Item"+
            "\nV - Earn item"+
            "\nR - Rescue person"+
            "\nE - Exit the room"+
            "\n--------------------------------------","UVRE");
    questions = new QuestionsControl();
    }
    
    /*public void displayRoomMenu() {
        char selection = ' ';
        do {
            System.out.println(ROOMMENU);//Display Room menu
            
            String roomInput = this.getRoomInput(); //get user's selection for room menu
            selection = roomInput.charAt(0); //get first character of string
            this.doRoomAction(selection); //do action based on room menu selection
        } while (selection != 'E'); //and selection is not X
    }
    public String getRoomInput() {
    
    Scanner keyboard = new Scanner (System.in); //keyboard input stream            
    boolean valid = false; //shows if key has been entered??
    String selection = null;
  
    //while a valid value name has not been retrieved 
    while (!valid) {
        //prompt user to enter menu option 
        System.out.println("Enter a room menu option");
     
        //get value entered from keyboard and trim off blanks
         selection = keyboard.nextLine(); 
         selection = selection.trim();
         selection = selection.toUpperCase();
         //invalid if user enters  
           if (!"UVDPRX".contains(selection.toUpperCase())) {
               System.out.println("Invalid menu option.");
               continue;  
           }
           break;
       }
       //return name
       return selection;
}
    */
@Override 
    public void doAction(Object obj)//change to public void doAction (Object obj)
    {
    Character selection = (Character) obj; //casting or type cast
        switch (selection) {
        case 'U': //use an item
            this.useItem();
            break;
        case 'V': //view items
            this.earnItem();
            break;
     	case 'R': //rescue person
            this.rescue();
            break;
        case 'X': //Exit or Return to previous menu
            return;
        default:
            //System.out.println("\n*** Invalid selection. Try again. ***");
            this.console.println("\n*** Invalid selection. Try again. ***");
            break;
        }
    }
//stub functions
        private void useItem () {
            //System.out.println("useItem function called");
            this.console.println("useItem function called");
        }        
        private void earnItem() {
            //System.out.println("viewItems function called");
            this.console.println("earnItem function called");
        }
        private void rescue () {
            //System.out.println("| Before you can save the victim, please answer the question |");
            this.console.println("| Before you can save the victim, please answer the question |");
            //display arrayList templist
            questions.displayTempList();
            //get user input for answer
                
           // Scanner keyboard = new Scanner (System.in); //keyboard input stream            
            boolean valid = false; 
            String selectionS = null;
            int selection = 0;
                //prompt user to enter menu option 
                //System.out.print("Enter the average temperature: ");
                this.console.print("Enter the average temperature: ");
                //while a valid value name has not been retrieved 
            while (!valid) {

                //get value entered from keyboard and trim off blanks
                try {
                selectionS = keyboard.readLine();
                selection = Integer.parseInt(selectionS);
                //this.keyboard.readLine(); **should I add this??
                }
                catch (NumberFormatException ex) {
                    System.out.println("Value must be an integer. Enter the average temperature: ");
                    continue; 
                }
                catch (IOException ex) {
                    System.out.println(ex.getStackTrace());
                }
                 //invalid if user enters  
                   if (selection != questions.findAverage()) {
                       //System.out.println("Invalid answer- recalculate");
                       this.console.println("Invalid answer- recalculate");
                       continue;  
                   }
                   else 
                       //System.out.println("Congratulations! You have saved a life!");
                       this.console.println("Congratulations! You have saved a life!");
                   break;

            }
        }
        
}

    
