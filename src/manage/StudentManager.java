package manage;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class StudentManager {
    private List<Student> students = new ArrayList<>();
    private Scanner scanner = new Scanner(System.in);

    // 增加学生信息
    public void addStudent() {
        System.out.print("请输入学生姓名: ");
        String name = scanner.nextLine();
        System.out.print("请输入学生性别: ");
        String gender = scanner.nextLine();
        System.out.print("请输入学生学号: ");
        String studentId = scanner.nextLine();
        System.out.print("请输入学生班级: ");
        String studentClass = scanner.nextLine();

        Student student = new Student(name, gender, studentId, studentClass);
        students.add(student);
        System.out.println("学生信息添加成功！");
    }

    // 删除学生信息
    public void removeStudent() {
        System.out.print("请输入要删除的学生学号: ");
        String studentId = scanner.nextLine();

        Student studentToRemove = null;
        for (Student student : students) {
            if (student.getStudentId().equals(studentId)) {
                studentToRemove = student;
                break;
            }
        }

        if (studentToRemove != null) {
            students.remove(studentToRemove);
            System.out.println("学生信息删除成功！");
        } else {
            System.out.println("未找到该学号对应的学生！");
        }
    }

    // 修改学生信息
    public void updateStudent() {
        System.out.print("请输入要修改的学生学号: ");
        String studentId = scanner.nextLine();

        for (Student student : students) {
            if (student.getStudentId().equals(studentId)) {
                System.out.print("请输入新的学生姓名: ");
                student.setName(scanner.nextLine());
                System.out.print("请输入新的学生性别: ");
                student.setGender(scanner.nextLine());
                System.out.print("请输入新的学生班级: ");
                student.setStudentClass(scanner.nextLine());
                System.out.println("学生信息修改成功！");
                return;
            }
        }
        System.out.println("未找到该学号对应的学生！");
    }

    // 查询学生信息（按学号或班级）
    public void queryStudents() {
        System.out.println("1. 按学号查询");
        System.out.println("2. 按班级查询");
        System.out.print("请选择查询方式: ");
        int choice = Integer.parseInt(scanner.nextLine());

        if (choice == 1) {
            System.out.print("请输入学生学号: ");
            String studentId = scanner.nextLine();
            for (Student student : students) {
                if (student.getStudentId().equals(studentId)) {
                    System.out.println(student);
                    return;
                }
            }
            System.out.println("未找到该学号对应的学生！");
        } else if (choice == 2) {
            System.out.print("请输入班级: ");
            String studentClass = scanner.nextLine();
            boolean found = false;
            for (Student student : students) {
                if (student.getStudentClass().equals(studentClass)) {
                    System.out.println(student);
                    found = true;
                }
            }
            if (!found) {
                System.out.println("未找到该班级的学生！");
            }
        } else {
            System.out.println("无效选择！");
        }
    }
}

