package interf01;

public class Circle extends Triangle {
    double radius;

    public Circle(double radius) {
        this.radius = radius;
    }

    public Circle() {
    }

    @Override
    public double getPerimeter() {
        return 2 * Math.PI * radius;
    }
}
