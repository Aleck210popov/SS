package com.ss.two;

public abstract class Arthropod {
    protected String name = "Default Arthie";
    protected String habitat = "Vacuum";
    protected int noInRegion = 0;
    protected boolean wings = false;
    protected int limbsPairsNo = 4;
    protected int eyesNo = 2;
    
    public Arthropod() {}
    
    public Arthropod(String p1, String p2, int p3, boolean p4, int p5, int p6) {
        name = p1;
        habitat = p2;
        noInRegion = p3;
        wings = p4;
        limbsPairsNo = p5;
        eyesNo = p6;
    }
    
    public String getName() {
        return name;
    }
    
    public String getHabitat() {
        return habitat;
    }
    
    public int getNoInRegion() {
        return noInRegion;
    }
    
    public boolean getWings() {
        return wings;
    }
    
    public int getLimbsPairsNo() {
        return limbsPairsNo;
    }
    
    public int getEyesNo() {
        return eyesNo;
    }
    
    public void setName(String p1) {
        if (p1 != null) name = p1;
    }
    
    public void setHabitat(String p2) {
        if (p2 != null) habitat = p2;
    }
    
    public void setNoInRegion(int p3) {
        if (p3 >= 0) noInRegion = p3;
    }
    
    public void setWings(boolean p4) {
        wings = p4;
    }
    
    public void setLimbsPairsNo(int p5) {
        if (p5 >= 0) limbsPairsNo = p5;
    }
    
    public void setEyesNo(int p6) {
        if (p6 >= 0) eyesNo = p6;
    }
    
    public String breatheMode() {
        String temp;
        if (habitat == "Air") {
            temp = name + " are using trachaea for respiration.\n";
        }
        else if (habitat == "Water") {
            temp = name + " are using spiracles for respiration.\n";
        }
        else {
            temp = name + " can't breathe.\n";
        };
        return temp;
    }
    
    public int calcLegs() {
        return 2 * noInRegion * limbsPairsNo;
    }
    
    public String toString() {
        String temp = name + " is an anthropod living in " + habitat + ".\n";
        temp += "There are " + noInRegion + " of them in our region.\n";
        if (wings == true) {
            temp += "They have wings.\n";
        }
        else {
            temp += "They don't have wings.\n";
        };
        temp += "They have " + limbsPairsNo + " pairs of limbs and " + eyesNo + " eyes each.\n";
        return temp;
    }
}