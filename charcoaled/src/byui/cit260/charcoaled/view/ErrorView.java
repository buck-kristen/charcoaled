/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package byui.cit260.charcoaled.view;

import charcoaled.Charcoaled;
import java.io.PrintWriter;

/**
 *
 * @author justdance2007
 */
public class ErrorView {
    private static final PrintWriter errorFile = Charcoaled.getOutFile();
    private static final PrintWriter logFile = Charcoaled.getLogFile(); 
    
    public static void display (String className, String errorMessage) {
        errorFile.println(
                 "-----------------------------"
                +"\n-ERROR- " + errorMessage
                +"\n----------------------------");
        
        //log error wk 11pg. 12
        logFile.println(className + "-" + errorMessage);
    }
}
