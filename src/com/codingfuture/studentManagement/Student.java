package com.codingfuture.studentManagement;
class Student {
   private String name;
   private String sex;
   private int id;
   private String studentClass;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getSex() {
        return sex;
    }

    public void setSex(String sex) {
        this.sex = sex;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getStudentClass() {
        return studentClass;
    }

    public void setStudentClass(String studentClass) {
        this.studentClass = studentClass;
    }

    public Student() {
    }


    public Student(String name, String sex, int id, String studentClass) {
        this.name = name;
        this.sex = sex;
        this.id = id;
        this.studentClass = studentClass;
    }

    @Override
    public String toString() {
        return "学生信息{" +
                "姓名='" + name + '\'' +
                ", 性别='" + sex + '\'' +
                ", 学号=" + id +
                ", 班级='" + studentClass + '\'' +
                '}';
    }
}