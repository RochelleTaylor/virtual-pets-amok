package virtualpetshelter;

public class OrganicDog extends Organic implements Walkable {

	public OrganicDog(String petName, String petDescription) {
		this.petName = petName;
		this.petDescription = petDescription;
	}

	private int walk;

	@Override
	public void walk() {
		boredom -= 20;
		waste -= 40;
		health += 30;

	}

	@Override
	public void tick() {
		hunger++;
		thirst++;
		boredom++;

	}
}
