package test01;

import java.util.Scanner;

public class Calculator {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("请输入两个数");
        System.out.println("第一个数：");
        double num1 = scanner.nextDouble();
        System.out.println("第二个数：");
        double num2 = scanner.nextDouble();
        System.out.println("请输入运算符：");
        System.out.println("1.加法 2.减法 3.乘法 4.除法");
        int operator = scanner.nextInt();
        double result = 0;
        switch (operator) {
            case 1:
                result = num1 + num2;
                break;
            case 2:
                result = num1 - num2;
                break;
            case 3:
                result = num1 * num2;
                break;
            case 4:
                if (num2 != 0) {
                    result = num1 / num2;
                } else {
                    System.out.println("除数不能为0");
                }
                break;
            default:
                System.out.println("输入的运算符不正确");
                break;
        }
        System.out.println("运算结果为：" + result);
    }
}
