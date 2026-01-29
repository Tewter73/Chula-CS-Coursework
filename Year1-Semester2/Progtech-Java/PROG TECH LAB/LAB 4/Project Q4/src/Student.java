public class Student {
    private final String studentID;
    private final String name;
    private final String lastName;
    private final String major;

    public Student(String studentID, String name, String lastName, String major) {
        this.studentID = studentID;
        this.name = name;
        this.lastName = lastName;
        this.major = major;
    }

    private int getDigit(int start, int end) {
        String digitString = this.studentID.substring(start, end + 1);
        return Integer.parseInt(digitString);
    }

    public int getYear() {
        return getDigit(0, 1);
    }

    public int getLevelCode() {
        return getDigit(2, 2);
    }

    public int getFacultyCode() {
        return getDigit(8, 9);
    }

    public boolean sameYear(Student otherStudent) {
        return this.getYear() == otherStudent.getYear();
    }

    public boolean sameLevel(Student otherStudent) {
        return this.getLevelCode() == otherStudent.getLevelCode();
    }

    public boolean sameFaculty(Student otherStudent) {
        return this.getFacultyCode() == otherStudent.getFacultyCode();
    }

    public String getStudentID() {
        return studentID;
    }

    public String getName() {
        return name;
    }

    public String getLastName() {
        return lastName;
    }

    public String getMajor() {
        return major;
    }
}