package For;

interface A {
    String func();
}

class B implements A {
    public String func() {
        return "func";
    }
}

class Test01 {
    public static void main(String[] args) {
        A a = new B();
        System.out.println(a.func());
    }
}