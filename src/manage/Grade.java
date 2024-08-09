package manage;

public class Grade {
    private String studentId;
    private int chinese;
    private int math;
    private int english;
    private int politics;


    public Grade(String studentId, int chinese, int math, int english, int politics) {
        this.studentId = studentId;
        this.chinese = chinese;
        this.math = math;
        this.english = english;
        this.politics = politics;
    }


    public String getStudentId() {
        return studentId;
    }

    public void setStudentId(String studentId) {
        this.studentId = studentId;
    }

    public int getChinese() {
        return chinese;
    }

    public void setChinese(int chinese) {
        this.chinese = chinese;
    }

    public int getMath() {
        return math;
    }

    public void setMath(int math) {
        this.math = math;
    }

    public int getEnglish() {
        return english;
    }

    public void setEnglish(int english) {
        this.english = english;
    }

    public int getPolitics() {
        return politics;
    }

    public void setPolitics(int politics) {
        this.politics = politics;
    }


    @Override
    public String toString() {
        return "Grade{" +
                "studentId='" + studentId + '\'' +
                ", chinese=" + chinese +
                ", math=" + math +
                ", english=" + english +
                ", politics=" + politics +
                '}';
    }
}
