package com.jkmoncayo.desktop;

import java.util.Scanner;

public class Mouse extends InputDevice{
    //Atributes
    private String typeMouse;

    final Scanner mouse = new Scanner(System.in);

    //Constructor
    public Mouse(String typeMouse) {
        this.typeMouse = typeMouse;
    }

    //Getters and Setters
    public String getTypeMouse() {
        return typeMouse;
    }

    public void setTypeMouse(String typeMouse) {
        this.typeMouse = typeMouse;
    }


    @Override
    public String enterInformation() {
        String data_in = mouse.nextLine();
        return data_in;
    }
}
