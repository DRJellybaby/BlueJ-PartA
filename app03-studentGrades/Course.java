
/**
 * Class for creation and storage of course data
 *
 * @author Will Deeley
 * @version 26/10/2020
 * 
 * added support for spacific moduals within the class
 */
public class Course
{
    // Attributes for course Details (name and ID respectivly)
    private String title;
    private String cID;

    private int noModule;

    private Module module;

    private Module module1;
    private Module module2;
    private Module module3;
    private Module module4;

    // Variables to store Marks for individual moduals
    private int module1Mark;
    private int module2Mark;
    private int module3Mark;
    private int module4Mark;
    
    private int finalMark;
    private String finalGrade;

    /**
     * Constructor for the identifying details of a course (ID number and Name)
     */
    public Course(String title, String courseID)
    {
        this.title = title;
        cID = courseID;
        noModule = 0;
    }

    /**
     * Method to add a up to 4 moduals to a course
     */
    public void addmodule(String moduleName, String moduleCode)
    {
        noModule ++;
        if (noModule == 1)
        {
            module1 = new Module(moduleName, moduleCode);
        }
        else if (noModule == 2)
        {
            module2 = new Module(moduleName, moduleCode);
        }
        else if (noModule == 3)
        {
            module3 = new Module(moduleName, moduleCode);
        }
        else if (noModule == 4)
        {
            module4 = new Module(moduleName, moduleCode);
        }
        else if (noModule == 5)
        {
            System.out.println ("This Course is at maximum modules");
        }
        setGrade();
    }

    /**
     * Method to change the mark of spacific moduals and update the over all grade to reflect
     */
    public void changeMark(String moduleName, int mark)
    {
        if (moduleName == module1.getName())
        {
            module1.changeMark(mark);
            module1Mark = mark;
        }
        else if (moduleName == module2.getName())
        {
            module2.changeMark(mark);
            module2Mark = mark;
        }
        else if (moduleName == module3.getName())
        {
            module3.changeMark(mark);
            module3Mark = mark;
        }
        else if (moduleName == module4.getName())
        {
            module4.changeMark(mark);
            module4Mark = mark;
        }
        setGrade();
    }

    /**
     * Method to find the average mark of the current modules and assign a appropriate grade
     */
    public void setGrade()
    {
        finalMark = ((module1Mark + module2Mark + module3Mark + module4Mark) / 4);
        if (finalMark <= 40)
        {
            finalGrade = "F";
        }
        else if ((finalMark <= 49) && (finalMark >= 41))
        {
            finalGrade = "D";
        }
        else if ((finalMark <= 59) && (finalMark >= 50))
        {
            finalGrade = "C";
        }
        else if ((finalMark <= 69) && (finalMark >= 60))
        {
            finalGrade = "B";
        }
        else if ((finalMark <= 100) && (finalMark >= 70))
        {
            finalGrade = "A";
        }
    }
    
    /**
     * Method to print individual Modual Details
     */
    public void printModualDetails(String moduleName)
    {
        if (moduleName == module1.getName())
        {
            System.out.println ("========================================");
            module1.print();
        }
        else if (moduleName == module2.getName())
        {
            System.out.println ("========================================");
            module2.print();
        }
        else if (moduleName == module3.getName())
        {
            System.out.println ("========================================");
            module3.print();
        }
        else if (moduleName == module4.getName())
        {
            System.out.println ("========================================");
            module4.print();
        }
    }
    
    /**
     * print the details of a course and its moduales
     */
    public void print()
    {
        if (noModule <= 3)
        {
            System.out.println("A Course needs 4 moduals");
            System.out.println("Current number of modules: " + noModule);
        }
        else
        { 
            System.out.println ("Course: " + title + ", Course ID: " + cID);
            System.out.println ("========================================");
            module1.print();
            module2.print();
            module3.print();
            module4.print();
            System.out.println ("========================================");
            System.out.println ("Your grade is: " + finalGrade);
        }
    }
}