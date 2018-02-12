package virtualpetshelter;

import java.util.Collection;
import java.util.HashMap;
import java.util.Map;

public class VirtualPetShelter {

	private VirtualPet pet;
	private Map<String, VirtualPet> petList = new HashMap<String, VirtualPet>();
	private int cleanliness;
	private Map<String, VirtualPet> myShelter;
	private String robotDogStatus;

	public VirtualPetShelter() {
		addVirtualPetToPetList(new OrganicDog("Bob", " is blue "));

	}

	void addVirtualPetToPetList(OrganicDog organicDog) {

	}

	public void admitVirtualPetByName(String name, String description) {
		addVirtualPetToPetList((OrganicDog) pet);
	}

	public VirtualPet getPetByName(String name) {
		return petList.get(name);
	}

	public Collection<VirtualPet> getAllPets() {
		return petList.values();
	}

	public void adoptPetByName(String name) {
		petList.remove(name);

	}

	public void feedAllPets() {
		for (VirtualPet pet : petList.values()) {
			((Organic) pet).feed();
		}
	}

	public void waterAllPets() {
		for (VirtualPet pet : petList.values()) {
			((Organic) pet).thirst();
		}
	}

	public void tickAllPets() {
		for (VirtualPet pet : petList.values()) {
			pet.tick();
		}

	}

	public void playWithAPet(String name) {
		petList.get(name).play();

	}

	public boolean checkForPet(String name) {
		boolean result = petList.containsKey(name);
		return result;
	}

	public String displayPets() {
		String pets = "";
		for (VirtualPet pet : petList.values()) {
			if (pet instanceof Organic) {
				pets += pet.getPetName() + "\t|" + ((Organic) pet).getHunger() + "\t|" + ((Organic) pet).getThirst()
						+ "\t|" + pet.getPlay() + "\n";
			}
		}
		return pets;
	}

	public String displayPetNameAndDescription() {
		String pets = "";
		for (VirtualPet pet : petList.values()) {
			pets += pet.getPetName() + "\t|" + pet.getPetDescription() + "\n";
		}
		return pets;
	}

	public int getLitterBoxCleanliness() {
		return cleanliness;
	}

	public void soil() {
		cleanliness -= 30;

	}

	public void emptyLitterBox() {
		cleanliness += 30;

	}

	public void addVirtualPetToPetList(RobotCat robotCat) {
		// TODO Auto-generated method stub

	}

	public void addVirtualPetToPetList(OrganicCat organicCat) {
		// TODO Auto-generated method stub

	}

}
