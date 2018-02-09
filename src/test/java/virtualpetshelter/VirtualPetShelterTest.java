package virtualpetshelter;

import java.util.Collection;

import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

public class VirtualPetShelterTest {

	private static final String NAME = "name";
	private static final String DESCRIPTION = "description";
	private VirtualPetShelter virtualPetShelterUnderTest = new VirtualPetShelter();

	@Before
	public void setup() {
		virtualPetShelterUnderTest.admitVirtualPetByName(NAME, DESCRIPTION);

	}

	@Test
	public void shouldAllowIntakeOfPetName() {
		VirtualPet testPet = virtualPetShelterUnderTest.getPetByName("name");
		String petName = testPet.getName();
		Assert.assertEquals("name", petName);
	}

	@Test
	public void shouldAllowIntakeOfFourPetsAndgetFirstName() {
		VirtualPet testPet = virtualPetShelterUnderTest.getPetByName(NAME);

		Assert.assertEquals(NAME, testPet.getName());
	}

	@Test
	public void returnCollectionoOfPets() {
		Collection<VirtualPet> petList = virtualPetShelterUnderTest.getAllPets();
		int shelterSize = petList.size();
		Assert.assertEquals(2, shelterSize);
	}

	@Test
	public void adoptAPet() {
		virtualPetShelterUnderTest.adoptPetByName("third name");
		Collection<VirtualPet> petList = virtualPetShelterUnderTest.getAllPets();
		int shelterSize = petList.size();
		Assert.assertEquals(3, shelterSize);
	}

	@Test
	public void feedAllPets() {
		virtualPetShelterUnderTest.feedAllPets();
		VirtualPet testPet = virtualPetShelterUnderTest.getPetByName(NAME);
		int petHunger = testPet.getHunger();
		Assert.assertEquals(40, petHunger);
	}

	@Test
	public void waterAllPets() {
		virtualPetShelterUnderTest.waterAllPets();
		VirtualPet testPet = virtualPetShelterUnderTest.getPetByName(NAME);
		int petThirst = testPet.getThirst();
		Assert.assertEquals(30, petThirst);
	}

	@Test
	public void playWithAllPets() {
		virtualPetShelterUnderTest.playWithAPet(NAME);
		VirtualPet testPet = virtualPetShelterUnderTest.getPetByName(NAME);
		int petPlay = testPet.getPlay();
		Assert.assertEquals(30, petPlay);
	}

	@Test
	public void tickShouldIncreasePetsHungerAndThirstByOne() {
		virtualPetShelterUnderTest.tickAllPets();
		int petPlay = virtualPetShelterUnderTest.getPetByName(NAME).getPlay();
		int petThirst = virtualPetShelterUnderTest.getPetByName(NAME).getThirst();
		int petHunger = virtualPetShelterUnderTest.getPetByName(NAME).getHunger();
		Assert.assertEquals(51, petPlay);
		Assert.assertEquals(41, petThirst);
		Assert.assertEquals(51, petHunger);
	}

}
