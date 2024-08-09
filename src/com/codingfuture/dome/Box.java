package com.codingfuture.dome;

public class Box {
    private int length;
    private int width;
    private int height;

    public Box() {
    }

    public Box(int length, int width, int height) {
        this.length = length;
        this.width = width;
        this.height = height;
    }
//    定义一个方法求立方体的体积并返回
   public int volume(){
        return length*width*height;
   }
}
