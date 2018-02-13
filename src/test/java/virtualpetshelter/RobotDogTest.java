package virtualpetshelter;

import static org.hamcrest.Matchers.is;
import static org.junit.Assert.assertThat;

import org.junit.Test;

public class RobotDogTest {

	private static final String NAME = "Leo";
	private static final String DESCRIPTION = "is happy";

	RobotDog underTest = new RobotDog(NAME, DESCRIPTION, 30, 40, 60);

	@Test
	public void shouldReturnDefaultName() {
		String name = underTest.getPetName();
		assertThat(name, is(NAME));
	}

	@Test
	public void shouldReturnHigherHealthAfterOilingBy30() {
		int preOilHealth = underTest.getHealth();
		underTest.oil();
		int postOilHealth = underTest.getHealth();
		assertThat(postOilHealth - preOilHealth, is(30));

	}

	@Test
	public void tickShouldIncreaseOilHealthBy1() {
		int preTickOilHealth = underTest.getHealth();
		underTest.tick();
		int postTickOilHealth = underTest.getHealth();
		assertThat(preTickOilHealth - postTickOilHealth, is(1));
	}
}