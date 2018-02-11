package virtualpetshelter;

public class RobotDog extends VirtualPet implements Walkable {

	public RobotDog(String petName, String petDescription) {
		super();
	}

	public int getHealth() {
		return health;

	}

	public void oil() {
		health -= 30;

	}

	public void tick() {
		this.health--;
	}

	@Override
	public void walk() {
		// TODO Auto-generated method stub

	}

}