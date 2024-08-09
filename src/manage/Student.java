package manage;

public class Student {
    private String name;
    private String gender;
    private String studentId;
    private String studentClass;


    public Student(String name, String gender, String studentId, String studentClass) {
        this.name = name;
        this.gender = gender;
        this.studentId = studentId;
        this.studentClass = studentClass;
    }


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

    public String getStudentId() {
        return studentId;
    }

    public void setStudentId(String studentId) {
        this.studentId = studentId;
    }

    public String getStudentClass() {
        return studentClass;
    }

    public void setStudentClass(String studentClass) {
        this.studentClass = studentClass;
    }


    @Override
    public String toString() {
        return "Student{" +
                "name='" + name + '\'' +
                ", gender='" + gender + '\'' +
                ", studentId='" + studentId + '\'' +
                ", studentClass='" + studentClass + '\'' +
                '}';
    }
}
