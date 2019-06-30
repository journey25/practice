package algorithms.Lcm;

/**
 * @author jiyouneo
 * @since 2019. 06. 30
 *
 */
public class Lcm {
	public int cal(int[] nums) {
		int num1 = nums[0];
		int num2 = nums[1];

		int small = num1 <= num2 ? num1 : num2;
		int big = num1 > num2 ? num1 : num2;

		int gcd = 0;
		do {
			int r = big % small;
			if (r == 0) {
				gcd = small;
				break;
			}

			big = small;
			small = r;

		} while(true);

		return (num1 / gcd) * (num2 / gcd) * gcd;
	}
}
