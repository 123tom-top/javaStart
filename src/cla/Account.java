package cla;

public class Account {
    //    5、定义银行账户类Account和顾客类Customer：
//(1)  Account类有属性：卡号cid，余额balance，所属用户Customer
//(2)  Account类有如下四个方法：
//①  getInfo()，返回String类型，返回卡的详细信息，包括该卡的客户信息
//②  查询余额getBalance方法，返回double类型的余额
//③  取钱方法withdraw()，参数是取钱金额，返回值是double类型，表示取款后的余额，-1表示取款失败
//④  存钱方法save()，参数是存款金额，返回值是double类型，表示存款后的余额
//(3)  Customer类有姓名、身份证号、联系电话、家庭地址等属性
//(4)  Customer类有方法getInfo()，返回String类型，返回客户的个人信息
//(5)  在测试类TestBank的main方法中创建银行账户类对象和客户类对象，并设置属性，调用各个方法。
    int cid;
    double balance;
    String customer;

    public String getInfo() {
        return "卡号：" + cid + '\t' + "余额：" + '\t' + balance + '\t' + "所属用户：" + customer;
    }

    public double getBalance() {
        return balance;
    }

    public double withdraw(double money) {
        if (money > balance) {
            return -1;
        } else {
            balance -= money;
            return balance;
        }
    }

    public double save(double money) {
        balance += money;
        return balance;
    }
}


