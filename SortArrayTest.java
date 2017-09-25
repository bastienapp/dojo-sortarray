import junit.framework.*;
import org.junit.Test;
import org.junit.Assert;

public class SortArrayTest extends TestCase {
	@Test
	public void testTrue() throws Exception {
		assertEquals(true, true);
	}

	@Test
	public void test1() throws Exception {
		int[] arrayToSort = new int[]{0,1};
		int[] arraySorted = new int[]{0,1};
		Assert.assertArrayEquals(SortArray.sort(arrayToSort), arraySorted);
	}
}