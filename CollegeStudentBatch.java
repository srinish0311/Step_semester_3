
class CollegeStudent {
    private static final String COLLEGE_NAME;
    private static final String ACADEMIC_YEAR;
    private final String studentName;

    static {
        COLLEGE_NAME = "SRM Institute of Science and Technology";
        ACADEMIC_YEAR = "2025-2026";
        System.out.println("College info loaded: " + COLLEGE_NAME + " (" + ACADEMIC_YEAR + ")");
    }

    public CollegeStudent(String studentName) {
        this.studentName = studentName;
    }

    public void printConfirmation() {
        System.out.println("Student record created: " + studentName);
    }
}

public class CollegeStudentBatch {
    public static void main(String[] args) {
        String[] names = {"Ravi", "Meera", "Karthik", "Divya", "Anitha"};

        for (String name : names) {
            CollegeStudent student = new CollegeStudent(name);
            student.printConfirmation();
        }
    }
}
