
/**
 * Class: Cat
 * 
 * @author Robert Zank
 * @version 1.0 Course : CSE 274 Fall 2023 Written: September 15, 2023
 *
 *
 *          This class creates a Cat object with the following stored
 *          information: age and hair length. This class holds the appropriate
 *          constructors, getter, and setter methods needed to create a Cat
 *          object.
 *
 *          Purpose: – This class can be used to create or edit a Cat object.
 */

public class Cat extends Pet {

    // attributes
    private int age;
    private boolean isLongHair;

    /**
     * Constructor to initialize with all attributes
     * 
     * @param uniqueID
     * @param type
     * @param pName
     * @param oName
     * @param age
     * @param hairLength
     */
    public Cat(int uniqueID, String type, String pName, String oName, int age,
            boolean isLongHair) {
        super(uniqueID, type, pName, oName);
        this.age = age;
        this.isLongHair = isLongHair;
    }

    /**
     * Default constructor for the Cat class.
     * 
     * This constructor creates a Cat object with default values.
     */
    public Cat() {
        // default constructor - values automatically set to 0
    }

    /**
     * Get the age of the cat.
     * 
     * @return The age of the cat.
     */
    public int getAge() {
        return age;
    }

    /**
     * Get the hair length of the cat.
     * 
     * @return The hair length of the cat.
     */
    public boolean gethairLength() {
        return isLongHair;
    }

    /**
     * Set the age of the cat.
     * 
     * @param age The age of the cat.
     */
    public void setAge(int age) {
        this.age = age;
    }

    /**
     * Set the hair length of the cat.
     * 
     * @param hair length The breed of the cat.
     */
    public void sethairLength(boolean isLongHair) {
        this.isLongHair = isLongHair;
    }

    /**
     * Returns string of pet details
     */
    @Override
    public String toString() {
        String hairLength = "";
        if (this.isLongHair == true) {
            hairLength = "long";
        } else {
            hairLength = "short";
        }
        return "Cat [uniqueID: " + uniqueID + ", Pet Name: " + pName
                + ", Owner Name: "
                + oName + ", Hair length: " + hairLength + ", Age: " + age
                + "]";
    }
}
