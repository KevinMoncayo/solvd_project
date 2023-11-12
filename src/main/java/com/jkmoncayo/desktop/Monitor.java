package com.jkmoncayo.desktop;

public class Monitor {
    //Attributes
    private String monitorBrand;
    private int size;

    //Constructor
    public Monitor(String monitorBrand, int size) {
        this.monitorBrand = monitorBrand;
        this.size = size;
    }

    //Getters and Setters
    public String getMonitorBrand() {
        return monitorBrand;
    }

    public void setMonitorBrand(String monitorBrand) {
        this.monitorBrand = monitorBrand;
    }

    public int getSize() {
        return size;
    }

    public void setSize(int size) {
        this.size = size;
    }

}
