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
		addVirtualPetToPetList(new OrganicDog("Bob", " is blue ", 30, 60, 40, 20, 70));

	}

	void addVirtualPetToPetList(VirtualPet pet) {
		petList.put(pet.getPetName(), pet);
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
			((Organic) pet).water();
		}
	}

	public void tickAllPets() {
		for (VirtualPet pet : petList.values()) {
			pet.tick();
		}

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
						+ "\t|" + "\n";
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

	public void playWithAPet(String name) {
		getPetByName(name).play();

	}

}
