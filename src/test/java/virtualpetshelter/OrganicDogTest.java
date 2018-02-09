package virtualpetshelter;

import static org.hamcrest.Matchers.is;
import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertThat;

import org.junit.Test;

public class OrganicDogTest {

	private static final String DEFAULT_NAME = "Spike";
	private static final String DEFAULT_DESCRIPTION = " is white";

	OrganicDog underTest = new OrganicDog(DEFAULT_NAME, DEFAULT_DESCRIPTION);

	@Test
	public void shouldReturnPetName() {
		String check = underTest.getPetName();
		assertEquals(check, DEFAULT_NAME);
	}

	@Test
	public void shouldReturnPetDescrisption() {
		String check = underTest.getPetDescription();
		assertEquals(check, DEFAULT_DESCRIPTION);
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
	
}