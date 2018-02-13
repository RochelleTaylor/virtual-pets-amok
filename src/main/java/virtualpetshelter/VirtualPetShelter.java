package virtualpetshelter;

import java.util.Collection;
import java.util.HashMap;
import java.util.Map;

public class VirtualPetShelter {

	private VirtualPet pet;
	private Map<String, VirtualPet> petList = new HashMap<String, VirtualPet>();
	private int cleanliness;
	// public boolean getSize;
	public boolean getAllPets;

	public VirtualPetShelter() {
		addVirtualPetToPetList(new OrganicDog("Bob", " is blue ", 30, 60, 40, 20, 70));

	}

	void addVirtualPetToPetList(VirtualPet pet) {
		petList.put(pet.getPetName(), pet);
	}

	// public void admitVirtualPetByName(String name, String description) {
	// addVirtualPetToPetList(pet);
	// }

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
			if (pet instanceof Organic) {
				((Organic) pet).feed();
			}
		}
	}

	public void waterAllPets() {
		for (VirtualPet pet : petList.values()) {
			if (pet instanceof Organic) {
				((Organic) pet).water();
			}
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

	public String displayPetNameAndDescription() {
		String pets = "";
		for (VirtualPet pet : petList.values()) {
			pets += pet.getPetName() + "\t|" + pet.getPetDescription() + "\n";
		}
		return pets;
	}

	public String displayPets() {
		String pets = "";
		for (VirtualPet pet : petList.values()) {
			if (pet instanceof Organic) {
				pets += pet.getPetName() + "\t|" + ((Organic) pet).getHunger() + "\t|" + ((Organic) pet).getThirst()
						+ "\t|" + pet.getHealth() + "\n";
			}

		}
		return pets;
	}

	public String displayRoboticPets() {
		String pets = "";
		for (VirtualPet pet : petList.values()) {
			if (pet instanceof Robotic) {
				pets += pet.getPetName() + "\t|" + ((Robotic) pet).getPetDescription() + "\t|"
						+ ((Robotic) pet).getOilLevel() + "\t|" + pet.getHealth() + "\n";
			}

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

	public void addPet(OrganicDog organicDog) {

	}

	public int getSize() {
		return pet.size();
	}

	public boolean petIsAlive() {
		// TODO Auto-generated method stub
		return true;
	}

	public void oilAll() {
		for (VirtualPet pet : petList.values()) {
			((Robotic) pet).oil();
		}

	}

	public String displayPetStatus() {
		// TODO Auto-generated method stub
		return null;
	}

	public void cleanDogCages() {
		for (VirtualPet pet : petList.values()) {
			((OrganicDog) pet).cleanCage();	
	}

}
