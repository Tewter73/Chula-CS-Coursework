public class Student {
    private final String studentID;

    public Student(String studentID) {
        this.studentID = studentID;
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
        return getYear() == otherStudent.getYear();
    }

    public boolean sameLevel(Student otherStudent) {
        return getLevelCode() == otherStudent.getLevelCode();
    }

    public boolean sameFaculty(Student otherStudent) {
        return getFacultyCode() == otherStudent.getFacultyCode();
    }
}