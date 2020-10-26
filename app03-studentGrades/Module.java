
/**
 * Write a description of class Module here.
 *
 * @author (your name)
 * @version (a version number or a date)
 */
public class Module
{
    // instance variables - replace the example below with your own
    private String moduleName;

    private String moduleCode;

    private int modualMark;

    private boolean completed;

    /**
     * Constructor for objects of class Module
     */
    public Module(String name, String code)
    {
        moduleName = name;
        moduleCode = code;
        modualMark = 0;
        completed = false;
    }

    /**
     * Method to change a students mark. checks mark is a valid pacentage (0-100)
     */
    public void changeMark(int newMark)
    {
        if (newMark < 101 && newMark > 0)
        {
            modualMark = newMark;
            System.out.println("New mark for " + moduleName + " is: " + modualMark + "%");
            if (newMark >=40)
            {
                completed = true;
            }
        }
        else
        {
            System.out.println("please enter a valid Mark");
        }
    }

    public int getMark()
    {
        return modualMark;
    }

    public String getName()
    {
        return moduleName;
    }

    /**
     * method it print all the relivent details of a modual (name, ID and current mark)
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
