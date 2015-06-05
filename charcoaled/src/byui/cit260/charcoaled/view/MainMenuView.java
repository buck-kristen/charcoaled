/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package byui.cit260.charcoaled.view;

/**
 *
 * @author justdance2007
 */
public class MainMenuView {
    
    private final String MENU = "\n"
            +"\n----------------------"
            +"|Main Menu             |"
            +"\n----------------------"
            +"\nN - Start New Game"
            +"\nL - Load Existing Game"
            +"\nH - Help"
            +"\nS - Save Game"
            +"\nE - Exit"
            +"\n----------------------";
    
    public void displayMenu() {
        char selection = ' ';
        do {
            System.out.println(MENU);//Display main menu
            
            String input = this.getInput(); //get user's selection
            selection = input.charAt(0); //get first character of string
            
            this.doAction(selection); //do action based on selection
        } while (selection != 'E'); //and selection is not E
    }

    private String getInput() {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    private void doAction(char selection) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }
    
}
