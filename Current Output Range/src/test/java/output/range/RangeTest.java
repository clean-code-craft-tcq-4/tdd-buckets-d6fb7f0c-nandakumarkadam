package output.range;

import static org.junit.Assert.assertTrue;

import org.junit.Test;

import current.output.range.Range;

public class RangeTest {
	Range range = new Range();

	@Test
	public void testOutputRange() {
		Integer rangeValues[] = { 4, 5 };
		assertTrue("test Range", range.OutputRange(rangeValues) == 2);
	}
}
