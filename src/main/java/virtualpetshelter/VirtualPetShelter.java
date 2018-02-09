package virtualpetshelter;

import java.util.Collection;
import java.util.HashMap;
import java.util.Map;

public class VirtualPetShelter {

	private VirtualPet pet;
	private Map<String, VirtualPet> petList = new HashMap<String, VirtualPet>();

	public VirtualPetShelter() {
		admitVirtualPetByName("Bob", " is blue ");

	}

	public void addVirtualPetToPetList(VirtualPet newPet) {
		petList.put(newPet.getName(), newPet);
	}

	public void admitVirtualPetByName(String name, String description) {
		pet = new VirtualPet(name, description);

		addVirtualPetToPetList(pet);
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
			pet.feed();
		}
	}

	public void waterAllPets() {
		for (VirtualPet pet : petList.values()) {
			pet.water();
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
			pets += pet.getName() + "\t|" + pet.getHunger() + "\t|" + pet.getThirst() + "\t|" + pet.getPlay() + "\n";
		}
		return pets;

	}

	public String displayPetNameAndDescription() {
		String pets = "";
		for (VirtualPet pet : petList.values()) {
			pets += pet.getName() + "\t|" + pet.getDescription() + "\n";
		}
		return pets;
	}
}
