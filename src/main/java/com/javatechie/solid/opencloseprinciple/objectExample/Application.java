package com.javatechie.solid.opencloseprinciple.objectExample;

import java.util.List;

import com.javatechie.solid.opencloseprinciple.objectExample.Solution.ocp.interfaceexample.GeometricObjects;

// To calculate the volume of geometric objects

public class Application {

        // It returns the total volume of the geometric objects

    public double get_total_volume(List<GeometricObjects> geo_objects){
         // Variable to store total volume
         double vol_sum = 0;
 
         // Iteratively calculating the volume of each object
         // and adding it to the total volume
         for (GeometricObjects geo_obj : geo_objects) {
              
             // Iteratively calculating the volume of each object
             // and adding it to the total volume
             vol_sum += geo_obj.getVolume();
         }
  
         // returning the to total volume
         return vol_sum;
    }
    
}
