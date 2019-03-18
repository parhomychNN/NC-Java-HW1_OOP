package ru.parhomych.netcracker.hw1_oop.myTriangle;

public class MyTriangleEqualsHashTest {
    public static void main(String[] args) {
        MyTriangle myTriangle1 = new MyTriangle(1,2,3,4,5,6);
        MyTriangle myTriangle2 = new MyTriangle(1,2,3,4,5,6);
        MyTriangle myTriangle3 = new MyTriangle(21,20,3,4,5,6);

        System.out.println(myTriangle1);
        System.out.println(myTriangle2);
        System.out.println(myTriangle3);

        System.out.println();

        System.out.println("myTriangle1.equals(myTriangle2) --> " + myTriangle1.equals(myTriangle2));
        System.out.println("myTriangle1.equals(myTriangle3) --> " + myTriangle1.equals(myTriangle3));

        System.out.println();

        System.out.println("myTriangle1.hashCode() --> " + myTriangle1.hashCode());
        System.out.println("myTriangle2.hashCode() --> " + myTriangle2.hashCode());
        System.out.println("myTriangle3.hashCode() --> " + myTriangle3.hashCode());

    }
}
