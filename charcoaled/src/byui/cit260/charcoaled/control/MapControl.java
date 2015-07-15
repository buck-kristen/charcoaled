/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package byui.cit260.charcoaled.control;

import byui.cit260.charcoaled.model.Location;
import byui.cit260.charcoaled.model.Map;
import byui.cit260.charcoaled.model.Scene;

/**
 *
 * @author justdance2007
 */
public class MapControl { 
    public static Map createMap()
//throws MapControlException **and insert void after static then remove return statement below
    {
        Map map = new Map(); //creating map
        
        Location[][] locations = MapControl.createLocations();
        map.setLocations(locations);
        
        map.setRow("0");
        map.setColumn("0");
      
        return map; 
    }

    private static Location[][] createLocations()
//throws MapControlException **and insert void after static then remove return statement below
    {
        int rows = 5;
        int columns = 5;
        Location[][] locations = new Location[rows][columns];//create 2d array
            for (int r = 0; r < rows; r++) {
                for (int c = 0; c < columns; c++) {
                    //create location
                    Location location = new Location();
                    location.setRow(Integer.toString(r));//convert int to string
                    
                    location.setColumn(Integer.toString(c));
                    location.setVisited(false);
                    
                    Scene scene = new Scene();
                    scene.setSymbol(" # ");
            
                    location.setScene(scene);
                    //place in array
                    locations[r][c] = location;
                }
            }
            locations[0][0].setVisited(true);
            //create Scene
            Scene scene = new Scene();
            scene.setSymbol(" ^ ");
            
            locations[0][0].setScene(scene);
            return locations; 
    }
    
}