package virtualpetshelter;

public abstract class VirtualPet {
	private int play;
	boolean petIsAlive = true;
	protected String petName;
	protected String petDescription;
	protected int boredom;
	protected int happiness;
	protected int health;

	public VirtualPet() {

		super();
		// this.description = description;
		// this.name = name;
		// hunger = 50;
		// water = 40;
		// play = 50;
	}

	// public void feed() {
	// hunger -= 10;
	// }
	//
	// public int getHunger() {
	// return hunger;
	// }

	// public void water() {
	// water -= 10;
	// }

	// public int getThirst() {
	// return water;
	// }

	public void play() {
		play -= 20;
	}

	public int getPlay() {
		return play;
	}

	public abstract void tick();
	// hunger++;
	// water++;
	// play++;
	//
	// }

	public String getPetName() {
		return petName;
	}

	public String getPetDescription() {
		return petDescription;
	}

	public int getBoredom() {
		return boredom;
	}

	public int getHappiness() {
		return happiness;
	}

	public void happiness() {
		happiness -= 30;
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

}
