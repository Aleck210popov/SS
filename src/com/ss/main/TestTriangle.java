//package com.ss.main;
//
//import com.ss.one.Triangle;
//
//public class TestTriangle
//{
//  public static void main (String[]args)
//  {
//	Triangle t1 = null, t2 = null, t3 = null, t4 = null, t5 = null;
//	  try
//	{
//	  t1 = new Triangle ();
//	  t2 = new Triangle (1.5);
//	  t3 = new Triangle (2, 2);
//	  t4 = new Triangle (3, 4, 5);
//	  t5 = new Triangle (1, 2, 2);
//	}
//	catch (IllegalArgumentException e)
//	{
//	  System.err.printf ("Unable to create a triangle: " + e.getMessage ());
//	  System.exit (-1);
//	}
//	System.out.println ("t1 has sides: " + t1);
//	System.out.println ("t2 has sides: " + t2);
//	System.out.println ("t3 has sides: " + t3);
//	System.out.println ("t4 has sides: " + t4);
//	System.out.println ("t5 has sides: " + t5);
//	System.out.println ("t3 = t4 is " + t3.equals (t4));
//	System.out.println ("t3 = t5 is " + t3.equals (t5));
//	System.out.println ("t1's angles are: " + t1.angle1 () + ", " +
//						t1.angle2 () + ", " + t1.angle3 ());
//	System.out.println ("t4's angles are: " + t4.angle1 () + ", " +
//						t4.angle2 () + ", " + t4.angle3 ());
//	System.out.println ("t1's perimeter is: " + t1.perimeter ());
//	System.out.println ("t1's surface is: " + t1.surface ());
//	System.out.println ("t1's heights are: " + t1.height1 () + ", " +
//						t1.height2 () + ", " + t1.height3 ());
//	System.out.println ("t1's equilaterality is " + t1.isEquilateral ());
//	System.out.println ("t4's equilaterality is " + t4.isEquilateral ());
//	System.out.println ("t1's isoscelesness is " + t1.isIsosceles ());
//	System.out.println ("t4's isoscelesness is " + t4.isIsosceles ());
//	System.out.println ("t1's rectangularity is " + t1.isRectangular ());
//	System.out.println ("t4's rectangularity is " + t4.isRectangular ());
//  }
//}
