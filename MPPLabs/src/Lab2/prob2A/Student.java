package Lab2.prob2A;

public class Student {
    private String name;
    private GradeReport grade;

    Student(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }

    public GradeReport getGrade() {
        return grade;
    }

    public void setGrade(GradeReport grade) {
        this.grade = grade;
    }
}
