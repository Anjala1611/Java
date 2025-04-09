import java.util.HashMap;
import java.util.Map;

public class StudentInformationSystem {
    // HashMap to store student information, where key is student ID (Integer) and value is student name (String)
    private Map<Integer, String> studentMap;

    // Constructor to initialize the student map
    public StudentInformationSystem() {
        studentMap = new HashMap<>();
    }

    // Method to add a student to the system
    public void addStudent(int studentId, String studentName) {
        studentMap.put(studentId, studentName);
    }

    // Method to retrieve a student's name by their ID
    public String getStudentName(int studentId) {
        return studentMap.getOrDefault(studentId, "Student not found");
    }

    // Method to check if a student exists by ID
    public boolean studentExists(int studentId) {
        return studentMap.containsKey(studentId);
    }

    // Method to remove a student from the system
    public void removeStudent(int studentId) {
        studentMap.remove(studentId);
    }

    public static void main(String[] args) {
        // Create an instance of the StudentInformationSystem
        StudentInformationSystem sis = new StudentInformationSystem();

        // Add students
        sis.addStudent(101, "Alice");
        sis.addStudent(102, "Bob");
        sis.addStudent(103, "Charlie");

        // Retrieve students by ID
        System.out.println("Student 101: " + sis.getStudentName(101)); // Output: Alice
        System.out.println("Student 104: " + sis.getStudentName(104)); // Output: Student not found

        // Check if a student exists
        System.out.println("Does student 102 exist? " + sis.studentExists(102)); // Output: true
        System.out.println("Does student 105 exist? " + sis.studentExists(105)); // Output: false

        // Remove a student
        sis.removeStudent(102);
        System.out.println("Does student 102 exist after removal? " + sis.studentExists(102)); // Output: false
    }
}
