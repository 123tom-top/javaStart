package cla;
//封装一个一个圆柱体类：
//(1)  声明两个属性：底面的半径，和高
//(2)  声明如下方法：
//①  赋值方法public boolean setValue(double radius,double height)，为圆柱体的底边的半径和高赋值，并返回赋值的结果：如果底边的半径或高为<=0，赋值失败，返回false，否则返回true
//
//②  返回底面积方法public double getArea()
//
//③  返回体积方法 public double getVolume()
//
//④  打印圆柱体的详细信息：圆柱体的底边的半径是xxx，高是xxx，底面积是xxx，体积是xxx。
//
//(3)  测试类中测试上述所有功能
public class Cylinder {
    int radius;
    int height;
    public boolean setValue(double radius,double height){
        if(radius<=0||height<=0){
            return false;
        }else{
            this.radius=(int)radius;
            this.height=(int)height;
            return true;

        }

    }
    public double getArea(){
        return Math.PI*radius*radius;
    }
    public double getVolume() {
        return Math.PI * radius * radius * height;
    }
    public void print() {
        System.out.println("圆柱体的底边的半径是" + radius + "，高是" + height + "，底面积是" + getArea() + "，体积是" + getVolume());
    }
    }

