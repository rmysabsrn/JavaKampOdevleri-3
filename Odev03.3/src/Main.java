import entities.Course;

public class Main {
    public static void main(String[] args) {
        Course course1 = new Course();
        course1.setId(1);
        course1.setCourseName("Java Programlama Kursu");
        course1.setInstructor("Engin Demiroğ");
        course1.setCourseExp("Yazılım Geliştirici Yetiştirme Kampı");

        System.out.println(course1.getCourseName());
    }
}