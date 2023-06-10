package com.javatechie.solid.dependencyinversionprinciple.developerExample;

public class BackEndDeveloper implements Developer {

    public void develop() {
        writeJava();
    }

    void writeJava() {
        System.out.println("Writing Java Code");
    }

}
