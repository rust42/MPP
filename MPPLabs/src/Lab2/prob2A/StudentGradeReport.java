package Lab2.prob2A;

public class StudentGradeReport {
    public static Student createStudent(String name) {
        Student student = new Student(name);
        GradeReport gradeReport = new GradeReport();
        student.setGrade(gradeReport);
        gradeReport.setStudent(student);
        return student;
    }
}
