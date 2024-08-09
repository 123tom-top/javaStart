package test01;

import java.util.Scanner;

public class Lvyou {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("请输入你出行的月份");
        int n = scanner.nextInt();
        double a = 5000;
        if (n>=4&n<=10){
            double td=a*0.9;
            double jj=a*0.6;
            System.out.println("您的头等舱费用为"+td+"元");
            System.out.println("您的经济舱费用为"+jj+"元");
        }else {
            double td=a*0.5;
            double jj=a*0.4;
            System.out.println("您的头等舱费用为"+td+"元");
            System.out.println("您的经济舱费用为"+jj+"元");
        }
    }
}
