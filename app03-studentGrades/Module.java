
/**
 * Class for creation and storage of modual data for within a course
 *
 * Will Deely
 * 26/10/2020
 */
public class Module
{
    // instance variables - replace the example below with your own
    private String moduleName;

    private String moduleCode;

    private int modualMark;

    /**
     * Constructor for objects of class Module
     */
    public Module(String name, String code)
    {
        moduleName = name;
        moduleCode = code;
        modualMark = 0;
    }

    /**
     * Method to change a students mark. checks mark is a valid pacentage (0-100)
     * detects if the mark is a pass/fail mark
     */
    public void changeMark(int newMark)
    {
        if (newMark < 101 && newMark > 0)
        {
            modualMark = newMark;
            System.out.println("New mark for " + moduleName + " is: " + modualMark + "%");
        }
        else
        {
            System.out.println("please enter a valid Mark");
        }
    }

    /**
     * Get method for modual mark
     */
    public int getMark()
    {
        return modualMark;
    }

    /**
     * get method for moduale name
     */
    public String getName()
    {
        return moduleName;
    }

    /**
     * method it print all the relivent details of a modual (name, ID and current mark)
     * displays if the modual is a pass or fail
     */
    public void print()
    {
        System.out.println("module Details:");
        System.out.println("Name = " + moduleName);
        System.out.println("ID code = " + moduleCode);
        System.out.println("Current Mark = " + modualMark + "%");
        System.out.println ("========================================");
    }
}
