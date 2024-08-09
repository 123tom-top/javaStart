package test01;

public class Main {
    public static void main(String[] args) {
      int i = 3287;
        int q=i/1000;
        int b=i%1000/100;
        int s=i/10%10;
        int g=i%10;
        System.out.println("个位是："+g+","+"十位是"+s+","+"百位是"+b+","+"千位是"+q);
    }
}