package manage;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class ParentManager {
    private List<Parent> parents = new ArrayList<>();
    private Scanner scanner = new Scanner(System.in);

    // 增加家长信息
    public void addParent() {
        System.out.print("请输入家长姓名: ");
        String name = scanner.nextLine();
        System.out.print("请输入家长性别: ");
        String gender = scanner.nextLine();
        System.out.print("请输入家长与学生的关系: ");
        String relation = scanner.nextLine();
        System.out.print("请输入家长年龄: ");
        int age = Integer.parseInt(scanner.nextLine());
        System.out.print("请输入家长联系方式: ");
        String contact = scanner.nextLine();

        Parent parent = new Parent(name, gender, relation, age, contact);
        parents.add(parent);
        System.out.println("家长信息添加成功！");
    }

    // 删除家长信息
    public void removeParent() {
        System.out.print("请输入要删除的家长姓名: ");
        String name = scanner.nextLine();

        Parent parentToRemove = null;
        for (Parent parent : parents) {
            if (parent.getName().equals(name)) {
                parentToRemove = parent;
                break;
            }
        }

        if (parentToRemove != null) {
            parents.remove(parentToRemove);
            System.out.println("家长信息删除成功！");
        } else {
            System.out.println("未找到该姓名对应的家长！");
        }
    }

    // 修改家长信息
    public void updateParent() {
        System.out.print("请输入要修改的家长姓名: ");
        String name = scanner.nextLine();

        for (Parent parent : parents) {
            if (parent.getName().equals(name)) {
                System.out.print("请输入新的性别: ");
                parent.setGender(scanner.nextLine());
                System.out.print("请输入新的与学生关系: ");
                parent.setRelation(scanner.nextLine());
                System.out.print("请输入新的年龄: ");
                parent.setAge(Integer.parseInt(scanner.nextLine()));
                System.out.print("请输入新的联系方式: ");
                parent.setContact(scanner.nextLine());
                System.out.println("家长信息修改成功！");
                return;
            }
        }
        System.out.println("未找到该姓名对应的家长！");
    }

    // 查询家长信息
    public void queryParents() {
        System.out.println("1. 按姓名查询");
        System.out.println("2. 查询所有家长");
        System.out.print("请选择查询方式: ");
        int choice = Integer.parseInt(scanner.nextLine());

        switch (choice) {
            case 1:
                queryParentByName();
                break;
            case 2:
                listAllParents();
                break;
            default:
                System.out.println("无效选择！");
        }
    }

    // 根据姓名查询家长信息
    private void queryParentByName() {
        System.out.print("请输入家长姓名: ");
        String name = scanner.nextLine();
        for (Parent parent : parents) {
            if (parent.getName().equals(name)) {
                System.out.println(parent);
                return;
            }
        }
        System.out.println("未找到该姓名对应的家长！");
    }

    // 列出所有家长信息
    private void listAllParents() {
        if (parents.isEmpty()) {
            System.out.println("没有家长信息！");
        } else {
            for (Parent parent : parents) {
                System.out.println(parent);
            }
        }
    }
}
