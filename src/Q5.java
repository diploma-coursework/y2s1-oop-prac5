public class Q5 {
    public static void main(String[] args) {
        Student student1 = new Student("A12345", "Ali", "FASC");
        Student student2 = new Student("B88888", "Abu", "FAFB");

        System.out.printf("Student ID for %s is %svalid.\n", student1.getName(), Student.validateStudentID(student1) ? "" : "in");
        System.out.printf("Student ID for %s is %svalid.\n", student2.getName(), Student.validateStudentID(student2) ? "" : "in");
    }
}

class Student {
    private String studentID;
    private String name;
    private String school;

    public Student(String studentID, String name, String school) {
        this.studentID = studentID;
        this.name = name;
        this.school = school;
    }

    public void setStudentID(String studentID) { this.studentID = studentID; }
    public void setName(String name) { this.name = name; }
    public void setSchool(String school) { this.school = school; }

    public String getStudentID() { return this.studentID; }
    public String getName() { return this.name; }
    public String getSchool() { return this.school; }

    public static boolean validateStudentID(Student student) {
        if (student.getStudentID().length() != 6 || !Character.isLetter(student.getStudentID().charAt(0))) return false;

        switch (student.getStudentID().charAt(0)) {
            case 'A':
                if (!student.getSchool().equals("FASC")) return false;
                break;
            case 'B':
                if (!student.getSchool().equals("FAFB")) return false;
                break;
            default:
                return false;
        }

        for (int i = 1; i < 6; i++) {
            if (!Character.isDigit(student.getStudentID().charAt(i))) return false;
        }

        return true;
    }
}
