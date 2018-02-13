package virtualpetshelter;

public abstract class Robotic extends VirtualPet {

	protected int oil;

	public Robotic(int boredom, int health, String name, String description, int oil) {
		super(boredom, health, name, description);
		this.oil = oil;
	}

	public void oil() {
		health -= 30;

	}

	public void tick() {
		health -= 1;
	}

	public int getOilLevel() {
		return oil;

	}

}