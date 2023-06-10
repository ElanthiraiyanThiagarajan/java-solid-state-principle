package com.javatechie.solid.opencloseprinciple.usingInterface;

import com.javatechie.solid.opencloseprinciple.usingInterface.interfacesection.Notificationservice;

public class WhatsAppNotificationService implements Notificationservice {

    public void sendOTP(String medium) {
        //logic to integrate whatsapp api
    }

    public void sendTransactionReport(String medium) {
//logic to integrate whatsapp api
    }
}
