package business;

import core.logging.Logger;
import dataAccess.Abstract.ICategoryDao;
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

    public void add(Category category)throws Exception{
       for(Category ctgry : categories) {
           if(ctgry.getCategoryName() == category.getCategoryName() && ctgry !=category){
               System.out.println("Kategori adı tekrar edemez.");
           }else {
               categoryDao.add(category);
           }
           System.out.println("Kategori eklendi");
       }

        }
            }



