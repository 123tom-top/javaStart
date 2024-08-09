package interf;

public class Circle implements Shape{
    double radius;
    public Circle(double radius) {
        this.radius = radius;
    }
    public  Circle(){

    }
    @Override
    public double getArea() {
        return Pi * radius * radius;
    }
    public double getPerimeter(){
        return 2 * Pi * radius;
    }
}

