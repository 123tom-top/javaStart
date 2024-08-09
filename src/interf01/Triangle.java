package interf01;

public class Triangle implements Shape {
//三角形的三边属性
     double a;
    double b;
     double c;

    public Triangle(double a, double b, double c) {
        this.a = a;
        this.b = b;
        this.c = c;
    }

    public Triangle() {
    }

    @Override
    public double getPerimeter() {
        return a+b+c;
    }
}