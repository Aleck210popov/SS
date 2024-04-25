package com.ss.main;

import com.ss.graphical.GraphicalInterface;
import com.ss.one.Triangle;
import com.ss.two.*;

public class Main {
    public static void main(String[] args) {
        Crustacean crus2 = new Crustacean("Crab", "Water", 75, 8, 8);
        Arachnid arac2 = new Arachnid("Spider", "Air", 69, 6);
        Insect inse2 = new Insect("Ladybug", "Air", 420, 4);
        Arthropod[] region = new Arthropod[3];
        region[0] = crus2;
        region[1] = arac2;
        region[2] = inse2;
        RegionArthropods obl = new RegionArthropods(3, region);
        Triangle t4 = new Triangle (5, 3, 5);


        startGraphicalInterface(t4, obl, true);
    }
    private static void startGraphicalInterface(){
        GraphicalInterface graphicalInterface = new GraphicalInterface();
    }
    private static void startGraphicalInterface(Triangle triangle){
        GraphicalInterface graphicalInterface = new GraphicalInterface(triangle);
    }
    private static void startGraphicalInterface(RegionArthropods regionArthropods){
        GraphicalInterface graphicalInterface = new GraphicalInterface(regionArthropods);
    }
    private static void startGraphicalInterface(Triangle triangle, RegionArthropods regionArthropods){
        GraphicalInterface graphicalInterface = new GraphicalInterface(triangle, regionArthropods);
    }
    private static void startGraphicalInterface(Triangle triangle, RegionArthropods regionArthropods, boolean isLanguage){
        GraphicalInterface graphicalInterface = new GraphicalInterface(triangle, regionArthropods, isLanguage);
    }
}
