package com.jkmoncayo.desktop;

import java.util.Objects;

public class Cpu {
    //Attributes
    private String reference;

    //Constructor
    public Cpu(String reference) {
        this.reference = reference;
    }

    //Getters and Setters
    public String getReference() {
        return reference;
    }

    public void setReference(String reference) {
        this.reference = reference;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Cpu cpu = (Cpu) o;
        return Objects.equals(reference, cpu.reference);
    }

    @Override
    public int hashCode() {
        return Objects.hash(reference);
    }
}
