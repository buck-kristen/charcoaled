/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package byui.cit260.charcoaled.control;

/**
 *
 * @author justdance2007
 */
public class QuestionsControl {
    public double sphereVolume(double diameter) { //function signature for Team
        if (diameter < 0 || diameter > 45) { //testing for invalids
            return -1; 
        }
            double radius = diameter / 2; //finding volume of a sphere
            double volume = (4.0/3.0) * Math.PI * Math.pow(radius, 3);
            return volume;
        }
    public static double convertTemperature(double fahrenheit) { //Kristen function signature
        if (fahrenheit < 100 || fahrenheit > 1500) { //testing for invalids
            System.out.println("Invalid- Number must be entered between 100 and 1500.");
            return -1;        
        }
        else {                  
            double degreesCelsius = (fahrenheit-32) * 5/9; //find temperature in Celsius
            System.out.println("The temperature in Celsius is: " + degreesCelsius);
            return degreesCelsius;
        }       
    }
    
    public double triangleArea (double base, double height) { // fx signature for calculating the area of a triangle
        if (base < 0 || base > 50) { // test for invalid values. is base negative or out of range?
            return -1;
        }
            
        if (height < 0 || height > 50) { // test for invalid values. is height negative or out of range?
            return -1;
        }
        
        double areaOfTriangle = (base * height) / 2; // calculate area of triangle (when base & height are known)
            
        return areaOfTriangle;
    }  
    
}