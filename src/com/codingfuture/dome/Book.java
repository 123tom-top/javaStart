package com.codingfuture.dome;

public class Book {
    private String name;
    private double price;
    private String author;
    private String press;

    public String getName() {
        return name;
    }


    public double getPrice() {
        return price;
    }

    public void setPrice(double price) {
        if (this.price<10){
            this.price = 10;
            System.out.println("价格不能低于10元");
        }
        this.price = price;
    }

    public String getAuthor() {
        return author;
    }

    public String getPress() {
        return press;
    }

    public void setPress(String press) {
        this.press = press;
    }


    public Book(String name, double price, String author, String press) {
        this.name = name;
        this.price = price;
        this.author = author;
        this.press = press;
    }
    public void introduction(){
        System.out.println("书名："+this.name+"，作者："+this.author+"，出版社："+this.press+"，价格："+this.price);
    }
}
