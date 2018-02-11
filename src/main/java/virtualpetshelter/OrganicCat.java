package virtualpetshelter;

public class OrganicCat extends Organic {

	private int thirst;

	public OrganicCat(String name, String description) {
		this.petName = petName;
		this.petDescription = petDescription;
	}

	public void soil(VirtualPetShelter testShelter) {
		testShelter.soil();
	}

	public int getThirst() {
		return thirst;
	}

	@Override
	public void tick() {
		// TODO Auto-generated method stub

	}

}
