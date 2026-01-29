public class Course {
    private String courseID;
    private String name;
    private int credit;

    public Course(String courseID, String name, int credit) {
        this.courseID = courseID;
        this.name = name;
        this.credit = credit;
    }

    public String getCourseID() {
        return courseID;
    }

    public String getName() {
        return name;
    }

    public int getCredit() {
        return credit;
    }
}
