package virtualpetshelter;

public class Organic {
	protected String petName;
	protected String petDescription;
	private int hunger;
	private int water;
	private int boredom;
	private int waste;
	private int happiness;
	private int health;
	private int cleanliness;

	public Organic() {
		super();
	}

	public String getPetName() {
		return petName;
	}

	public String getPetDescription() {
		return petDescription;
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

	public int getBoredom() {
		return boredom;
	}

	public void play() {
		boredom -= 30;
	}

	public int getWaste() {
		return waste;

	}

	public int getHappiness() {
		return happiness;
	}

	public void happiness() {
		happiness -= 30;
	}

	public void soil() {
		waste -= 30;
		cleanliness -= 30;

	}

	public void boredom() {
		boredom -= 30;

	}

	public int getHealth() {
		return health;
	}

	public void health() {
		health -= 30;

	}

	public int getCleanliness() {
		return cleanliness;
	}

	public void cleanCage() {
		cleanliness -= 30;
	}

}