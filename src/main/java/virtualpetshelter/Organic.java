package virtualpetshelter;

public abstract class Organic extends VirtualPet {
	protected int hunger;
	protected int waste;
	protected int cleanliness;
	protected int thirst;

	public Organic(String name, String description, int boredom, int health, int waste, int thirst, int hunger) {
		super(boredom, health, name, description);
		this.hunger = hunger;
		this.waste = waste;
		this.thirst = thirst;
	}

	public int getHunger() {
		return hunger;
	}

	public void feed() {
		hunger = 0;
	}

	public int getWaste() {
		return waste;

	}

	public void soil() {
		waste -= 30;
		cleanliness -= 30;

	}

	public int getCleanliness() {
		return cleanliness;
	}

	public void cleanCage() {
		cleanliness -= 30;
	}

	public int getThirst() {
		return thirst;
	}

	public void walkDogs() {
		// TODO Auto-generated method stub

	}

	public void water() {
		thirst = 0;
	}

}