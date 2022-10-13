package dataAccess.Concrete.Jdbc;

import dataAccess.Abstract.ICategoryDao;
import entities.Category;

public class JdbcCategoryDao implements ICategoryDao {
    @Override
    public void add(Category category) {
        System.out.println("Kategori Jdbc ile veritabanına eklendi");
    }
}
