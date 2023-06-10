package com.javatechie.solid.opencloseprinciple.objectExample.Solution.ocp.dto;

import com.javatechie.solid.opencloseprinciple.objectExample.Solution.ocp.interfaceexample.GeometricObjects;

public class Cuboid extends GeometricObjects{

    public double length;
    public double breadth;
    public double height;
    
    
    public double getVolume() {
        return length * breadth * height;
    }

    
}
