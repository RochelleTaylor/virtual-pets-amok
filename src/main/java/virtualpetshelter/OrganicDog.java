package virtualpetshelter;

public class OrganicDog {

	private String petName;
	private String petDescription;
	private int hunger;

	public OrganicDog(String petName, String petDescription) {
		this.petName = petName;
		this.petDescription = petDescription;

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

}
