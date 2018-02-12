package virtualpetshelter;

import java.util.Scanner;

public class OldVirtualPetShelterApp {

	private static String userInputName;
	private static String userInputDescription;
	private Object pet;

	public static void main(String[] args) {

		Scanner input = new Scanner(System.in);

		VirtualPetShelter myShelter = new VirtualPetShelter();
		String nameInput;
		String descriptionInput;
		String optionsEntered = "";

		System.out.println("Thank you for volunteering at Rochelles Virtual Pet Shelter!");
		input.nextLine();
		input.nextLine();

		while (!optionsEntered.equals("6")) {
			System.out.println("This is the status of your pets:");
			input.nextLine();
			System.out.println("Name : Hunger : Thirst : Play");
			System.out.println(myShelter.displayPets());
			System.out.println();

			System.out.println("What would you like to do next?");

			System.out.println(" 1: Feed pets");
			System.out.println(" 2: Water pets");
			System.out.println(" 3: Play with a pet");
			System.out.println(" 4: Adopt a pet");
			System.out.println(" 5: Admit a pet");
			System.out.println(" 6: Quit");
			optionsEntered = input.nextLine();

			if (optionsEntered.equals("1")) {
				myShelter.feedAllPets();
				System.out.println("You have fed your pets");
			}

			else if (optionsEntered.equals("2")) {

				myShelter.waterAllPets();
				System.out.println("You have watered your pets");
			}

			else if (optionsEntered.equals("3")) {
				System.out.println(myShelter.displayPetNameAndDescription());
				System.out.println("Enter the name of the pet you would like to play with");
				nameInput = input.nextLine();
				if (myShelter.checkForPet(nameInput)) {
					myShelter.playWithAPet(nameInput);

					System.out.println("You played with " + nameInput);
				}
			}

			else if (optionsEntered.equals("4")) {
				System.out.println("What is the name of the pet");
				nameInput = input.nextLine();
				if (myShelter.checkForPet(nameInput))
					myShelter.adoptPetByName(nameInput);
				System.out.println("You adopted a pet!");
			}

			if (optionsEntered.equals("5")) {
				System.out.println("Enter a name");
				nameInput = input.nextLine();
				System.out.println("Enter a description");
				descriptionInput = input.nextLine();
				System.out.println("You've admitted a pet!");

				input.nextLine();
				input.nextLine();
			}

			System.out.println("We've added new pets to our shelter!");
			input.nextLine();
			System.out.println("We have included an Organic Dog, Organic Cat, Robot Dog and Robot Cat to our shelter!");
			input.nextLine();
			System.out.println("Here is the status of our Organic Dog");
			myShelter.addVirtualPetToPetList(new OrganicDog(userInputName, userInputDescription));
			input.nextLine();
			System.out.println("Here is the Status of our Organic Cat");
			myShelter.addVirtualPetToPetList(new OrganicCat(userInputName, userInputDescription));
			input.nextLine();
			System.out.println("Here is the status of our Robot Dog");
			// System.out.println(" Name : Oil : Battery : Happiness");

			System.out.println("Here is the status of our Robot Cat");
			myShelter.addVirtualPetToPetList(new RobotCat(userInputName, userInputDescription));
		}
		myShelter.tickAllPets();

	}
}
