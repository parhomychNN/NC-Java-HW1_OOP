package ru.parhomych.netcracker.hw1_oop.circle;

public class CircleEqualsHashTest {
    public static void main(String[] args) {

        Circle circle1 = new Circle(10.4, "green");
        Circle circle2 = new Circle(10.4, "green");
        Circle circle3 = new Circle(11, "red");

        System.out.println("circle1.equals(circle2) --> " + circle1.equals(circle2));
        System.out.println("circle1.equals(circle3) --> " + circle1.equals(circle3));

        System.out.println();

        System.out.println("circle1.hashCode() --> " + circle1.hashCode());
        System.out.println("circle2.hashCode() --> " + circle2.hashCode());
        System.out.println("circle3.hashCode() --> " + circle3.hashCode());
    }
}
