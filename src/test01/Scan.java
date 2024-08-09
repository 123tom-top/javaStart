package test01;

import java.util.Scanner;public class Scan {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("请输入你的成绩：");
        int a = input.nextInt();
        if (a>=90&a<100){
            System.out.println("A");
        }else if (a>=70&a<90){
            System.out.println("B");
        }  else if (a>=60&a<70) {
            System.out.println("C");
        } else if (a>=0&a<60)  {
            System.out.println("D");
        }else{
            System.out.println("输入错误");
        }

    }
}