package manage;

import java.util.Scanner;

import java.util.Scanner;

public class MainMenu {
    private StudentManager studentManager = new StudentManager();
    private GradeManager gradeManager = new GradeManager();
    private ParentManager parentManager = new ParentManager();
    private Scanner scanner = new Scanner(System.in);

    public void displayMainMenu() {
        while (true) {
            System.out.println("欢迎进入学生管理系统");
            System.out.println("1. 学生信息管理");
            System.out.println("2. 成绩信息管理");
            System.out.println("3. 家长信息管理");
            System.out.println("4. 退出系统");
            System.out.print("请选择操作: ");
            int choice = Integer.parseInt(scanner.nextLine());

            switch (choice) {
                case 1:
                    studentMenu();
                    break;
                case 2:
                    gradeMenu();
                    break;
                case 3:
                    parentMenu();
                    break;
                case 4:
                    System.out.println("退出系统！");
                    return;
                default:
                    System.out.println("无效选择，请重新选择！");
            }
        }
    }

    private void studentMenu() {
        while (true) {
            System.out.println("学生信息管理");
            System.out.println("1. 添加学生信息");
            System.out.println("2. 删除学生信息");
            System.out.println("3. 修改学生信息");
            System.out.println("4. 查询学生信息");
            System.out.println("5. 返回主菜单");
            System.out.print("请选择操作: ");
            int choice = Integer.parseInt(scanner.nextLine());

            switch (choice) {
                case 1:
                    studentManager.addStudent();
                    break;
                case 2:
                    studentManager.removeStudent();
                    break;
                case 3:
                    studentManager.updateStudent();
                    break;
                case 4:
                    studentManager.queryStudents();
                    break;
                case 5:
                    return;
                default:
                    System.out.println("无效选择，请重新选择！");
            }
        }
    }

    private void gradeMenu() {
        while (true) {
            System.out.println("成绩信息管理");
            System.out.println("1. 添加成绩信息");
            System.out.println("2. 删除成绩信息");
            System.out.println("3. 修改成绩信息");
            System.out.println("4. 查询成绩信息");
            System.out.println("5. 返回主菜单");
            System.out.print("请选择操作: ");
            int choice = Integer.parseInt(scanner.nextLine());

            switch (choice) {
                case 1:
                    gradeManager.addGrade();
                    break;
                case 2:
                    gradeManager.removeGrade();
                    break;
                case 3:
                    gradeManager.updateGrade();
                    break;
                case 4:
                    gradeManager.queryGrades();
                    break;
                case 5:
                    return;
                default:
                    System.out.println("无效选择，请重新选择！");
            }
        }
    }

    private void parentMenu() {
        while (true) {
            System.out.println("家长信息管理");
            System.out.println("1. 添加家长信息");
            System.out.println("2. 删除家长信息");
            System.out.println("3. 修改家长信息");
            System.out.println("4. 查询家长信息");
            System.out.println("5. 返回主菜单");
            System.out.print("请选择操作: ");
            int choice = Integer.parseInt(scanner.nextLine());

            switch (choice) {
                case 1:
                    parentManager.addParent();
                    break;
                case 2:
                    parentManager.removeParent();
                    break;
                case 3:
                    parentManager.updateParent();
                    break;
                case 4:
                    parentManager.queryParents();
                    break;
                case 5:
                    return;
                default:
                    System.out.println("无效选择，请重新选择！");
            }
        }
    }

    public static void main(String[] args) {
        MainMenu mainMenu = new MainMenu();
        mainMenu.displayMainMenu();
    }
}

