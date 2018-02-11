package virtualpetshelter;

public abstract class Organic extends VirtualPet {
	int hunger;
	private int water;
	protected int waste;
	private int cleanliness;
	int thirst;

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