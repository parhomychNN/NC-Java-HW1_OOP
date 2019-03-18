package ru.parhomych.netcracker.hw1_oop.myPoint;

public class MyPoint {

    private int x = 0;
    private int y = 0;

    public MyPoint() {
        // default constructor
    }

    public MyPoint(int x, int y) {
        this.x = x;
        this.y = y;
    }

    public int getX() {
        return x;
    }

    public void setX(int x) {
        this.x = x;
    }

    public int getY() {
        return y;
    }

    public void setY(int y) {
        this.y = y;
    }

    public int[] getXY(){
        int[] arrXY = {x, y};
        return arrXY;
    }

    public void setXY(int x, int y) {
        this.x = x;
        this.y = y;
    }

    @Override
    public String toString() {
        return "(" + x +
                "," + y +
                ")";
    }

    public double distance(int x, int y){
        double distance = Math.sqrt(
                Math.pow(this.x - x, 2) + Math.pow(this.y - y, 2)
        );
        return distance;
    }

    public double distance(MyPoint another){
        double distance = distance(another.getX(), another.getY());
        return distance;
    }
    public double distance(){
        double distance = distance(0, 0);
        return distance;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        MyPoint myPoint = (MyPoint) o;

        return y == myPoint.y && x == myPoint.x;
    }

    @Override
    public int hashCode() {
        int result = 17;
        result = 31 * result + x;
        result = 31 * result + y;
        return result;
    }
}
