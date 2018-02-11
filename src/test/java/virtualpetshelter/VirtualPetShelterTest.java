package virtualpetshelter;

import static org.hamcrest.Matchers.is;
import static org.junit.Assert.assertThat;

import java.util.Collection;

import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

public class VirtualPetShelterTest {

	private static final String NAME = "name";
	private static final String DESCRIPTION = "description";
	private VirtualPetShelter underTest = new VirtualPetShelter();

	@Before
	public void setup() {
		underTest.addVirtualPetToPetList(new OrganicDog(NAME, DESCRIPTION));

	}

	@Test
	public void shouldAllowIntakeOfPetName() {
		String petName = underTest.getPetByName(NAME).getPetName();
		Assert.assertTrue(petName.equals(NAME));
	}

	@Test
	public void shouldAllowIntakeOfFourPetsAndgetFirstName() {
		VirtualPet testPet = underTest.getPetByName(NAME);

		Assert.assertEquals(NAME, testPet.getPetName());
	}

	@Test
	public void returnCollectionoOfPets() {
		Collection<VirtualPet> petList = underTest.getAllPets();
		int shelterSize = petList.size();
		Assert.assertEquals(2, shelterSize);
	}

	@Test
	public void adoptAPet() {

		underTest.adoptPetByName("third name");
		Collection<VirtualPet> petList = underTest.getAllPets();
		int shelterSize = petList.size();
		Assert.assertEquals(2, shelterSize);
	}

	@Test
	public void feedAllPets() {
		underTest.feedAllPets();
		VirtualPet testPet = underTest.getPetByName(NAME);
		int petHunger = testPet.getHunger();
		Assert.assertEquals(-30, petHunger);
	}

	// @Test
	// public void waterAllPets() {
	// underTest.waterAllPets();
	// VirtualPet testPet = underTest.getPetByName(NAME);
	// int petThirst = testPet.getThirst();
	// Assert.assertEquals(-10, petThirst);
	// }

	@Test
	public void playWithAllPets() {
		underTest.playWithAPet(NAME);
		VirtualPet testPet = underTest.getPetByName(NAME);
		int petPlay = testPet.getPlay();
		Assert.assertEquals(-20, petPlay);
	}

	@Test
	public void tickShouldIncreasePetsHungerAndThirstBy1() {
		underTest.tickAllPets();
		int petPlay = underTest.getPetByName(NAME).getPlay();
		int petThirst = underTest.getPetByName(NAME).getThirst();
		int petHunger = underTest.getPetByName(NAME).getHunger();
		Assert.assertEquals(51, petPlay);
		Assert.assertEquals(41, petThirst);
		Assert.assertEquals(51, petHunger);
	}

	@Test
	public void soilShouldDecreaseCleanlinessBy30() {
		int preSoilCleanliness = underTest.getLitterBoxCleanliness();
		underTest.soil();
		int postSoilCleanliness = underTest.getLitterBoxCleanliness();
		assertThat(preSoilCleanliness - postSoilCleanliness, is(30));
	}

	@Test
	public void emptyLitterboxShouldIncreaseCleanliness() {
		int preEmptyCleanliness = underTest.getLitterBoxCleanliness();
		underTest.emptyLitterBox();
		int postLitterBoxCleanliness = underTest.getLitterBoxCleanliness();
		assertThat(preEmptyCleanliness - postLitterBoxCleanliness, is(-30));

	}
}
