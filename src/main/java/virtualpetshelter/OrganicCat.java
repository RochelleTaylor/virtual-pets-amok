package virtualpetshelter;

public class OrganicCat extends Organic {

	public OrganicCat(String name, String description, int boredom, int health, int waste, int thirst, int hunger) {
		super(name, description, boredom, health, waste, thirst, hunger);

	}

	public void soil(VirtualPetShelter testShelter) {
		testShelter.soil();
	}

	public int getThirst() {
		return thirst;
	}

	@Override
	public void tick() {
		hunger++;
		thirst++;
		boredom++;

	}

}
