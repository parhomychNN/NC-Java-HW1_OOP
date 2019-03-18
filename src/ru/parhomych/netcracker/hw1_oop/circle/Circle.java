package ru.parhomych.netcracker.hw1_oop.circle;

public class Circle {

    private double radius = 1.0d;
    private String color = "red";

    public Circle() {
        System.out.println("Created an instance of Circle by constructor#1");

    }

    public Circle(double radius) {
        this.radius = radius;
        System.out.println("Created an instance of Circle by constructor#2");

    }

    public Circle(double radius, String color) {
        this.radius = radius;
        this.color = color;
        System.out.println("Created an instance of Circle by constructor#3");
    }

    public double getRadius() {
        return radius;
    }

    public void setRadius(double radius) {
        this.radius = radius;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    @Override
    public String toString() {
        return "Circle[" +
                "radius=" + radius +
                ", color='" + color + '\'' +
                ", area=" + getArea() +
                ']';
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        Circle circle = (Circle) o;

        return color.equals(circle.color) && Double.compare(circle.radius, radius) == 0;
    }

    @Override
    public int hashCode() {
        int result = 17;
        long temp;
        temp = Double.doubleToLongBits(radius);
        result = 31 * result + (int) (temp ^ (temp >>> 32));
        result = 31 * result + color.hashCode();
        return result;
    }

    public double getArea(){
        double area = Math.PI * Math.pow(radius, 2);
        return area;
    }
}
