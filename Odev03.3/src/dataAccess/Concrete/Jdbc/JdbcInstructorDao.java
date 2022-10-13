package dataAccess.Concrete.Jdbc;

import dataAccess.Abstract.IInstructorDao;
import entities.Instructor;

public class JdbcInstructorDao implements IInstructorDao {
    @Override
    public void add(Instructor instructor) {
        System.out.println("Eğitmen Jdbc ile veritabanına eklendi");
    }
}
