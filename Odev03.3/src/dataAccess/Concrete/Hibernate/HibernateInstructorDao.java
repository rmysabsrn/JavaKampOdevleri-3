package dataAccess.Concrete.Hibernate;

import dataAccess.Abstract.ICategoryDao;
import dataAccess.Abstract.IInstructorDao;
import entities.Category;
import entities.Instructor;

public class HibernateInstructorDao implements IInstructorDao {
    @Override
    public void add(Instructor instructor) {
        System.out.println("Eğitmen Hibernate ile veritabanına eklendi");
    }


}
