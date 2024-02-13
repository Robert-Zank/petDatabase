import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileWriter;
import java.io.IOException;
import java.util.LinkedList;
import java.util.Scanner;

/**
 * Class: PetFrontEnd
 * 
 * @author Robert Zank
 * @version 1.0 Course : CSE 274 Fall 2023 Written: September 15, 2023
 *
 *          This class uses the classes Pet.java, Cat.Java, and Dog.java
 *          to make a pet directory. When using this the user can
 *          carry out the following actions: They can view all the pets,
 *          add or delete a pet, exit the program, or exit and save the
 *          program.
 *
 *          Purpose: – This class can be used to keep track of a large sum of
 *          pets with unique details that pertain to each one.
 */

public class PetFrontEndWLL {

    static Scanner key = new Scanner(System.in);

    public static void main(String[] args) {
        LinkedList<Pet> pets = new LinkedList<Pet>();
        load(pets);
        System.out.println("\nWelcome to the pet directory!");
        menu(pets);
    }

    /**
     * Method responsible for taking the text file and reading the info in it,
     * then translating the data into their respective objects and adding them
     * into an arrayList.
     * 
     * @param ArrayList with the list of all pet objects
     */
    private static void load(LinkedList<Pet> pets) {
        boolean trip = false;
        while (trip == false) {
            System.out.println(
                    "Please enter the filename of the file you"
                    + " would like to load: ");
            try {
                Scanner fle = new Scanner(new File(key.next()));
                trip = true;
                while (fle.hasNextLine()) {
                    int tUniqueID = Integer.parseInt(fle.nextLine());
                    String tPetName = fle.nextLine();
                    String tOwner = fle.nextLine();
                    String tType = fle.nextLine();
                    int tAge = Integer.parseInt(fle.nextLine());
                    if (fle.hasNextBoolean()) {
                        boolean tHair = fle.nextBoolean();
                        if (fle.hasNextLine()) {
                            fle.nextLine();
                        }
                        Pet temp = new Cat(tUniqueID, tType, tPetName, tOwner,
                                tAge,
                                tHair);
                        pets.add(temp);
                    } else {
                        String tBreed = fle.nextLine();
                        Pet temp = new Dog(tUniqueID, tType, tPetName, tOwner,
                                tAge,
                                tBreed);
                        pets.add(temp);
                    }
                }
            } catch (FileNotFoundException e) {
                System.out.println("Please enter valid file name.");
            }
        }
    }

    /**
     * This is a simple method that prompts the user with a menu that they may
     * interact with. With this menu, the user can view the list of pets,
     * delete a pet, add a pet, save changes to the list and to output that
     * new data to a file, or exit the program.
     */
    private static void menu(LinkedList<Pet> pets) {
        System.out.println("\n1. View the list of all pets.");
        System.out.println("2. Delete a pet.");
        System.out.println("3. Add a pet.");
        System.out.println("4. Save changes and output new"
                + " data to a text file.");
        System.out.println("5. Exit the program.");
        boolean trip = false;
        boolean intTrip = false;
        int intTemp = 0;
        while (trip == false || intTrip == false) {
            System.out.print("Enter the number that correspond"
                    + " to the action you would like to preform: ");
            String temp = key.next();
            try {
                intTemp = Integer.parseInt(temp);
                trip = true;
                if (intTemp > 0 && intTemp < 6) {
                    intTrip = true;
                } else {
                    System.out.println("Please enter a valid integer!");
                }
            } catch (NumberFormatException e) {
                System.out.println("Please enter a valid integer!");
            }
        }
        if (intTemp == 1) {
            showAllPets(pets);
            menu(pets);
        } else if (intTemp == 2) {
            removePet(pets);
            menu(pets);
        } else if (intTemp == 3) {
            addPet(pets);
            menu(pets);
        } else if (intTemp == 4) {
            saveAndExit(pets);
        } else if (intTemp == 5) {
            System.out.println("\nThank you for using this pet directory!");
            System.out.println("See you next time!");
        }
    }

    /**
     * This method shows the list of all pets.
     */
    private static void showAllPets(LinkedList<Pet> pets) {
        for (int i = 0; i < pets.size(); i++) {
            System.out.println("Index: " + i + " " + pets.get(i).toString());
        }
    }

    /**
     * This method removes a pet
     */
    private static void removePet(LinkedList<Pet> pets) {
        showAllPets(pets);
        System.out.println(
                "Enter the index for the pet you would like to remove: ");
        pets.remove(key.nextInt());
    }

    /**
     * This method adds a pet
     */
    private static void addPet(LinkedList<Pet> pets) {
        System.out.println(
                "Enter the the following data for the new pet to be added: ");
        System.out.println("Will you be adding a cat or a dog?");
        System.out.println("Type cat or dog: ");
        boolean triger1 = false;
        String tType = "";
        while (triger1 == false) {
            tType = key.next().toLowerCase();
            if (tType.equals("cat") || tType.equals("dog")) {
                triger1 = true;
            } else {
                System.out.println("Please enter a valid selection: ");
            }
        }
        System.out.println("uniqueID: ");
        int tUniqueID = key.nextInt();
        System.out.println("Pet name: ");
        key.nextLine();
        String tPetName = key.nextLine();
        System.out.println("Owner name: ");
        String tOwner = key.nextLine();
        System.out.println("Age: ");
        int tAge = key.nextInt();
        if (tType.equals("cat")) {
            System.out.println("Does the cat have long or short hair?");
            System.out.println("Type long or short: ");
            boolean tHair = true;
            if (key.next().toLowerCase().equals("short")) {
                tHair = false;
            }
            Pet temp = new Cat(tUniqueID, tType, tPetName, tOwner, tAge,
                    tHair);
            pets.add(temp);
        } else {
            System.out.println("Enter the breed of dog: ");
            key.nextLine();
            String tBreed = key.nextLine();
            Pet temp = new Dog(tUniqueID, tType, tPetName, tOwner, tAge,
                    tBreed);
            pets.add(temp);
        }
    }

    /**
     * This method saves the changes made and prints them to a new txt file
     */
    private static void saveAndExit(LinkedList<Pet> pets) {
        boolean trip = false;
        while (trip == false) {
            System.out.println(
                    "Please provide a name for the output file "
                    + "with (.txt) at the end: ");
            try {
                String temp = key.next();
                FileWriter output = new FileWriter(temp);
                try {
                    if (temp.substring(temp.length() - 4).equals(".txt")
                            && temp.length() > 3) {
                        trip = true;
                        for (Pet e : pets) {
                            output.write(e.getID() + "\n" + e.getPetName()
                                    + "\n" + e.getOwnerName() + "\n"
                                    + e.getType());
                            if (e instanceof Dog) {
                                Dog t = (Dog) e;
                                output.write("\n" + t.getAge());
                                output.write("\n" + t.getBreed() + "\n");
                            } else {
                                Cat t = (Cat) e;
                                output.write("\n" + t.getAge());
                                if (t.gethairLength() == false) {
                                    output.write("\n" + "false\n");
                                } else {
                                    output.write("\n" + "true\n");
                                }
                            }
                        }
                    }
                } catch (StringIndexOutOfBoundsException d) {
                    System.out.println("Please enter a valid file name");
                }
                output.close();
            } catch (IOException e) {
                System.out.println("Please enter a valid file name");
            }
        }
    }
}
