package algorithms;

/**
 * @author jiyouneo
 * @since 2019. 06. 30
 */
public class FractionSum {
	public String cal(String[] nums) {

		// 분모의 최소공배수를 구한다 -
		int deno1 = Integer.parseInt(nums[0].split(" ")[1]);
		int deno2 = Integer.parseInt(nums[1].split(" ")[1]);
		int num1 = Integer.parseInt(nums[0].split(" ")[0]);
		int num2 = Integer.parseInt(nums[1].split(" ")[0]);

		int small = deno1;
		int big = deno2;

		// 최대공약수
		int gcd = Lcm.cal(big, small);

		// 최소공배수
		int lcm = (deno1 / gcd) * (deno2 / gcd) * gcd;

		int deno3 = lcm;
		int num3 = (num1 * (lcm / deno1)) + (num2 * (lcm / deno2));

		int gcd2 = Lcm.cal(deno3, num3);

		return (num3 / gcd2) + " " + (deno3 / gcd2);
	}
}
