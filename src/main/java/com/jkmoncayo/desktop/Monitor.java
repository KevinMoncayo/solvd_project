package com.jkmoncayo.desktop;

import java.util.Objects;

public class Monitor extends OutoutDevice{
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

    @Override
    protected void exitInformation() {
        System.out.println("Show info through Monitor "+this.monitorBrand);
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Monitor monitor = (Monitor) o;
        return size == monitor.size && Objects.equals(monitorBrand, monitor.monitorBrand);
    }

    @Override
    public int hashCode() {
        return Objects.hash(monitorBrand, size);
    }
}
