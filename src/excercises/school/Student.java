package excercises.school;

public class Student {

    // fields
    public static String name;
    public static int studentId;
    private int numberOfCredits;
    private double gpa;


    // Getters
    public String getName() {
        return name;
    }

    public int getStudentId() {
        return studentId;
    }

    public int getNumberOfCredits() {
        return numberOfCredits;
    }

    public double getGpa() {
        return gpa;
    }


    // Setters
    private void setName(String aName) {
        name = aName;
    }

    private void setStudentId(int astudentId) {
        studentId = astudentId;
    }

    private void setNumberOfCredits(int aNumberOfCredits) {
        numberOfCredits = aNumberOfCredits;
    }

    private void setGpa(double aGpa) {
        gpa = aGpa;
    }



}
