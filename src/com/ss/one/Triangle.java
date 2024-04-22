package com.ss.one;

public class Triangle {
    private double side1;
    private double side2;
    private double side3;
    private double temp;

    public Triangle() {
        this(1, 1, 1);
    }

    public Triangle(double s1) {
        this(s1, 1, 1);
    }

    public Triangle(double s1, double s2) {
        this(s1, s2, 1);
    }

    public Triangle(double s1, double s2, double s3) {
        side1 = Math.max(Math.max(s1, s2), s3);
        side3 = Math.min(Math.min(s1, s2), s3);
        side2 = s1 + s2 + s3 - side1 - side3;
        if (side3 <= 0) {
            throw new IllegalArgumentException("Sides must be positive");
        }
        if (side1 >= side2 + side3) {
            throw new
                    IllegalArgumentException
                    ("Any side must be less than the sum of two remaining ones");
        }
    }

    public String toString() {
        return side1 + ", " + side2 + ", " + side3;
    }

    public boolean equals(Triangle a) {
        if ((this.side1 == a.side1) && (this.side2 == a.side2)
                && (this.side3 == a.side3)) {
            return true;
        } else {
            return false;
        }
    }

    public double getSide1() {
        return side1;
    }

    public double getSide2() {
        return side2;
    }

    public double getSide3() {
        return side3;
    }

    public void setSide1(double n) {
        side1 = n;
    }

    public void setSide2(double n) {
        side2 = n;
    }

    public void setSide3(double n) {
        side3 = n;
    }

    public double angle1() {
        return Math.acos((side2 * side2 + side3 * side3 - side1 * side1) /
                (2 * side2 * side3)) * 180 / Math.PI;
    }

    public double angle2() {
        return Math.acos((side1 * side1 + side3 * side3 - side2 * side2) /
                (2 * side1 * side3)) * 180 / Math.PI;
    }

    public double angle3() {
        return Math.acos((side2 * side2 + side1 * side1 - side3 * side3) /
                (2 * side2 * side1)) * 180 / Math.PI;
    }

    public double perimeter() {
        return side1 + side2 + side3;
    }

    public double surface() {
        double p = perimeter() / 2;
        return Math.sqrt(p * (p - side1) * (p - side2) * (p - side3));
    }

    public double height1() {
        return 2 * surface() / side1;
    }

    public double height2() {
        return 2 * surface() / side2;
    }

    public double height3() {
        return 2 * surface() / side3;
    }

    public boolean isEquilateral() {
        return (side1 == side3);
    }

    public boolean isIsosceles() {
        return (side1 == side2) || (side2 == side3);
    }

    public boolean isRectangular() {
        return (Math.abs(angle1() - 90) <= 0.000001);
    }

    public String getDataTriangle(Triangle triangle) {
        double perimeter = triangle.perimeter();
        double surface = triangle.surface();
        boolean isEquilateral = triangle.isEquilateral();
        boolean isIsosceles = triangle.isIsosceles();
        boolean isRectangular = triangle.isRectangular();

        return String.format("Периметр: %.2f, площадь: %.2f," +
                        " равносторонний: %s, равнобедренный: %s, прямоугольный: %s",
                triangle.perimeter(),
                triangle.surface(),
                triangle.isEquilateral() ? "Да" : "Нет",
                triangle.isIsosceles() ? "Да" : "Нет",
                triangle.isRectangular() ? "Да" : "Нет");
    }
}
