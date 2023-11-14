package com.jkmoncayo.desktop;

import java.util.Objects;

public class Speaker extends OutoutDevice{
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

    @Override
    protected void exitInformation() {
        System.out.println("Making sound through "+this.brandSpeaker);
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Speaker speaker = (Speaker) o;
        return Objects.equals(brandSpeaker, speaker.brandSpeaker);
    }

    @Override
    public int hashCode() {
        return Objects.hash(brandSpeaker);
    }
}
