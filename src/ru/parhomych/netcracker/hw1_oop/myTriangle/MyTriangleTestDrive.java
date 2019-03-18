package ru.parhomych.netcracker.hw1_oop.myTriangle;

import ru.parhomych.netcracker.hw1_oop.myPoint.MyPoint;

public class MyTriangleTestDrive {
    public static void main(String[] args) {
        System.out.println("************************************************************");
        System.out.println("******************** Home Work #1, OOP *********************");
        System.out.println("******************* by Parkhomenko Ilya ********************");
        System.out.println("************************* Triangle *************************");
        System.out.println("************************************************************");
        System.out.println();

        // creating isosceles triangle
        MyPoint iso1point = new MyPoint(0, 0);
        MyPoint iso2point = new MyPoint(0, 3);
        MyPoint iso3point = new MyPoint(3, 0);
        MyTriangle isoscTriangle = new MyTriangle(iso1point, iso2point, iso3point);
        System.out.println(isoscTriangle);
        System.out.println("Perimeter of isoscTriangle = " + isoscTriangle.getPerimeter());
        System.out.println("Type of triangle: " + isoscTriangle.getType());

        System.out.println("---***---");

        // creating scalene triangle
        MyPoint sc1point = new MyPoint(0, 0);
        MyPoint sc2point = new MyPoint(-4, 3);
        MyPoint sc3point = new MyPoint(3, 0);
        MyTriangle scTriangle = new MyTriangle(sc1point, sc2point, sc3point);
        System.out.println(scTriangle);
        System.out.println("Perimeter of scTriangle = " + scTriangle.getPerimeter());
        System.out.println("Type of triangle: " + scTriangle.getType());

    }
}
