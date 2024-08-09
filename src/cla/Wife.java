package cla;

public class Wife {
    String name;
    byte age;
    Husband husband;

    public String showInfo() {
        return "名字：" + this.name + "年龄：" + this.age + "妻子：" + this.husband.name;
    }
}
