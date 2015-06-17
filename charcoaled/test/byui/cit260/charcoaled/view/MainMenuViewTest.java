/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package byui.cit260.charcoaled.view;

import java.io.ByteArrayInputStream;
import org.junit.Test;
import static org.junit.Assert.*;

/**
 *
 * @author justdance2007
 */
public class MainMenuViewTest {
    
    public MainMenuViewTest() {
    }

    /**
     * Test of displayMenu method, of class MainMenuView.
     */
    @Test
    public void testDisplayMenu() {
        System.out.println("displayMenu");
        MainMenuView instance = new MainMenuView();
        String data = "N";
        System.setIn(new ByteArrayInputStream(data.getBytes()));
        instance.display();
        // TODO review the generated test code and remove the default call to fail.
        System.out.println("The test case is a prototype of displayMenu.");
    }

    /**
     * Test of doAction method, of class MainMenuView.
     */
    @Test
    public void testDoAction() {
        System.out.println("doAction");
        char selection = ' ';
        MainMenuView instance = new MainMenuView();
        instance.doAction(selection);
        // TODO review the generated test code and remove the default call to fail.
        System.out.println("The test case is a prototype of doAction.");
    }
    
}
