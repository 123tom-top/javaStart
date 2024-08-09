package interf01;

public class Test {
    public static void main(String[] args) {
        Circle c = new Circle(5);
        Triangle t = new Triangle(3, 4, 5);
            System.out.println(c.getPerimeter());
        System.out.println(t.getPerimeter());
    }
}
