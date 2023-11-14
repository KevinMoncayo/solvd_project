package com.jkmoncayo.desktop;

public class Main {
    public static void main(String[] args) {
        //Attributes
        int computersBuilt = 0;

        Cpu kitCpu1 = new Cpu("CPU1002");
        Cpu kitCpu2 = new Cpu("CPU1002");
        HardDisk ssd1 = new HardDisk("Crucial",2,"Solid State");
        Keyboard keyboardGeniusWired = new Keyboard("k1002","Wired computers.Keyboard");
        Monitor lg50 = new Monitor("LG",50);
        MotherBoard asusMotherBoard = new MotherBoard("ASUS");
        Mouse mouseGeniusWired = new Mouse("Wired computers.Mouse");
        Printer hpLasser = new Printer("Lasser","HP");
        Processor intelI9 = new Processor(9,"Intel");
        Ram crucialRam64GbDdr5 = new Ram("Crucial",64,"DDR5");
        Speaker bose1 = new Speaker("Bose");

        computersBuilt++;
        System.out.println("Cantidad de computadores construidos: "+computersBuilt);

        System.out.println("Type info through keyboard:");
        keyboardGeniusWired.enterInformation();
        System.out.println("Now enter info through mouse:");
        mouseGeniusWired.enterInformation();
        lg50.exitInformation();
        hpLasser.exitInformation();
        bose1.exitInformation();

        System.out.println(kitCpu1.hashCode());
        System.out.println(kitCpu2.hashCode());
    }
}

//(done)Use polymorphism with at least one abstract class.
//(done)Create and override at least one abstract method.
//(done)Use protected modifier at least 5 times
//(done)Override methods from class Object (toString(), hashcode(), equals()) for at least 3 classes from the hierarchy.
