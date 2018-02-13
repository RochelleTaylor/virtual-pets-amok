package virtualpetshelter;

public abstract class VirtualPet {

	boolean petIsAlive = true;
	protected String petName;
	protected String petDescription;
	protected int boredom;
	protected int health;
	int size;

	public VirtualPet(int boredom, int health, String name, String description) {
		this.boredom = boredom;
		this.health = health;
		this.petName = name;
		this.petDescription = description;

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

	public int getHealth() {
		return health;
	}

	public void health() {
		health -= 30;

	}

	public void play() {
		boredom = 0;

	}

	public int size() {
		// TODO Auto-generated method stub
		return 0;
	}

}
