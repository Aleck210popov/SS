package com.ss.two;

public class Insect extends Arthropod {
    private String name = "Default Insie";
    private final boolean wings = true;
    private final int limbsPairsNo = 3;

    public Insect() {
        super();
    }
    
    public Insect(String p1, String p2, int p3, int p6) {
        super(p1, p2, p3, true, 3, p6);
        this.name = p1;
    }
    
    public String breatheMode() {
        String temp;
        if (habitat == "Air") {
            temp = name + " are using trachaea for respiration.\n";
        }
        else {
            temp = name + " can't breathe.\n";
        };
        return temp;
    }
    
    public String toString() {
        String temp = name + " is an insect living in " + habitat + ".\n";
        temp += "There are " + noInRegion + " of them in our region.\n";
        temp += "They have wings.\n";
        temp += "They have " + limbsPairsNo + " pairs of limbs and " + eyesNo + " eyes each.\n";
        return temp;
    }
}