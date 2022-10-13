package entities;

public class Course {
    int id;
    String instructor;
    String courseName;
    String courseExp;
    double price;

    public Course(){

    }

    public Course(int id ,String courseExp, String courseName, String instructor, double price) {
        this.courseExp = courseExp;
        this.courseName = courseName;
        this.id = id;
        this.price = price;
        this.instructor = instructor;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getInstructor() {
        return instructor;
    }

    public void setInstructor(String instructor) {
        this.instructor = instructor;
    }

    public String getCourseName() {
        return courseName;
    }

    public void setCourseName(String courseName) {
        this.courseName = courseName;
    }

    public String getCourseExp() {
        return courseExp;
    }

    public void setCourseExp(String courseExp) {
        this.courseExp = courseExp;
    }

    public double getPrice() {
        return price;
    }

    public void setPrice(double price) {
        this.price = price;
    }
}
