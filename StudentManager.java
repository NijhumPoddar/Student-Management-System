import java.util.ArrayList;
import java.util.List;

public class StudentManager {
    private List<Student> students = new ArrayList<>();

    public void addStudent(Student s) {
        students.add(s);
        System.out.println("Student added successfully!");
    }

    public void removeStudent(int id) {
        students.removeIf(s -> s.getId() == id);
        System.out.println("Student removed if existed.");
    }

    public void viewAllStudents() {
        if (students.isEmpty()) {
            System.out.println("No students available.");
            return;
        }
        for (Student s : students) {
            s.displayInfo();
        }
    }

    public Student findStudentById(int id) {
        for (Student s : students) {
            if (s.getId() == id) {
                return s;
            }
        }
        return null;
    }

    public void updateGrade(int id, double newGrade) {
        Student s = findStudentById(id);
        if (s != null) {
            s.setGrade(newGrade);
            System.out.println("Grade updated.");
        } else {
            System.out.println("Student not found.");
        }
    }
}
