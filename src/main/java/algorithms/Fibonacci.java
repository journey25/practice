package algorithms;

/**
 * @author jiyouneo
 * @since 2019. 06. 30
 */
public class Fibonacci {
	public int cal(int num) {
		int start = 0;
		int next = 1;

		int cal = 0;

		for (int i = 0; i < num - 1 ; i++) {
			cal = start + next;

			start = next;
			next = cal;

		}

		return cal;
	}
}
