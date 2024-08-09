package cla;

public class Husband {
    String name;
    byte age;
    Wife wife;

    public String showInfo() {
            return "名字："+this.name+"年龄："+this.age+"妻子："+this.wife.name;

    }

}
