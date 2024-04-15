package com.ss.two;

public class Arachnid extends Arthropod {
    private String name = "Default Arachie";
    private final boolean wings = false;
    private final int limbsPairsNo = 4;

    public Arachnid() {
        super();
    }
    
    public Arachnid(String p1, String p2, int p3, int p6) {
        super(p1, p2, p3, false, 4, p6);
        this.name = p1;
    }
    
    public String breatheMode() {
        String temp;
        if (habitat == "Air") {
            temp = name + " are using book lungs for respiration.\n";
        }
        else {
            temp = name + " can't breathe.\n";
        };
        return temp;
    }
    
    public String toString() {
        String temp = name + " is an arachnid living in " + habitat + ".\n";
        temp += "There are " + noInRegion + " of them in our region.\n";
        temp += "They don't have wings.\n";
        temp += "They have " + limbsPairsNo + " pairs of limbs and " + eyesNo + " eyes each.\n";
        return temp;
    }
}