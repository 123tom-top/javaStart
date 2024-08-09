package test01;


public class Ff {
    public static void main(String[] args) {
        int i = 0;
        change(i);
        i = i++;
        System.out.println("i = " + i);
    }

    public static void change(int i) {
        i++;
    }//0


}

//    // 冒泡排序方法
//    public static void bubbleSort(int[] array) {
//        int n = array.length;
//
//        for (int i = 0; i < n - 1; i++) {
//            for (int j = 0; j < n - 1 - i; j++) {
//                if (array[j] > array[j + 1]) {
//                    int temp = array[j];
//                    array[j] = array[j + 1];
//                    array[j + 1] = temp;
//                }
//            }
//            // 如果在一轮中没有发生交换，数组已经排序好，提前结束
//        }
//    }
//
//    // 打印数组的方法
//    public static void printArray(int[] array) {
//        for (int i : array) {
//            System.out.print(i + " ");
//        }
//        System.out.println();
//    }
//
//    // 测试冒泡排序方法
//    public static void main(String[] args) {
//        int[] array = {64, 34, 25, 12, 22, 11, 90};
//        System.out.println("排序前的数组：");
//        printArray(array);
//        bubbleSort(array);
//        System.out.println("排序后的数组：");
//        printArray(array);
//    }
//}


//        int i = 4, j = 2;
//        method(i, j);
//        System.out.println(i);
//    }
//
//    public static void method(int i, int j) {
//        i += j;
//    }//4
//    }

