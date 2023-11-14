package com.jkmoncayo.desktop;

import java.util.Objects;
import java.util.Scanner;

public class Keyboard extends InputDevice{
    //Attributes
    private String partId;
    private String typeKeyboard;

    final Scanner keyboard = new Scanner(System.in);

    //Constructor
    public Keyboard(String partId, String typeKeyboard) {
        this.partId = partId;
        this.typeKeyboard = typeKeyboard;
    }

    //Getters and Setters
    public String getPartId() {
        return partId;
    }

    public void setPartId(String partId) {
        this.partId = partId;
    }

    public String getTypeKeyboard() {
        return typeKeyboard;
    }

    public void setTypeKeyboard(String typeKeyboard) {
        this.typeKeyboard = typeKeyboard;
    }

    @Override
    protected void enterInformation() {
        String data_in = keyboard.nextLine();
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Keyboard keyboard1 = (Keyboard) o;
        return Objects.equals(partId, keyboard1.partId) && Objects.equals(typeKeyboard, keyboard1.typeKeyboard) && Objects.equals(keyboard, keyboard1.keyboard);
    }

    @Override
    public int hashCode() {
        return Objects.hash(partId, typeKeyboard, keyboard);
    }
}
