package virtualpetshelter;

import static org.hamcrest.Matchers.is;
import static org.junit.Assert.assertThat;

import org.junit.Test;

public class OrganicCatTest {

	private static final String NAME = "Bruno";
	private static final String DESCRIPTION = "is Brown";

	OrganicCat underTest = new OrganicCat(NAME, DESCRIPTION);

	@Test
	public void thirstShouldReduceWaterBy30() {
		int preThirst = underTest.getWater();
		underTest.thirst();
		int postThirst = underTest.getWater();
		assertThat(preThirst - postThirst, is(30));
	}

	@Test
	public void playShouldReduceBoredomBy30() {
		int prePlay = underTest.getBoredom();
		underTest.boredom();
		int postPlay = underTest.getBoredom();
		assertThat(prePlay - postPlay, is(30));
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
	public void happinessShouldIncreaseBy30() {
		int preHappiness = underTest.getHappiness();
		underTest.happiness();
		int postHappiness = underTest.getHappiness();
		assertThat(preHappiness - postHappiness, is(30));
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
		int prefeed = underTest.getHunger();
		underTest.feed();
		int postFeedHunger = underTest.getHunger();
		assertThat(prefeed - postFeedHunger, is(30));
	}

	@Test
	public void soilShouldReduceLitterBoxBy30() {
		VirtualPetShelter testShelter = new VirtualPetShelter();
		int preSoilCleanliness = testShelter.getLitterBoxCleanliness();
		underTest.soil(testShelter);
		int postSoilCleanliness = testShelter.getLitterBoxCleanliness();
		assertThat(preSoilCleanliness - postSoilCleanliness, is(30));
	}
}
