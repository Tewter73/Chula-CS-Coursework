import java.util.ArrayList;
import java.util.concurrent.Callable;

public class Student {
    private String studentID;
    private String name;
    private ArrayList<CourseGrade> transcript = new ArrayList<>();

    public Student(String studentID, String name) {
        this.name = name;
        this.studentID = studentID;
    }

    public String getName() {
        return name;
    }

    public String getStudentID() {
        return studentID;
    }

    public ArrayList<CourseGrade> getTranscript() {
        return transcript;
    }

    public void addGradeReport(Course c, String g) {
        CourseGrade a = new CourseGrade(c,g);
        transcript.add(a);
    }

    public double calGPA(){
        double totalGrade = 0.00;
        int totalCredits = 0;
        for (CourseGrade courseGrade : transcript) {
            String grade = courseGrade.getGrade();
            int credit = courseGrade.getCourse().getCredit();
            totalCredits += credit;
            switch (grade) {
                case "A":
                    totalGrade += 4.0 * credit;
                    break;
                case "B+":
                    totalGrade += 3.5 * credit;
                    break;
                case "B":
                    totalGrade += 3.0 * credit;
                    break;
                case "C+":
                    totalGrade += 2.5 * credit;
                    break;
                case "C":
                    totalGrade += 2.0 * credit;
                    break;
                case "D+":
                    totalGrade += 1.5 * credit;
                    break;
                case "D":
                    totalGrade += 1.0 * credit;
                    break;
            }
        }
        return totalGrade / totalCredits;
    }

    public String getGradeReport(String courseID) {
        for (CourseGrade a : transcript) {
            if (courseID.equals(a.getCourse().getCourseID())) {
                return a.getGrade();
            }
        }
        return null;
    }
}