package dataAccess.Concrete.Hibernate;

import dataAccess.Abstract.ICategoryDao;
import entities.Category;

public class HibernateCategoryDao implements ICategoryDao {
    @Override
    public void add(Category category) {
        System.out.println("Kategori Hibernate ile veritabanına eklendi");
    }
}
