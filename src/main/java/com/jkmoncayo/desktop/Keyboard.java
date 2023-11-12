package com.jkmoncayo.desktop;

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
    public String enterInformation() {
        String data_in = keyboard.nextLine();
        return data_in;
    }
}
