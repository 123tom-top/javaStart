package cla;


//编写一个Student类：

//(1)  属性：姓名name、性别gender、年龄age、学号id属性。

//(2)  类中有一个show方法，返回String类型，包含学生的所有信息。

//(3)  在另一个测试类StudentTest类中的main方法，创建Student对象，访问所有属性和show方法。
public class Student {
    String name;
    char gender;
    int age;
    int id;

    public  String student(){
        return "姓名："+name+"性别："+gender+"年龄："+age+"学号："+id;
    }


}
