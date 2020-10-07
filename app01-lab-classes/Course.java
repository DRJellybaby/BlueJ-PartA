
/**
 * CLass for creation and storage of course data
 *
 * @author Will Deeley
 * @version 07/10/2020
 */
public class Course
{
    // variable for the name of a course
    private String title;
    // variable for the ID code for a course
    private String cID;

    /**
     * Constructor for the identifying details of a course (ID number and Name)
     */
    public Course(String title, String courseID)
    {
        // initialise instance variables
        this.title = title;
        cID = courseID;
    }
    
    /**
     * print the details of a course
     */
    public void print()
    {
        System.out.println ("Course: " + title + ", Course ID: " + cID);
    }
}
