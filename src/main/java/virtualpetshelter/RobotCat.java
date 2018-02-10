package virtualpetshelter;

public class RobotCat {

	private String petName;
	private String petDescription;
	private int health;
	private int oil;

	public RobotCat(String petName, String petDescription) {
		this.petName = petName;
		this.petDescription = petDescription;
	}

	public int getHealth() {
		return health;
	}

	public void oil() {
		health -= 30;

	}

}
