public class Course {
    private final String name;
    private final String courseID;
    private final int credit;

    public Course(String courseID, String name, int credit) {
        this.courseID = courseID;
        this.name = name;
        this.credit = credit;
    }

    public String getName() {
        return name;
    }

    public String getCourseID() {
        return courseID;
    }

    public int getCredit() {
        return credit;
    }
}