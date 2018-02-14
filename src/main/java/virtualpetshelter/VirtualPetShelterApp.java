package virtualpetshelter;

import java.util.Scanner;

public class VirtualPetShelterApp {

	private static Object myShelter;

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);

		String description;
		String name;

		VirtualPetShelter myShelter = new VirtualPetShelter();

		System.out.println("Hello, welcome to Rochelles pet shelter!");
		input.nextLine();
		System.out.println("We have some funky fun pets that have their own special characteristics! Check them out!");
		input.nextLine();
		// while(true) {
		// System.out.println(myShelter.displayPets());
		System.out.println("Here is a list of our all of our organic pet with their status");
		System.out.println("Name\t:Hunger\t:Thirst\t:Health\t");
		myShelter.addVirtualPetToPetList(new OrganicDog("Bob", " is blue ", 30, 60, 40, 20, 70));
		myShelter.addVirtualPetToPetList(new OrganicDog("Shiela", "likes to lick eyeballs", 20, 30, 50, 60, 10));
		myShelter
				.addVirtualPetToPetList(new OrganicCat("Bruno", " he doesnt like to be bothered ", 30, 20, 60, 40, 50));
		myShelter.addVirtualPetToPetList(new OrganicCat("Samson", "loves drinking milk", 40, 30, 20, 10, 60));
		input.nextLine();
		while (true) {
			// if (myShelter.getSize() > 0);
			System.out.println(myShelter.displayPets());
			System.out.println(/* Something returning a string that lists pets */);
			System.out.println("Here is a list of our robotic pets with their status");
			System.out.println("Name\t:Description    \t:Oil\t:Health\t");

			myShelter.addVirtualPetToPetList(new RobotDog("Milo", "talks!               ", 40, 30, 20));
			myShelter.addVirtualPetToPetList(new RobotDog("Sam", "can do math!          ", 20, 60, 30));
			myShelter.addVirtualPetToPetList(new RobotCat("Sara", "can change colors    ", 50, 70, 30));
			myShelter.addVirtualPetToPetList(new RobotCat("Blue", "Doesnt like RobotDogs", 50, 60, 40));
			System.out.println(myShelter.displayRoboticPets());
			System.out.println("Now that we know their status, what would you like to do next?");

			System.out.println("1. Feed Dogs & Cats.");
			System.out.println("2. Water Dogs & Cats.");
			System.out.println("3. Oil & Charge Robot Dogs.");
			System.out.println("4. Play with a Shelter Pet.");
			System.out.println("5. Adopt a pet.");
			System.out.println("6. Admit a pet.");
			System.out.println("7. Clean all Dog cages.");
			System.out.println("8. Clean the Shelter Litter Box.");
			System.out.println("9. Quit");
			String optionEntered = input.nextLine();

			if (optionEntered.equals("1")) {
				myShelter.feedAllPets();
				System.out.println("You fed all the dogs and cats");

			} else if (optionEntered.equals("2")) {
				myShelter.waterAllPets();
				System.out.println("You watered your dogs and cats");

			} else if (optionEntered.equals("3")) {
				myShelter.oilAll();
				System.out.println("Thanks for the oil maintenance");

			} else if (optionEntered.equals("4")) {
				System.out.println("Enter a name");
				name = input.nextLine();
				myShelter.playWithAPet(name);
				System.out.println("Great job playing with your pets!");

			} else if (optionEntered.equals("5")) {
				System.out.println("What is the name of the pet you want to adopt?");
				name = input.nextLine();
				if (myShelter.checkForPet(name))
					myShelter.adoptPetByName(name);
				System.out.println("You adopted a pet!");

			} else if (optionEntered.equals("6")) {
				System.out.println("Enter a name");
				name = input.nextLine();
				System.out.println("Enter a description");
				description = input.nextLine();
				System.out.println("What kind of pet would you like to admit?");
				System.out.println("1 for Robotic Dog, 2 for Robotic Cat, 3 for Organic Dog, 4 For Organic Cat");
				String choice = input.nextLine();
				if (choice.equals("1")) {
					VirtualPet newPet = new RobotDog(name, description, 30, 50, 40);
					myShelter.addVirtualPetToPetList(newPet);
					System.out.println("You've admitted a pet!");
				} else if (choice.equals("2")) {
					VirtualPet newPet = new RobotDog(name, description, 30, 50, 40);
					myShelter.addVirtualPetToPetList(newPet);
					System.out.println("You've admitted a pet!");
				} else if (choice.equals("3")) {
					VirtualPet newPet = new RobotDog(name, description, 30, 50, 40);
					myShelter.addVirtualPetToPetList(newPet);
					System.out.println("You've admitted a pet!");
				} else if (choice.equals("4")) {
					VirtualPet newPet = new RobotDog(name, description, 30, 50, 40);
					myShelter.addVirtualPetToPetList(newPet);
					System.out.println("You've admitted a pet!");

				} else if (optionEntered.equals("7")) {
					System.out.println("Time to clean the dog cages!");
					myShelter.cleanDogCages();

				} else if (optionEntered.equals("8")) {
					System.out.println("Time to clean the Shelter LitterBox");
					myShelter.getLitterBoxCleanliness();
				}

				myShelter.tickAllPets();

				// display the updated stats
				System.out.println(myShelter.displayPets());
				System.out.println(myShelter.displayRoboticPets());
			}
		}
	}
}