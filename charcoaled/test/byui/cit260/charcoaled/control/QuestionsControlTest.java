/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package byui.cit260.charcoaled.control;

import org.junit.Test;
import static org.junit.Assert.*;


/**
 *
 * @author justdance2007
 */
public class QuestionsControlTest {
    
    public QuestionsControlTest() {
    }

    /**
     * Test of sphereVolume method, of class QuestionsControl.
     */
    @Test
    public void testSphereVolume() {
        System.out.println("sphereVolume");
    /**********************************
     * Test Case #1
     *********************************/
        System.out.println("\tTest case #1");
        
        //input parameter for test case 1
        double diameter = 36.0;
        //create instance of QuestionsControl class
        QuestionsControl instance = new QuestionsControl();
        //expected result
        double expResult = 24429.0244743;
        //call function to run test
        double result = instance.sphereVolume(diameter);
        //compare expResult to actual result
        assertEquals(expResult, result, 0.0001);
        
        
        /**********************************
     * Test Case #2
     *********************************/
        System.out.println("\tTest case #2");
        
        //input parameter for test case 2
        diameter = -1.0;
        //expected result
        expResult = -1;
        //call function to run test
        result = instance.sphereVolume(diameter);
        //compare expResult to actual result
        assertEquals(expResult, result, 0.0001);
        // TODO review the generated test code and remove the default call to fail.
      
        
           /**********************************
     * Test Case #3
     *********************************/
        System.out.println("\tTest case #3");
        
        //input parameter for test case 3
        diameter = 46.0;
        //expected result
        expResult = -1;
        //call function to run test
        result = instance.sphereVolume(diameter);
        //compare expResult to actual result
        assertEquals(expResult, result, 0.0001);
        // TODO review the generated test code and remove the default call to fail.
     
        
           /**********************************
     * Test Case #4
     *********************************/
        System.out.println("\tTest case #4");
        
        //input parameter for test case 4
        diameter = 0.0;
        //expected result
        expResult = 0.0;
        //call function to run test
        result = instance.sphereVolume(diameter);
        //compare expResult to actual result
        assertEquals(expResult, result, 0.0001);
        // TODO review the generated test code and remove the default call to fail.
      
        
           /**********************************
     * Test Case #5
     *********************************/
        System.out.println("\tTest case #5");
        
        //input parameter for test case 5
        diameter = 45.0;
        //expected result
        expResult = 47712.9384264;
        //call function to run test
        result = instance.sphereVolume(diameter);
        //compare expResult to actual result
        assertEquals(expResult, result, 0.0001);
        // TODO review the generated test code and remove the default call to fail.
       
    }

    /**
     * Test of convertTemperature method, of class QuestionsControl.
     */
    @Test
    public void testConvertTemperature() {
        System.out.println("convertTemperature");
        
     /**********************************
     * Test Case #1
     *********************************/
        System.out.println("\tTest Case #1");
        //input parameter for test case 1
        double fahrenheit = 1000.0;
        //create instance of QuestionsControl class
        //do I need to have this again?
        QuestionsControl instance = new QuestionsControl();
         //expected result
        double expResult = 537.777777778;
        //call function to run test
        double result = instance.convertTemperature(fahrenheit);
        //compare expResult to actual result
        assertEquals(expResult, result, 0.0001);
      
          /**********************************
     * Test Case #2
     *********************************/
        System.out.println("\tTest Case #2");
        //input parameter for test case 2
        fahrenheit = 99.0;
         //expected result
        expResult = -1;
        //call function to run test
        result = instance.convertTemperature(fahrenheit);
        //compare expResult to actual result
        assertEquals(expResult, result, 0.0001);
      
        
          /**********************************
     * Test Case #3
     *********************************/
        System.out.println("\tTest Case #3");
        //input parameter for test case 3
        fahrenheit = 1501.0;
         //expected result
        expResult = -1;
        //call function to run test
        result = instance.convertTemperature(fahrenheit);
        //compare expResult to actual result
        assertEquals(expResult, result, 0.0001);
        
          /**********************************
     * Test Case #4
     *********************************/
        System.out.println("\tTest Case #4");
        //input parameter for test case 4
        fahrenheit = 100.0;
         //expected result
        expResult = 37.7777777778;
        //call function to run test
        result = instance.convertTemperature(fahrenheit);
        //compare expResult to actual result
        assertEquals(expResult, result, 0.0001);

        
          /**********************************
     * Test Case #5
     *********************************/
        System.out.println("\tTest Case #5");
        //input parameter for test case 5
        fahrenheit = 1500.0;
         //expected result
        expResult = 815.555555556;
        //call function to run test
        result = instance.convertTemperature(fahrenheit);
        //compare expResult to actual result
        assertEquals(expResult, result, 0.0001);
      
    }
    
}
