package com.jkmoncayo.desktop;

public class Speaker {
    //Attributes
    private String brandSpeaker = "Marshall";

    //Constructor

    public Speaker(String brandSpeaker) {
        this.brandSpeaker = brandSpeaker;
    }

    //Getters and Setters

    public String getBrandSpeaker() {

        return brandSpeaker;
    }

    public void setBrandSpeaker(String brandSpeaker) {

        this.brandSpeaker = brandSpeaker;
    }
}
