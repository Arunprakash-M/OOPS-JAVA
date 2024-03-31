import java.util.List;

public class School {
    private List<Teacher> teachers;
    private List<Student> students;
    private static int TotalMoneyEarned;
    private static int TotalMoneySpent;
    public School(List<Teacher> teachers, List<Student> students) {
        this.teachers = teachers;
        this.students = students;
        TotalMoneyEarned=0;
        TotalMoneySpent=0;
    }
    public List<Teacher> getTeachers() {
        return teachers;
    }
    public void addTeachers(Teacher teacher) {
        teachers.add(teacher);
    }

    public List<Student> getStudents() {
        return students;
    }
    public void addStudents(Student student) {
        students.add(student);
    }

    public int getTotalMoneyEarned() {
        return TotalMoneyEarned;
    }
    public static void updateTotalMoneyEarned(int MoneyEarned) {
        TotalMoneyEarned += MoneyEarned;
    }
    public int getTotalMoneySpent() {
        return TotalMoneySpent;
    }
    public static void updateTotalMoneySpent(int MoneySpent) {
        TotalMoneyEarned -= MoneySpent;
    }
}
