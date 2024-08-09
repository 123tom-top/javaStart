package apple;

public abstract class Animal {
    abstract public void shout();
}
class Cat extends Animal{
    @Override
    public void shout() {
        System.out.println("猫叫");
    }
}
class Dog extends Animal{
    @Override
    public void shout() {
        System.out.println("狗叫");
    }
}
class Test01{
    public static void main(String[] args) {
        Animal a1 =new Cat();
        a1.shout();
        Animal a2 =new Dog();
        a2.shout();
    }
}
