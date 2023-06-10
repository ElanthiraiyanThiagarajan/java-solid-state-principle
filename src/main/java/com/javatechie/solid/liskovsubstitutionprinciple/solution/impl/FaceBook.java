package com.javatechie.solid.liskovsubstitutionprinciple.solution.impl;

import com.javatechie.solid.liskovsubstitutionprinciple.solution.PostMediaManager;
import com.javatechie.solid.liskovsubstitutionprinciple.solution.SocialMedia;
import com.javatechie.solid.liskovsubstitutionprinciple.solution.SocialVideoCallManager;

public class FaceBook implements SocialMedia,PostMediaManager,SocialVideoCallManager{

    public void chatWithFriend() {
        // TODO Auto-generated method stub
        throw new UnsupportedOperationException("Unimplemented method 'chatWithFriend'");
    }

    public void sendPhotosAndVideos() {
        // TODO Auto-generated method stub
        throw new UnsupportedOperationException("Unimplemented method 'sendPhotosAndVideos'");
    }

    public void publishPost(Object post) {
        // TODO Auto-generated method stub
        throw new UnsupportedOperationException("Unimplemented method 'publishPost'");
    }

    public void groupVideoCall(String... users) {
        // TODO Auto-generated method stub
        throw new UnsupportedOperationException("Unimplemented method 'groupVideoCall'");
    }
    
}
