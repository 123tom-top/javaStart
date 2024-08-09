package apple;

public class Apple {
    public static void main(String[] args) {
        JuiceMachine juiceMachine = new JuiceMachine();
        Apple2 apple2 = new Apple2();
        Orange orange= new Orange();
        juiceMachine.juice(apple2);
        juiceMachine.juice(orange());
    }

    private static Apple2 orange() {
        return null;
    }
}
class Orange{
    public void flow() {
        System.out.println("Orange juice");
    }
}
class JuiceMachine{

    public void juice(Apple2 apple2)  {
        apple2.flow();
    }
    public void juice(Orange orange)  {
        orange.flow();
    }
}
class Apple2{

    public void flow() {
        System.out.println("Apple juice");
    }
}