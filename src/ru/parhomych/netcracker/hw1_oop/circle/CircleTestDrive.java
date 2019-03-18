package ru.parhomych.netcracker.hw1_oop.circle;

public class CircleTestDrive {
    public static void main(String[] args) {
        System.out.println("************************************************************");
        System.out.println("******************** Home Work #1, OOP *********************");
        System.out.println("******************* by Parkhomenko Ilya ********************");
        System.out.println("************************** Circle **************************");
        System.out.println("************************************************************");
        System.out.println();

        System.out.println("-------------------- Test for 1 task (Circle) --------------------");

        Circle circle1 = new Circle();
        Circle circle2 = new Circle(2.5);
        Circle circle3 = new Circle(20, "yellow");

        System.out.println();
        System.out.println("Before setters:");

        System.out.println(circle1);
        System.out.println(circle2);
        System.out.println(circle3);

        System.out.println();
        System.out.println("After setters (and getters):");

        circle1.setColor("blue");
        circle2.setColor(circle3.getColor());
        circle3.setRadius(30);

        System.out.println(circle1);
        System.out.println(circle2);
        System.out.println(circle3);
    }
}
