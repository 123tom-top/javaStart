package com.codingfuture.dome;

public class Point {
    private int x;
    private int y;

    public Point() {
    }

    public Point(int x, int y) {
        this.x = x;
        this.y = y;
    }

    public void showPoint() {
        System.out.println("(" + x + "," + y + ")");
    }

    public double getDistance() {
        return Math.sqrt(x * x + y * y);
    }

    public double getDistance(double m, double n) {
        return Math.sqrt((x - m) * (x - m) + (y - n) * (y - n));
    }

    public double getDistance(Point pnt) {
        return Math.sqrt((x - pnt.x) * (x - pnt.x) + (y - pnt.y) * (y - pnt.y));
    }

    public static void main(String[] args) {
        Point pnt = new Point(3, 4);
        System.out.print("当前点的坐标为:");
        pnt.showPoint();
        System.out.println("计算当前点到原点的距离:"+ pnt.getDistance());
        System.out.println("计算当前点到任意一点(m,n)的距离:"+pnt.getDistance(1, 2));
        System.out.println("计算当前点到任意一点Point的距离:"+pnt.getDistance(new Point(1, 2)));
    }
}
