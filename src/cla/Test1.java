package cla;

import javax.sound.midi.Soundbank;

public class Test1 {
    public static void main(String[] args) {

//(5)  在测试类TestBank的main方法中创建银行账户类对象和客户类对象，并设置属性，调用各个方法。

            Account account = new Account();
            account.cid = 123456;
            account.balance = 1000;


            Customer customer=new Customer();
            customer.name = "张信";
            customer.phoneNumber = 123456789;
            customer.address = "北京市海淀区";

            account.customer = customer.getInfo();
            System.out.println(account.getInfo());
            System.out.println(account.getBalance());
            System.out.println(account.withdraw(800));
            System.out.println(account.save(500));
            System.out.println(account.getInfo());
            System.out.println(customer.getInfo());



//        Cylinder c=new Cylinder();
//        c.setValue(5, 4);
//        c.print();


//        Husband husband = new Husband();
//        husband.name = "张三";
//        husband.age = 20;
//
//
//        Wife wife = new Wife();
//        wife.name = "小四";
//        wife.age = 18;


//        husband.wife= wife;
//        wife.husband = husband;
//
//
//        System.out.println(husband.showInfo());
//        System.out.println(wife.showInfo());
//
//
//
//
//


    }
//        Student student=new Student();
//        student.name="张三";
//        student.gender='男';
//        student.age=20;
//        student.id=1001;
//        System.out.println(student.student());
//    }
}
