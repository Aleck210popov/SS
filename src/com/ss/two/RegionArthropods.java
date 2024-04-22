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
        StringBuilder temp = new StringBuilder("Regional arthropods:\n");
        for (int i = 0; i < numArthropods; i++) {
            temp.append(arthropods[i]);
        }
        return temp.toString();
    }
    
    public int calcLegs() {
        int temp = 0;
        for (int i = 0; i < numArthropods; i++) {
            temp += arthropods[i].calcLegs();
        }
        return temp;
    }
    public String numberEmployees() {
        int arachnid = 0;
        int crustacean = 0;
        int insect = 0;
        for (Arthropod arthropod : arthropods) {
            if (arthropod instanceof Arachnid) {
                arachnid++;
            } else if (arthropod instanceof Crustacean) {
                crustacean++;
            } else if (arthropod instanceof Insect) {
                insect++;
            }
        }
        return String.format("Паукообразные: %d, ракообразные: %d, насекомые: %d", arachnid, crustacean, insect);
    }
}