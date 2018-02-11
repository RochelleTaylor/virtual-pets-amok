package virtualpetshelter;

import static org.hamcrest.Matchers.is;
import static org.junit.Assert.assertThat;

import org.junit.Test;

public class RobotDogTest {

	private static final String DEFAULT_NAME = "Rosco";
	private static final String DEFAULT_DESCRIPTION = "is blue";

	RobotDog underTest = new RobotDog(DEFAULT_NAME, DEFAULT_DESCRIPTION);

	@Test
	public void shouldReturnHigherHealthAfterOilingBy30() {
		int preOilHealth = underTest.getHealth();
		underTest.oil();
		int postOilHealth = underTest.getHealth();
		assertThat(preOilHealth - postOilHealth, is(30));

	}

	@Test
	public void tickShouldIncreaseOilHealthBy1() {
		int preTickOilHealth = underTest.getHealth();
		underTest.tick();
		int postTickOilHealth = underTest.getHealth();
		assertThat(preTickOilHealth - postTickOilHealth, is(1));
	}
}