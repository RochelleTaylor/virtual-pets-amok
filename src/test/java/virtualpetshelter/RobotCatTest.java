package virtualpetshelter;

import static org.hamcrest.Matchers.is;
import static org.junit.Assert.assertThat;

import org.junit.Test;

public class RobotCatTest {

	private static final String NAME = "Fido";
	private static final String DESCRIPTION = "is pink";

	RobotCat underTest = new RobotCat(NAME, DESCRIPTION);

	@Test
	public void shouldReturnHigherHealthAfterOilingBy30() {
		int preOilHealth = underTest.getHealth();
		underTest.oil();
		int postOilHealth = underTest.getHealth();
		assertThat(preOilHealth - postOilHealth, is(30));

	}
}
