
/*
 * Name: Donald Fer F. Planteras
 * Section: BSIT-2B
 * Date: November 15, 2026
 * Activity: Java OOP Laboratory Activity 2
 */

public class Student {

    // Private Attributes
    private String name;
    private String studentId;
    private String course;
    private int yearLevel;

    // Constructor
    public Student(String name, String studentId, String course, int yearLevel) {
        this.name = name;
        this.studentId = studentId;
        this.course = course;
        setYearLevel(yearLevel);
    }

    // Getter for name
    public String getName() {
        return name;
    }

    // Setter for name
    public void setName(String name) {
        this.name = name;
    }

    // Getter for studentId
    public String getStudentId() {
        return studentId;
    }

    // Setter for studentId
    public void setStudentId(String studentId) {
        this.studentId = studentId;
    }

    // Getter for course
    public String getCourse() {
        return course;
    }

    // Setter for course
    public void setCourse(String course) {
        this.course = course;
    }

    // Getter for yearLevel
    public int getYearLevel() {
        return yearLevel;
    }

    // Setter for yearLevel with validation
    public void setYearLevel(int yearLevel) {
        if (yearLevel >= 1 && yearLevel <= 4) {
            this.yearLevel = yearLevel;
        } else {
            System.out.println("Invalid year level! Must be between 1 and 4.");
        }
    }

    // Display Student Information
    public void displayInfo() {
        System.out.println("Name: " + name);
        System.out.println("ID: " + studentId);
        System.out.println("Course: " + course);
        System.out.println("Year Level: " + yearLevel);
    }
}
