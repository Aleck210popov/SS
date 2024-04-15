package com.ss.two;

public class Crustacean extends Arthropod {
    private String name = "Default Crustie";
    private final boolean wings = false;
    private int limbsPairsNo = 6;

    public Crustacean() {
        super();
    }
    
    public Crustacean(String p1, String p2, int p3, int p5, int p6) {
        super(p1, p2, p3, false, p5, p6);
        this.name = p1;
        this.limbsPairsNo = p5;
    }
    
    public String breatheMode() {
        String temp;
        if (habitat == "Air") {
            temp = name + " are using primitive lungs for respiration.\n";
        }
        else if (habitat == "Water") {
            temp = name + " are using spiracles for respiration.\n";
        }
        else {
            temp = name + " can't breathe.\n";
        };
        return temp;
    }
    
    public String toString() {
        String temp = name + " is a crustacean living in " + habitat + ".\n";
        temp += "There are " + noInRegion + " of them in our region.\n";
        temp += "They don't have wings.\n";
        temp += "They have " + limbsPairsNo + " pairs of limbs and " + eyesNo + " eyes each.\n";
        return temp;
    }
}