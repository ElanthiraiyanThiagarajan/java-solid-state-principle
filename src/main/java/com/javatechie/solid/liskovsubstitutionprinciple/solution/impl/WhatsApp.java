package com.javatechie.solid.liskovsubstitutionprinciple.solution.impl;

import com.javatechie.solid.liskovsubstitutionprinciple.solution.SocialMedia;
import com.javatechie.solid.liskovsubstitutionprinciple.solution.SocialVideoCallManager;

public class WhatsApp implements SocialMedia,SocialVideoCallManager {
    public void chatWithFriend() {

    }

    public void sendPhotosAndVideos() {

    }

    public void groupVideoCall(String... users) {

    }
}
