package com.javatechie.solid.opencloseprinciple.objectExample;

import java.util.ArrayList;
import java.util.List;

import com.javatechie.solid.opencloseprinciple.objectExample.Solution.ocp.dto.Cuboid;
import com.javatechie.solid.opencloseprinciple.objectExample.Solution.ocp.dto.Sphere;
import com.javatechie.solid.opencloseprinciple.objectExample.Solution.ocp.interfaceexample.GeometricObjects;

public class GeometricImplementation {

    public static void main(String[] args) {
        Cuboid c = new Cuboid();
        c.breadth=10;
        c.height=20;
        c.length=30;

        Sphere sphere = new Sphere();
        sphere.radius= 10;

        List<GeometricObjects> cuboidList = new ArrayList<GeometricObjects>();
        Application a = new Application();
        cuboidList.add(c);
        cuboidList.add(sphere);

        System.out.println(a.get_total_volume(cuboidList));

    
        

    }
    
}
