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
    public double convertTemperature(double fahrenheit) { //Kristen function signature
        if (fahrenheit < 100 || fahrenheit > 1500) { //testing for invalids
            return -1;        
        }
           // fahrenheit = f; how to reassign variable name?? Change code when I find out
            double degreesCelsius = (fahrenheit-32) * 5/9; //find temperature in Celsius
            return degreesCelsius;
            
            
    }
}