package ru.parhomych.netcracker.hw1_oop.rectangle;

public class RectangleTestDrive {
    public static void main(String[] args) {
        System.out.println("************************************************************");
        System.out.println("******************** Home Work #1, OOP *********************");
        System.out.println("******************* by Parkhomenko Ilya ********************");
        System.out.println("************************* Rectangle ************************");
        System.out.println("************************************************************");
        System.out.println();
        Rectangle rectangle1 = new Rectangle();
        Rectangle rectangle2 = new Rectangle(2.5f, 3.5f);

        System.out.println();
        System.out.println("Before setters:");

        System.out.println(rectangle1);
        System.out.println(rectangle2);

        System.out.println();
        System.out.println("After setters (and getters):");

        rectangle1.setLength(4.5f);
        rectangle2.setWidth(rectangle1.getLength());

        System.out.println(rectangle1);
        System.out.println(rectangle2);
    }
}
