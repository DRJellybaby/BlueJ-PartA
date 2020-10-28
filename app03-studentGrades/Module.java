
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

    private boolean complete; 

    /**
     * Constructor for objects of class Module
     */
    public Module(String name, String code)
    {
        moduleName = name;
        moduleCode = code;
        modualMark = 0;
        complete = false;
    }

    /**
     * Method to change a students mark. checks mark is a valid pacentage (0-100)
     * detects if the mark is a pass/fail mark and if modual is complete
     */
    public void changeMark(int newMark)
    {
        if (newMark < 101 && newMark > 0)
        {
            modualMark = newMark;
            System.out.println("New mark for " + moduleName + " is: " + modualMark + "%");
            if (newMark >= 40)
            {
                complete = true;
            }
            else
            {
                complete = false;
            }
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
     * Get method for modual mark
     */
    public boolean getComplete()
    {
        return complete;
    }

    /**
     * get method for modual name
     */
    public String getName()
    {
        return moduleName;
    }

    /**
     * Method to check and list complete/incomplete modual 
     */
    public void printIfIncomplete()
    {
        if (complete == true)
        {
            System.out.println("Modual: " + moduleName + " is complete. Mark: " + modualMark + "%");
        }
        else if (complete == false)
        {
            System.out.println("Modual: " + moduleName + " is incomplete. Mark:" + modualMark + "%");
        }
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
