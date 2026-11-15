
/*
 * Name: Donald Fer F. Planteras
 * Section: BSIT-2B
 * Date: November 15, 2026
 * Activity: Java OOP Laboratory Activity 2
 */

public class Main {

    public static void main(String[] args) {

        // Create Student Objects
        Student student1 = new Student("Ana Cruz", "STU001", "BSIT", 2);

        Student student2 = new Student("Mark Reyes", "STU002", "BSCS", 1);

        // Create CollegeStudent Object
        CollegeStudent student3 = new CollegeStudent(
            "Lea Santos", "STU003", "BSIT", 3, "Full Scholar"
        );

        // Display Student Information
        System.out.println("===== STUDENT INFORMATION =====");

        student1.displayInfo();

        System.out.println();

        student2.displayInfo();

        // Display College Student Information
        System.out.println("\n===== COLLEGE STUDENT =====");

        student3.displayInfo();

        // Update Student Information
        student1.setYearLevel(4);

        // Display Updated Information
        System.out.println("\n===== UPDATED INFORMATION =====");

        System.out.println("Name: " + student1.getName());
        System.out.println("Course: " + student1.getCourse());
        System.out.println("Year Level: " + student1.getYearLevel());

    }
}

/*
 * REFLECTION QUESTIONS
 *
 * 1. Why should the attributes of Student be private instead of public?
 *
 * Answer:
 * Attributes should be private to protect the data from direct access.
 * We use getters and setters to access and modify the attributes safely.
 *
 *
 * 2. What would happen if CollegeStudent did not call super(...)
 *    in its constructor?
 *
 * Answer:
 * The parent class constructor would not be properly called.
 * Since Student does not have a default constructor, Java would
 * produce a compilation error if super(...) is not provided.
 *
 *
 * 3. What is the benefit of overriding displayInfo() instead of
 *    writing a new method with a different name?
 *
 * Answer:
 * Overriding allows the child class to use the same method name
 * while adding its own information. It also makes the program
 * easier to organize and supports polymorphism.
 */
