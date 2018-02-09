package virtualpetshelter;

public class VirtualPet {

	private String name;
	private String description;
	private int hunger;
	private int water;
	private int play;
	boolean petIsAlive = true;

	public VirtualPet(String name, String description) {
		this.description = description;
		this.name = name;
		hunger = 50;
		water = 40;
		play = 50;
	}

	public String getName() {
		return name;
	}

	public void feed() {
		hunger -= 10;
	}

	public int getHunger() {
		return hunger;
	}

	public void water() {
		water -= 10;
	}

	public int getThirst() {
		return water;
	}

	public void play() {
		play -= 20;
	}

	public int getPlay() {
		return play;
	}

	public void tick() {
		hunger++;
		water++;
		play++;

	}

	public String getDescription() {

		return description;
	}

}
