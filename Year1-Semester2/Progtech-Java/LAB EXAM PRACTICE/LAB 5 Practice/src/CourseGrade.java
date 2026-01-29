public class CourseGrade {
    private Course course;
    private String grade;

    public CourseGrade(Course course, String grade) {
        this.course = course;
        this.grade = grade;
    }

    public Course getCourse() {
        return course;
    }

    public String getGrade() {
        return grade;
    }
}
