package com.ss.two;

public class RegionArthropods {
    private int numArthropods = 5;
    private Arthropod[] arthropods;
    
    public RegionArthropods() {
        arthropods = new Arthropod[numArthropods];
    }
    
    public RegionArthropods(int n) {
        if (n >= 0) numArthropods = n;
        arthropods = new Arthropod[numArthropods];
    }
    
    public RegionArthropods(int n, Arthropod[] arr) {
        if (n >= 0) numArthropods = n;
        arthropods = arr;
    }
    
    public int getNumArthropods() {
        return numArthropods;
    }
    
    public Arthropod[] getArthropods() {
        return arthropods;
    }
    
    public void setNumArthropods(int n) {
        if (n >= 0) numArthropods = n;
    }
    
    public void setArthropods(Arthropod[] arr) {
        arthropods = arr;
    }
    
    public String toString() {
        String temp = "Regional arthropods:\n";
        for (int i = 0; i < numArthropods; i++) {
            temp += arthropods[i];
        }
        return temp;
    }
    
    public int calcLegs() {
        int temp = 0;
        for (int i = 0; i < numArthropods; i++) {
            temp += arthropods[i].calcLegs();
        }
        return temp;
    }
}