package manage;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class GradeManager {
    private List<Grade> grades = new ArrayList<>();
    private Scanner scanner = new Scanner(System.in);

    // 增加成绩信息
    public void addGrade() {
        System.out.print("请输入学生学号: ");
        String studentId = scanner.nextLine();
        System.out.print("请输入语文成绩: ");
        int chinese = Integer.parseInt(scanner.nextLine());
        System.out.print("请输入数学成绩: ");
        int math = Integer.parseInt(scanner.nextLine());
        System.out.print("请输入英语成绩: ");
        int english = Integer.parseInt(scanner.nextLine());
        System.out.print("请输入政治成绩: ");
        int politics = Integer.parseInt(scanner.nextLine());

        Grade grade = new Grade(studentId, chinese, math, english, politics);
        grades.add(grade);
        System.out.println("成绩信息添加成功！");
    }

    // 删除成绩信息
    public void removeGrade() {
        System.out.print("请输入要删除的学生学号: ");
        String studentId = scanner.nextLine();

        Grade gradeToRemove = null;
        for (Grade grade : grades) {
            if (grade.getStudentId().equals(studentId)) {
                gradeToRemove = grade;
                break;
            }
        }

        if (gradeToRemove != null) {
            grades.remove(gradeToRemove);
            System.out.println("成绩信息删除成功！");
        } else {
            System.out.println("未找到该学号对应的成绩！");
        }
    }

    // 修改成绩信息
    public void updateGrade() {
        System.out.print("请输入要修改成绩的学生学号: ");
        String studentId = scanner.nextLine();

        for (Grade grade : grades) {
            if (grade.getStudentId().equals(studentId)) {
                System.out.print("请输入新的语文成绩: ");
                grade.setChinese(Integer.parseInt(scanner.nextLine()));
                System.out.print("请输入新的数学成绩: ");
                grade.setMath(Integer.parseInt(scanner.nextLine()));
                System.out.print("请输入新的英语成绩: ");
                grade.setEnglish(Integer.parseInt(scanner.nextLine()));
                System.out.print("请输入新的政治成绩: ");
                grade.setPolitics(Integer.parseInt(scanner.nextLine()));
                System.out.println("成绩信息修改成功！");
                return;
            }
        }
        System.out.println("未找到该学号对应的成绩！");
    }

    // 查询成绩信息
    public void queryGrades() {
        System.out.println("1. 查询单个学生成绩");
        System.out.println("2. 查询班级某科成绩");
        System.out.println("3. 查询班级某科及格学生");
        System.out.println("4. 查询班级某科平均成绩");
        System.out.print("请选择查询方式: ");
        int choice = Integer.parseInt(scanner.nextLine());

        switch (choice) {
            case 1:
                querySingleStudentGrade();
                break;
            case 2:
                queryClassSubjectGrades();
                break;
            case 3:
                queryPassingStudents();
                break;
            case 4:
                queryClassSubjectAverage();
                break;
            default:
                System.out.println("无效选择！");
        }
    }

    // 查询单个学生的成绩
    private void querySingleStudentGrade() {
        System.out.print("请输入学生学号: ");
        String studentId = scanner.nextLine();
        for (Grade grade : grades) {
            if (grade.getStudentId().equals(studentId)) {
                System.out.println(grade);
                return;
            }
        }
        System.out.println("未找到该学号对应的成绩！");
    }

    // 查询班级某科成绩
    private void queryClassSubjectGrades() {
        System.out.print("请输入班级: ");
        String studentClass = scanner.nextLine();
        System.out.print("请输入科目（语文/数学/英语/政治）: ");
        String subject = scanner.nextLine();

        for (Grade grade : grades) {
            if (studentClass.equals(getStudentClassById(grade.getStudentId()))) {
                int score = getSubjectScore(grade, subject);
                System.out.println("学号: " + grade.getStudentId() + ", " + subject + "成绩: " + score);
            }
        }
    }

    // 查询班级某科及格学生
    private void queryPassingStudents() {
        System.out.print("请输入班级: ");
        String studentClass = scanner.nextLine();
        System.out.print("请输入科目（语文/数学/英语/政治）: ");
        String subject = scanner.nextLine();

        for (Grade grade : grades) {
            if (studentClass.equals(getStudentClassById(grade.getStudentId()))) {
                int score = getSubjectScore(grade, subject);
                if (score >= 60) {
                    System.out.println("学号: " + grade.getStudentId() + ", " + subject + "成绩: " + score);
                }
            }
        }
    }

    // 查询班级某科平均成绩
    private void queryClassSubjectAverage() {
        System.out.print("请输入班级: ");
        String studentClass = scanner.nextLine();
        System.out.print("请输入科目（语文/数学/英语/政治）: ");
        String subject = scanner.nextLine();

        int totalScore = 0;
        int count = 0;
        for (Grade grade : grades) {
            if (studentClass.equals(getStudentClassById(grade.getStudentId()))) {
                totalScore += getSubjectScore(grade, subject);
                count++;
            }
        }

        if (count > 0) {
            double average = totalScore / (double) count;
            System.out.println(studentClass + "班的" + subject + "平均成绩为: " + average);
        } else {
            System.out.println("未找到该班级的成绩信息！");
        }
    }

    // 获取学生班级信息 (需要连接 StudentManager 或其他方法实现)
    private String getStudentClassById(String studentId) {
        // 假设有个方法或类可以通过 studentId 获取到 studentClass
        // 例如，StudentManager.getStudentClassById(studentId);
        // 暂时使用假数据
        return "三班"; // 这是一个示例，实际实现需要根据学生ID获取其班级
    }

    // 根据科目名称获取成绩
    private int getSubjectScore(Grade grade, String subject) {
        switch (subject) {
            case "语文":
                return grade.getChinese();
            case "数学":
                return grade.getMath();
            case "英语":
                return grade.getEnglish();
            case "政治":
                return grade.getPolitics();
            default:
                System.out.println("无效的科目！");
                return 0;
        }
    }
}
