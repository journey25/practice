import algorithms.Lcm.Lcm;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

/**
 * @author jiyouneo
 * @since 2019. 06. 30
 */
public class LcmTest {
	@Test
	public void lcm_when1_1_then_1() {
		Lcm lcm = new Lcm();
		int[] nums = new int[2];
		nums[0] = 1;
		nums[1] = 1;
		assertEquals(1, lcm.cal(nums));
	}

	@Test
	public void lcm_when2_4_then_x() {
		Lcm lcm = new Lcm();
		int[] nums = new int[2];
		nums[0] = 2;
		nums[1] = 4;

		assertEquals(4, lcm.cal(nums));
	}

	@Test
	public void lcm_when3_5_then_15() {
		Lcm lcm = new Lcm();
		int[] nums = new int[2];
		nums[0] = 3;
		nums[1] = 5;
		assertEquals(15, lcm.cal(nums));
	}

	@Test
	public void lcm_when1_123_then_123() {
		Lcm lcm = new Lcm();
		int[] nums = new int[2];
		nums[0] = 1;
		nums[1] = 123;
		assertEquals(123, lcm.cal(nums));
	}

	@Test
	public void lcm_when121_199_then_24079() {
		Lcm lcm = new Lcm();
		int[] nums = new int[2];
		nums[0] = 1;
		nums[1] = 123;
		assertEquals(123, lcm.cal(nums));
	}
}
