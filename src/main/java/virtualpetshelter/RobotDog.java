package virtualpetshelter;

public class RobotDog extends Robotic implements Walkable {
	public RobotDog(String name, String description, int boredom, int health, int oil) {
		super(boredom, health, name, description, oil);

	}

	public void oil() {
		health += 30;
		if (health > 100) {
			health = 100;
		}

	}

	public void tick() {
		this.health--;
	}

	@Override
	public void walk() {
		// TODO Auto-generated method stub

	}

}