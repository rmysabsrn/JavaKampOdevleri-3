package dataAccess.Concrete.Jdbc;
import dataAccess.Abstract.ICourseDao;
import entities.Course;

public class JdbcCourseDao implements ICourseDao {

    @Override
    public void add(Course course) {
        System.out.println("Kurs Jdbc ile veritabanına eklendi");
    }

}
