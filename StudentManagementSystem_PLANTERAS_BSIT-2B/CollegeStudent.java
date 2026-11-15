
/*
 * Name: Donald Fer F. Planteras
 * Section: BSIT-2B
 * Date: November 15, 2026
 * Activity: Java OOP Laboratory Activity 2
 */

public class CollegeStudent extends Student {

    // Private Attribute
    private String scholarshipStatus;

    // Constructor
    public CollegeStudent(String name, String studentId, String course,
                          int yearLevel, String scholarshipStatus) {

        super(name, studentId, course, yearLevel);

        this.scholarshipStatus = scholarshipStatus;
    }

    // Getter for scholarshipStatus
    public String getScholarshipStatus() {
        return scholarshipStatus;
    }

    // Setter for scholarshipStatus
    public void setScholarshipStatus(String scholarshipStatus) {
        this.scholarshipStatus = scholarshipStatus;
    }

    // Overriding displayInfo()
    @Override
    public void displayInfo() {

        super.displayInfo();

        System.out.println("Scholarship: " + scholarshipStatus);
    }
}
