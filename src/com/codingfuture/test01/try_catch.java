package com.codingfuture.test01;

import test01.Scan;

import java.util.Scanner;

public class try_catch {
    public static void main(String[] args) {
        test1();
    }

    private static void test1() {
        test2();
    }

    private static void test2() {
        test3();
    }
private static  void  test3(){
    Scanner scan=new Scanner(System.in);
    System.out.println("请输入一个除数");
    try {
        int i =100/scan.nextInt();
        System.out.println(i);
    }catch (ArithmeticException e){
        System.out.println("除数不能为0");
    }
    System.out.println("程序结束");
}
}
