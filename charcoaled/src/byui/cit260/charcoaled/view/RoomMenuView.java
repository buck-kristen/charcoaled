/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package byui.cit260.charcoaled.view;

import byui.cit260.charcoaled.control.QuestionsControl;
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
            "\nV - View items"+
            "\nD - Drop items"+
            "\nP - Pick up item"+
            "\nR - Rescue person"+
            "\nE - Exit the room"+
            "\n--------------------------------------","UVDPRE");
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
    public void doAction(Object obj)//change to  public void doAction (Object obj)
    {
    Character selection = (Character) obj; //casting or type cast
        switch (selection) {
        case 'U': //use an item
            this.useItem();
            break;
        case 'V': //view items
            this.viewItems();
            break;
        case 'D': //drop items
            this.dropItem();
            break;
        case 'P': //pick up item
            this.pickItem();
            break;
     	case 'R': //rescue person
            this.rescue();
            break;
        case 'X': //Exit or Return to previous menu
            return;
        default:
            System.out.println("\n*** Invalid selection. Try again. ***");
            break;
    }
    }
//stub functions
        private void useItem () {
            System.out.println("useItem function called");
        }        
        private void dropItem () {
            System.out.println("dropItem function called");
        }
        private void pickItem () {
            System.out.println("pickItem function called");
        }
         private void rescue () {
            System.out.println("| Before you can save the victim answer the question |");
            //display arrayList templist
            questions.displayTempList();
            //get user input for answer
                
    Scanner keyboard = new Scanner (System.in); //keyboard input stream            
    boolean valid = false; 
    int selection = 0;
        //prompt user to enter menu option 
        System.out.print("Enter the average temperature: ");
        //while a valid value name has not been retrieved 
    while (!valid) {
     
        //get value entered from keyboard and trim off blanks
        try {
        selection = keyboard.nextInt(); 
        }
        catch (InputMismatchException ex) {
            System.out.println("Value must be an integer");
            keyboard.nextLine();
            continue; 
        }
         //invalid if user enters  
           if (selection != questions.findAverage()) {
               System.out.println("Invalid answer- recalculate");
               continue;  
           }
           else 
               System.out.println("Congratulations! You have saved a life!");
           break;
       
         }
}
        private void viewItems() {
            System.out.println("viewItems function called");
    }

    }

    
