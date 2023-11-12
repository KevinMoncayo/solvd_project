package com.jkmoncayo.desktop;

public class Processor {
    //Attributes
    private int cores;
    private String brandProcessor;

    //Constructor
    public Processor(int cores, String brandProcessor) {
        this.cores = cores;
        this.brandProcessor = brandProcessor;
    }

    //Getters and Setters

    public int getCores() {

        return cores;
    }

    public void setCores(int cores) {

        this.cores = cores;
    }

    public String getBrandProcessor() {

        return brandProcessor;
    }

    public void setBrandProcessor(String brandProcessor) {

        this.brandProcessor = brandProcessor;
    }
}
