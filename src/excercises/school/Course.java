package excercises.school;

import java.util.HashMap;

//fields
public class Course {
    private String courseName;
    private String courseDescription;
    private int credits;
    private HashMap<String, Integer> courseRoster = new HashMap<>();


    // Getters
    public String getCourseName() {
        return courseName;
    }

    public String getCourseDescription() {
        return courseDescription;
    }

    public int getCredits() {
        return credits;
    }

    public HashMap<String, Integer> getCourseRoster() {
        return courseRoster;
    }

    // Setters
    private void setCourseName(String aCourseName) {
        courseName = aCourseName;
    }

    private void setCourseDescription(String aCourseDescription) {
        courseDescription = aCourseDescription;
    }

    private void setCredits(int aCredits) {
        credits = aCredits;
    }

    private void setCourseRoster(HashMap<Student.name, Student.studentId > aCourseRoster) {
        courseRoster = aCourseRoster;
    }
}
