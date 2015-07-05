/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package byui.cit260.charcoaled.control;

import byui.cit260.charcoaled.exceptions.QuestionsControlException;
import java.util.ArrayList;

/**
 *
 * @author justdance2007
 */
public class QuestionsControl {
    ArrayList<Integer> tempList;
    
    public QuestionsControl() {
        tempList = new ArrayList<Integer>();
        //average= 561 total = 3366
            tempList.add(150);
            tempList.add(500);
            tempList.add(430);
            tempList.add(1200);
            tempList.add(984);
            tempList.add(102);
    }
    
    public double sphereVolume(double diameter) throws QuestionsControlException { //function signature for Team
        if (diameter < 0 || diameter > 45) { //testing for invalids
            throw new QuestionsControlException("Diameter is out of range, must be between 0 and 45.");
        }
        double radius = diameter / 2; //finding volume of a sphere
        double volume = (4.0/3.0) * Math.PI * Math.pow(radius, 3);
        return volume;
    }
    
    public static double convertTemperature(double fahrenheit) throws QuestionsControlException { //Kristen function signature
        if (fahrenheit < 100 || fahrenheit > 1500) { //testing for invalids
            throw new QuestionsControlException("Temperature value is out of range, must be between 100 and 1500 degrees Fahrenheit.");       
        }
        else {                  
            double degreesCelsius = (fahrenheit-32) * 5/9; //find temperature in Celsius
            System.out.println("The temperature in Celsius is: " + degreesCelsius);
            return degreesCelsius;
        }       
    }
    
    public int findAverage() {
        //for-each loop
        int sum = 0; 
            for (int temperature: tempList) {
                sum = sum + temperature;
            }
	//calculate average value
	int average = sum / tempList.size();
	
        return average;
    }
    
    public void displayTempList() {
        System.out.println("\nFind the average of the following temperatures:");
        for (int temperature: tempList) {
            System.out.println(temperature);
        }
    }
    
    public double triangleArea (double base, double height) throws QuestionsControlException { // fx signature for calculating the area of a triangle
        if (base < 0 || base > 50) { // test for invalid values. is base negative or out of range?
            throw new QuestionsControlException("Base value is out of range, must be between 0 and 50.");
        }
            
        if (height < 0 || height > 50) { // test for invalid values. is height negative or out of range?
            throw new QuestionsControlException("Height value is out of range, must be between 0 and 50.");
        }
        
        double areaOfTriangle = (base * height) / 2; // calculate area of triangle (when base & height are known)
            
        return areaOfTriangle;
    }  
    
    
}