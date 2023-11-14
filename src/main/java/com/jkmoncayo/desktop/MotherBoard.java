package com.jkmoncayo.desktop;

import java.util.Objects;

public class MotherBoard {
    //Attributes
    private String brand;

    //Constructor
    public MotherBoard(String brand) {
        this.brand = brand;
    }

    //Getters and Setters
    public String getBrand() {
        return brand;
    }

    public void setBrand(String brand) {
        this.brand = brand;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        MotherBoard that = (MotherBoard) o;
        return Objects.equals(brand, that.brand);
    }

    @Override
    public int hashCode() {
        return Objects.hash(brand);
    }
}
