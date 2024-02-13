
/**
 * Class: Pet
 * 
 * @author Robert Zank
 * @version 1.0 Course : CSE 274 Fall 2023 Written: September 15, 2023
 *
 *
 *          This class creates a Pet object with the following stored
 *          information: unique ID, type, pet name, and owner name. This
 *          class holds the appropriate constructors, getter, and setter
 *          methods needed to create a Pet object.
 *
 *          Purpose: – This class can be used to create or edit a Pet object.
 */

public abstract class Pet {
    
    // attributes
    protected int uniqueID;
    protected String type;
    protected String pName;
    protected String oName;

    /**
     * Default constructor for the Pet class.
     * 
     * This constructor creates a Pet object with default values.
     */
    public Pet() {
        // Initialize attributes with default values
        uniqueID = 0;
        type = "";
        pName = "";
        oName = "";
    }
    
    /**
     * Constructor to initialize all attributes at once
     * 
     * @param uniqueID
     * @param type
     * @param pName
     * @param oName
     */
    public Pet(int uniqueID, String type, String pName, String oName) {
        super();
        this.uniqueID = uniqueID;
        this.type = type;
        this.pName = pName;
        this.oName = oName;
    }

    /**
     * Get the unique ID of the pet.
     * 
     * @return The unique ID of the pet.
     */
    public int getID() {
        return uniqueID;
    }

    /**
     * Get the type of the pet.
     * 
     * @return The type of the pet.
     */
    public String getType() {
        return type;
    }

    /**
     * Get the name of the pet.
     * 
     * @return The name of the pet.
     */
    public String getPetName() {
        return pName;
    }

    /**
     * Get the name of the pet's owner.
     * 
     * @return The name of the pet's owner.
     */
    public String getOwnerName() {
        return oName;
    }
    
    /**
     * Set the name of the pet's uniqueID.
     * 
     * @param uniqueID The unique ID of the pet.
     */
    public void setUniqueID(int uniqueID) {
        this.uniqueID = uniqueID;
    }

    /**
     * Set the type of the pet.
     * 
     * @param type The type of the pet.
     */
    public void setType(String type) {
        this.type = type;
    }

    /**
     * Set the name of the pet.
     * 
     * @param petName The name of the pet.
     */
    public void setPetName(String petName) {
        this.pName = petName;
    }

    /**
     * Set the name of the pet's owner.
     * 
     * @param ownerName The name of the pet's owner.
     */
    public void setOwnerName(String ownerName) {
        this.oName = ownerName;
    }
}
