package ru.parhomych.netcracker.hw1_oop.rectangle;

public class Rectangle {

    private float length = 1.0f;
    private float width = 1.0f;

    public Rectangle() {
        System.out.println("Created an instance of Rectangle by constructor#1");
    }

    public Rectangle(float length, float width) {
        this.length = length;
        this.width = width;
        System.out.println("Created an instance of Rectangle by constructor#2");
    }

    public float getLength() {
        return length;
    }

    public void setLength(float length) {
        this.length = length;
    }

    public float getWidth() {
        return width;
    }

    public void setWidth(float width) {
        this.width = width;
    }

    @Override
    public String toString() {
        return "Rectangle[" +
                "length=" + length +
                ", width=" + width +
                ", perimeter=" + getPerimeter() +
                ", area=" + getArea() +
                ']';
    }

    public double getArea(){
        double area = length * width;
        return area;
    }

    public double getPerimeter(){
        double perimeter = 2 * (length+width);
        return perimeter;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        Rectangle rectangle = (Rectangle) o;

        return Float.compare(rectangle.width, width) == 0 && Float.compare(rectangle.length, length) == 0;
    }

    @Override
    public int hashCode() {
        int result = 17;
        result = 31 * result + Float.floatToIntBits(length);
        result = 31 * result + Float.floatToIntBits(width);
        return result;
    }
}
