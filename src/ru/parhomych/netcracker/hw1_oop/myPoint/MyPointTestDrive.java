package ru.parhomych.netcracker.hw1_oop.myPoint;

public class MyPointTestDrive {
    public static void main(String[] args) {
        System.out.println("************************************************************");
        System.out.println("******************** Home Work #1, OOP *********************");
        System.out.println("******************* by Parkhomenko Ilya ********************");
        System.out.println("************************* My Point *************************");
        System.out.println("************************************************************");
        System.out.println();

        MyPoint point1 = new MyPoint(4,3);
        MyPoint point2 = new MyPoint();
        MyPoint point3 = new MyPoint(4,19);
        MyPoint point4 = new MyPoint(11,15);

        System.out.println("Мои точки: ");
        System.out.println(point1);
        System.out.println(point2);
        System.out.println(point3);
        System.out.println(point4);

        System.out.println();
        System.out.println("Testing distance:");

        System.out.println("distance(int x, int y): " + point1.distance(3,4));
        System.out.println("distance(MyPoint another) [point1 to point3]: "
                + point1.distance(point3));
        System.out.println("distance() [point1 to 0]: " + point1.distance());

        System.out.println();
        System.out.println("Testing getXY():");
        System.out.println(point3.getXY()[0] + " " + point3.getXY()[1]);
    }
}
