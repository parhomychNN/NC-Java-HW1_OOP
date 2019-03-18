package ru.parhomych.netcracker.hw1_oop.myPoint;

public class MyPointEqualsHashTest {
    public static void main(String[] args) {
        MyPoint myPoint1 = new MyPoint(3, 4);
        MyPoint myPoint2 = new MyPoint(3, 4);
        MyPoint myPoint3 = new MyPoint(5, 10);

        System.out.println(myPoint1);
        System.out.println(myPoint2);
        System.out.println(myPoint3);

        System.out.println();

        System.out.println("myPoint1.equals(myPoint2) --> " + myPoint1.equals(myPoint2));
        System.out.println("myPoint1.equals(myPoint3) --> " + myPoint1.equals(myPoint3));

        System.out.println();

        System.out.println("myPoint1.hashCode() --> " + myPoint1.hashCode());
        System.out.println("myPoint2.hashCode() --> " + myPoint2.hashCode());
        System.out.println("myPoint3.hashCode() --> " + myPoint3.hashCode());

    }
}
