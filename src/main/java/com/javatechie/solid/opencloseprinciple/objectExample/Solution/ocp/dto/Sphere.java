package com.javatechie.solid.opencloseprinciple.objectExample.Solution.ocp.dto;

import com.javatechie.solid.opencloseprinciple.objectExample.Solution.ocp.interfaceexample.GeometricObjects;

public class Sphere extends GeometricObjects {

    public double radius;

    public double getVolume() {
        return (4 / 3) * Math.PI * radius * radius * radius;
    }

}
