package cla;

public  class Customer {
    String name;
    int phoneNumber;
    String address;

    public String getInfo(){
        return "姓名："+name+"\t"+"电话："+phoneNumber+"\t"+"地址："+address;
    }
}