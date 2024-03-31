import java.util.ArrayList;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        System.out.println("School Management");
        Teacher arun = new Teacher(1,"arun",2000000);
        Teacher jeevi = new Teacher(2,"jeevi",2000000);
        List<Teacher> TeacherList = new ArrayList<>();
        TeacherList.add(arun);
        TeacherList.add(jeevi);

        Student s1 = new Student(1,"S1",12);
        Student s2 = new Student(2,"s2",12);
        List<Student> StudentList = new ArrayList<>();
        StudentList.add(s1);
        StudentList.add(s2);

        School AJS = new School(TeacherList,StudentList);
        s1.PayFees(10500);
        s2.PayFees(40000);
        arun.recievedSalary(50000);
        System.out.println("Total Money Earned " + AJS.getTotalMoneyEarned());
    }
}