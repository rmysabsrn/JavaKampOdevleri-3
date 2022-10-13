package dataAccess.Concrete.Hibernate;

import dataAccess.Abstract.ICourseDao;
import entities.Category;
import entities.Course;

public class HibernateCourseDao implements ICourseDao {
    @Override
    public void add(Course course) {
        System.out.println("Kurs Hibernate ile veritabanına eklendi");
    }

}
