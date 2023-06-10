package com.javatechie.solid.dependencyinversionprinciple.developerExample;

public class FrontEndDeveloper implements Developer {

    public void develop() {
        makeJavaScriptDeveloper();

    }

    void makeJavaScriptDeveloper() {
        System.out.println("Front End Developer");
    }

}
