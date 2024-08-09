package extend;

import java.util.Objects;

public class Person {
    @Override
    public String toString() {
        return
                "name='" + name + '\'' +
                ", sex='" + sex + '\'' +
                ", age=" + age ;
    }

    private String name;
    private String sex;
    private int age;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getSex() {
        return sex;
    }

    public void setSex(String sex) {
        this.sex = sex;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public Person(String name, String sex, int age) {
        this.name = name;
        this.sex = sex;
        this.age = age;
    }

    public Person() {
    }
}

class Stuent extends Person {

    private int stuId;

    public int getStuId() {
        return stuId;
    }

    public void setStuId(int stuId) {
        this.stuId = stuId;
    }

    public Stuent(String name, String sex, int age, int stuId) {
        super(name, sex, age);
        this.stuId = stuId;
    }

    public Stuent() {

    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Stuent stuent = (Stuent) o;
        return stuId == stuent.stuId && Objects.equals(getName(), stuent.getName());
    }

    @Override
    public String toString() {
        return "Stuent{" +
                "stuId=" + stuId +"," +
                super.toString() +
                '}';
    }
}

class Test {
    // 测试类中实例化两个Student对象，输出是个人信息，并判断是否是同一个学生
    public static void main(String[] args) {
        Stuent stu1 = new Stuent("张三", "男", 18, 1001);
        System.out.println(stu1);
    }
}

