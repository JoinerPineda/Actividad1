public class GradeBook {

    private String courseName;

    /**
     * @return the courseName
     */
    public String getCourseName() {
        return courseName;
    }

    /**
     * @param courseName the courseName to set
     */
    public void setCourseName(String courseName) {
        this.courseName = courseName;
    }

    public GradeBook(String courseName) {
        this.setCourseName(courseName);
    }

    public void displayMessage() {
        System.out.println("course name is: " + this.getCourseName());
    }
}