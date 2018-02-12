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

		play = 50;

	}

	public void play() {
		play -= 20;
	}

	public int getPlay() {
		return play;
	}

	public void tick() {
	}

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
