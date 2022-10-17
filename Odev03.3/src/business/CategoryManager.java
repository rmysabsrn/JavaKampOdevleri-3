package business;

import core.logging.Logger;
import dataAccess.Abstract.ICategoryDao;
import dataAccess.Concrete.Jdbc.JdbcCategoryDao;
import entities.Category;

public class CategoryManager {
    private ICategoryDao categoryDao;
    private Category[] categories;
    private Logger[] logger;



    public CategoryManager(Category[] categories, Logger[] logger, ICategoryDao categoryDao) {
        this.categories = categories;
        this.categoryDao = categoryDao;
        this.logger = logger;
    }

    public CategoryManager(ICategoryDao jdbcCategoryDao, Logger[] loggers) {
    }

    public void add(Category category)throws Exception{
       for(Category ctgry : categories) {
           if(ctgry.getCategoryName() == category.getCategoryName() && ctgry !=category){
               System.out.println("Kategori adı tekrar edemez.");
           }else {
               categoryDao.add(category);
           }
           System.out.println("Kategori eklendi");
       }
        categoryDao.add(category);
        for (Logger logger : logger) {
            logger.log(category.getCategoryName());
        }

        }


            }



