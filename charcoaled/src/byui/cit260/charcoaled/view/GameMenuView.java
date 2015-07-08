/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package byui.cit260.charcoaled.view;

import charcoaled.Charcoaled;
import java.io.BufferedReader;
import java.io.PrintWriter;

/**
 *
 * @author justdance2007
 */
public class GameMenuView {
    protected final BufferedReader keyboard = Charcoaled.getInFile();
    protected final PrintWriter console = Charcoaled.getOutFile();
    
    public void displayMenu() {
        //System.out.println("\n*** displayMenu sub function called in gameMenuViewClass***");
        this.console.println("\n*** displayMenu sub function called in gameMenuViewClass***");
    }
    
}
