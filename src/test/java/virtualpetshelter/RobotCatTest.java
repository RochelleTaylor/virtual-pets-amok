package virtualpetshelter;

import static org.hamcrest.Matchers.is;
import static org.junit.Assert.assertThat;

import org.junit.Test;

public class RobotCatTest {

	private static final String NAME = "Fido";
	private static final String DESCRIPTION = "is pink";

	Robotic underTest = new RobotCat(20, 30, "Tom", "IsPurple", 40);

	@Test
	public void shouldReturnHigherHealthAfterOilingBy30() {
		int preOilHealth = underTest.getHealth();
		underTest.oil();
		int postOilHealth = underTest.getHealth();
		assertThat(preOilHealth - postOilHealth, is(30));

	}

	@Test
	public void tickShouldDecreaseHealthBy1() {
		int preTickOilHealth = underTest.getHealth();
		underTest.tick();
		int postTickOilHealth = underTest.getHealth();
		assertThat(preTickOilHealth - postTickOilHealth, is(1));

	}
}
