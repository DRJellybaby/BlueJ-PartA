import java.util.*;

/**
 * Write a description of class Course here.
 *
 * @author Will Deeley
 * @version 06/10/2020
 */
public class Course
{
    // the written name of the course
    public String course;   
    public String cID;
    
    /**
     * Create a new Course with a given name and ID number.
     */
    public Course(String courseName, String courseID)
    {
        course = courseName;
        cID = courseID;
    }

}
