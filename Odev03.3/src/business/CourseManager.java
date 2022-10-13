package business;

import core.logging.Logger;
import dataAccess.Abstract.ICourseDao;
import entities.Course;

public class CourseManager {
   private ICourseDao courseDao;
   private Logger [] loggers;

    public CourseManager(ICourseDao courseDao, Logger[] loggers) {
        this.courseDao = courseDao;
        this.loggers = loggers;
    }

    public void add(Course course) throws Exception{
        if(course.getPrice()<0){
            throw new Exception ("Ürün fiyatı 0'dan küçük olamaz.");
        }


        courseDao.add(new Course());

        for(Logger logger : loggers ){
            logger.log(course.getCourseName());
        }
    }


}
