public class CourseGrade {
    private final Course course;
    private final String grade;

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