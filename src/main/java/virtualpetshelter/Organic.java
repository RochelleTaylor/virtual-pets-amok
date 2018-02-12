package virtualpetshelter;

public abstract class Organic extends VirtualPet {
	protected int hunger = 50;
	protected int water = 40;
	protected int waste = 0;
	protected int cleanliness;
	protected int thirst = 40;

	public Organic() {
		super();
	}

	public int getHunger() {
		return hunger;
	}

	public void feed() {
		hunger -= 30;
	}

	public int getWater() {
		return water;

	}

	public void thirst() {
		water -= 30;

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

}