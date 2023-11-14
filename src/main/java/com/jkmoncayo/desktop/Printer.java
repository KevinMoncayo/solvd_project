package com.jkmoncayo.desktop;

import java.util.Objects;

public class Printer extends OutoutDevice{
    //Attributes
    private String typePrinter;
    private String printerBrand;


    //Constructor
    public Printer(String typePrinter, String printerBrand) {

        this.typePrinter = typePrinter;
        this.printerBrand = printerBrand;
    }

    //Getters and Setters
    public String getTypePrinter() {
        return typePrinter;
    }

    public void setTypePrinter(String typePrinter) {
        this.typePrinter = typePrinter;
    }

    public String getPrinterBrand() {
        return printerBrand;
    }

    public void setPrinterBrand(String printerBrand) {
        this.printerBrand = printerBrand;
    }
    @Override
    protected void exitInformation() {
        System.out.println("Show info through Printer "+this.printerBrand);
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Printer printer = (Printer) o;
        return Objects.equals(typePrinter, printer.typePrinter) && Objects.equals(printerBrand, printer.printerBrand);
    }

    @Override
    public int hashCode() {
        return Objects.hash(typePrinter, printerBrand);
    }
}
