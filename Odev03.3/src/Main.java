import business.CourseManager;
import core.logging.Logger;
import dataAccess.Abstract.ICourseDao;
import dataAccess.Concrete.Hibernate.HibernateCourseDao;
import dataAccess.Concrete.Jdbc.JdbcCourseDao;
import entities.Course;

public class Main {
    public static void main(String[] args) throws Exception {
        Course course = new Course(1,"Yazılım Geliştirici Yetiştirme Kampı","Java Kampı","Engin Demiroğ",20);
        Logger [] loggers = {};

        CourseManager courseManager = new CourseManager(new HibernateCourseDao(), loggers);
        courseManager.add(course);

        System.out.println(course.getCourseName()+"/"+course.getCourseExp());
    }
}