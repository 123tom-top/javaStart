package Arr;

import java.util.Scanner;

public class Test01 {
    public static void main(String[] args) {
//       任意输入5个人名，在其中查找一个指定的人。
        Scanner scanner = new Scanner(System.in);
        String[] names = new String[5];
        for (int i = 0; i < names.length; i++) {
            names[i] = scanner.next();

        }
        System.out.println("请输入要查找的人名：");
        String name = scanner.next();
boolean flag = false;
        for (int i = 0; i < names.length; i++) {
            if (names[i].equals(name)) {
                System.out.println("找到了");
                flag = true;
            }
            }
        if (!flag) {
            System.out.println("没找到");
        }



















//有一个整数数组，其中存放着序列45,6,23,8,26,98,6,15。请将该序列排序并倒序输出。
//        int[] arr = {45, 6, 23, 8, 26, 98, 6, 15};
//
//        for (int i = 0; i < arr.length; i++) {

//            for (int j = 0; j < arr.length - 1; j++) {
//                if (arr[j] < arr[j + 1]) {
//                    int temp = arr[j];
//                    arr[j] = arr[j + 1];
//                    arr[j + 1] = temp;
//                }
//            }
        }
//        for (int i = 0; i < arr.length; i++) {
//
//            System.out.print(arr[i]+" ");
//
//        }




//        定义一个整型数组（长度和所有元素都从控制台输入），求出数组中所有元素的和、数组元素的最大值和最小值，并输出
//        Scanner scanner = new Scanner(System.in);
//
//        // 读取数组长度
//        System.out.print("请输入数组的长度: ");
//        int length = scanner.nextInt();
//
//        // 定义数组
//        int[] array = new int[length];
//
//        // 读取数组元素
//        System.out.println("请输入数组的 " + length + " 个元素:");
//        for (int i = 0; i < length; i++) {
//            array[i] = scanner.nextInt();
//        }
//        // 初始化和、最大值、最小值
//        int sum = 0;
//        int max = array[0];
//        int min = array[0];
//
//        // 计算和、最大值、最小值
//        for (int i = 0; i < length; i++) {
//            sum += array[i];
//            if (array[i] > max) {
//                max = array[i];
//            }
//            if (array[i] < min) {
//                min = array[i];
//            }
//        }
//        // 输出结果
//        System.out.println("数组中所有元素的和: " + sum);
//        System.out.println("数组中元素的最大值: " + max);
//        System.out.println("数组中元素的最小值: " + min);


//         打印数组arr,每三个元素换行
//       int [] arr = {1,2,3,4,5,6,7,8,9,10};
//        for (int i = 0; i < arr.length; i++) {
//            if(i%3==0){
//                System.out.println();
//            }
//            System.out.print(arr[i]+" ");
//        }


}

