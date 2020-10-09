
/**
 * CLass for creation and storage of course data
 *
 * @author Will Deeley
 * @version 07/10/2020
 */
public class Course
{
    // Attributes for course Details (name and ID respectivly)
    private String title;
    private String cID;

    /**
     * Constructor for the identifying details of a course (ID number and Name)
     */
    public Course(String title, String courseID)
    {
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
