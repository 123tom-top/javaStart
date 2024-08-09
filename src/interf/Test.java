package interf;

public class Test {
    public static void main(String[] args) {
        Circle cir = new Circle(2);
        Cylinder cyl=new Cylinder(3);
        cyl.setHeight(1);
        System.out.println(cir.getArea());
        System.out.println(cir.getPerimeter());
        System.out.println(cyl.getVolume());
    }
}
