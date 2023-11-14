package com.jkmoncayo.desktop;

import java.util.Objects;
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
    protected void enterInformation() {
        String data_in = mouse.nextLine();
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Mouse mouse1 = (Mouse) o;
        return Objects.equals(typeMouse, mouse1.typeMouse) && Objects.equals(mouse, mouse1.mouse);
    }

    @Override
    public int hashCode() {
        return Objects.hash(typeMouse, mouse);
    }
}
