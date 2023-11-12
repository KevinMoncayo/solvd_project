package com.jkmoncayo.desktop;

public class Ram {
    //Attributes
    private String brandMemoryRam;
    private int memorySizeGb;
    private String ramMemoryTechnology;

    //Constructor
    public Ram(String brandMemoryRam, int memorySizeGb, String ramMemoryTechnology) {
        this.brandMemoryRam = brandMemoryRam;
        this.memorySizeGb = memorySizeGb;
        this.ramMemoryTechnology = ramMemoryTechnology;
    }

    //Getters and Setters

    public String getBrandMemoryRam() {

        return brandMemoryRam;
    }

    public void setBrandMemoryRam(String brandMemoryRam) {

        this.brandMemoryRam = brandMemoryRam;
    }

    public int getMemorySizeGb() {

        return memorySizeGb;
    }

    public void setMemorySizeGb(int memorySizeGb) {

        this.memorySizeGb = memorySizeGb;
    }

    public String getRamMemoryTechnology() {

        return ramMemoryTechnology;
    }

    public void setRamMemoryTechnology(String ramMemoryTechnology) {

        this.ramMemoryTechnology = ramMemoryTechnology;
    }
}
