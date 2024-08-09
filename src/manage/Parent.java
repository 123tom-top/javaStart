package manage;

public class Parent {
    private String name;
    private String gender;
    private String relation;
    private int age;
    private String contact;

    // 构造方法
    public Parent(String name, String gender, String relation, int age, String contact) {
        this.name = name;
        this.gender = gender;
        this.relation = relation;
        this.age = age;
        this.contact = contact;
    }

    // Getter 和 Setter 方法
    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getGender() {
        return gender;
    }

    public void setGender(String gender) {
        this.gender = gender;
    }

    public String getRelation() {
        return relation;
    }

    public void setRelation(String relation) {
        this.relation = relation;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public String getContact() {
        return contact;
    }

    public void setContact(String contact) {
        this.contact = contact;
    }

    // 重写 toString 方法
    @Override
    public String toString() {
        return "Parent{" +
                "name='" + name + '\'' +
                ", gender='" + gender + '\'' +
                ", relation='" + relation + '\'' +
                ", age=" + age +
                ", contact='" + contact + '\'' +
                '}';
    }
}
