package com.javatechie.solid.dependencyinversionprinciple.developerExample;

import java.util.ArrayList;
import java.util.List;

public class DeveloperImplementation {

    public static void main(String[] args) {
        List<Developer> dList = new ArrayList<Developer>();

        Developer f = new FrontEndDeveloper();
        Developer b = new BackEndDeveloper();
        dList.add(f);
        dList.add(b);

        for (Developer d : dList) {
            d.develop();
        }

    }

}
