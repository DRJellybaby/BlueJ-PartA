
/**
 * CLass for creation and storage of course data
 *
 * @author Will Deeley
 * @version 24/10/2020
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

    private Module module1Mark;
    private Module module2Mark;
    private Module module3Mark;
    private Module module4Mark;

    /**
     * Constructor for the identifying details of a course (ID number and Name)
     */
    public Course(String title, String courseID)
    {
        this.title = title;
        cID = courseID;
        noModule = 0;
    }

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
    }

    public void addMark (int mark)
    {
        module1.changeMark(mark);
        module2.changeMark(mark);
        module3.changeMark(mark);
        module4.changeMark(mark);
    }

    public void changeMark(String moduleName, int mark)
    {
        if (moduleName == module1.getName())
        {
            module1.changeMark(mark);
        }
        else if (moduleName == module2.getName())
        {
            module2.changeMark(mark);
        }
        else if (moduleName == module3.getName())
        {
            module3.changeMark(mark);
        }
        else if (moduleName == module4.getName())
        {
            module4.changeMark(mark);
        }
    }

    /**
     * print the details of a course
     */
    public void print()
    {
        if (noModule <= 3)
        {
            System.out.println("please add additional modules");
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
        }
    }

    /**
     * Calculation for grade
     */
    public int getMark()
    {
        return module1.getMark();
    }
}