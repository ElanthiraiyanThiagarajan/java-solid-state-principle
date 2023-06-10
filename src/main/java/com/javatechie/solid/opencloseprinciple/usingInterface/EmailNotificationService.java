package com.javatechie.solid.opencloseprinciple.usingInterface;
import com.javatechie.solid.opencloseprinciple.usingInterface.interfacesection.Notificationservice;

public class EmailNotificationService implements Notificationservice {
    public void sendOTP(String medium) {
        //write logic to integrate with email api

    }

    public void sendTransactionReport(String medium) {
        //write logic to integrate with email api
    }
}
