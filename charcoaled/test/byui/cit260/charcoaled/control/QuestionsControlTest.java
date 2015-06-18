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
     * Test Case #1; valid entry
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
     * Test Case #2; invalid entry 
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
     * Test Case #3; invalid entry 
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
     * Test Case #4; boundary - low
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
     * Test Case #5 boundary - high
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
     * Test Case #1; invalid entry
     *********************************/
        System.out.println("\tTest Case #1");
        //input parameter for test case 1
        double fahrenheit = 1000.0;
        //create instance of QuestionsControl class
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
     
    /**
     * Test of triangleArea method, of class QuestionsControl.
     */
    @Test
    public void testTriangleArea() {
        System.out.println("triangleArea");
		
        /************************
        * Test Case #1
        ***********************/
        System.out.println("\tTest Case #1");
        // input values for Test Case #1
        double base = 6.0;
        double height = 8.0;
        // expected output returned value
        double expResult = 24.0;
        // create instance of QuestionsControl class
        QuestionsControl instance = new QuestionsControl();
        // call function to run test
        double result = instance.triangleArea(base, height);
        // compare expected return value with actual value returned
        assertEquals(expResult, result, 0.0001);
                
        /************************
         * Test Case #2
         ***********************/
        System.out.println("\tTest Case #2");
        // input values for Test Case #2
        base = -1.0;
        height = 8.0;
        // expected output returned value
        expResult = -1.0; 
        // call function to run test
        result = instance.triangleArea(base, height);
        // compare expected return value with actual value returned
        assertEquals(expResult, result, 0.0001);
		
	/************************
         * Test Case #3
         ***********************/
        System.out.println("\tTest Case #3");
        // input values for Test Case #3
        base = 6.0;
        height = -1.0;
        // expected output returned value
        expResult = -1.0; 
        // create instance of QuestionsControl class
        result = instance.triangleArea(base, height);
        // compare expected return value with actual value returned
        assertEquals(expResult, result, 0.0001);
				
	/************************
         * Test Case #4
         ***********************/
        System.out.println("\tTest Case #4");
        // input values for Test Case #4
        base = 51.0;
        height = 8.0;
        // expected output returned value
        expResult = -1.0; 
        // call function to run test
        result = instance.triangleArea(base, height);
        // compare expected return value with actual value returned
        assertEquals(expResult, result, 0.0001);
		
	/************************
         * Test Case #5
         ***********************/
        System.out.println("\tTest Case #5");
        // input values for Test Case #5
        base = 6.0;
        height = 51.0;
        // expected output returned value
        expResult = -1.0; 
        // create instance of QuestionsControl class
        result = instance.triangleArea(base, height);
        // compare expected return value with actual value returned
        assertEquals(expResult, result, 0.0001);
				
	/************************
         * Test Case #6
         ***********************/
        System.out.println("\tTest Case #6");
        // input values for Test Case #6
        base = 0.0;
        height = 8.0;
        // expected output returned value
        expResult = 0.0; 
        // create instance of QuestionsControl class
        result = instance.triangleArea(base, height);
        // compare expected return value with actual value returned
        assertEquals(expResult, result, 0.0001);
				
	/************************
         * Test Case #7
         ***********************/
        System.out.println("\tTest Case #7");
        // input values for Test Case #7
        base = 6.0;
        height = 0.0;
        // expected output returned value
        expResult = 0.0; 
        // create instance of QuestionsControl class
        result = instance.triangleArea(base, height);
        // compare expected return value with actual value returned
        assertEquals(expResult, result, 0.0001);
				
	/************************
         * Test Case #8
         ***********************/
        System.out.println("\tTest Case #3");
        // input values for Test Case #3
        base = 50.0;
        height = 8.0;
        // expected output returned value
        expResult = 200.0; 
        // create instance of QuestionsControl class
        result = instance.triangleArea(base, height);
        // compare expected return value with actual value returned
        assertEquals(expResult, result, 0.0001);
				
	/************************
         * Test Case #9
         ***********************/
        System.out.println("\tTest Case #9");
        // input values for Test Case #9
        base = 6.0;
        height = 50.0;
        // expected output returned value
        expResult = 150.0; 
        // create instance of QuestionsControl class
        result = instance.triangleArea(base, height);
        // compare expected return value with actual value returned
        assertEquals(expResult, result, 0.0001);
	
    }
    
}
