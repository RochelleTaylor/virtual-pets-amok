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
		underTest.addVirtualPetToPetList(new OrganicDog(NAME, DESCRIPTION, 50, 60, 40, 30, 20));

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
		int petHunger = ((Organic) testPet).getHunger();
		Assert.assertThat(petHunger, is(0));
	}

	@Test
	public void waterAllPets() {
		underTest.waterAllPets();
		OrganicDog testPet = (OrganicDog) underTest.getPetByName(NAME);
		int petThirst = testPet.getThirst();
		Assert.assertEquals(0, petThirst);
	}

	@Test
	public void playWithAPet() {
		underTest.getPetByName(NAME).tick();
		underTest.playWithAPet(NAME);
		VirtualPet testPet = underTest.getPetByName(NAME);
		int boredom = testPet.getBoredom();
		Assert.assertEquals(0, boredom);
	}

	@Test
	public void tickShouldIncreasePetsHungerAndThirstBy1() {
		underTest.tickAllPets();
		int petPlay = underTest.getPetByName(NAME).getBoredom();
		int petThirst = ((Organic) underTest.getPetByName(NAME)).getThirst();
		int petHunger = ((Organic) underTest.getPetByName(NAME)).getHunger();
		Assert.assertEquals(51, petPlay);
		Assert.assertEquals(31, petThirst);
		Assert.assertEquals(21, petHunger);
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
