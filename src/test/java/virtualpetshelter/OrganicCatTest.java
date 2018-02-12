package virtualpetshelter;

import static org.hamcrest.Matchers.is;
import static org.junit.Assert.assertThat;

import org.junit.Test;

public class OrganicCatTest {

	private static final String NAME = "Bruno";
	private static final String DESCRIPTION = "is Brown";

	OrganicCat underTest = new OrganicCat(NAME, DESCRIPTION, 20, 30, 10, 40, 50);

	@Test
	public void thirstShouldReduceWaterBy30() {
		underTest.water();
		int postThirst = underTest.getThirst();
		assertThat(postThirst, is(0));
	}

	@Test
	public void playShouldReduceBoredomBy30() {
		underTest.play();
		int postPlay = underTest.getBoredom();
		assertThat(postPlay, is(0));
	}

	@Test
	public void soilShouldReduceWasteBy30() {
		int preWaste = underTest.getWaste();
		underTest.soil();
		int postWaste = underTest.getWaste();
		assertThat(preWaste - postWaste, is(30));

	}

	@Test
	public void healthShouldIncreaseBy30() {
		int preHealth = underTest.getHealth();
		underTest.health();
		int postHealth = underTest.getHealth();
		assertThat(preHealth - postHealth, is(30));

	}

	@Test
	public void shouldIncreaseCleanlinessby30() {
		int preCleanliness = underTest.getCleanliness();
		underTest.cleanCage();
		int postCleanliness = underTest.getCleanliness();
		assertThat(preCleanliness - postCleanliness, is(30));

	}

	@Test
	public void feedShouldReduceHungerBy30() {
		underTest.feed();
		int postFeedHunger = underTest.getHunger();
		assertThat(postFeedHunger, is(0));
	}

	@Test
	public void soilShouldReduceLitterBoxBy30() {
		VirtualPetShelter testShelter = new VirtualPetShelter();
		int preSoilCleanliness = testShelter.getLitterBoxCleanliness();
		underTest.soil(testShelter);
		int postSoilCleanliness = testShelter.getLitterBoxCleanliness();
		assertThat(preSoilCleanliness - postSoilCleanliness, is(30));
	}

	@Test
	public void tickShouldIncreaseHungerThirstAndBoredomBy1() {
		int preTickHunger = underTest.getHunger();
		int preTickThirst = underTest.getThirst();
		int preTickBoredom = underTest.getBoredom();
		underTest.tick();
		int postTickHunger = underTest.getHunger();
		int postTickThirst = underTest.getThirst();
		int postTickBoredom = underTest.getBoredom();
		assertThat(postTickHunger - preTickHunger, is(1));
		assertThat(postTickThirst - preTickThirst, is(1));
		assertThat(postTickBoredom - preTickBoredom, is(1));
	}
}
