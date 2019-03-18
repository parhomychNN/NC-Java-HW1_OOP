package ru.parhomych.netcracker.hw1_oop.rectangle;

public class RectangleEqualsHashTest {
    public static void main(String[] args) {
        Rectangle rectangle1 = new Rectangle(13,9);
        Rectangle rectangle2 = new Rectangle(13,9);
        Rectangle rectangle3 = new Rectangle(0,0);

        System.out.println(rectangle1);
        System.out.println(rectangle2);
        System.out.println(rectangle3);

        System.out.println();

        System.out.println("rectangle1.equals(rectangle2) --> " + rectangle1.equals(rectangle2));
        System.out.println("rectangle1.equals(rectangle3) --> " + rectangle1.equals(rectangle3));

        System.out.println();

        System.out.println("rectangle1.hashCode() --> " + rectangle1.hashCode());
        System.out.println("rectangle2.hashCode() --> " + rectangle2.hashCode());
        System.out.println("rectangle3.hashCode() --> " + rectangle3.hashCode());

    }
}
