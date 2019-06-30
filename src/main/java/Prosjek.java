/**
 * @author jiyouneo
 * @since 2019. 06. 30
 */
public class Prosjek {
	public String calculate(int length, String numbers) {

		String[] nums = numbers.split(" ");
		int sum = 0;

		String res = "";
		for (int i = 1; i <= length; i++) {
			int b = Integer.parseInt(nums[i-1]);

			// x / 2 = 2 -> x = 2(len) * 2
			// x / 3 = 3 -> x = 3(len) * 3
			// x / 4 = 5 -> x = 4(len) * 5

			res += (i * b) - sum + "";
			sum += (i * b) - sum;

			if (i != length) {
				res += " ";
			}
		}

		return res;
	}
}
