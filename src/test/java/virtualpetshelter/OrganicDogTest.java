package virtualpetshelter;

import static org.hamcrest.Matchers.is;
import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertThat;

import org.junit.Test;

public class OrganicDogTest {

	private static final String NAME = "Spike";
	private static final String DESCRIPTION = " is white";

	Organic underTest = new OrganicDog(NAME, DESCRIPTION);

	@Test
	public void shouldReturnPetName() {
		String check = underTest.getPetName();
		assertEquals(check, NAME);
	}

	@Test
	public void shouldReturnPetDescrisption() {
		String check = underTest.getPetDescription();
		assertEquals(check, DESCRIPTION);
	}

	@Test
	public void feedShouldReduceHungerBy30() {
		int prefeed = underTest.getHunger();
		underTest.feed();
		int postFeedHunger = underTest.getHunger();
		assertThat(prefeed - postFeedHunger, is(30));
	}

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
	public void shouldReduceWasteBy30() {
		int preWaste = underTest.getWaste();
		underTest.waste();
		int postWaste = underTest.getWaste();
		assertThat(preWaste - postWaste, is(30));

	}

	@Test
	public void shouldReduceSoilBy30() {
		int preSoil = underTest.getSoil();
		underTest.soil();
		int postSoil = underTest.getSoil();
		assertThat(preSoil - postSoil, is(30));

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
		underTest.cleanliness();
		int postCleanliness = underTest.getCleanliness();
		assertThat(preCleanliness - postCleanliness, is(30));

	}

}