package com.codingfuture.dome;

import java.util.Scanner;

public class Test {
    public static void main(String[] args) {

        Circle circle = new Circle(3);
        System.out.println("面积为："+circle.getArea());
        System.out.println("周长为："+circle.getCircumference());
        System.out.println("两个圆的大小："+circle.equals(new Circle(3)));
        System.out.println("更大的圆的面积是："+circle.compare(new Circle(4)).getArea());





//Box box = new Box(10,20,30);
//        System.out.println(box.volume());





//        Scanner sc = new Scanner(System.in);
//        System.out.println("请输入书名");
//        String name = sc.next();
//        System.out.println("请输入作者");
//        String author = sc.next();
//        System.out.println("请输入价格");
//        double price = sc.nextDouble();
//        System.out.println("请输入出版社");
//        String press = sc.next();
//        Book book = new Book(name,price,author,press);
//        book.introduction();







//        Dog dog = new Dog( "旺财", 3, "黄色");
//        dog.setName("旺财");
//        dog.setAge(3);
//        dog.setColor("黄色");
//        dog.showInfo();
    }
}
