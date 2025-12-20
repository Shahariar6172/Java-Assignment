import java.util.*;
class Student {
    String name;
    String dept;
    double cgpa;
    Student(String name, String dept, double cgpa) {
        this.name = name;
        this.dept = dept;
        this.cgpa = cgpa;
    }

    @Override
    public String toString() {
        return name + " (" + dept + "), CGPA: " + cgpa;
    }
}

public class StudentDetailsMap {
    public static void main(String[] args) {

        TreeMap<Integer, Student> students = new TreeMap<>();

        students.put(102, new Student("Rahim", "CSE", 3.90));
        students.put(101, new Student("Karim", "EEE", 3.60));
        students.put(103, new Student("Jamal", "ICT", 3.85));

        System.out.println("Student List (Sorted by ID):");
        for (Map.Entry<Integer, Student> entry : students.entrySet()) {
            System.out.println(entry.getKey() + " => " + entry.getValue());
        }
    }
}
