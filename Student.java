public class Student {

    private int id;
    private String name;
    private String course;
    private double grade;

    public Student(int id, String name, String course, double grade) {
        this.id = id;
        this.name = name;
        this.course = course;
        this.grade = grade;
    }

    // Getters and Setters
    public int getId() {
        return id;
    }

    public String getName() {
        return name;
    }

    public String getCourse() {
        return course;
    }

    public double getGrade() {
        return grade;
    }

    public void setCourse(String course) {
        this.course = course;
    }

    public void setGrade(double grade) {
        this.grade = grade;
    }

    public void displayInfo() {
        System.out.println("ID: " + id + ", Name: " + name + ", Course: " + course + ", Grade: " + grade);
    }
}
