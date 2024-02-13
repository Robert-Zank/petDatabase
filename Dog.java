
/**
 * Class: Dog
 * 
 * @author Robert Zank
 * @version 1.0 Course : CSE 274 Fall 2023 Written: September 15, 2023
 *
 *
 *          This class creates a Dog object with the following stored
 *          information: age and breed. This class holds the appropriate
 *          constructors, getter, and setter methods needed to create a Dog
 *          object.
 *
 *          Purpose: – This class can be used to create or edit a Dog object.
 */

public class Dog extends Pet {

    // attributes
    private int age;
    private String breed;

    /**
     * Constructor to initialize with all attributes
     * 
     * @param uniqueID
     * @param type
     * @param pName
     * @param oName
     * @param age
     * @param breed
     */
    public Dog(int uniqueID, String type, String pName, String oName, int age,
            String breed) {
        super(uniqueID, type, pName, oName);
        this.age = age;
        this.breed = breed;
    }

    /**
     * Default constructor for the Dog class.
     * 
     * This constructor creates a Dog object with default values.
     */
    public Dog() {
        // default constructor - values automatically set to 0
    }

    /**
     * Get the age of the dog.
     * 
     * @return The age of the dog.
     */
    public int getAge() {
        return age;
    }

    /**
     * Get the breed of the dog.
     * 
     * @return The breed of the dog.
     */
    public String getBreed() {
        return breed;
    }

    /**
     * Set the age of the dog.
     * 
     * @param age The age of the dog.
     */
    public void setAge(int age) {
        this.age = age;
    }

    /**
     * Set the breed of the dog.
     * 
     * @param breed The breed of the dog.
     */
    public void setBreed(String breed) {
        this.breed = breed;
    }

    /**
     * Returns string of pet details
     */
    @Override
    public String toString() {
        return "Dog [uniqueID: " + uniqueID + ", Pet Name: " + pName
                + ", Owner Name: "
                + oName + ", Breed: " + breed + ", Age: " + age + "]";
    }
}
