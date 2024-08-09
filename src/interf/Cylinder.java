package interf;

public class Cylinder extends Circle{
double height;

    public double getHeight() {
        return height;
    }

    public void setHeight(double height) {
        this.height = height;
    }

    public Cylinder(int radius) {
        super(radius);
    }
    @Override
    public double getArea() {
        return 2 * Pi * radius * (radius + height);
    }
    public double getVolume() {
        return Pi * radius * radius* height;
    }
}
