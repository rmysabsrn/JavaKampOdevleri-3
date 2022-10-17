import business.CategoryManager;
import business.CourseManager;
import business.InstructorManager;
import core.logging.DatabaseLogger;
import core.logging.EmailLogger;
import core.logging.FileLogger;
import core.logging.Logger;
import dataAccess.Abstract.ICategoryDao;
import dataAccess.Abstract.ICourseDao;
import dataAccess.Abstract.IInstructorDao;
import dataAccess.Concrete.Hibernate.HibernateCourseDao;
import dataAccess.Concrete.Jdbc.JdbcCategoryDao;
import dataAccess.Concrete.Jdbc.JdbcCourseDao;
import dataAccess.Concrete.Jdbc.JdbcInstructorDao;
import entities.Category;
import entities.Course;
import entities.Instructor;

import java.util.Locale;

public class Main {
    public static void main(String[] args) throws Exception {
        Logger [] loggers = {new DatabaseLogger(),new EmailLogger(), new FileLogger()};


        Category category = new Category(1,"Back-end");
        CategoryManager categoryManager = new CategoryManager(new JdbcCategoryDao(),loggers);

        Course course = new Course(1,"Yazılım Geliştirici Yetiştirme Kampı","Java Kampı","Engin Demiroğ",20);
        CourseManager courseManager = new CourseManager(new JdbcCourseDao(), loggers);
        courseManager.add(course);

        Instructor instructor = new Instructor(1, "Engin","Demiroğ");
        InstructorManager instructorManager = new InstructorManager(new JdbcInstructorDao(),loggers);
        instructorManager.add(instructor);


        System.out.println(course.getCourseName()+"/"+course.getCourseExp());


    }
}