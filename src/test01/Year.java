package test01;

import java.util.Scanner;


public class Year {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("请输入年份：");
        int year = scanner.nextInt();
        System.out.print("请输入月份：");
        int month = scanner.nextInt();
        System.out.print("请输入日期：");
        int day = scanner.nextInt();
        int[] daysInMonth = {31, 28, 31, 30, 31, 30, 31, 31, 30, 31, 30, 31};
        boolean isLeapYear = (year % 4 == 0 && year % 100 != 0) || (year % 400 == 0);
        if (isLeapYear) {
            daysInMonth[1] = 29;
        }
        int dayOfYear = 0;
        for (int i = 0; i < month - 1; i++) {
            dayOfYear += daysInMonth[i];
        }
        dayOfYear += day;
        System.out.println("这一天是当年的第 " + dayOfYear + " 天。");
    }
}
