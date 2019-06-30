import algorithms.Lcm;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

/**
 * @author jiyouneo
 * @since 2019. 06. 30
 *
 * 당신은 두 수에 대하여 최소공배수를 구하는 프로그램을 작성 하는 것이 목표이다.
 *
 * input
 * 한 줄에 두 자연수 A와 B가 공백으로 분리되어 주어진다.
 * A와 B는 100,000,000(10^8)보다 작다.
 *
 *
 * output
 * A와 B의 최소공배수를 한 줄에 출력한다.
 *
 *
 * source
 * 2016 AIPO National Finals 2번
 *
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
