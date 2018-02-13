package virtualpetshelter;

public class OrganicDog extends Organic implements Walkable {

	public OrganicDog(String name, String description, int boredom, int health, int waste, int thirst, int hunger) {
		super(name, description, boredom, health, waste, thirst, hunger);
	}

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
