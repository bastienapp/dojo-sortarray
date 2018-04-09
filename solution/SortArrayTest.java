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
		Assert.assertArrayEquals(arraySorted, SortArray.sort(arrayToSort));
	}

	@Test
	public void test2() throws Exception {
		int[] arrayToSort = new int[]{1,0};
		int[] arraySorted = new int[]{0,1};
		Assert.assertArrayEquals(arraySorted, SortArray.sort(arrayToSort));
	}

	@Test
	public void test3() throws Exception {
		int[] arrayToSort = new int[]{1,8,3,7,9,13,2,8};
		int[] arraySorted = new int[]{1,2,3,7,8,8,9,13};
		Assert.assertArrayEquals(arraySorted, SortArray.sort(arrayToSort));
	}
}
