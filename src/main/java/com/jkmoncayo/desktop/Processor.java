package com.jkmoncayo.desktop;

import java.util.Objects;

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

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Processor processor = (Processor) o;
        return cores == processor.cores && Objects.equals(brandProcessor, processor.brandProcessor);
    }

    @Override
    public int hashCode() {
        return Objects.hash(cores, brandProcessor);
    }
}
