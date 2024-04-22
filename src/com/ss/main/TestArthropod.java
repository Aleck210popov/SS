//package com.ss.main;
//
//import com.ss.two.*;
//
//public class TestArthropod
//{
//	public static void main(String[] args) {
//		Crustacean arth2 = new Crustacean();
//		System.out.println(arth2);
//		Crustacean crus1 = new Crustacean();
//		System.out.println(crus1);
//		Crustacean crus2 = new Crustacean("Crab", "Water", 75, 8, 8);
//		System.out.println(crus2);
//		System.out.println(crus1.breatheMode());
//		System.out.println(crus2.breatheMode());
//		Arachnid arac1 = new Arachnid();
//		System.out.println(arac1);
//		Arachnid arac2 = new Arachnid("Spider", "Air", 69, 6);
//		System.out.println(arac2);
//		System.out.println(arac1.breatheMode());
//		System.out.println(arac2.breatheMode());
//		Insect inse1 = new Insect();
//		System.out.println(inse1);
//		Insect inse2 = new Insect("Ladybug", "Air", 420, 4);
//		System.out.println(inse2);
//		System.out.println(inse1.breatheMode());
//		System.out.println(inse2.breatheMode());
//		Arthropod[] region = new Arthropod[4];
//		region[0] = arth2;
//		region[1] = crus2;
//		region[2] = arac2;
//		region[3] = inse2;
//		RegionArthropods obl = new RegionArthropods(4, region);
//		System.out.println(obl);
//		System.out.println("Regional arthropods need " + obl.calcLegs() + " boots.\n");
//	}
//}