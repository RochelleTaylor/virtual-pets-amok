package virtualpetshelter;

public class RobotDog extends VirtualPet implements Walkable {

	public RobotDog(String userInputName, String userInputDescription) {
		super();
	}

	public void RobotDog() {

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