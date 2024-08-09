package com.codingfuture.dome;

public class Circle {
    private int radius;
    public Circle() {
    }
    public Circle(int radius) {
        this.radius = radius;
    }
    public double getCircumference() {
        return 2 * radius;
    }
    public double getArea(){
        return Math.PI * radius * radius;
    }
    public boolean equals(Circle circle){
        return this.radius == circle.radius;
    }
//    获取更大的圆
public Circle compare(Circle circle){
        if(this.radius > circle.radius){
            return this;
        }else{
            return circle;
        }

}



}
