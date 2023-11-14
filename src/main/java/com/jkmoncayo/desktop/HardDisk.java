package com.jkmoncayo.desktop;

import java.util.Objects;

public class HardDisk {
    //Attributes
    private String hardDiskBrand;
    private int digitalStorageCapacityTera;
    private String hardDiskInterface;

    //Constructor

    public HardDisk(String hardDiskBrand, int digitalStorageCapacityTera, String hardDiskInterface) {
        this.hardDiskBrand = hardDiskBrand;
        this.digitalStorageCapacityTera = digitalStorageCapacityTera;
        this.hardDiskInterface = hardDiskInterface;
    }

    //Getters and Setters

    public String getHardDiskBrand() {
        return hardDiskBrand;
    }

    public void setHardDiskBrand(String hardDiskBrand) {
        this.hardDiskBrand = hardDiskBrand;
    }

    public int getDigitalStorageCapacityTera() {
        return digitalStorageCapacityTera;
    }

    public void setDigitalStorageCapacityTera(int digitalStorageCapacityTera) {
        this.digitalStorageCapacityTera = digitalStorageCapacityTera;
    }

    public String getHardDiskInterface() {
        return hardDiskInterface;
    }

    public void setHardDiskInterface(String hardDiskInterface) {
        this.hardDiskInterface = hardDiskInterface;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        HardDisk hardDisk = (HardDisk) o;
        return digitalStorageCapacityTera == hardDisk.digitalStorageCapacityTera && Objects.equals(hardDiskBrand, hardDisk.hardDiskBrand) && Objects.equals(hardDiskInterface, hardDisk.hardDiskInterface);
    }

    @Override
    public int hashCode() {
        return Objects.hash(hardDiskBrand, digitalStorageCapacityTera, hardDiskInterface);
    }
}
