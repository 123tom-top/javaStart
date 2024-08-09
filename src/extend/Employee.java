package extend;

public class Employee {
    private String name;
    private String id;
    private int blance;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public int getBlance() {
        return blance;
    }

    public void setBlance(int blance) {
        this.blance = blance;
    }

    public Employee() {
    }

    public Employee(String name, String id, int blance) {
        this.name = name;
        this.id = id;
        this.blance = blance;
    }

    public double getBonus() {
        return blance * 1.5;
    }
}
class Manager extends Employee{

    public Manager() {
    }

    public Manager(String name, String id, int blance) {
        super(name, id, blance);
    }


    @Override
    public double getBonus() {
        return getBlance() * 2;
    }
}
class Test01{
    public static void main(String[] args) {
        Employee[] empls = new Employee[2];
        empls[0] = new Employee("张三", "001", 1000);
        empls[1] = new Manager("李四", "002", 2000);
        System.out.println("姓名\t编号\t余额\t奖金");
        for (Employee e : empls) {
            System.out.println(e.getName() + " " + e.getId() + " " + e.getBlance() + " " + e.getBonus());
        }
    }
}
